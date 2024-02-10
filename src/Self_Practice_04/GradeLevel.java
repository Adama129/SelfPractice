package Self_Practice_04;

public class GradeLevel {
    public static void main(String[] args) {

        byte gradeLevel = 8;

        if (gradeLevel <= 5 ) {
            System.out.println("Elementary school");
        } else if (gradeLevel <= 8) {
            System.out.println("Middle school");
        } else if (gradeLevel <= 12) {
            System.out.println("High school");
        } else if (gradeLevel <=16) {
            System.out.println("College");
        } else if (gradeLevel <=18) {
            System.out.println("grad school");
        } else {
            System.out.println("Invalid grade level");
        }
    }
}
