package oving2;

public class StopWatch {
    private int tick;
    private int total;
    private boolean start = false; 
    private boolean stopped = false;
    private int lapTime;
    private int lastLapTime = -1;
    private int time;
    
    public boolean isStarted() {
        if(start){
           return true;
        }
        else{
            return false;
        }

    }


    public boolean isStopped() {
        if(stopped){
            return true;
        }
        else{
            return false;
        }
    }

    public int getTicks() {
        return total;
    }

    public int getTime() {
        if(start==true){
            return tick;
        }
        return -1;
    }

    public int getLapTime() {
        if(start){
            return lapTime;
        }
        return -1;
    }

    public int getLastLapTime() {
        if(start){
            return lastLapTime;
        }
        return -1;
    }

    public void tick(int ticks) {
        total += ticks;
        if(start){
            tick += ticks;
            lapTime += ticks;
        }
    }

    public void start() {
        start = true;
    }

    public void lap() {
        lastLapTime = lapTime;
        tick = 0;
        lapTime = 0;
        
    }

    public void stop() {
        stopped = true;
    }


    public static void main(String[] args) {
        StopWatch k = new StopWatch();
        k.tick(20);
        k.tick(20);
        k.tick(20);
        k.start();
        k.tick(1);
        k.tick(1);
        System.out.println(k.getTime());
        System.out.println(k.getTicks());
    }
}
