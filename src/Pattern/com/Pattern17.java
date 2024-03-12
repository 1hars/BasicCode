package Pattern.com;
import java.util.Scanner;
public class Pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                if((row == n/2+1) || (col == n/2+1)){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        scn.close();
    }
}
