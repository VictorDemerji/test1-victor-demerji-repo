import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu un numar: ");
        int numar  = sc.nextInt();
        if ((numar%2) == 0) {
            System.out.println("Numarul " + numar + " este par.");
        } else {
            System.out.println("Numarul " + numar + " este impar.");
        }
    }
}
