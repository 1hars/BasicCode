package String.org;
import java.util.Scanner;
public class SubString {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        for(int i = 0; i < str.length(); i++){
            for(int j = i+1;  j <= str.length(); j++){
                System.out.print(str.substring(i,j)+"\t");
            }
            System.out.println();
        }

    }
}
