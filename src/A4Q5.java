
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // inserting scanner
        Scanner input = new Scanner(System.in);

        //asking for the student's name
        System.out.println("What is your name?");
        String name = input.nextLine();

        //asking for the total of the first test
        System.out.println("What was the first test out of?");
        double total1 = input.nextDouble();

        //asking for the mark of the first test
        System.out.println("What mark did you get?");
        double mark1 = input.nextDouble();

        //getting the percentage
        double percent1 = (mark1 / total1) * 100;

        //asking for the total of the second test
        System.out.println("What was the second test out of?");
        double total2 = input.nextDouble();


        //asking for the mark of the second test
        System.out.println("What mark did you get?");
        double mark2 = input.nextDouble();

        //getting the percentage
        double percent2 = (mark2 / total2) * 100;

        //asking for the total of the third test
        System.out.println("What was the third test out of?");
        double total3 = input.nextDouble();

        //asking for the mark of the third test
        System.out.println("What mark did you get?");
        double mark3 = input.nextDouble();

        //getting the percentage
        double percent3 = (mark3 / total3) * 100;

        //asking for the total of the fourth test
        System.out.println("What was the fourth test out of?");
        double total4 = input.nextDouble();

        //asking for the mark of the fourth test
        System.out.println("What mark did you get?");
        double mark4 = input.nextDouble();

        //getting the percentage
        double percent4 = (mark4 / total4) * 100;


        //asking for the total of the fifth test
        System.out.println("What was the fifth test out of?");
        double total5 = input.nextDouble();

        //asking for the mark of the fifth test
        System.out.println("What mark did you get?");
        double mark5 = input.nextDouble();

        //getting the percentage
        double percent5 = (mark5 / total5) * 100;

        //adding up all the percentages to get the average
        double average = (percent1 + percent2 + percent3 + percent4 + percent5) / 5;

        //telling the user what their mark is
        System.out.println("Test scores for " + name);
        System.out.println("Test 1: " + percent1 + "%");
        System.out.println("Test 2: " + percent2 + "%");
        System.out.println("Test 3: " + percent3 + "%");
        System.out.println("Test 4: " + percent4 + "%");
        System.out.println("Test 5: " + percent5 + "%");
        System.out.println("Average: " + average + "%");
    }
}
