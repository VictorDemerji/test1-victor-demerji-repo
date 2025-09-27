import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu un numar: ");
        int numar1 = sc.nextInt();
        System.out.print("Introdu alt numar: ");
        int numar2 = sc.nextInt();
        System.out.println(numar1+numar2);
        System.out.println(numar1-numar2);
        System.out.println(numar1*numar2);
        System.out.println(numar1/numar2);
        System.out.println(numar1%numar2);
    }
}
