package additional_exercise1.service;

import java.io.IOException;

public interface IStudentService {
    void addStudent() throws IOException;
    void deleteStudent() throws IOException;
    void displayStudent() throws IOException;
    void searchStudent();
    void sortNameStudent();
}
