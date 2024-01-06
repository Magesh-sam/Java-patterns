public class pattern13 {
    public static void main(String[] args) {
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
        int value=0;
        for(int i=1;i<=5;i++){
            int temp =1;
            while(temp<=i){
                value++;
                System.out.print(value+" ");
                temp++;
            }
            System.out.println();
        }
    }
}
