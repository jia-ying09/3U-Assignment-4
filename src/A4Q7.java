
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
        //calculating the number

        System.out.println("Enter the sum of the dice:");

        int roll = input.nextInt() + 1;

        //ask for the sum of the dice
        while (roll >= 3 && roll <= 13) {

            //first spot
            System.out.println("You are now on square " + roll);

            while (roll == 0) {
                System.out.println("You quit");

            }
        }
        while (true) {
            int spot = roll;
            //other rolls: tell them what square they are on              
            //ask for the sum of the dice      
            System.out.println("Enter the sum of the dice:");
            if (roll >= 3 && roll <= 13) {
                
                //first spot 
                int square = roll + spot;
                System.out.println("You are now on square " + square);
                
                System.out.println("Enter the sum of the dice:");
                input.nextInt;
                // spot 
                System.out.println("You are now on square " + square);

            } else {
                if (roll == 0) {
                    System.out.println("YOU QUIT");
                    break;

                }
            }


            // if the player lands on 53 move the player to 19
            //  if (spot == 53) {
            //  spot - 34;
            //System.out.println("You are now on square " + spot);

            // if the player lands on 90 move the player to 48
            //  if (spot == 90) {
            //  spot - 42;
            //System.out.println("You are now on square " + spot);

            // if the player lands on 99 move the player to 77
            //  if (spot == 99) {
            //  spot - 22;
            //System.out.println("You are now on square " + spot);
            
            // if the player lands on 9 move the player to 34
            //  if (spot == 9) {
            //  spot + 25;
            //System.out.println("You are now on square " + spot);

            // if the player lands on 40 move the player to 64
            //  if (spot == 40) {
            //  spot + 24;
            //System.out.println("You are now on square " + spot);

            // if the player lands on 67 move the player to 86
            //  if (spot == 67) {
            //  spot + 19;
            //System.out.println("You are now on square " + spot);


        }




    }
}
}
