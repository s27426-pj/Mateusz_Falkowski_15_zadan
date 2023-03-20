import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {
        System.out.println("Podaj trzy boki :");
        int a, b, c;

        Scanner keyboard = new Scanner(System.in);
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();
        boolean d , e , f;

        String wynik;
        if (a+b>c){
            d = true;
        }
        else {
            d = false;
        }
        if (a+c>b){
            e = true;
        }
        else {
            e = false;
        }
        if (b+c>a){
            f = true;
        }
        else {
            f = false;
        }
        if (d==e==f){
            wynik = "TAK";
        }
        else {
            wynik = "NIE";
        }
        if (a<0){
            wynik = "BŁĄD";
        }
        if (b<0){
            wynik = "BŁĄD";
        }
        if (c<0){
            wynik = "BŁĄD";
        }
            System.out.println(wynik);

    }
}