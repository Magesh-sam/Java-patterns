 
public class Pattern2 {
    public static void main(String[] args) {
        // *
        // **
        // ***
        // ****
        // *****

        for (int i = 1; i <= 5; i++) {
            int temp = 1;
            while (temp <= i) {
                System.out.print("*");
                temp++;
            }
            System.out.println();
        }
    }
}
