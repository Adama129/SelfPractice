package Self_Practice_08;
import java.util.Scanner;
public class FirstAndLastName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter you first name");
        String firstName = input.nextLine();

        System.out.println("Enter you last name");
        String lastName = input.nextLine();

        input.close();

        String firstNameFirstLetter = firstName.substring(0, 1).toUpperCase();
        String firstNameRest = firstName.substring(1).toLowerCase();

        String lastNameFirstLetter = lastName.substring(0, 1).toUpperCase();
        String lastNameRest = lastName.substring(1).toLowerCase();

        System.out.println(firstNameFirstLetter+firstNameRest + " " + lastNameFirstLetter+lastNameRest);
    }
}
