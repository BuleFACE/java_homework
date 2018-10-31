//
//
//Author:William Zhang
package myGraph;

public class Circle {
	public double m_x,m_y;
    public double m_radius;

    public Circle(double r)
    {
        m_x=0;
        m_y=0;
        m_radius=r;
    }
    public Circle(double x,double y,double r)
    {
        m_x=x;
        m_y=y;
        m_radius=r;
    }
    public double getPerimeter(){
	return (2*Math.PI*m_radius);}
    public double getArea(){
    return (Math.PI*m_radius*m_radius);}
}
