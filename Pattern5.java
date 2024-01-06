 
public class Pattern5 {
    public static void main(String[] args) {
        
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 5; i >= 1; i--) {
            int temp = i;
            while (temp >= 1) {
                System.out.print("*");
                temp--;
            }
            System.out.println();
        }
    }
}
