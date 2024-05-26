public class Address {
 
    private String streetName;
    private int streetNumber;
 
    public Address(String streetName, int streetNumber) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }
 
    public String getStreetName() {
        return streetName;
    }
 
    public int getStreetNumber() {
        return streetNumber;
    }
 
}