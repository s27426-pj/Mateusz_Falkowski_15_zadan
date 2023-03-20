import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        System.out.println("Podaj dwa wyrazy :");
        String a, b;

        Scanner keyboard = new Scanner(System.in);
        a = keyboard.next();
        b = keyboard.next();

        System.out.println( b + " " + a );

    }
}