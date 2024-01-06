public class Pattern15 {
    public static void main(String[] args) {
// ABCDE
// ABCD
// ABC
// AB
// A
        for(int i=5;i>=1;i--){
            int temp =1;
            char value ='A';

            while (temp<=i) {
                System.out.print(value);
                value++;
                temp++;
            }
            System.out.println();
        }
    }
}
