import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int flag = 0;
        ArrayList<student> al = new ArrayList<student>();
        while (flag == 0) {
            System.out.println("1). Add student to the DataBase\n" +
                    "2). Search for student\n" +
                    "3). Delete student Details\n" +
                    "4). Display all students\n" +
                    "5). EXIT\n");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice : ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    student.add(al);
                    break;
                case 2:
                    student.search(al);
                    break;
                case 3:
                    student.delete(al);
                    break;
                case 4:
                    student.display(al);
                    break;
                case 5:
                    flag = 1;
                    break;
            }
        }
    }
}