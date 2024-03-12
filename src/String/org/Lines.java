package String.org;
import java.util.Scanner;
public class Lines {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        String str = scn.nextLine();
//        System.out.println(str);
//        System.out.println(str.indexOf('l'));
//        String st = new String("Hello");
//        String gtr = new String("Aello");
//        System.out.println(st.compareTo(gtr));
        String str = "abcde";
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
        scn.close();
    }
}
