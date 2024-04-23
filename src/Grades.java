import java.util.HashMap;
import java.util.Map;

public class Grades{
    private static Map<Integer, String> grades = new HashMap<>();
    public static void createGradeReport(String[] args){

        grades.put(12345, "Info: 1.3");
        grades.put(54321, "GDM: 2.0; Math:3.7");
    }
    public static String getGradeReport(int id){
        return grades.get(id);
    }
}
