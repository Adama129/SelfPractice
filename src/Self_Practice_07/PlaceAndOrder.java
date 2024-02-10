package Self_Practice_07;
import java.util.Scanner;
public class PlaceAndOrder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name:");
        String productName = input.nextLine();

        System.out.println("Enter the price:");
        double productPrice = input.nextDouble();

        System.out.println("Enter the quantity:");
        int productQuantity = input.nextInt();

        System.out.println("Enter your first name");
        String firstName = input.next();

        double total = productQuantity * productPrice;

        System.out.println(firstName + ", your order for " + productQuantity + " " + productName +
                " has been placed. Your total is " + total);

        input.close();

    }
}
