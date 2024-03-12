package FunctionWithConversion;
import java.util.Scanner;
public class DecimalToAny {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int b = scn.nextInt();
        conversion(num,b);
        scn.close();
    }
    public static void conversion(int num, int b){
        int sum = 0;
        int mul = 1;
        while(num != 0){
            int rem = num%b;
            sum = sum+(rem*mul);
            mul = mul*10;
            num = num/b;
        }
        System.out.println("The conversion value is "+sum);
    }
}
