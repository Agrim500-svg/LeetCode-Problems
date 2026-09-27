class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> l=new Stack<>();
        for(String i:tokens){
            if(!i.equals("+")&&!i.equals("-") && !i.equals("*") && !i.equals("/")){
                l.push(Integer.parseInt(i));
            }
            if(i.equals("+")||i.equals("-") || i.equals("*") || i.equals("/")){
                int b=l.pop();
                int a=l.pop();
                switch(i){
                    case "+":
                        l.push(a+b);
                        break;
                    case "-":
                        l.push(a-b);
                        break;
                    case "*":
                        l.push(a*b);
                        break;
                    case "/":
                        l.push(a/b);
                        break;
                }
            }
        }
        return l.peek();
    }
}