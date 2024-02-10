package Self_Practice_09;
import java.util.Arrays;
import java.util.Scanner;
public class ClassMatesInitials {
    public static void main(String[] args) {
        String[] names = {"John Doe","Alice Smith", "Robert Johnson","Daniel Arron", "Jimmy Joe", "Mike Jonathan", "Breanna King", "John Smith", "Anne White", "Walter Ray"};
        String[] initials = findIniials(names);
        System.out.println(Arrays.toString(initials));
        for (int i = 0; i < names.length; i++) {
            System.out.println(initials[i]);
        }

    }
    public static String[] findIniials(String[] names){
        String[] initials = new String[names.length];
        for (int i = 0; i < names.length ; i++) {

            initials[i]=names[i].charAt(0)+""+names[i].charAt(names[i].indexOf(" ")+1);
        }
        return initials;
    }
}
