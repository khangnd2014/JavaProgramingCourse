package nestech.javacourse.example.condition;

public class Student {
    private String fistname;
    public String lastName;
    private double score;

    public Student(String fistname, String lastName, double score) {
        this.fistname = fistname;
        this.lastName = lastName;
        this.score = score;
    }

    public String getName() {
        return this.fistname + " " + this.lastName;
    }

    public double getScore() {
        return score;
    }

    public void setFullName(String fistname, String lastName) {
        this.fistname = fistname;
        this.lastName = lastName;
    }
}
