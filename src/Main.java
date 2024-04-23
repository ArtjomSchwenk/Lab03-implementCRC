package src;

public class Main {
    public static void main(String[] args) {
        System.out.println("LSD RUNNING");

        Student s1 = new Student("Dieter", 12345);
        Student s2 = new Student("Hans", 54321);

        /*
        System.out.println("src.Student-Name: " + s1.getName());
        System.out.println("ID: "+ s1.getId());*/

        Grades gradeReport = new Grades();
        gradeReport.createGradeReport(12345, "Info: 1.3");

        System.out.println(gradeReport.getGradeReport(s1.getId()));
    }
}
