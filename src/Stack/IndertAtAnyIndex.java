package Stack;

import java.util.Stack;

public class IndertAtAnyIndex {
    public static void main(String[] args){

        Stack<Integer> str = new Stack<>();
        str.push(10);
        str.push(20);
        str.push(30);
        str.push(40);
        insert(str,55,2);
    }
    public static void insert(Stack<Integer> str,int n,int idx){
        Stack<Integer> gtr = new Stack<>();
        while(!str.isEmpty()){
            gtr.push(str.pop());
        }
        System.out.println(gtr);
        while (!gtr.isEmpty()){
            if(str.size()==idx-1){
                str.push(n);
            }else{
                str.push(gtr.pop());
            }
        }
        System.out.println(str);
    }
}
