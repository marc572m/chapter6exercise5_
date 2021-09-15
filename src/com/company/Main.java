package com.company;

import java.util.Scanner;

public class Main {

    public static boolean isDoubloon(String s){
        String  testString = s.toLowerCase();
        for (int index = 1;index < testString.length(); index++){
            int count = 0;
            for (int j = 0; j < testString.length(); j++)
                if (testString.charAt(index) == testString.charAt(j))
                {
                    count++;
                }
            if (2 < count || 1 == count) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        boolean result = isDoubloon(s);
        if (result){
            System.out.println(s + " is Doubloon");
        }else{
            System.out.println(s + " isn't Doubloon");
        }
    }
}
