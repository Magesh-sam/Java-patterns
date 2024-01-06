 
public class Pattern6 {
    public static void main(String[] args) {
        

        // 12345
        // 1234
        // 123
        // 12
        // 1
        for (int i = 1; i <= 5; i++) {
            int temp = i;
            int j = 1;
            while (temp <= 5) {
                System.out.print(j);
                temp++;
                j++;
            }
            System.out.println();
        }
    }
}
