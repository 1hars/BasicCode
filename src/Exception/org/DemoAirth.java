package Exception.org;

public class DemoAirth {
    public static void main(String[] args){
        try{
            int var1 = 10;
            int var2 = 10/0;
        }
        catch(NullPointerException ee){
            System.out.println("Exception");
        }
        finally{
            System.out.println("Inside the finally");
        }
        System.out.println("This is for you");
    }
}
