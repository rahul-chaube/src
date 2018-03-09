package compratorPkg;

import java.util.Comparator;

public class Student {
    int rollNo;
    String name, address;
    long dob;

    public Student(int rollNo, String name, String address, long dob) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.dob = dob;
    }

    public String toString() {
        return " Roll No " + this.rollNo + " Name " + this.name + " Address " + this.address + " Date Of Birth " + this.dob;
    }
}

class SortByRollNo implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollNo - o2.rollNo;
    }
}

class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SortByDob implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int) o1.dob - (int) o2.dob;
    }
}


