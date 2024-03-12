package Stack;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.Stack;
public class PushThroughRecusive {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        out.println("Enter the push number");
        int n = scn.nextInt();
        pushAtfirst(st,n);
        out.println(st);
    }
    public static void pushAtfirst(Stack<Integer> st,int n){
        if(st.isEmpty()){
            st.push(n);
            return;
        }
        int top = st.pop();
        pushAtfirst(st,n);
        st.push(top);
    }

}
