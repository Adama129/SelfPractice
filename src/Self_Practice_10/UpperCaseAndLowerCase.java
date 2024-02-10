package Self_Practice_10;

public class UpperCaseAndLowerCase {


        public static void main(String[] args) {

            String str = "JAVA java";

            int numOfUpperCase = 0;
            int numOfLowerCase = 0;

            for (char eachCh : str.toCharArray()) {

                if (Character.isUpperCase(eachCh))
                    numOfUpperCase++;
                if (Character.isLowerCase(eachCh))
                    numOfLowerCase++;
            }

            boolean upperCIsEqualLoverC = numOfUpperCase == numOfLowerCase;
            System.out.println(upperCIsEqualLoverC);

        }
}
