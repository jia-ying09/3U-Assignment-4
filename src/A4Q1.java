
import becker.robots.City;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a scanner to get user input
        Scanner input = new Scanner(System.in);
        //asking user to enter name
        System.out.println("Please enter your name:");

        //scanning name into system input
        String name = input.nextLine();

        System.out.println("Hello " + name + "." + " How are you today?");
    }
}
