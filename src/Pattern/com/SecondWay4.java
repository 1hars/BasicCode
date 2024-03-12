package Pattern.com;
import java.util.Scanner;
public class SecondWay4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int row = 1; row <= n; row++){
            int str = (n+1)-row;
            int nspace = n-str;
            for(int i = 1; i <= nspace; i++){
                System.out.print("\t");
            }
            for(int i = 1; i <= str; i++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
        scn.close();
    }
}
