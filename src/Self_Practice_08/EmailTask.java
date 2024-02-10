package Self_Practice_08;
import java.util.Scanner;
public class EmailTask {
    public static void main(String[] args) {
        Scanner email = new Scanner(System.in);

        System.out.println("Enter your gmail address");

        String newEmail = email.next();

        email.close();

        if (newEmail.contains("_")) {
            String firstPart = newEmail.substring(0, newEmail.indexOf("_"));
            String secondPart = newEmail.substring(newEmail.indexOf("_") + 1, newEmail.indexOf("@"));
            String domainPart = newEmail.substring(newEmail.indexOf("@"));

            System.out.println(secondPart + "_" + firstPart + domainPart);

        } else {
            System.out.println(newEmail);
        }
    }
}
