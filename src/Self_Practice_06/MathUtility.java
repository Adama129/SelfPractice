package Self_Practice_06;

public class MathUtility {
    public static void main(String[] args) {
        int result1 = calculate(10, '+', 20);
        System.out.println(result1);

        double result2 = calculate(2.5, '*', 3.0);
        System.out.println(result2);

        int result3 = square(8);
        System.out.println(result3);

        double result4 = square(1.5);
        System.out.println(result4);

        int result5 = cube(3);
        System.out.println(result5);

        double result6 = cube(2.5);
        System.out.println(result6);
    }

    public static int calculate(int num1, char operation, int num2) {
        switch (operation) {
            case '+' -> {return num1 + num2;}
            case '-' -> {return num1 - num2;}
            case '*' -> {return num1 * num2;}
            case '/' -> {return num1 / num2;}
            default -> {return 0;}
        }
    }

    public static double calculate(double num1, char operation, double num2) {
        switch (operation) {
            case '+' -> {return num1 + num2;}
            case '-' -> {return num1 - num2;}
            case '*' -> {return num1 * num2;}
            case '/' -> {return num1 / num2;}
            default -> {return 0;}
        }
    }

    public static int square(int num1) {
        return calculate(num1, '*', num1);
    }

    public static double square(double num1) {
        return calculate(num1, '*', num1);
    }

    public static int cube(int num1) {
        return calculate(square(num1), '*', num1);
    }

    public static double cube(double num1) {
        return calculate(square(num1), '*', num1);
    }
}
