package Self_Practice_05;

public class Alphabets {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'a'; j <= 'z'; j++) {
                System.out.print(i);
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}