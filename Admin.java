package seatingRepo;

public class Admin {
    static private String password;
    
    public void register(String password){
        Admin.password=password;
        System.out.println("Succesfully Registered");
    }
    public boolean login(String password){
        if(Admin.password.equals(password))return true;
        return false;
    }
}
