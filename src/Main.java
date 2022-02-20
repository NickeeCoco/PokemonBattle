public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", 200, 55);
        Pokemon jigglypuff = new Pokemon("Jigglypuff", 115, 45);

        pikachu.setTarget(jigglypuff);
        jigglypuff.setTarget(pikachu);

        Thread t1 = new Thread(pikachu);
        Thread t2 = new Thread(jigglypuff);

        t1.start();
        t2.start();
    }
}
