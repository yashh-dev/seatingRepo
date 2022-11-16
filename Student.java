package SeatingArrangement;

import java.util.ArrayList;

public class Student {
    private String Name;
    private String password;
    private int rollNumber;
    private String branch;
    private int year;
    private String[] subjects;
    public Student(String name,String password,int rollNumber,  String branch, int year,String[] subjects) {
        Name = name;
        this.rollNumber = rollNumber;
        this.branch = branch;
        this.year = year;
        this.subjects = subjects;
    }
    public Student() {
    }

    public Student register(String Name,String password){
        this.Name = Name;
        this.password = password;
        System.out.println("Succesfully Registered");
        return this;
    }
    public Student authentication(String password){
        if(this.password == password)return this;
        System.out.println("Wrong Password");
        return null;
    }
    public void getDetails() {
        System.out.printf("Name:%s%nRoll Number:%d%nBranch:%s%nSemester:%d%nYear:%d%n",this.Name,this.rollNumber,this.branch,this.year);
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
