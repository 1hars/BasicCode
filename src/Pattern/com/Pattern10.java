package Pattern.com;
import java.util.Scanner;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nspace = n/2;
        int nstr = 1;
        for(int row = 1; row <= n; row++){
            for(int i = 1; i <= nspace; i++){
                System.out.print("\t");
            }
            for(int i = 1; i <= nstr; i++){
                if(i > 1 && i < nstr){
                    System.out.print("\t");
                }else{
                    System.out.print("*"+"\t");
                }
            }
            for(int i = 1; i <= nspace; i++){
                System.out.print("\t");
            }
            System.out.println();
            if(row <= n/2){
                nstr = nstr+2;
                nspace = nspace-1;
            }else{
                nstr = nstr-2;
                nspace = nspace+1;
            }
        }
        scn.close();
    }
}
