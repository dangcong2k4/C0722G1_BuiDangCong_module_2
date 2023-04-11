package ss19_string_regex.pracice;

public class sutdent {
    private int index;
    private int id;
    private String name;
    private String birth;
    private int gender;
    private double score;

    public sutdent() {
    }

    public sutdent(int index, int id, String name, String birth, int gender, double score) {
        this.index = index;
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.score = score;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "sutdent{" +
                "index=" + index +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", gender=" + gender +
                ", score=" + score +
                '}';
    }
}
