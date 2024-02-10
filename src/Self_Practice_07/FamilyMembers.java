package Self_Practice_07;
import java.util.Scanner;
public class FamilyMembers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people do you live with?:");
        int people = input.nextInt();
        System.out.println(
                people < 3 ? "Live with less than three people."
                        : people <= 6 ? "Live with 3-6 people."
                        : "Live with more than six people"
        );

    }
}
