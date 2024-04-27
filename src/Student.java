package src;

public class Student {

    String name = "NONE";
    int id = 0;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
