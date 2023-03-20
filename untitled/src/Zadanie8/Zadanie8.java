import java.util.Scanner;
public class Zadanie8 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę naturalą :");
        int a;

        Scanner keyboard = new Scanner(System.in);
        a = keyboard.nextInt();

        while (a<0){
            System.out.println("Błędne dane !");
            System.out.println("Podaj prawidłową liczbę naturalą :");
            a = keyboard.nextInt();
        }
        String c="*";
        for (int b=0;b<a;b++){
            System.out.println(c);
            c=c+"*";
        }

    }
}