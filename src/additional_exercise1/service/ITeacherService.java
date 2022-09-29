package additional_exercise1.service;

import java.io.IOException;

public interface ITeacherService {
    void addTeacher() throws IOException;
    void deleteTeacher();
    void displayTeacher();
    void searchTeacher();
    void sortNameTeacher();
}
