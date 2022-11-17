package seatingRepo;
import java.util.*;
public class Main {
    private static Scanner sc=new Scanner(System.in);
    public static StudentController studentController = new StudentController();
    static ArrayList<Student> students = new ArrayList<Student>();
    public static void main(String[] args) {
        
        students.add(new Student("yash","yash",1,"cs",2018));
        students.add(new Student("aak","yash",2,"cs",2018));
        students.add(new Student("sanj","yash",3,"bio",2018));
        students.add(new Student("asan","yash",4,"bio",2018));
        System.out.println("----------------------------------");
        System.out.println("Welcome Seating Arrangement System");
        System.out.println("----------------------------------");
        getStudents();
        int choice=0;
        boolean quit=false;
        while (!quit) {
            LoginInstructions();
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0:adminForm();break;
                case 1:studentForm();break;
                case 2:quit=true;
                    System.out.println("Bye");break;
                case 3:LoginInstructions();
                case 4:getStudents();
            }
        }
    }

    private static void studentForm() {
        System.out.println("Student Login");
        Student user;
        int choice=0;
        boolean quit=false;
        FormInstructions();
        while (!quit) {
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0:user = StudentController.register(students);
                       studentPage(user);
                       quit=true;
                       break;
                case 1:user = StudentController.login(students);
                        if(user!=null){
                            studentPage(user); 
                        }                       
                       quit=true;
                       break;
                case 2:quit=true;break; 
             
                case 3:FormInstructions();
            }
        }
    }



    private static void studentPage(Student user) {
        int choice=0;
        boolean quit=false;
        StudentInstructions();
        while (!quit) {
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0:StudentInstructions();break;
                case 1:user.getDetails();break;
                case 2:user.getSubjects();break;
                case 3:SeatingSystem.getSeating(user);break;
                case 4:quit=true;
                    System.out.println("Logged out");    
                break;
            }
        }
    }

    private static void adminForm() {
        System.out.println("Admin Login");
        int choice=0;
        boolean quit=false;
        FormInstructions();
        while (!quit) {
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0:AdminController.register();
                        adminPage();
                        quit=true;
                        break;
                case 1:if(AdminController.login()){
                    adminPage();
                };
                        quit=true;
                        break;
                case 2:quit=true;break;
                case 3:FormInstructions();
            }
        }
    }

    private static void adminPage() {
        int choice=0;
        boolean quit=false;
        AdminInstructions();
        while (!quit) {
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0:AdminInstructions();break;
                case 1:AdminController.getStudentDetails(students);break;
                case 2:AdminController.createSeatingArrangement(students);break;
                case 3:quit=true;
                    System.out.println("Logged out");    
                break;
            }
        }
    }

    private static void FormInstructions() {
        System.out.println("Press :");
        System.out.println("0 to Register");
        System.out.println("1 to Login");
        System.out.println("2 to quit from the program");
        System.out.println("3 to Print Instruction");
    }
    public static void LoginInstructions(){
        System.out.println("Press :");
        System.out.println("0 to Login/Register as Admin ");
        System.out.println("1 to Login/Register as Student");
        System.out.println("2 to quit from the program");
        System.out.println("3 to Print Instruction");
    }
    public static void StudentInstructions(){
        System.out.println("Press :");
        System.out.println("0 to Print Instruction");
        System.out.println("1 to Get your Details");
        System.out.println("2 Get your Subjects");
        System.out.println("3 to Get your SeatArrangement");
        System.out.println("4 to Logout");
    }
    public static void AdminInstructions(){
        System.out.println("Press :");
        System.out.println("0 to Print Instruction");
        System.out.println("1 to Get Student Details");
        System.out.println("2 to Create SeatArrangement");
        System.out.println("3 to Logout");
    }
    public static void getStudents(){
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }   
}
