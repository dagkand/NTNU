package oving5;

public class Person1 implements Named{

    private String givenName;
    private String familyName;
    
    public Person1(String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
    }
    public void setGivenName(String givenName){
        this.givenName = givenName;
    }
    public String getGivenName(){
        return this.givenName;
    }
    public void setFamilyName(String familyName){
        this.familyName = familyName;
    }
    public String getFamilyName(){
        return this.familyName;
    }

    public void setFullName(String fullName) {
        this.givenName = fullName.substring(0, fullName.indexOf(" "));
        this.familyName = fullName.substring(fullName.indexOf(" ")+1);
    }

    public String getFullName(){
        return (this.givenName + " " +this.familyName);
    }
}
