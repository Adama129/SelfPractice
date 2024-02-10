package Self_Practice_08;
import java.util.Scanner;
public class Cydeo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = input.nextLine();
        firstName = firstName.substring(0,1).toUpperCase()+ firstName.substring(1,firstName.length()).toLowerCase();
        System.out.println("Enter last name: ");
        String lastName = input.nextLine();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1, lastName.length()).toLowerCase();
        input.close();
        System.out.println(firstName + " " +lastName);
} }
