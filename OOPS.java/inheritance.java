public class inheritance {
    
    public static void main(String [] args){
        // Fish shark = new Fish();
        // shark.eat();

        Dog dobby = new Dog();
        dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);


    }

}



// Base class or parent class
class Animal{
    String color;
    void eat(){
        System.out.println("eating...");
    }


    void breathe(){
        System.out.println("breathing ....");
    }
}


class Mammal extends Animal{
    // int legs;
    void walk(){
        System.out.println("walking...");
    }
}

class Fish extends Animal{
    // int legs;
    void swim(){
        System.out.println("swimming...");
    }
}

class Bird extends Animal{
    // int legs;
    void fly(){
        System.out.println("flying...");
    }
}

class Dog extends Mammal{
    String breed;
}


// // Derived or child class
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("swimming...");
//     }
// }