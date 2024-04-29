package src;

public class UnitTests {
    public String studentChecksGrade(){
        Student s1 = new Student("Dieter", 12345);

        Grades gradeReport = new Grades();
        gradeReport.createGradeReport(12345, "Info: ", 1.0);

        if (gradeReport.getGradeReport(s1.getId()).equals("{Info: =1.0}")) {
            return "Test passed";
        } else {
            return "Test failed";
        }
    }

    public String TeacherCreatesGradeReport(){
        Student s1 = new Student("Dieter", 12345);
        Teacher t1 = new Teacher("Dr. Kleinen", 54321);

        Grades gradeReport = new Grades();
        t1.putGrade(gradeReport, s1.getId(), "Info: ", 1.0);

        if (gradeReport.getGradeReport(s1.getId()).equals("{Info: =1.0}")) {
            return "Test passed";
        } else {
            return "Test failed";
        }
    }
    public void runAllTests(){
        String result = "";
        result += "studentChecksGrade: " + studentChecksGrade() + "\n" +
                "TeacherCreatesGradeReport: " + TeacherCreatesGradeReport();

        System.out.println(result);
    }
}
