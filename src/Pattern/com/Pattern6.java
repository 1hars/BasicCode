package Pattern.com;
import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nstr = (n/2+1);
        int nspace = 1;
        for(int row = 1; row <= n; row++){
            for(int i = 1; i <= nstr; i++){
                System.out.print("*"+"\t");
            }
            for(int i = 1; i <= nspace; i++){
                System.out.print("\t");
            }
            for(int i = 1; i <= nstr; i++){
                System.out.print("*"+"\t");
            }
            System.out.println();
            if(row <= n/2){
                nstr = nstr-1;
                nspace = nspace+2;
            }else{
                nstr = nstr+1;
                nspace = nspace-2;
            }
        }
        scn.close();
    }
}
