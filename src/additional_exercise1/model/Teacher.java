package additional_exercises.model;

public class Teacher extends Person{
    private String specialize;

    public Teacher() {
    }

    public Teacher(int id, String name, String birthDay, String age, String specialize) {
        super(id, name, birthDay, age);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString()+
                "specialize='" + specialize + '\'' +
                '}';
    }
}
