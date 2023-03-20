package oving5;

public class Person2 implements Named{
    
    private String fullName;
    
    public Person2(String fullName) {
        this.fullName = fullName;
    }
    public void setGivenName(String name){
        String familyName = fullName.substring(fullName.indexOf(" "));
		String givenName = name;
		this.fullName = givenName + familyName;
    }
    public String getGivenName(){
        String givenName = fullName.substring(0, fullName.indexOf(" "));
        return givenName;
    }
    public void setFamilyName(String name){
        String givenName = fullName.substring(0, fullName.indexOf(" ")+1);
		String familyName = name;
		this.fullName = givenName + familyName;

    }
    public String getFamilyName(){
        String familyName = fullName.substring(fullName.indexOf(" ")+1);
        return familyName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName(){
        return this.fullName;
    }
}
