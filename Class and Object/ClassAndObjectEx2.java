import java.util.Scanner;

class Student{                                                  //Class
    int rollNum;                                                //Attribute
    String name;                                                //Attribute
    void insertRecord(int r, String n){                         //Method
        rollNum = r;
        name = n;
    }
    void studentDetails(){                                      //Method
        System.out.println("Student Detaiils are ==>");
        System.out.println("Roll number = "+rollNum);
        System.out.println("Name = "+name);
    }
}
public class ClassAndObjectEx{
    public static void main(String[] args){
        Student sobjr = new Student();                          //Object Creation for Student Class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        sobjr.insertRecord(roll, name);
        sobjr.studentDetails();
    }
}