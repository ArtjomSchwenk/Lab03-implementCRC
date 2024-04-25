package src;

public class UnitTests {
    public String studentChecksGrade(){
        Student s1 = new Student("Dieter", 12345);

        Grades gradeReport = new Grades();
        gradeReport.createGradeReport(12345, "Info: 1.3");

        if (gradeReport.getGradeReport(s1.getId()).equals("Info: 1.3")) {
            return "Test passed";
        } else {
            return "Test failed";
        }
    }
    public String unkownStudentChecksGrade(){
        Student s1 = new Student("James", 54632);

        Grades gradeReport = new Grades();
        gradeReport.createGradeReport(12345, "Info: 1.3");

        if (gradeReport.getGradeReport(s1.getId()).equals("Info: 1.3")) {
            return "Test passed";
        } else {
            return "Test failed";
        }
    }
    public void runAllTests(){
        String result = "";
        result += "studentChecksGrade: " + studentChecksGrade() + "\n"
                + "unknownStudentChecksGrade: " + unkownStudentChecksGrade();

        System.out.println(result);
    }
}
