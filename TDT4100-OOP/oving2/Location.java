package oving2;

public class Location {
    private double x = 0.0;
    private double y = 0.0;
    
    public void up() {
        y -= 1;
    }

    public void down() {
        y += 1;
    }

    public void left() {
        x -= 1;
    }

    public void right() {
        x += 1;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Din x verdi er: " + x + " og din y verdi er:" + y;
    }

    public static void main(String[] args) {
        Location location = new Location();
        System.out.println(location);
        location.up();
        System.out.println(location);
        System.out.println(location.getX());
    }

}


