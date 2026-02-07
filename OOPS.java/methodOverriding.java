public class methodOverriding {
 
        public static void main(String [] args){
            Deer d = new Deer();
            d.eat();  //it will call the eat method of deer class as it is overriding the eat method of animal class, so it will print "eating grass..." instead
        }

}

class Animal{
    void eat(){
        System.out.println("eating anything...");
    }

}

class Deer extends Animal{

    void eat(){
        System.out.println("eating grass...");
    }
}
