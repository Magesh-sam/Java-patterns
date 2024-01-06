 
public class Pattern4 {
    public static void main(String[] args) {
        

        // 1
        // 22
        // 333
        // 4444
        // 55555

        for (int i = 1; i <= 5; i++) {
            int temp = 1;
            while (temp <= i) {
                System.out.print(i);
                temp++;
            }
            System.out.println();
        }
    }
}
