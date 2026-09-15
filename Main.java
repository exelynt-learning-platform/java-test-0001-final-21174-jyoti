public class Main {
    public static void main(String[] args) {

        int n = 9;
        int center = n / 2;

        for (int i = 0; i < n; i++) {

            int distance = Math.abs(center - i);

            for (int j = 0; j < n; j++) {

                if (j == center - distance || j == center + distance) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
