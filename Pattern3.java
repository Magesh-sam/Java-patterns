 
public class Pattern3 {
    public static void main(String[] args) {
        
        // 1
        // 12
        // 123
        // 1234
        // 12345

        for (int i = 1; i <= 5; i++) {
            int temp = 1;
            while (temp <= i) {
                System.out.print(temp);
                temp++;
            }
            System.out.println();
        }
    }
}
