package Started;
import java.util.Scanner;
public class Fabo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int first = 0, second = 1;
        for(int i = 0; i < n; i++){
            System.out.println(first);
            int third = first+second;
            first = second;
            second = third;
        }
    }
}
