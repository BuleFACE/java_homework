//
//
//Author:William Zhang
package newMyGraph;

public class Rectangle extends MyShape{
    MyPoint point1,point2;
    public Rectangle(int xx,int xy,int yx,int yy)
    {
        if(xx>yx&&xy>yy)
    	{point1=new MyPoint(xx,xy,"rectangle");
        point2=new MyPoint(yx,yy,"rectangle");}
        else {point2=new MyPoint(xx,xy,"rectangle");
        point1=new MyPoint(yx,yy,"rectangle");}
    } 
    public double getPerimeter(){
    return 2*(point1.x-point2.x+point1.y-point2.y);}
    public double getArea(){
    return (point1.x-point2.x)*(point1.y-point2.y);}
}
