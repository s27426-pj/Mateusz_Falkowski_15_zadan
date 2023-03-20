import java.util.Scanner;
public class Zadanie1 {
    public static void
    main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj bok a :");
        Double a = scan.nextDouble();
        System.out.println("Podaj bok b :");
        Double b = scan.nextDouble();
        a = a*b;
        System.out.println("Pole wynosi : " + a);
    }
}