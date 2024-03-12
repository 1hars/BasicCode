package FunctionWithConversion;
import java.util.Scanner;
public class DigitOfFrequency {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num = scn.nextInt();
        digitFrequency(n,num);
        scn.close();
    }
    public static void digitFrequency(int n, int num){
        int count = 0;
        while(num != 0){
            int digit = num%10;
            if(digit == n){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}
