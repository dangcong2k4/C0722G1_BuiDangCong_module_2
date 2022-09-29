package additional_exercise1.service;

import java.io.IOException;

public interface IStudentService {
    void addStudent() throws IOException;
    void deleteStudent();
    void displayStudent();
    void searchStudent();
    void sortNameStudent();
}
