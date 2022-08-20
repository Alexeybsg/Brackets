package org.example;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class OldAnswer {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        System.out.println(checkString(string));

    }

    public static String checkString(String string) {

        LinkedList<Character> temp = new LinkedList<>();
        int openBrake=0;
        char[] letters = string.toCharArray();

        for (int i = 0; i < letters.length; i++) {

            switch (letters[i]) {
                case ('['):

                case ('('):

                case ('{'):
                    if (temp.isEmpty()) {
                        openBrake = i + 1;
                    }
                    temp.push(letters[i]);
                    break;

                case (']'):
                    if (temp.peek() == (Character) '[') {
                        temp.pop();
                        break;
                    } else {
                        return Integer.toString(i + 1);
                    }

                case ('}'):
                    if (temp.peek() == (Character) '{') {
                        temp.pop();
                        break;
                    } else {
                        return Integer.toString(i + 1);
                    }

                case (')'):
                    if (temp.peek() == (Character) '(') {
                        temp.pop();
                        break;
                    } else {
                        return Integer.toString(i + 1);
                    }
            }
        }

        if(temp.isEmpty()){
            return "Success";
        }
        else {
            return Integer.toString(openBrake);
        }
    }
}