package oving2;

public class UpOrDownCounter {

    private int start;
    private int end;

    
    public UpOrDownCounter(int start, int end) {
        this.start = start;
        this.end = end;

        if( this.start==this.end){
            throw new IllegalArgumentException("Start and end is the same number");
        }
    }

    public int getCounter() {
        return this.start;
    }

    public boolean count() {
        if(this.start<this.end){
            this.start += 1;
            if(this.start==this.end){
                return false;
            }
            return true;
        }
    
        else if(this.start>this.end){
            this.start -= 1;
            if(this.start==this.end){
                return false;
            }
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        UpOrDownCounter p = new UpOrDownCounter(1, 5);
        System.out.println(p.count());
        System.out.println(p.count());
        System.out.println(p.count());
        System.out.println(p.count());
        System.out.println(p.count());

    }

}
