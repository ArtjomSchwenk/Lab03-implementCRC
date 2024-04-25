package src;

public class UnitTests {
    public void studentChecksGrade(){
        Student s1 = new Student("Dieter", 12345);
        Student s2 = new Student("Hans", 54321);

        Grades gradeReport = new Grades();
        gradeReport.createGradeReport(12345, "Info: 1.3");

        System.out.println(gradeReport.getGradeReport(s1.getId()));
    }
}
