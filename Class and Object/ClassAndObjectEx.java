class Student{
    int rollNum;
    String name;
    void insertRecord(int r, String n){
        rollNum = r;
        name = n;
    }
    void studentDetails(){
        System.out.println("Roll number = "+rollNum);
        System.out.println("Name = "+name);
    }
}
public class ClassAndObjectEx{
    public static void main(String[] args){
        Student sobjr = new Student();
        sobjr.insertRecord(10, "Ram");
        sobjr.studentDetails();
    }
}