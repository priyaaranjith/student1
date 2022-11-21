import java.util.ArrayList;
import java.util.Scanner;

public class student
{
    String name;
    int admissionnumber;
    int rollno;
    String college;

    public student(String name, int admissionnumber, int rollno, String college) {
        this.name = name;
        this.admissionnumber = admissionnumber;
        this.rollno = rollno;
        this.college = college;
    }
    public String toString() {
        return "\nStudent Details :" +  "\nName: " + this.name + "\nadmission no:"+
                this.admissionnumber + "\nrollNo: " + this.rollno + "\ncollege: " + this.college;
    }
    static void display(ArrayList<student> al) {
        System.out.println("\n--------------student list--------\n");
        for (student s : al) {
            System.out.println("name" + s.name);
            System.out.println("admission no" + s.admissionnumber);
            System.out.println("rollno" + s.rollno);
            System.out.println("college" + s.college);
            System.out.println("   ");
        }
    }
    static void search(ArrayList<student> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student admission number to search :");
        int admissionnumber = sc.nextInt();
        int i = 0;
        for (student s : al) {
            if (admissionnumber == s.admissionnumber) {
                System.out.println(s + "\n");
                i++;
            }
        }
        if (i == 0) {
            System.out.println("\nStudent Details are not available, Please enter a valid admission number!!");
        }
    }
    static void delete(ArrayList<student> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Employee name to DELETE");
        int admissionnumber = sc.nextInt();
        int k = 0;
        for (student s : al) {
            if (admissionnumber == s.admissionnumber) {
                al.remove(s);
                student.display(al);
                k++;
            }
        }
        if (k == 0) {
            System.out.println("\nstudent Details are not available, Please enter a valid admission number!!");
        }
    }
    static void add(ArrayList<student> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the following details to ADD list:\n");
        System.out.println("Enter name :");
        String name = sc.next();
        System.out.println("Enter admission number :");
        int admissionnumber = sc.nextInt();
        System.out.println("Enter Salary :");
        int rollno = sc.nextInt();
        System.out.println("Enter college:");
        String college = sc.next();
        al.add(new student(name, admissionnumber, rollno, college));
    }


}
