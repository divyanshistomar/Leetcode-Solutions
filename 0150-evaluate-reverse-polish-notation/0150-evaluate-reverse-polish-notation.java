class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];

            if (!s.equals("+") &&  !s.equals("-") && !s.equals("*") && !s.equals("/")) {
                st.push(Integer.valueOf(s));
            }else{
            
        
                int b = st.pop();
                int a = st.pop();
                switch(s){
                    case "+":
                    st.push(a+b);
                    break;
                    case "-":
                    st.push(a-b);
                    break;
                    case "*":
                    st.push(a*b);
                    break;
                    case "/":
                    st.push(a/b);
                        }
            }
        }
               
            
            

        return st.peek();
    }
}