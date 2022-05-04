public class Main {
    protected static int buffer = 0;
    public static void main(String[] args) throws Exception {
        Semaforo rosso = new Semaforo(0);
        Semaforo verde = new Semaforo(1);
        CreaUno i = new CreaUno(verde , rosso);
        CreaRaddoppio r = new CreaRaddoppio(verde, rosso);
        Elimina o = new Elimina(verde , rosso, 1);
        Elimina l = new Elimina(verde, rosso, 2);
        i.start();
        r.start();
        o.start();
        l.start();
        System.out.println("Inizio.");
    }
}