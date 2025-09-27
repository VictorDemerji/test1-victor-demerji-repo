import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu un numar: ");
        int numar1 = sc.nextInt();
        System.out.print("Introdu alt numar: ");
        int numar2 = sc.nextInt();
        if (numar1 > numar2) {
            System.out.println("Primul numar este mai mare.");
        } else if (numar1 == numar2) {
            System.out.println("Numerele sunt egale.");
        }else {
            System.out.println("Primul numar este mai mic.");
        }
    }
}
