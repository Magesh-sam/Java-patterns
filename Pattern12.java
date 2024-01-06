 
public class Pattern12 {
    public static void main(String[] args) {
// 1       1
// 12     21
// 123   321
// 1234 4321

        int row = 5;
        for (int i = row; i > 1; i--) {
            int first = row - i + 2;
            int last = row + i - 2;
            for (int j = 1; j <= (row * 2) - 1; j++) {

                if (j >= first && j <= last) {
                    System.out.print(" ");
                } else {
                    System.out.print(j <row ? j : (row*2)-j);
                }
            }
            System.out.println();
        }
    }
}
