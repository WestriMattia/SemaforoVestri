public class Main {
    protected static int buffer = 0;
    public static void main(String[] args) throws Exception {
        Semaforo rosso = new Semaforo(0);
        Semaforo verde = new Semaforo(1);
        Crea i = new Crea(verde , rosso);
        Elimina o = new Elimina(verde , rosso);
        i.start();
        o.start();
        System.out.println("Inizio.");
    }
}