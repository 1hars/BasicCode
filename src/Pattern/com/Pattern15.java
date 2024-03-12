package Pattern.com;
import java.util.Scanner;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nspace = n/2, nstar = 1, val = 1;
        for(int row = 1; row <= n; row++){
            for(int i = 1; i <= nspace; i++){
                System.out.print("\t");
            }
            int var = val;
            for(int col = 1; col <= nstar; col++){
                System.out.print(var+"\t");
                if(col <= nstar/2){
                    var++;
                }else{
                    var--;
                }
            }
            System.out.println();
            if(row <= n/2){
                nspace = nspace-1;
                nstar = nstar+2;
                val++;
            }else{
                nspace = nspace+1;
                nstar = nstar-2;
                val--;
            }
        }
    }
}
