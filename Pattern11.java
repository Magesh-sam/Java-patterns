public class Pattern11 {
    public static void main(String[] args) {
        // 1
        // 01
        // 101
        // 0101
        // 10101
        for (int i = 1; i <= 5; i++) {
            int temp = 1;
            while (temp <= i) {

                if (i % 2 == 0) {
                    if (temp % 2 == 0) {

                        System.out.print(1);
                    } else {
                        System.out.print(0);
                       

                    }
                }

                else {
                    if(temp%2==0){

                        System.out.print(0);
                    }
                    else{
                        System.out.print(1);

                    }
                }
                temp++;

            }
            System.out.println();
        }
    }
}
