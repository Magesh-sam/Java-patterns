public class Pattern14 {
    public static void main(String[] args) {
// A
// AB
// ABC
// ABCD
// ABCDE
        for(int i=1;i<=5;i++){
            int temp=1;
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
