
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // inputting scanner
        Scanner input = new Scanner(System.in);

        //ask user for measurement
        System.out.println("Please enter your measurement in inches you wish to convert");

        //when the measurement is given multiply by 2.56
        double measurement = input.nextDouble();
        double answer = 2.54 * measurement;

        //determining the answer
        System.out.println(measurement + " inches " + " is the same as " + answer + " cm");
    }
}
