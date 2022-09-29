package ss16_text_file.exercise.exercise2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCountries {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\CODEGYM\\module2\\src\\ss16_text_file\\exercise\\exercise2\\data\\countries.csv");

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        List<Countries> countriesList = new ArrayList<>();
        String[] inFo;
        Countries countries;
        while ((line = bufferedReader.readLine())!=null) {
            inFo = line.split(",");
            countries = new Countries(Integer.parseInt(inFo[0]),inFo[1],(inFo[0]));
            countriesList.add(countries);

        }

        bufferedReader.close();
        for (Countries countries1:countriesList) {
            System.out.println(countries1);
        }
    }
}
