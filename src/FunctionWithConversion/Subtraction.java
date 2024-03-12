package FunctionWithConversion;
import java.util.Scanner;
public class Subtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int base = scn.nextInt();
        subtract(n1,n2,base);
    }
    public static void subtract(int n1, int n2, int base){
        int num1 = 0, num2 = 0, carry = 0, mul = 1;
        int ans = 0;
        while(n1 > 0){
            num1 = n1%10;
            num2 = n2%10;
            num1 = num1+carry;
            int digit = 0;
            if(num1 >= num2){
                carry = 0;
                digit = num1-num2;
            }else{
                carry = -1;
                num1 = num1+base;
                digit = num1-num2; //77
            }
            ans = ans + (digit*mul);
            mul = mul*10;
            n1 = n1/10;
            n2 = n2/10;
        }
        System.out.println(ans);
    }
}
// 2*10+7=27 ,,, 500+27 = 527