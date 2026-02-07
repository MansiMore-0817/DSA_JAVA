//  OOPS - Object Oriented prog. first program in oops java
public class program1 {
    public static void main(String [] args){
            Pen p1 = new Pen(); //created a pen object called p1
            p1.setColor("blue");
            // System.out.println(p1.color);   cant access it directly as it is pvt, we need to use functions to access it 
            System.out.println(p1.getColor());
            p1.setTip(5);
            // System.out.println(p1.tip);
            System.out.println(p1.getTip());
            p1.setColor("orange");
            // System.out.println(p1.color);
            System.out.println(p1.getColor());
            // p1.color = "yellow";
            p1.setColor("yellow");
            // System.out.println(p1.color);
            System.out.println(p1.getColor());


            BankAccount myAcc = new BankAccount();
            myAcc.username = "mansiMore";
            // myAcc.password = "12345";    cannot access  pw here as it is private
            myAcc.setPw("123abc");    //but we can set the pw using the public method setPw
    }

}

class Pen{
    private String color;
    private int tip;
    
    String getColor(){
        return this.color;
    }


    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}

class BankAccount{
    public String username;
    private String password;


    public void setPw(String pwd){
        password = pwd;
    }
}

class Student{
    String name;
    int age;
    float percentage;   //cgpa

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math)/3;
    }

}