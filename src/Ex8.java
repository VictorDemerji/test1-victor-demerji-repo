import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu ora: ");
        int ora = sc.nextInt();
        if (ora < 6) {
            System.out.println("Este noapte.");
        } else if (ora < 11) {
            System.out.println("Este dimineata.");
        } else if (ora < 16) {
            System.out.println("Este amiaza.");
        } else if (ora < 21) {
            System.out.println("Este amiaza.");
        } else if (ora <= 24) {
            System.out.println("Este noapte.");
        } else {
            System.out.println("EROARE");
        }
    }
}
