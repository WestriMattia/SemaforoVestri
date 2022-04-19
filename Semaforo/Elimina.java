public class Elimina extends Thread{
    Semaforo verde;
    Semaforo rosso;
    private int controllo;

    public Elimina(Semaforo verde, Semaforo rosso){
        this.verde = verde;
        this.rosso = rosso;
    }

    public void run(){
       while (true) {
           verde.verde();
           controllo = Main.buffer;
           System.out.println("Dato eliminato: " + controllo);
           rosso.rosso();
       }
    }
}
