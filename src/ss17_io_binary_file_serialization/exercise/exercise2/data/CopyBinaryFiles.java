package ss17_io_binary_file_serialization.exercise.exercise2.data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyBinaryFiles {
    public static void main(String[] args) {
        String destFile = "src\\ss17_io_binary_file_serialization\\exercise\\exercise2\\data\\destFile";
        String copyFile = "src\\ss17_io_binary_file_serialization\\exercise\\exercise2\\data\\copyFile";
        List<String> stringList = new ArrayList<>();
        stringList.add("cong");
        stringList.add("dat");
        stringList.add("khanh");
        stringList.add("hjhjhj");
        stringList.add("hjhjhj");
        writeFile(stringList, destFile);
        readFile(stringList, destFile);
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(destFile);
            os = new FileOutputStream(copyFile);
            byte[] buffer = new byte[300];
            int length;
            int count = 0;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
                count += length;
            }
            System.out.println("có: " + count + " byte ");
            readFile(stringList, copyFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFile(List<String> stringList, String link) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(link);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(stringList);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile(List<String> stringList, String link) {
        try {
            FileInputStream fileInputStream = new FileInputStream(link);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            stringList = (List<String>) objectInputStream.readObject();
            for (String s : stringList) {
                System.out.println(s);
            }
            objectInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
