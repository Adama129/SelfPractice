package Self_Practice_04;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 42;

        if (age <= 20) {
            System.out.println("Teenager");
        } else if (age <= 40) {
            System.out.println("Young adult");
        } else if (age <=49) {
            System.out.println("Young Middle-Aged Adult");
        } else if (age <= 59) {
            System.out.println("Middle-Aged adult");
        } else if (age <=100) {
            System.out.println("Old adult");
        } else {
            System.out.println("Invalid");

    }
} }
