package ss16_text_file.practice;

import java.io.*;

public class practice2 {
    public static void main(String[] args) throws IOException {
       File file=new File("C:\\CODEGYM\\module2\\src\\ss16_text_file\\practice\\Number.txt");
       FileReader fileReader = new FileReader(file);
       BufferedReader bufferedReader = new BufferedReader(fileReader);

       String line;
       int sum = 0;
       while ((line = bufferedReader.readLine()) !=null){
           System.out.println(line);
           sum+= Integer.parseInt(line);
       }
        System.out.println("tổng = "+sum);
       bufferedReader.close();
    }
}
