package SeatingArrangement;

import java.time.Year;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class StudentController {
    static ArrayList<Student> students;
    boolean islogin;
    static Student currentUser;
    static Scanner sc = new Scanner(System.in);
    static Student student = new Student();
    public static Student register(){
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
        currentUser = new Student(Name,password,rollNumber,branch,year,["asdf"]);
        return currentUser;
    }
    public static Student login(){
        System.out.println("name");
        String Name = sc.nextLine();
        System.out.println("Enter your Password");
        String password=sc.nextLine();
        for (Student student : students) {
            if (student.getName() == Name) {
                return student.authentication(password);
            }
        }
        System.out.println("Student Not Found");
        return null;
    }
}
