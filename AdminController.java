package SeatingArrangement;

import java.util.Scanner;

public class AdminController {
    boolean islogin;
    static Scanner sc = new Scanner(System.in);
    static Admin admin = new Admin();
    public static void register(){
        System.out.println("Enter new Password");
        String password=sc.nextLine();
        admin.register(password);
    }
    public static void login(){
        System.out.println("Enter your Password");
        String password=sc.nextLine();
        if(admin.login(password)){
            System.out.println("Log In Successful");
        }else{
            System.out.println("Try Again");
            login();
        }
    }
}
