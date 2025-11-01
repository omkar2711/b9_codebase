// parameterized constructor example
// constructor name is same as class name
// it is used to initialize object with specific values
package parshwa.oops;
class book{
    String name;
    String writer;
    int price;

    void displayinfo(){
        System.out.println("Name: " + name);
        System.out.println("Writer: " + writer);
        System.out.println("Price: " + price);
    }


    // parameterized constructor
    book(String n, String w, int p){
        name = n;
        writer = w;
        price = p;
    }
}

public class parameterizedconstructor {
    public static void main(String[] args) {
        book b1 = new book("Java Programming", "John Doe", 500);
        b1.displayinfo();
    }
}
