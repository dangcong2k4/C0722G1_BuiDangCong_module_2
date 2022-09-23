package additional_exercise1.controller;

import additional_exercise1.service.ITeacherService;
import additional_exercise1.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController<iTeacherService> {
    private static ITeacherService iTeacherService = new TeacherService();
    public static void menuTeacher(){
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Thêm mới giáo viên ");
            System.out.println("2. Xóa giáo viên ");
            System.out.println("3. Xem danh sách giáo viên ");
            System.out.println("4. tìm giáo viên bằng tên ");
            System.out.println("5. sắp xếp theo tên ");
            System.out.println("6. thoát ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.deleteTeacher();
                    break;
                case 3:
                    iTeacherService.displayTeacher();
                    break;
                case 4:
                    iTeacherService.searchTeacher();
                    break;
                case 5:
                    iTeacherService.sortNameTeacher();
                    break;
                case 6:
                    return;
            }
        }while (true);
    }
}
