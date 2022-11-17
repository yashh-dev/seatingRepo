package seatingRepo;

import java.util.ArrayList;

public class Student {
    private String Name;
    private String password;
    private int rollNumber;
    private String branch;
    private int year;
    private String[] subjects =new String[]{"Math","Science","Social"};
    public Student(String name,String password,int rollNumber,  String branch, int year) {
        Name = name;
        this.rollNumber = rollNumber;
        this.branch = branch;
        this.year = year;
    }
    public Student() {
    }

    public Student register(String Name,String password){
        this.Name = Name;
        this.password = password;
        System.out.println("Succesfully Registered");
        return this;
    }
    public void getDetails() {
        System.out.printf("Name:%s%nRoll Number:%d%nBranch:%s%nyear:%d%n",this.Name,this.rollNumber,this.branch,this.year);
    }
    public void getSubjects(){
        System.out.println(subjects);
        // for (String sub : subjects) {
        //     sys
        // }
    }
    public String   getName() {
        return Name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public String getBranch() {
        return branch;
    }
    
    
}
