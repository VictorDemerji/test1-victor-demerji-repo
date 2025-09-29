import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Introdu un text.");
        String text = sc.nextLine();
        System.out.println("Indicele maxim este: " + (text.length()-1));
        System.out.println("Marimea sirului este: " + text.length());

    }
}
