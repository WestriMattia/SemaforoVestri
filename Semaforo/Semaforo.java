public class Semaforo extends Thread{
    int x;

    public Semaforo(int x){
        this.x = x;
    }

    synchronized public void rosso(){
        while (x == 0) {
            try {
                wait();
            } catch (Exception e) {}
        }
        x--;
    }

    synchronized public void verde(){
       x++;
       notify();
    }
}
