package FunctionWithConversion;
import java.util.Scanner;
public class AnyTODecimal {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        anytodecimal(n,b);
        scn.close();
    }
    public static void anytodecimal(int n, int b){
        int sum = 0;
        int mul = 1;
        while(n != 0){
            int digit = n%10;
            sum = sum+(digit*mul);
            mul = mul*b;
            n = n/10;
        }
        System.out.println("Conversion is ready for u "+ sum);
    }
}
