package OOPS;


class Shape{ //Super Class
    // String color;
    int height;
    int width;

    int area;

    void calculateArea(){
        area = (width * height) ;
        System.out.println(area);
    }
}

class Square extends Shape{ //Derived Class

    Square(int side){
        this.height = side;
        this.width = side;
    }
    
}

class Rectangle extends Shape{
    Rectangle(int h, int w){
        this.height = h;
        this.width = w;
    }
}


public class inheritance {
    public static void main(String[] args){
       
        Square s = new Square(10);
        Rectangle r = new Rectangle(5, 10);

        s.calculateArea();
        r.calculateArea();
        
        
    }
}
