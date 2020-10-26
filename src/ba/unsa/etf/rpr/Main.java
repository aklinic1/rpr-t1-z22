package ba.unsa.etf.rpr;

import java.util.Scanner;

//Koristeći IntelliJ IDEA napraviti projekat pod nazivom "rpr-t1-z2". Napravite program koji na ekranu ispisuje sve brojeve između 1 i n koji su djeljivi
// sa sumom svojih cifara, pri čemu se n unosi sa tastature. U programu se obavezno treba nalaziti funkcija sumaCifara.
// Po završetku zadatak treba postaviti na GitHub koristeći isključivo funkcionalnosti IntelliJ IDEA okruženja!
public class Main {

    public static int sumaCifara(int n){
        int suma = 0;
        while(n!=0){
            suma += n%10;
            n=n/10;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n = scan.nextInt();
        int i;
        for(i = 1; i < n; i++) {
            if (i % sumaCifara(i) ==0)System.out.println(i);
        }

    }
}
