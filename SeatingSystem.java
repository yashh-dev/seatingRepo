package seatingRepo;

import java.util.ArrayList;
import java.util.HashMap;

public class SeatingSystem {
    static HashMap<Student, Integer> seating = new HashMap<Student,Integer>();
    static public void getSeating(ArrayList<Student> students,String subject,int seats){
        for (int i = 0; i < students.size(); i++) {
            seating.put(students.get(i),(i+1));
            System.out.println(students.get(i).getName()+" - "+(i+1));
        }
    }
    static public void getSeating(Student student){
        int seat = seating.get(student);
        System.out.println(student.getName()+" - "+seat);
    }
}
