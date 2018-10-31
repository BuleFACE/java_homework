//
//
//Author:William Zhang
package newMyGraph;

public class Circle extends MyShape {
	MyPoint center;
    public int m_radius;

    public Circle(int x,int y,int r)
    {
        center=new MyPoint(x,y,"circle");
        m_radius=r;
    }
    public double getPerimeter(){
	return (2*Math.PI*m_radius);}
    public double getArea(){
    return (Math.PI*m_radius*m_radius);}
}
