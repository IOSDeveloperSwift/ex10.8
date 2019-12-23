package com.Doloscan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        squareOfCharacter();

    }

    static void squareOfCharacter() {

        int side;
        char fill;

        Scanner scr = new Scanner(System.in);
        System.out.print("Enter side => ");
        side = scr.nextInt();
        System.out.print("Enter char => ");
        fill = scr.next().charAt(0);


        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++)
                System.out.print(fill + " ");
            System.out.println();
        }


    }
}
