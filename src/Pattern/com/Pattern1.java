package Pattern.com;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int row = 1; row <= n; row++){
            int str = row;
            for(int col = 1; col <= str; col++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
        scn.close();
    }
}
