import java.util.Random;

public class Vlakno implements Runnable{

    private Thread t;
    private String name;
    private int priority;

    public Vlakno(String name, int priority) {
        this.name = name;
        this.priority = priority;
        System.out.println(name + " has been created!");
    }

    @Override
    public void run() {
        System.out.println("thread " + this.name +" is running");
        try {
            for(int i = 1; i<=10; i++){
                int vypis = getTimeMs();
//                System.out.println(vypis);
                Thread.sleep(vypis);
                System.out.println(name+ " " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+ " finished");
    }

    public void startXXX(){
        System.out.println(this.name + " started");
        if(t ==null){
            t = new Thread(this, this.name);
            t.start();
        }
    }

    public int getTimeMs(){
        Random random = new Random();
        if (this.priority == 1)
            return random.nextInt(2000)+500;
        else if (this.priority == 2)
            return random.nextInt(3000)+1000;
        else return random.nextInt(4000)+2000;
    }
}
