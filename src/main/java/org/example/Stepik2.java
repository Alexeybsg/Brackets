package org.example;

import java.util.LinkedList;
import java.util.Scanner;

public class Stepik2 {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int numberOfPackets = Integer.parseInt(scanner.nextLine());
        String[] string = new String[numberOfPackets];
        int maxnumber=0;
        for (int i = 0; i < numberOfPackets; i++) {
            string[i] = scanner.nextLine();
        }
        for (String s: string
             ) {
            if(s.matches("push .*")){
                stack.push(Integer.parseInt(s.replaceAll("push ", "")));
                maxnumber++;
            }
            if(s.matches("pop .*")){
                stack.pop();
            }
            if(s.matches("max")){
                System.out.println(maxnumber);
            }
        }

    }
}