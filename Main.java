package SeatingArrangement;
import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("----------------------------------");
        System.out.println("Welcome Seating Arrangement System");
        System.out.println("----------------------------------");
        LoginInstructions();
        int choice=0;
        boolean quit=false;
        while (!quit) {
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0:adminForm();break;
                case 1:studentForm();break;
                case 2:quit=true;
                    System.out.println("Bye");break;
                case 3:LoginInstructions();
            }
        }
    }

    private static void studentForm() {
        Student user;
        int choice=0;
        boolean quit=false;
        FormInstructions();
        while (!quit) {
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0:user = StudentController.register();
                       studentPage(user);   
                       break;
                case 1:user = StudentController.login();
                       studentPage(user); 
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
                case 3:break;
                case 4:quit=true;
                    System.out.println("Logged out");    
                break;
            }
        }
    }

    private static void adminForm() {
        int choice=0;
        boolean quit=false;
        FormInstructions();
        while (!quit) {
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0:AdminController.register();
                        adminPage();
                        break;
                case 1:AdminController.login();
                        adminPage();
                        break;
                case 2:quit=true;break;
                case 3:FormInstructions();
            }
        }
    }

    private static void adminPage() {
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
    
}
