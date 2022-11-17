package seatingRepo;

import java.util.*;

public class AdminController {
    boolean islogin;
    static Scanner sc = new Scanner(System.in);
    static Admin admin = new Admin();
    public static void register(){
        System.out.println("Enter new Password");
        String password=sc.nextLine();
        admin.register(password);
    }
    public static boolean login(){
        System.out.println("Enter your Password");
        String password=sc.nextLine();
        if(admin.login(password)){
            System.out.println("Log In Successful");
            return true;
        }else{
            System.out.println("Wrong Password");
            return false;
        }
    }
    public static void getStudentDetails(ArrayList<Student> students){
        for (Student student : students) {
            System.out.println("-----------------");
            student.getDetails();
        }
    }
    public static void createSeatingArrangement(ArrayList<Student> students){
        System.out.println("To create Seating Arrangement");
        System.out.println("Enter subject");
        String sub = sc.nextLine();
        System.out.println("ENter Number of Seats");
        int seat = sc.nextInt();
        sc.nextLine();
        SeatingSystem.getSeating(students,sub,seat);
    }
}
