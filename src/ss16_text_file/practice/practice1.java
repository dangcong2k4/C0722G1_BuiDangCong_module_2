package ss16_text_file.practice;

import java.io.*;

public class practice1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\CODEGYM\\module2\\src\\ss16_text_file\\practice\\numberMax.txt");

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        int max = Integer.parseInt(bufferedReader.readLine());
        while ((line = bufferedReader.readLine())!=null) {
            System.out.println(line);
            if (Integer.parseInt(line)>max){
                max = Integer.parseInt(line);
            }
        }
        System.out.println("max = "+max);
        bufferedReader.close();
    }
}
