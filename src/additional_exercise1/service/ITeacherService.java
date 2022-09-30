package additional_exercise1.service;

import java.io.IOException;

public interface ITeacherService {
    void addTeacher() throws IOException;
    void deleteTeacher() throws IOException;
    void displayTeacher() throws IOException;
    void searchTeacher();
    void sortNameTeacher();
}
