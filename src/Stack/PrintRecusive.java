package Stack;
import java.util.Stack;
public class PrintRecusive {
    public static void recursive( Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        System.out.println(st.pop());
        recursive(st);
    }
    public static void main(String[]  args){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        recursive(st);
    }
}
