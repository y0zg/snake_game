package com;

import java.util.Scanner;

public class SimpleGame {
    public static void main(String[] args) {
        MovementLoop();
    }

    public static void MovementLoop() {

        Scanner input = new Scanner(System.in);

        int pos = 10, linepos = 2;
        String keypressed;
        boolean playing = true;

        while (playing) {
            Display dObj = new Display(linepos, pos);
            dObj.drawImage();
            keypressed = input.nextLine();
            if (keypressed.equals("w")) {
                linepos -= 1;
            } else if (keypressed.equals("s")) {
                linepos += 1;
            } else if (keypressed.equals("a")) {
                pos -= 1;
            } else if (keypressed.equals("d")) {
                pos += 1;
            } else if (keypressed.equals("q")) {
                System.out.println("You have quit the game.");
                playing = false;
            } else {
                System.out.println("\nplease use w a s d\n");
            }
        }
    }
}