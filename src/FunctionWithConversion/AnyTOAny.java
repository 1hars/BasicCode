package FunctionWithConversion;
import java.util.Scanner;
public class AnyTOAny {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int dnumber = decimal(num,b1);
        deciToAny(dnumber,b2);
        scn.close();
    }
    public static int decimal(int num, int b1){
        int sum = 0;
        int mul = 1;
        while(num != 0){
            int digit = num%10;
            sum = sum+(digit*mul);
            mul = mul*b1;
            num = num/10;
        }
        return sum;
    }
    public static void deciToAny(int dnumber, int b2){
        int sum = 0;
        int mul = 1;
        while(dnumber != 0){
            int digit = dnumber%b2;
            sum = sum + (digit*mul);
            mul = mul*10;
            dnumber = dnumber/b2;
        }
        System.out.println(sum);
    }

}
