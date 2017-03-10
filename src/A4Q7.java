
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

        //ask for the sum of the dice
        System.out.println("Enter the sum of the dice:");

        //calculating the number
        int roll = input.nextInt();
        int first = roll + 1;


        {
            //first roll: tell them what square they are on
            System.out.println("You are now on square " + first);

            //other rolls: tell them what square they are on
            
            if (roll >= 2 && roll <= 12);{        
        System.out.println("You are now on square " + roll);
        } else {
                System.out.println("You quit");
    }
}
