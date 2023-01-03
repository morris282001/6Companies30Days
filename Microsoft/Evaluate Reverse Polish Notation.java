class Solution {
    public int evalRPN(String[] tokens) {
       
        int t1=0;
        int t2=0;
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0; i<tokens.length; i++){
            switch(tokens[i]){

                case "+": t1 = s.pop();
                t2 = s.pop();
                
                s.push(t1+t2);
                break;

                case "-": t1 = s.pop();
                t2 = s.pop();
                
                s.push(t2-t1);
                break;

                case "*": t1 = s.pop();
                t2 = s.pop();
                
                s.push(t1*t2);
                break;

                case "/": t1 = s.pop();
                t2 = s.pop();
                
                s.push(t2/t1);
                break;

                default: s.push(Integer.parseInt(tokens[i]));

            }
        }

    return s.peek();
        
    }
}
