public class copyConstructor{

    public static void main(String [] args){
        Student s1 = new Student();
        s1.name = "mansi";
        s1.roll = 123;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);   //copy
        // as s1 is now already copied in s2..any changes made in s1 after copying it in s2, logically it won't reflect those changes in s2
        // but in reality, only the reference of s1 is copied..and the changes made in s1 can be reflected in s2 as well even after copying
        s2.password = "xyz";
        s1.marks[2] = 100;
        for(int i = 0; i < 3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];
    String add;


    class Address{
        String city;
    }

    Student(){
        marks = new int[3];
        System.out.println("constructor called...");
    }

    // Shallow copy-constructor below
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // Deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
            
        }

    }



    Student(String name){
        marks = new int[3];
        this.name = name;
    }

    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }


}