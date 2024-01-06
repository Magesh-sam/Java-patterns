public class Pattern10 {
    public static void main(String[] args) {
// *
// **
// ***
// ****
// *****
// *****
// ****
// ***
// **
// *
        
        for(int i=1;i<=5;i++){
            int temp=1;
            while(temp<=i){
                System.out.print("*");
                temp++;
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            int temp=1;
            while(temp<=i){

                System.out.print("*");
                temp++;
            }
            System.out.println();
        }
    }
}