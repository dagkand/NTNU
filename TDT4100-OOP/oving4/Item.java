package oving4;

public class Item {

    String name;
    String type;
    double price;
    Merchant owner;

    public Item(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
    
    public Merchant getOwner() {
        return this.owner;
    }

    public void changeOwner(Merchant merchant){
        merchant.inventory.add(Item)

    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        if (price<0){
            throw new IllegalArgumentException("Cant sell something for a negative amount");
        }

        this.price = price;
    }

    @Override
    public String toString() {
        return "Item [name=" + name + ", type=" + type + ", price=" + price + "]";
    }

    public static void main(String[] args) {
        
    }

}
