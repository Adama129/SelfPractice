package Self_Practice_08;
import java.util.Scanner;
public class WithoutFirstChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first word");

        String firstWord = input.next();

        System.out.println("Enter your second word");

        String secondWord = input.next();

        String new1 = firstWord.substring(1);

        String new2 = secondWord.substring(1);

        System.out.println(new1 + new2);

    }
}
