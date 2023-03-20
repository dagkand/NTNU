package oving4;

public class Partner {

    private String name;
    private Partner partner;

    public Partner(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }


    public Partner getPartner() {
        return this.partner;
    }

    public void setPartner(Partner person){
		Partner gammel = this.getPartner();
		if(this.partner == person){
			
		}
		else{
			if(gammel == null && person == null){
				throw new IllegalStateException("Denne personen kan ikke skille seg, personen er ikke i et partnerskap");
			}
			if(gammel == null){
				this.partner = person;
				person.setPartner(this);
			}
			else if(this.partner == person){
				
			}
			else if(person == null){
				this.partner = null;
				gammel.setPartner(null);
			}
			else{
				gammel.setPartner(null);
				setPartner(null);
				setPartner(person);
			}
		}
	}


    public static void main(String[] args) {
        Partner bengt = new Partner("bengt");
        Partner mads = new Partner("mads");

        System.out.println("Bengt sin partner: " + bengt.getPartner());
        System.out.println("Mads sin partner: " + mads.getPartner());
        bengt.setPartner(mads);
        System.out.println("Bengt sin partner: " + bengt.getPartner());
        System.out.println("Mads sin partner: " + mads.getPartner());

    }
}
