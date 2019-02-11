package com.inclusivity.solutions;

import com.inclusivity.solutions.utils.Utility;

import java.util.Scanner;

/**
 * Created by amukelani.g.mathye on 2019/02/11.
 */
public class PokerHand {

    final static String faces = "AKQJT98765432";
    final static String suits = "HDSC";

    public static void main(String[] args) {

        Utility utils = new Utility();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter 5 cards separated by space, ie: AS 3D 4S 5C 7H: ");

        String cards = in.nextLine();

        System.out.println(cards);

        String input = utils.check10InTheInputs(cards);

        System.out.println(input);

        System.out.println(utils.analyzeHand(input.split(" "), faces, suits));

    }
}
