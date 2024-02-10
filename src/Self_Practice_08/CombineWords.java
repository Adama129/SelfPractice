package Self_Practice_08;
import java.util.Scanner;
public class CombineWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String word1 = input.next();
        System.out.println("Enter second word: ");
        String word2 = input.next();
        input.close();
        if (word1.charAt(word1.length()-1) == word2.charAt(0))
            word2 = word2.substring(1);
        System.out.println("Output: " + word1+word2);
} }
