package src;

public class Teacher extends User {

    String name = "NONE";
    int id = 0;

    Teacher(String name, int id) {
        super(name, id);
    }

    public void putGrade(Grades grades, int id, String subject, double grade) {
        grades.createGradeReport(id, subject, grade);
    }
}
