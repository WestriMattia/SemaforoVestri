public class CreaRaddoppio extends Thread{
    Semaforo verde;
    Semaforo rosso;
    int elementi = 5;
    final int attesa = 500;

    public CreaRaddoppio(Semaforo verde, Semaforo rosso){
        this.verde = verde;
        this.rosso = rosso;
    }

    public void run(){
        for (int i = 0; i < elementi; i++) {
            rosso.verde();
            Main.buffer = Main.buffer*2;
            System.out.println("Dato creato: " + Main.buffer);
            verde.rosso();
            try {
                Thread.sleep(attesa);
            } catch (Exception e) {}
        }
        System.out.println("Fine raddoppio.");
    }
}