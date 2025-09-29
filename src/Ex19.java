import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc     = new Scanner(System.in);
        System.out.print("Introdu o litera (R/G/V): ");
        String culoare = sc.nextLine().toUpperCase();
        switch (culoare) {
            case "R":
                System.out.println("Rosu");
                break;
            case "G":
                System.out.println("Galben");
                break;
            case "V":
                System.out.println("Verde");
                break;
            default:
                System.out.println("Introdu una din literele mentionate(R/V/G)!");
        }
    }
}
