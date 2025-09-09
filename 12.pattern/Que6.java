public class Que6 {
    public static void invHalfpirmid(int n) {

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loopl
            // print spaces
            for (int j = 1; j<= n-i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invHalfpirmid(4);
    }
}
