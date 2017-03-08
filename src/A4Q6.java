
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // insert scanner
        Scanner input = new Scanner(System.in);

        //asking user for speed limit
        System.out.println("Enter speed limit:");
        int limit = input.nextInt();

        //asking user for record speed
        System.out.println("Enter the record speed of the car:");
        int record = input.nextInt();

        //calculating if the speed is over the limit
        int pass = record - limit;

        // if the speed is within the limit: pass       
        if (pass <= 0);
        {
            System.out.println("Congradulations, you are within the speed limit!");
        }

        // if the speed is 1-20 above the limit: $100
        if  (pass >= 1);
        {
            System.out.println("You are speeding and your fine is: $100");
        }

        // if the speed is 21-30 above the limit: $270
        if (pass >= 21);
        {
            System.out.println("You are speeding and your fine is: $270");
        }

        // if the speed is 31-above above the limit: $500
        if (pass >= 31);
        {
            System.out.println("You are speeding and your fine is: $500");
        }

    }
}
