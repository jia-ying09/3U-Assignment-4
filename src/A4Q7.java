
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // import scanner
        Scanner input = new Scanner(System.in);

        //put player on square 1
        int one = +1;

        //ask the player the sum of dice
        System.out.println("Enter the sum of the dice");

        //input roll
        int roll = input.nextInt();

        //calculating the spot togo to
        one = one + roll;

        //telling the player what spot they are on
        System.out.println("You are now on square " + one);

        while (true) {

            System.out.println("Enter the sum of the dice");

            //if player inputs 0 they quit the game
            if (roll == 0) {
                System.out.println("YOU QUIT");
                break;

            } else {

                //move if the player rolls between 2-12
                if (roll >= 2 && roll <= 12);
                {

                    //move player
                    int square = input.nextInt();
                    one = one + roll;
                    square = square + one;

                    //if the player lands on a snake
                    //if the player lands on 53 move the player to 19
                    if (square == 53) {
                        square = square - 34;
                    }

                    // if the player lands on 90 move the player to 48
                    if (square == 90) {
                        square = square - 42;
                    }

                    // if the player lands on 99 move the player to 77
                    if (square == 99) {
                        square = square - 22;
                    }

                    //if the player lands on a ladder
                    // if the player lands on 9 move the player to 34
                    if (square == 9) {
                        square = square + 25;
                    }

                    // if the player lands on 40 move the player to 64
                    if (square == 40) {
                        square = square + 24;
                    }

                    // if the player lands on 67 move the player to 86
                    if (square == 67) {
                        square = square + 19;
                    }

                    if (square >= 100) {
                        System.out.println("YOU WIN!");
                        break;
                    }

                    //tell player what their square is
                    System.out.println("You are now on square " + square);

                }
            }
        }
    }
}
