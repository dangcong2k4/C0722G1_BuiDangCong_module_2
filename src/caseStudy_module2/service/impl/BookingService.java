package caseStudy_module2.service.impl;

import caseStudy_module2.model.Booking;
import caseStudy_module2.model.person.Customer;
import caseStudy_module2.model.resort.Facility;
import caseStudy_module2.model.resort.Villa;
import caseStudy_module2.service.IBookingService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookingService implements IBookingService {
    private static TreeSet<Booking> bookings = new TreeSet<>();
    private static Scanner scanner = new Scanner(System.in);
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static CustomerService customerService = new CustomerService();
    private static FacilityService facilityService = new FacilityService();

    @Override
    public void add() {
        bookings.add(infoBooking());
        System.out.println("thêm đặt chỗ thành công");
    }

    @Override
    public void display() {
        for (Booking booking:bookings) {
            System.out.println(booking);
        }
    }

    public Booking infoBooking(){
        System.out.println("nhập mã booking");
        String codeBooking = scanner.nextLine();
        System.out.println("nhập ngày bắt đầu");
        LocalDate startDay = LocalDate.parse(scanner.nextLine(),formatter);
        System.out.println("nhập ngày kết thúc");
        LocalDate stopDay = LocalDate.parse(scanner.nextLine(),formatter);

        customerService.display();
        System.out.println("chọn mã khách hàng");
        String codeCustomer = scanner.nextLine();
        List<Customer> customerList = customerService.getCustomerFromFile();
        for (int i = 0; i < customerList.size(); i++) {
            if(customerList.get(i).getCode().contains(codeCustomer)){
                System.out.println(customerList.get(i));
            }
        }

        System.out.println("chọn dịch vụ");
        String serviceName = "" ;
        while (true){
            try {
                System.out.println("1. Villa");
                System.out.println("2. House");
                System.out.println("3. Room");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option){
                    case 1:
                        serviceName = "Villa";
                        facilityService.display();
                        System.out.println("chọn mã dịch vụ");
                        String codeService = scanner.nextLine();
                        Map<Villa, Integer> villaMap = facilityService.getVillaFromFile();
                        Set<Villa> villas = villaMap.keySet();
                        for (Villa villa : villas){
                            if (villa.getServiceCode().equals(codeService)){
                                villaMap.replace(villa, villaMap.get(villa) + 1);
                            }
                        }
                        break;

                    case 2:

                    case 3:
                        break;
                    default:
                        throw new  NumberFormatException("nhập đúng định dạng");
                }
                break;
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }

        }

        System.out.println("chọn loại dịch vụ");
        String serviceType = scanner.nextLine();

        Booking booking = new Booking(codeBooking,startDay,stopDay,codeCustomer,serviceName,serviceType);
        return booking;
    }

}
