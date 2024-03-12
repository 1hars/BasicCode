package Exception.org;

public class Conversion {
    public static void main(String[] args){
        try {
            String str = "10";
            int num = Integer.parseInt(str);
            System.out.println(num);
            String str1 = "Java";
            int n = Integer.parseInt(str1);
            System.out.println(n);
        }
        catch(NumberFormatException ee){
            System.out.println(ee);
        }
    }
}
