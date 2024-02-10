package Self_Practice_07;

public class Employee {
    public static void main(String[] args) {

    }
    public String name;
    public  int age;
    public  char gender;
    public String jobTitle;
    public double salary;

    public void work(){
        System.out.println(jobTitle + " "+ name + " is working.");

    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
} }
