public class Que11 {

    public static void butterflypattern(int n) {
        // outer loop for 1st half
        for (int i = 1; i <= n; i++) {
            // inner loop
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 1; j <= 2*(n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Half ke liye outer loop
        for (int i = n; i >= 1; i--) {

            // inner loop
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2*(n - i); j++) {
                System.out.print(" ");

            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterflypattern(6);
    }

}
