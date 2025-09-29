public class Ex17 {
    public static void main(String[] args) {
        int[] sir = {15, 7, 69, 3, 42};

        int max = sir [0];
        for (int i = 1; i < sir.length; i++) {
            if (sir[i] > max) {
                max = sir[i];
            }
        }

        System.out.println("Cel mai mare element este: " + max);
    }
}