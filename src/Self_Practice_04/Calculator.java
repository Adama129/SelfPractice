package Self_Practice_04;

public class Calculator {
    public static void main(String[] args) {

        int n1 = 10,
                n2 = 20;
        char mathOperator = '+';

        switch (mathOperator) {

            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '/':
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("invalid operator.");
        }
    }
}

