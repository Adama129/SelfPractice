package Self_Practice_06;

public class SalaryCalculator {
    public static void main(String[] args) {
        double income = salary(45, 40);
        System.out.println(income);
    }

    public static double salary(double hourly, int weekly) {
        double salaryCalculator = hourly * weekly * 52;
        return salaryCalculator;
    }
}
