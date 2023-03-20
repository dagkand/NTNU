package oving4;

import java.util.ArrayList;

public class Merchant {

    double discount;
    double allDiscount;
    double balance;
    Item item;
    ArrayList<Item> inventory = new ArrayList<Item>();

    public Merchant(double balance){
        if(balance<0){
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;

    }

    public void obtainItem(Item item){
        this.inventory.add(item);
    }

    public void sellItem(Item item, Merchant merchant){
        

        if (merchant.balance < item.getPrice()){
            throw new IllegalArgumentException("You cant afford to buy item");
        }

        if(merchant){

        }

        this.inventory.remove(item);
    }

    public void itemSale(double discount, Item item){
        item.price = (item.getPrice()*(1-discount));

    }

    public void inventorySale(double allDiscount){
        inventory.countains = (item.getPrice()*(1-discount));
    }

}
