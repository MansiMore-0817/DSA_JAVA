public class constructors {
    

    public static void main(String [] args){
        // Student s3 = new Student();    this works only when we have a default or no constructor made previously inside class, or else to make this work we need to delete the other constructors
        Student s1 = new Student("mansi");  //when we create an object of the class, the constructor is called automatically and it initializes the object
        System.out.println(s1.name);
        Student s2 =  new Student(123);
        
    }
}

class Student {
    String name;
    int roll;

    Student(){
        System.out.println("cont called");
    }

    Student(String name){   //this is constructor, it has same name as class and no return type, it is used to initialize the objects of the class
        // System.out.println("constructor called...");
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}
