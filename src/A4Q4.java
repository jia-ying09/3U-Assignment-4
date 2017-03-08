
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating scanner
        Scanner input = new Scanner(System.in);

        //asking for the cost of renting the hall
        System.out.println("How much does the rental for the hall cost?");
        int hall = input.nextInt();

        //asking for the cost of food
        System.out.println("How much does the food cost?");
        int food = input.nextInt();

        //asking for the cost of the DJ
        System.out.println("How much does the DJ cost?");
        int DJ = input.nextInt();

        //asking for the cost of the decorations
        System.out.println("How much does the decorations cost?");
        int decor = input.nextInt();

        //asking for the cost of the staff
        System.out.println("How much does the staff cost?");
        int staff = input.nextInt();

        //asking for the cost of the misellanious 
        System.out.println("How much does the miscellaneous cost?");
        int misc = input.nextInt();

        //finding the sum of everything
        int total = hall + food + DJ + decor + staff + misc;

        //finding how many tickets need to be sold in order to break even
        int tickets = total / 35 + 1; 

        //outputting the number of tickets to break even
        System.out.println("The total cost is " + "$" + total + ". " + "You will need to sell " + tickets + " to break even.");
    }
}
