package ss4_Class_And_Object_In_Java.Exercise;

public class Exe2_StopWatch {
    long start;
    long stop;
    public Exe2_StopWatch(){
    }
    public void getStart(){
        start = System.currentTimeMillis();
    }
    public void getStop(){
        stop = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return stop-start;
    }

    public static void main(String[] args) {
        Exe2_StopWatch stopWatch = new Exe2_StopWatch();
        stopWatch.getStart();
        for (int i = 0; i <1000000000 ; i++) {
            for (int j = 0; j <999999999 ; j++) {

            }
        }
        stopWatch.getStop();
        System.out.println("thời gian chạy chương trình là :"+stopWatch.getElapsedTime()+" milliseconds ");
    }


}
