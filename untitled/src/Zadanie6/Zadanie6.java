import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args) {
        System.out.println("Podaj trzy liczby rzeczywiste :");
        int a,b,c,d;

        Scanner keyboard = new Scanner(System.in);
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        if (a>b){
            if (a>c){
                d=a;
                a=c;
                c=d;
                if (a>b){
                    d=a;
                    a=b;
                    b=d;
                }
            }
            else{
               d=a;
               a=b;
               b=d;
            }
        } else if (b>c) {
            d=b;
            b=c;
            c=d;
        }
        System.out.println( a + " " +  b + " " +  c );
        System.out.println( c + " " +  b + " " +  a );
    }
}