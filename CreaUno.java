public class CreaUno extends Thread{
    Semaforo verde;
    Semaforo rosso;
    int elementi = 5;
    final int attesa = 500;

    public CreaUno(Semaforo verde, Semaforo rosso){
        this.verde = verde;
        this.rosso = rosso;
    }

    public void run(){
        for (int i = 0; i < elementi; i++) {
            rosso.verde();
            Main.buffer = Main.buffer+1;
            System.out.println("Dato creato: " + Main.buffer);
            verde.rosso();
            try {
                Thread.sleep(attesa);
            } catch (Exception e) {}
        }
        System.out.println("Fine somma.");
    }
}