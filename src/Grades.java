package src;

import java.util.HashMap;
import java.util.Map;

public class Grades{
    public  Map<Integer, Map<String, Double>> grades = new HashMap<>();

    public void createGradeReport(int id, String subject, double grade){
        Map<String, Double> studentGrade = new HashMap<>();
        studentGrade.put(subject, grade);
        grades.put(id, studentGrade);
    }
    public String getGradeReport(int id) {
        Map<String, Double> studentGrade = grades.get(id);
        if(studentGrade == null){
            return "No grade found for student with id " + id;
        } else {
            return studentGrade.toString();
        }
        //String report = grades.get(id).toString();
        //return report != null ? report: "No grade found for student with id " + id;
    }
}
