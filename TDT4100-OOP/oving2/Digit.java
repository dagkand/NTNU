package oving2;

public class Digit {

    private int numberSystem;
    private int base;
    
    public Digit(int numberSystem) {
        if(numberSystem<0){
            throw new IllegalArgumentException("Cant use negative number");
        }
        else{
            this.numberSystem = numberSystem;
        }
        this.base = 0;
    }


    public int getValue() {
        return this.base;
    }
    
    public boolean increment() {
        if ((this.base+1) == this.numberSystem) {
            this.base = 0;
            return true;
        }
        
        else{
            this.base += 1;
            return false;
        }
        
    }

    public int getBase() {
        return this.numberSystem;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String string = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return String.valueOf(string.charAt(this.base));
    }

    public static void main(String[] args) {
        
        
    }
}
