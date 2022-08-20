package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(solution("abcdef"));
    }

    public static String[] solution(String s) {
        char[] strings = s.toCharArray();
        List<String> list = new LinkedList();
        StringBuilder sb = new StringBuilder();
        int number = 0;
        if (s.length() % 2 == 0) {
            for (int i = 0; i < s.length(); i = i + 2) {
                sb.append(strings[i]);
                sb.append(strings[i+1]);
                list.add(sb.toString());
                sb.delete(0, 2);
            }

        } else {
            for (int i = 0; i < s.length(); i = i + 2) {
                if (i == (s.length() - 1)) {
                    sb.append(strings[i]);
                    sb.append('_');
                    list.add(sb.toString());
                    sb.delete(0, 2);
                    break;
                } else {
                    sb.append(strings[i]);
                    sb.append(strings[i+1]);
                    list.add(sb.toString());
                    sb.delete(0, 2);
                }
            }


        }
        System.out.println(list);

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;


    }
}
