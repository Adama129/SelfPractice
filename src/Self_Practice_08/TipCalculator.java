package Self_Practice_08;
import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Split or No Split (Yes or No)?");
        String splitOrNot = input.next().toLowerCase();

        while (!(splitOrNot.equals("yes") || splitOrNot.equals("no"))) {
            System.err.println("Invalid entry, please re-enter your answer:");
            splitOrNot = input.next().toLowerCase();
        }

        int numberOfPeople = 1;

        if (splitOrNot.equals("yes")) {
            System.out.println("Enter the number of people:");
            numberOfPeople = input.nextInt();
        }

        while (numberOfPeople <= 0) {
            System.err.println("Invalid entry, please re-enter number of people:");
            numberOfPeople = input.nextInt();
        }

        System.out.println("Enter the check amount:");
        double checkAmount = input.nextDouble();

        while (checkAmount < 0) {
            System.err.println("Invalid entry, please re-enter check amount:");
            checkAmount = input.nextInt();
        }

        System.out.println("How was the Service Quality? (Poor/Fair/Good/Great/Excellent)");


    } }
