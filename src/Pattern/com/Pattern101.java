package Pattern.com;
import java.util.Scanner;
public class Pattern101 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nstr = 1;
        for(int row = 1; row <= n; row++){
            for(int i = 1; i <= nstr; i++){
                System.out.print("*\t");
            }
            System.out.println();
            if(row <= n/2){
                nstr = nstr+1;
            }else{
                nstr = nstr-1;
            }
        }
        scn.close();
    }
}
