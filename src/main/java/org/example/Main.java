package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String string = in.nextLine();

        String string ="()[]}";

        System.out.println(checkString(string));

    }

    public static String checkString(String string) {

        char[] brakets = string.toCharArray();

        int openBracket = 0;

        LinkedList<Character> stack = new LinkedList<>();

        for (int i = 0; i < brakets.length; i++) {
            if (brakets[i] == '[' || brakets[i] == '{' || brakets[i] == '('){
                if(stack.isEmpty())
                    openBracket = i+1;
                stack.push(brakets[i]);
            } else if (brakets[i] == ']' || brakets[i] == '}' || brakets[i] == ')') {
                if (stack.peek() == reversal(brakets[i])) {
                    stack.pop();
                } else {
                    return Integer.toString(i+1);
                }
            }



        }

        if(stack.isEmpty()){
            return "Success";
        } else{
            return Integer.toString(openBracket);
        }

    }

    public static Character reversal(Character c){
        switch (c){
            case(']'):
                return '[';
            case('}'):
                return '{';
            case(')'):
                return '(';
            default:
                return '-';
        }
    }
}
