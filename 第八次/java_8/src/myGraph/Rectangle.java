//
//
//Author:William Zhang
package myGraph;

public class Rectangle extends MyShape{
    MyPoint point1,point2;
    int w,h;
    public Rectangle(int xx,int xy,int yx,int yy)
    {
        if(xx>yx&&xy>yy)
    	{point1=new MyPoint(xx,xy,"矩形");
        point2=new MyPoint(yx,yy,"矩形");}
        else {point2=new MyPoint(xx,xy,"矩形");
        point1=new MyPoint(yx,yy,"矩形");
        w=Math.abs(xx-yx);h=Math.abs(xy-yy);
        }
    } 
    public double getPerimeter(){
    return 2*(point1.x-point2.x+point1.y-point2.y);}
    public double getArea(){
    return (point1.x-point2.x)*(point1.y-point2.y);}
    public String getProperty() {
    	return "矩形：w="+w+"  h="+h;
    }
    public MyPoint point() {
    	return point1;
    }
}
