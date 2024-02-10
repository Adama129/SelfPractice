package Self_Practice_08;
import java.util.Scanner;
public class StartsWithX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");

        String word = input.nextLine();
        if(word.charAt(0) == 'x')
            word = word.replaceFirst("x", "a");
        input.close();
        System.out.println(word);
} }
