package Stack;
import java.util.Stack;
import static java.lang.System.out;
public class ForPrint {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        int n = st.size();
//        Stack<Integer> gt = new Stack<>();
//        while(!st.isEmpty()){
//            gt.push(st.pop());
//        }
//        out.println(gt);
//        while (!gt.isEmpty()){
//            int n = gt.pop();
//            out.print(n+"\n");
//            st.push(n);
//        }
        int arr[] = new int[n];
        for(int i = n-1; i >= 0; i--){
            arr[i] = st.pop();
        }
        for(int i = 0; i < arr.length; i++){
            out.println(arr[i]);
            st.push(arr[i]);
        }
    }
}
