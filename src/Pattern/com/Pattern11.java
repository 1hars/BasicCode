package Pattern.com;
import java.util.Scanner;
public class Pattern11 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num = 1;
        for(int row = 1; row <= n; row++){
            int col = row;
            for(int i = 1; i <= row; i++){
                System.out.print(num+"\t");
                num++;
            }
            System.out.println();

        }
        scn.close();
    }
}
