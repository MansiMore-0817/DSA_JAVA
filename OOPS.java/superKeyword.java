public class superKeyword {
    public static void main(String [] args){
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal{
    
    String color;
    Animal(){
        System.out.println("Animal const called...");
    }
}

class Horse extends Animal{
    
    Horse(){
        // super();
        super.color = "brown"; // we can use super keyword to access the properties of the parent class, in this case, we are accessing the color property of the Animal class and initializing it with the value "brown", so when we create an object of the Horse class, it will have the color property initialized with the value "brown" because it is inherited from the Animal class, and we can also access it using the super keyword in the constructor of the Horse class, so it is a good practice to use super keyword to access the properties of the parent class in the constructor of the child class, so that we can initialize the properties of the parent class in one place and it will be inherited by all the child classes that extend the parent class, so it will make our code more organized and easier to maintain
        System.out.println("Horse const called...");
    }
}
