//
//
//Author:William Zhang
package myGraph;

public class Square {
	public double sq_a;
    public double sq_xx,sq_xy;
    public double sq_yx,sq_yy;

    public Square(double xx,double xy,double yx,double yy)
    {
        sq_xx=xx;sq_xy=xy;
        sq_yx=yx;sq_yy=yy;
        sq_a=0.707106*Math.sqrt(Math.pow((xx-yx),2)+Math.pow((xy-yy),2));
    }
    public Square(double a)
    {
        sq_a=a;
        sq_xx=0;sq_xy=0;
        sq_yx=a;sq_yy=a;
    }
    public double getPerimeter(){
    return 4*sq_a;}
    public double getArea(){
    return sq_a*sq_a;}
}
