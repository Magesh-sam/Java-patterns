public class Pattern16 {
    public static void main(String[] args) {
// A
// BB
// CCC
// DDDD
// EEEEE
char value ='A';
        for(int i=1;i<=5;i++){
            int temp=1;
            while (temp<=i) {
               
                System.out.print(value);
                temp++;
            }
            value++;
            System.out.println();
        }
    }
}
