package src;

public class Cli {
    public int option;
    public Student student;

    public int getInput(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("==========\nLSD RUNNING\n==========\nWhats your name?");
        String name = scanner.nextLine();

        System.out.println("Your id?");
        int id = scanner.nextInt();

        System.out.println("What do you want to do?\n1.Check notes\n2.Exit");
        return scanner.nextInt();
    }
}
