//  OOPS - Object Oriented prog. first program in oops java
public class program1 {
    public static void main(String [] args){
            Pen p1 = new Pen(); //created a pen object called p1
            p1.setColor("blue");
            System.out.println(p1.color);
            p1.setTip(5);
            System.out.println(p1.tip);
            p1.setColor("orange");
            System.out.println(p1.color);
            p1.color = "yellow";
            System.out.println(p1.color);


            BankAccount myAcc = new BankAccount();
            myAcc.username = "mansiMore";
            // myAcc.password = "12345";    cannot access  pw here as it is private
            myAcc.setPw("123abc");
    }

}

class Pen{
    String color;
    int tip;
    
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
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