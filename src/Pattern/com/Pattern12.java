package Pattern.com;
import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int first = 0, second = 1;
        for(int row = 1; row <= n; row++){
            int col = row;
            for(int i = 1; i <= col; i++){
                System.out.print(first+"\t");
                int third = first+second;
                first = second;
                second = third;
            }
            System.out.println();
        }
        scn.close();
    }
}
