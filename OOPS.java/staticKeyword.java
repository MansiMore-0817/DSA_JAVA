public class staticKeyword {
        public static void main(String [] args){
            Student s1 = new Student();
            s1.schoolName = "Francis";   //this changes/updates the name of all the objects' school name

            Student s2 = new Student();
            System.out.println(s2.schoolName);

            Student s3 = new Student();
            s1.schoolName = "ABC"; //this will again update the school name for all the objects, because it is a static variable, it is shared among all the objects of the class, so when we change the value of a static variable using one object, it changes for all the objects of the class
        }

}

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
