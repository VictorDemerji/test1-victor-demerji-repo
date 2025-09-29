import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Introdu un text.");
        String text = sc.nextLine();
        System.out.println(text.toUpperCase());
    }
}
