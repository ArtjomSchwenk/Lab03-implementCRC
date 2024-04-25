package src;

import java.util.HashMap;
import java.util.Map;

public class Grades{
    public  Map<Integer, String> grades = new HashMap<>();
    public void createGradeReport(int id, String grade){

        grades.put(id, grade);      // TODO: the grade is stored as a string, but it should be stored as a double
    }
    public String getGradeReport(int id) {
        String grade = grades.get(id);
        return grade != null ? grade : "No grade found for student with id " + id;
    }
}
