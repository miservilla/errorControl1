package com.company;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String item = TryParseIn(in.next());
        int Item1 = Integer.parseInt(item);

        System.out.println(Item1);
    }

    private static String TryParseIn(String number){
        int i = 0;
        while (i == 0) {
            try {
                Integer.parseInt(number);
                return number;
            }
            catch (NumberFormatException e){
                System.out.println("Value can't be parsed as a number, please try again!");
                i = 0;
                Scanner in = new Scanner(System.in);
                number = in.next();
            }
        }

        return number;
    }
}
