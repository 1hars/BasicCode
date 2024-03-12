package FunctionWithConversion;
import java.util.Scanner;
public class AnyBaseMultiplication{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int on1 = n1;
        int add1 = 0;
        int add2 = 0;
        int mul = 1;
        int div1 = n2%10;
        while(n1 != 0){
            int digit = n1%10;
            int mulans = digit*div1;
            add1 = (mulans*mul)+add1;
            mul = mul*10;
            n1 = n1/10;
        }
        div1 = n2/10;
        mul = 10;
        while(on1 != 0){
            int digit = on1%10;
            int mulans = digit*div1;
            add2 = (mulans*mul)+add2;
            mul = mul*10;
            on1 = on1/10;
        }
        int carry = 0;
        mul = 1;
        int sum = 0;
        while(add1 != 0 || add2 != 0 || carry != 0){
            int var1 = add1%10;
            int var2 = add2%10;
            int lsum = var1+var2+carry;
            sum = sum+(lsum%base)*mul;
            add1 = add1/10;
            add2 = add2/10;
            carry = lsum/base;
            mul = mul*10;
        }
        System.out.println(sum);
    }
}