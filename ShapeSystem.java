class Shape{
    void area(){
        System.out.println("Area of Shape");
    }
    void area(double length){
        double sq;
        sq= length*length;
        System.out.println("Area of Square: " + sq);
    }
     void area(double length,double breadth){
        double rec;
        rec=length*breadth;
        System.out.println("Area of Rectangle: "+ rec);
     }
}
class Rectangle extends Shape{
    @Override
    void area(){
        System.out.println("Rectangle class: overridden area() method");
    }
}
public class ShapeSystem {
    public static void main(String[] args){
        Shape s1=new Shape();
        s1.area();
        s1.area(6);
        s1.area(6.5,5.3);
        Rectangle r=new Rectangle();
        r.area();
        r.area(4.5);
        r.area(40.6,55.4);
    }
}

