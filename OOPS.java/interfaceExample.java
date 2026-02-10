public class interfaceExample {
    

    public static void main(String [] args){
        Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.eatGrass();
        b.eatMeat();
    }
}

// Multiple inheritance using interfaces
interface Herbivore{
     void eatGrass();
}

interface Carnivore{
    void eatMeat();
}

class Bear implements Herbivore, Carnivore{
    public void eatGrass(){
        System.out.println("eating grass...");
    }

    public void eatMeat(){
        System.out.println("eating meat...");
    }
}
// Multiple inheritance is not possible in java using classes, but it is possible using interfaces. In the above code, we have two interfaces Herbivore and Carnivore, and the Bear class implements both of these interfaces, thus achieving multiple inheritance.

// below is an example of interface and its impplementation by different classes
interface ChessPlayer{
     void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(in all 4 dirns)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(in all 4 dirns) but only 1 step");
    }
}

