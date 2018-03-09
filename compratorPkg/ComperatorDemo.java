package compratorPkg;

import java.util.ArrayList;
import java.util.Collections;

public class ComperatorDemo {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student(103,"Rahul chaube","Jaunpur",12365422543L));
        list.add(new Student(101,"Jayesh","Mumbai",1213265422543L));
        list.add(new Student(110,"Swati Pandey","Thane",123646422543L));
        list.add(new Student(113,"Anjali Singh","Bhandup",1236598551443L));

        System.out.println(" ***** Before Sort ******** ");
        for (Student student:list)
        {
            System.out.println(student);
        }

        System.out.println(" ***** Sort by Roll No ******** ");
        Collections.sort(list,new SortByRollNo());
        for (Student student:list)
        {
            System.out.println(student);
        }
        System.out.println(" ***** Sort by Name ******** ");
        Collections.sort(list,new SortByName());
        for (Student student:list)
        {
            System.out.println(student);
        }

        System.out.println(" ***** Sort by Date of Birth ******** ");
        Collections.sort(list,new SortByDob());
        for (Student student:list)
        {
            System.out.println(student);
        }

    }
}
