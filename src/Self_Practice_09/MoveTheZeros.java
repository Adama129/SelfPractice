package Self_Practice_09;
import java.util.Arrays;
public class MoveTheZeros {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};

        Arrays.sort(array);
        int[] reversedArray = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
