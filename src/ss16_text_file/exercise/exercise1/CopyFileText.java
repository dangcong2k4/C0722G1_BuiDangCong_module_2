package ss16_text_file.exercise.exercise1;


import java.io.*;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\CODEGYM\\module2\\src\\ss16_text_file\\exercise\\exercise1\\source.txt");
        File file1 = new File("C:\\CODEGYM\\module2\\src\\ss16_text_file\\exercise\\exercise1\\target.txt");

        FileReader fileReader = new FileReader(file);
        FileWriter fileWriter = new FileWriter(file1);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line;
        int count = 0;
        while ((line = bufferedReader.readLine()) !=null) {
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) != ' ') {
                    count++;
                }
            }
            bufferedWriter.write(line);
            bufferedWriter.newLine();

        }
        bufferedWriter.write("tổng các ký tự là : "+count);
        bufferedReader.close();
        bufferedWriter.close();
    }
}
