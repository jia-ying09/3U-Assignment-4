
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating scanner
        Scanner input = new Scanner(System.in);

        //asking for four numbers on seperate lines
        System.out.println("Please enter in numbers on 4 seperate lines:");

        //inputting numbers
        double first = input.nextDouble();
        double second = input.nextDouble();
        double third = input.nextDouble();
        double fourth = input.nextDouble();

        //repeating back the numbers
        System.out.println("Your numbers were " + first + "," + second + "," + third + "," + fourth + ",");
    }
}
