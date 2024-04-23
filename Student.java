public class Student {

    String name = "NONE";
    int matrikelnr = 0;

    Student(String name, int matrikelnr) {
        this.name = name;
        this.matrikelnr = matrikelnr;
    }

    public String getName() {
        return name;
    }

    public int getMatrikelnr() {
        return matrikelnr;
    }
}
