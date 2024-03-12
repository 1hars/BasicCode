package Pattern.com;
import java.util.Scanner;
public class Pattern16 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nstr = 1;
        int nspace = (2*n-1)-nstr;
        for(int row = 1; row <= n; row++){
            for(int i = 1; i <= nstr; i++){
                System.out.print(i+"\t");
            }
            for(int i = 1; i <= nspace; i++){
                    System.out.print("\t");
            }
            for(int i = nstr; i >= 1; i--){
                System.out.print(i+"\t");
            }
            System.out.println();
            nstr  = nstr+1;
            nspace = nspace-2;
        }
        scn.close();
    }
}
