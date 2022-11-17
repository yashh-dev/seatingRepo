package seatingRepo;

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
}
