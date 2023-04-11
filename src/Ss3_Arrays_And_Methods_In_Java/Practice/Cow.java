package Ss3_Arrays_And_Methods_In_Java.Practice;

public class Cow {
    private String name;
    private static int numOfCows = 0;

    public Cow() {
    }

    public Cow(String theName){
        this.name = theName;
    }
    public static int getCount(){
        return numOfCows;
    }
    public String getName(){
        return name;
    }

}
