public class Elimina extends Thread{
    Semaforo verde;
    Semaforo rosso;
    int nome;
    private int controllo;

    public Elimina(Semaforo verde, Semaforo rosso, int nome){
        this.verde = verde;
        this.rosso = rosso;
        this.nome=nome;
    }

    public void run(){
       while (true) {
           verde.verde();
           controllo = Main.buffer;
           System.out.println("Dato eliminato: " + controllo + " Consumatore: " + nome );
           rosso.rosso();
       }
    }
}
