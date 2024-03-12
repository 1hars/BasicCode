package Started;
import java.util.Scanner;
public class Rotate {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int on = n;
        int count = 0;
        while(n != 0){
            n = n/10;
            count++;
        }
        k = k%count;

        if(k < 0){
            k = k+count;
        }
        int temp = (int)Math.pow(10,k);
        int p1 = on%temp;
        int p2 = on/temp;

        int temp2 = (int)Math.pow(10,count-k);
        int ans = (p1*temp2)+p2;
        System.out.println(ans);
    }
}
