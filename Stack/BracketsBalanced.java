package Stack_Java;

import java.util.Stack;

public class BracketsBalanced {
    public static void main(String[] args) {
        String exp = "{a+[b+(c+d)]+(e+f)}";
        System.out.println("Expression is Balanced:-" + checkBal(exp));
    }

    private static boolean checkBal(String exp){
        if(exp.isEmpty())
        {
        return true;
        }
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<exp.length();i++){
            char current = exp.charAt(i);
            if(current=='(' || current=='[' || current=='{'){
                stack.push(current);
            }
            if(current==')' || current==']' || current=='}'){
                if(stack.isEmpty()){
                    return false;
                }
                char last = stack.peek();
                if(current == '}' && last=='{' || current==')' && last=='(' || current==']' && last=='[')
                  stack.pop();
                else
                return false;
            }
        }
        return stack.isEmpty()?true:false;
    }
}
