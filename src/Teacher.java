package src;

public class Teacher {

    String name = "NONE";
    int id = 0;

    Teacher(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void putGrade(Grades grades, int id, String subject, double grade) {
        grades.createGradeReport(id, subject, grade);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
