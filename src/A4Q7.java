
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

        //loop
        while (true) {

            //ask for the sum of the dice
            System.out.println("Enter the sum of the dice:");

            //calculating the number
            int roll = input.nextInt();
            int first = roll + 1;
            int firstSpot = roll + first;
            int spot = roll + firstSpot;

            //other rolls: tell them what square they are on
            if (roll >= 2 && roll <= 12) {

                //first spot
                System.out.println("You are now on square " + first);
                              
            } else {
                if (roll == 0) {
                    System.out.println("You quit");
                    break;
                }
            }
            
            //ask for the sum of the dice           
            System.out.println("Enter the sum of the dice:");
            
             //adding amount of dice to previous spot
                System.out.println("Your are now on square " + roll);

                
            }




        }
    }
}
