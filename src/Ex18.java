public class Ex18 {
    public static void main(String[] args) {
        int[] sir = {15, 7, 69, 3, 42};

        int min = sir[0];
        for (int i = 1; i < sir.length; i++) {
            if (sir[i] < min) {
                min = sir[i];
            }
        }

        System.out.println("Cel mai mic element este: " + min);
    }
}