package parshwa.oops;
//creating a class
class pen{
    String color;
    String type;

    void displayInfo(){
    System.out.println("Color: " + color);
    System.out.println("Type: " + type);
} 
}

  

public class penexample {
    public static void main(String[] args) {
        // creating object of class
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";
        // System.out.println("Pen color: " + pen1.color);
        // System.out.println("Pen type: " + pen1.type);
        System.out.println("Details of pen1:");
        pen1.displayInfo();


        pen pen2=new pen();
        pen2.color="black";
        pen2.type="ballpoint";
        System.out.println("Details of pen2:");
        pen2.displayInfo();
        
    }
}
