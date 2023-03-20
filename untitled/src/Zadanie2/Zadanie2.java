public class Zadanie2 {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.println();
        pi = Math.PI;
        pi = Math.sqrt(pi);
        pi = pi * 100;
        pi = Math.round(pi);
        pi = pi / 100;
        System.out.println("Zaokrąglenie do 2 miejsca po przecinku:\n" + pi);
    }
}