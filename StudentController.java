package seatingRepo;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentController {
    
    boolean islogin;
    static Student currentUser;
    static Scanner sc = new Scanner(System.in);
    static Student student = new Student();
    public StudentController(){

    }
    public static Student register(ArrayList<Student> students){
        System.out.println("Enter your Name");
        String Name = sc.nextLine();
        System.out.println("Enter new Password");
        String password=sc.nextLine();
        System.out.println("Enter your branch");
        String branch = sc.nextLine();
        System.out.println("Enter your rollNumber");
        int rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the  year");
        int year = sc.nextInt();
        sc.nextLine();
        currentUser = new Student(Name,password,rollNumber,branch,year);
        students.add(currentUser);
        return currentUser;
    }
    public static Student login(ArrayList<Student> students){
        System.out.println("name");
        String Name = sc.nextLine();
        System.out.println("Enter your Password");
        String pwd = sc.nextLine();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(Name)) {
                System.out.println("Logged in");
                return student;
               
            }
        }
        System.out.println("Student Not Found");
        return currentUser;
    }
   
}
