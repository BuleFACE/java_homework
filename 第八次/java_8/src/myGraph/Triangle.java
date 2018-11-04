//
//
//Author:William Zhang
package myGraph;

public class Triangle extends MyShape{
	public double tri_xx,tri_xy;
	public double tri_yx,tri_yy;
	public double tri_zx,tri_zy;
	public double tri_a,tri_b,tri_c;
	MyPoint point1,point2,point3;
	
	public Triangle(int xx,int xy,int yx,int yy,int zx,int zy)
	{
		point1=new MyPoint(xx,xy,"triangle");
		point2=new MyPoint(yx,yy,"triangle");
		point3=new MyPoint(zx,zy,"triangle");
		tri_a=Math.sqrt(Math.pow((xx-yx),2)+Math.pow((xy-yy),2));
		tri_b=Math.sqrt(Math.pow((xx-zx),2)+Math.pow((xy-zy),2));
		tri_c=Math.sqrt(Math.pow((yx-zx),2)+Math.pow((yy-zy),2));
	}
	public double getPerimeter(){
	return (tri_a+tri_b+tri_c);}	
	public double getArea(){
	double p=0.5*(tri_a+tri_b+tri_c);
    return (Math.sqrt(p*(p-tri_a)*(p-tri_b)*(p-tri_c)));}
	public String getProperty() {
		return "三角形：a="+tri_a+"  b="+tri_b+"  c="+tri_c;
	}	
}
