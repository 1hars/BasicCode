package Pattern.com;
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int row = 1; row <= n; row++){
            int space = (n-row);
            for(int i = 1; i <= space; i++){
                System.out.print("\t");
            }
            for(int j = 1; j <= row; j++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
        scn.close();
    }
}
