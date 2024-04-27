package src;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========");
        System.out.println("LSD RUNNING");
        System.out.println("==========");

        // Run the unit tests
        UnitTests tests = new UnitTests();

        tests.runAllTests();
    }
}
