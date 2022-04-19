public class Crea extends Thread{
    Semaforo verde;
    Semaforo rosso;
    int elementi = 5;
    final int attesa = 500;

    public Crea(Semaforo verde, Semaforo rosso){
        this.verde = verde;
        this.rosso = rosso;
    }

    public void run(){
        for (int i = 0; i < elementi; i++) {
            rosso.verde();
            Main.buffer = i;
            System.out.println("Dato creato: " + i);
            verde.rosso();
            try {
                Thread.sleep(attesa);
            } catch (Exception e) {}
        }
        System.out.println("Fine.");
    }
}