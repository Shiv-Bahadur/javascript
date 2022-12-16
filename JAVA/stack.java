import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack st=new Stack<>();
        st.push(10);
        st.push(12);
        st.push(14);
        st.push(16);
        st.push(18);
        st.push(20);
        System.out.println(st);
        
        int n=(int)st.peek();
        System.out.println(n);
        
    }
}
