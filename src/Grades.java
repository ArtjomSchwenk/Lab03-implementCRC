package src;

import java.util.HashMap;
import java.util.Map;

public class Grades{
    public  Map<Integer, Map<String, Double>> grades = new HashMap<>();

    public void createGradeReport(int id, String subject, double grade){
        Map<String, Double> studentGrade = new HashMap<>();
        studentGrade.put(subject, grade);
        grades.put(id, studentGrade);      // TODO: the grade is stored as a string, but it should be stored as a double
    }
    public String getGradeReport(int id) {
        String grade = grades.get(id).toString();
        return grade != null ? grade : "No grade found for student with id " + id;
    }
}
