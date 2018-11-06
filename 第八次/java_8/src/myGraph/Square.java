//
//
//Author:William Zhang
package myGraph;

public class Square extends MyShape{
    MyPoint point1,point2;
    int a;
    public Square(int xx,int xy,int yx,int yy)
    {
        if(xx>yx&&xy>yy)
    	{point1=new MyPoint(xx,xy,"正方形");
        point2=new MyPoint(yx,yy,"正方形");}
        else {point2=new MyPoint(xx,xy,"正方形");
        point1=new MyPoint(yx,yy,"正方形");
        a=Math.abs(xx-yx);
        }
    } 
    public double getPerimeter(){
    return 4*a;}
    public double getArea(){
    return a*a;}
    public String getProperty() {
    	return "正方形：a="+a;
    }
    public MyPoint point() {
    	return point1;
    }
}
