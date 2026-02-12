public class abstractClass {

    public static void main(String[] args) {
        // Dog d = new Dog();
        // d.eat();
        // d.walk();
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        // Animal a = new Animal(); //we cannot create an object of an abstract class,
        // so this will give an error, we can only create objects of the subclasses that
        // extend the abstract class



        GermanShepherd g = new GermanShepherd();
        // Animal -> Dog -> GermanShepherd,  constructors are called in the order of inheritance
    }

}

abstract class Animal {
    String color;

    // below is the constructor of the abstract class, it is used to initialize the
    // objects of the subclasses that extend the abstract class, it is called when
    // we create an object of the subclass, so it will initialize the color variable
    // for all the subclasses
    // that extend the abstract class, so we dont need to initialize the color
    // variable in each subclass, it will be initialized automatically when we
    // create an object of the subclass, so it is a good practice to initialize the
    // common properties of the subclasses in the constructor of the abstract class,
    // so that we dont have to repeat the code in each subclass and it will also
    // make our code more organized and easier to maintain
    Animal() {
        // color = "brown";
        System.out.println("Animal const called...");
    }

    void eat() {
        System.out.println("Animal eats...");
    }

    // Here, animal just gives the idea of walking, but it is not necessary that all
    // animals walk in the same way, so we can make the walk method abstract, which
    // means that it will not have a body and it will be implemented by the
    // subclasses that extend the abstract class
    abstract void walk(); // abstract method, it has no body and it is declared with abstract keyword, it
                          // must be implemented by the subclass that extends the abstract class
}

class Dog extends Animal {

    Dog(){
        System.out.println("Dog const callled...");
    }

    // dog is by default brown unless we change its color
    // first the parent class constructor will be  called and it will initialize the color var to brown and then we can change the color of dog
    void changeColor(){
        color = "dark brown";
    }


    void walk() {
        System.out.println("Dog walks on 4 legs...");
    }
}


class GermanShepherd extends Dog{
    GermanShepherd(){
        System.out.println("GermanShepherd const called...");
    }
}

class Chicken extends Animal {

    // chicken is by default brown unless we change its color
    // first the parent class constructor will be  called and it will initialize the color var to brown and then we can change the color of chicken
    void changeColor(){
        color = "white";
    }


    void walk() {
        System.out.println("Chicken walks on 2 legs...");
    }
}