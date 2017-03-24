
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
        int one = + 1;

        while (true) {

            //roll dice
            
            System.out.println("Enter the sum of the dice");
            int roll = input.nextInt() + 1;  
            System.out.println("You are now on square " + roll);
            if (roll >= 2 && roll <= 12){

            //move player
            int spot = roll + one ;
            int square = input.nextInt() + spot;

            //tell player what their square is
            System.out.println("You are now on square " + square);

            //if the player lands on a snake
            //if the player lands on 53 move the player to 19
            if (square == 53) {
                square = square - 34;
                System.out.println("You are now on square " + square);
            }

            // if the player lands on 90 move the player to 48
            if (square == 90) {
                square = square - 42;
                System.out.println("You are now on square " + square);}

                // if the player lands on 99 move the player to 77
                if (square == 99) {
                    square = square - 22;
                    System.out.println("You are now on square " + square);}

                    
                    //if the player lands on a ladder
                    // if the player lands on 9 move the player to 34
                    if (square == 9) {
                        square = square + 25;
                        System.out.println("You are now on square " + square);}

                        // if the player lands on 40 move the player to 64
                        if (square == 40) {
                            square = square + 24;
                            System.out.println("You are now on square " + square);}

                            // if the player lands on 67 move the player to 86
                            if (square == 67) {
                                square = square + 19;
                                System.out.println("You are now on square " + square);}
                            
                            if (square == 100) {
                                System.out.println("YOU WIN!");
                                break;
                            }
            
                            }
                        }
                    }
