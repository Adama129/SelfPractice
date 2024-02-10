package Self_Practice_07;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the cents:");

        int cents = input.nextInt();

        input.close();

        int num1 = cents / 100;
        int num2 = cents % 100;

        System.out.println(cents + " cents is equal to " + num1 + " dollars and " + num2 + " cents");

    }
}
