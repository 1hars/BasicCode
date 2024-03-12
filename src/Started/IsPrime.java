package Started;
import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i = 0; i < t; i++){
            int n = scn.nextInt();
            int flag = 0;
            for(int j = 2; j*j <= n; j++){
                if(n%j == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
                System.out.println("Not prime");
                else System.out.println("Prime");
        }
    }

}
