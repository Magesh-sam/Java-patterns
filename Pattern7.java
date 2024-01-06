 
public class Pattern7 {
    public static void main(String[] args) {
    //      *    
    //     ***   
    //    *****  
    //   ******* 
    //  *********
        int row = 5;
        for (int i = 1; i <= row; i++) {
            int first = row - i + 1;
            int last = row + i - 1;
            for (int j = 1; j <= (row * 2) - 1; j++) {

                if (j >= first && j <= last ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
