class Student{                                                  //Class
    int rollNum;                                                //Attribute
    String name;                                                //Attribute
    void insertRecord(int r, String n){                         //Method
        rollNum = r;
        name = n;
    }
    void studentDetails(){                                      //Method
        System.out.println("Roll number = "+rollNum);
        System.out.println("Name = "+name);
    }
}
public class ClassAndObjectEx{
    public static void main(String[] args){
        Student sobjr = new Student();                          //Object Creation for Student Class
        sobjr.insertRecord(10, "Ram");
        sobjr.studentDetails();
    }
}