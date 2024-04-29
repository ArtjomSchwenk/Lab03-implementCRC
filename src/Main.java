package src;

public class Main {
    public static void main(String[] args) {
        // Run the unit tests
        //UnitTests tests = new UnitTests();
        //tests.runAllTests();
        Cli cli = new Cli();
        Grades grades = new Grades();

        UserInput userInput = cli.getInput();
        int option = userInput.option;
        Student student = userInput.student;
        int id = student.getId();

        grades.createGradeReport(id, "Info", 2.3);

        if(option == 1){
            System.out.println(grades.getGradeReport(id));
        }

    }
}
