package ss16_text_file.exercise.exercise2;

public class Countries {
    private int id;
    private String code;
    private String name;

    public Countries() {
    }

    public Countries(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "'" + id +
                "', '" + code + '\'' +
                "', '" + name + '\'' +
                "'";
    }
    public String getInFo(){
        return String.format("%s,%s,%s",this.id,this.getCode(),this.getName());
    }


}
