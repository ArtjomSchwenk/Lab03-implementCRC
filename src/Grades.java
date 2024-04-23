package src;

import java.util.HashMap;
import java.util.Map;

public class Grades{
    public  Map<Integer, String> grades = new HashMap<>();
    public void createGradeReport(int id, String grade){

        grades.put(id, grade);
    }
    public String getGradeReport(int id){
        return grades.get(id);
    }
}
