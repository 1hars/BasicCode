package Pattern.com;
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int row = 1; row <= n; row++){
            int str = row;
            for(int i = n; i >= row; i--){
                System.out.print("*"+"\t");

            }
            System.out.println();
        }
        scn.close();
    }
}
