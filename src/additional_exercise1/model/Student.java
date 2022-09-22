package additional_exercise1.model;

public class Student extends Person{
    private String nameClass;
    private double scores;

    public Student() {
    }

    public Student(int id, String name, String birthDay, String age, String nameClass, double scores) {
        super(id, name, birthDay, age);
        this.nameClass = nameClass;
        this.scores = scores;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                "nameClass='" + nameClass + '\'' +
                ", scores=" + scores +
                '}';
    }
}
