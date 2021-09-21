
public class Test {

    public static void main(String[] args) {
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape r = new Rectangle();
        Shape p = new Polygon();
        c.printShape();
        t.printShape();
        r.printShape();
        p.printShape();

    }
}
interface Shape
{
    void printShape(); //this is by-default public
}
class Circle implements Shape{
    public void printShape() //in order to redefine the abstract method of interface, you need to use public keyword as the access specifier.
    {
        System.out.println("Shape: Circle");
    }
}

class Triangle implements Shape{
    public void printShape()
    {
        System.out.println("Shape: Triangle");
    }
}

class Rectangle implements Shape{
    public void printShape()
    {
        System.out.println("Shape: Rectangle");
    }
}

class Polygon implements Shape{
    public void printShape()
    {
        System.out.println("Shape: Polygon");
    }
}

