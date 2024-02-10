package Self_Practice_10;
import java.util.Arrays;
import java.util.ArrayList;
public class CombineTwoArrays {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));

        System.out.println("list ==> " + list);
    }

}
