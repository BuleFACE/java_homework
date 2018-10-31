package textPackage;
import myGraph.*;

public class J_Test {
	public static void main(String[] args)
	{
		Triangle triangle1=new Triangle(3,4,5);
		Triangle triangle2=new Triangle(0,0,1,0,1,2);
		Square square1=new Square(6);
		Square square2=new Square(1,1,5,7);
        Circle circle1=new Circle(3);
        Circle circle2=new Circle(3,4,6);
        System.out.println("triangle1:"+triangle1.getPerimeter()+" "+triangle1.getArea());
        System.out.println("triangle2:"+triangle2.getPerimeter()+" "+triangle2.getArea());
        System.out.println("square1:"+square1.getPerimeter()+" "+square1.getArea());
        System.out.println("square2:"+square2.getPerimeter()+" "+square2.getArea());
        System.out.println("circle1:"+circle1.getPerimeter()+" "+circle1.getArea());
        System.out.println("circle2:"+circle2.getPerimeter()+" "+circle2.getArea());
	}
}
