package SeatingArrangement;

public class Admin {
    private String password;
    public Admin(){

    }
    public Admin(String password) {
        this.password = password;
    }
    public void register(String password){
        this.password=password;
        System.out.println("Succesfully Registered");
    }
    public boolean login(String password){
        if(this.password == password)return true;
        return false;
    }
}
