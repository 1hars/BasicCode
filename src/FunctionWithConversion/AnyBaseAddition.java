package FunctionWithConversion;
import java.util.Scanner;
public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int base = scn.nextInt();
        addition(n1,n2,base);
        scn.close();
    }
    public static void addition(int n1, int n2, int base){
        int mul = 1;
        int ans = 0;
        int carry = 0;
        while(n1 != 0 || n2 != 0 || carry != 0){
            int num1 = n1%10;
            int num2 = n2%10;
            int sum = num1+num2+carry;
            ans = ans+ (sum%base)*mul;
            mul = mul*10;
            n1 = n1/10;
            n2 = n2/10;
            carry = sum/base;
        }
        System.out.println(ans);

    }
}
