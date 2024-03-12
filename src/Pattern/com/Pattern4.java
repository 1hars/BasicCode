package Pattern.com;
import java.util.Scanner;
public class Pattern4 {
    public static void  main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nspace = 0;
        for(int row = 1; row <= n; row++){
            int str = n-nspace;
            for(int i = 1; i <= nspace; i++){
                System.out.print("\t");
            }
            nspace++;
            for(int i = 1; i <= str; i++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
        scn.close();
    }
}
