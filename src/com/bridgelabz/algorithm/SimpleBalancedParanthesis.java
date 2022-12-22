package com.bridgelabz.algorithm;
import java.util.Stack;
public class SimpleBalancedParanthesis {
    public static boolean balancedParenthesis(String string) {
        Stack stack = new Stack();
        for (int i = 0; i < string.length(); i++) {
            char x = string.charAt(i);
            if (x == '(' || x == '[' || x == '{')
                 {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty()) return false;
            char check;
            switch (x) {
                case ')':
                    check = (char) stack.pop();
                    if (check == '{' || check == '[') return false;
                    break;
                case '}':
                    check = (char) stack.pop();
                    if (check == '(' || check == '[') return false;
                    break;
                case ']':
                    check = (char) stack.pop();
                    if (check == '(' || check == '{') return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
    public static void main(String[] args) {
        /**
         * given arithmatic expression
         * (5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)
         */
        String string = "{(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)}";
        if (balancedParenthesis(string))
            System.out.println("Balanced paranthesis");
        else
            System.out.println("not Balanced");
    }
}