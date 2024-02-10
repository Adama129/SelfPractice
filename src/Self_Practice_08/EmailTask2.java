package Self_Practice_08;
import java.util.Scanner;
public class EmailTask2 {
    public static void main(String[] args) {

        Scanner email = new Scanner(System.in);

        System.out.println("Enter your e-mail address");

        String newEmail = email.nextLine();

        email.close();

        int indexOfUnderScore = newEmail.indexOf("_");
        int indexOfAt = newEmail.indexOf("@");
        int indexOfDot = newEmail.indexOf(".");

        String firstName = newEmail.substring(0,1).toUpperCase() + newEmail.substring(1, indexOfUnderScore).toLowerCase();
        String secondName = newEmail.substring(indexOfUnderScore +1 , indexOfUnderScore+2).toUpperCase() + newEmail.substring(indexOfUnderScore+2,indexOfAt).toLowerCase();
        String domain = newEmail.substring(indexOfAt+1, indexOfDot);

        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Domain: " + domain);
    }
}
