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
    public String unknownStudentChecksGrade(){
        Student s1 = new Student("James", 54632);

        Grades gradeReport = new Grades();
        gradeReport.createGradeReport(12345, "Info: 1.3");

        if (!gradeReport.getGradeReport(s1.getId()).equals("Info: 1.3")) {
            return "Test passed. Unknown student";
        } else {
            return "Test failed. Known student";
        }
    }
    public void runAllTests(){
        String result = "";
        result += "studentChecksGrade: " + studentChecksGrade() + "\n"
                + "unknownStudentChecksGrade: " + unknownStudentChecksGrade();

        System.out.println(result);
    }
}
