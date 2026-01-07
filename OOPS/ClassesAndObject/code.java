package OOPS.ClassesAndObject;

public class code {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.setColor("blue");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Rushikesh";
        myAcc.setPassword("asdf");
        

    }
}


class Pen{
    String color;
    int tip;

    void getColor (){
    
        
    }

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}


class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}

