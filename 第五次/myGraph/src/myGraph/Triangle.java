//
//
//Author:William Zhang
package myGraph;

public class Triangle {
	public double tri_xx,tri_xy;
	public double tri_yx,tri_yy;
	public double tri_zx,tri_zy;
	public double tri_a,tri_b,tri_c;
	
	public Triangle(double xx,double xy,double yx,double yy,double zx,double zy)
	{
		tri_xx=xx;tri_xy=xy;
		tri_yx=yx;tri_yy=yy;
		tri_zx=zx;tri_zy=zy;
		tri_a=Math.sqrt(Math.pow((xx-yx),2)+Math.pow((xy-yy),2));
		tri_b=Math.sqrt(Math.pow((xx-zx),2)+Math.pow((xy-zy),2));
		tri_c=Math.sqrt(Math.pow((yx-zx),2)+Math.pow((yy-zy),2));
	}
	public Triangle(double x,double y,double z)
	{
		double t;
		if(x<y){t=x;x=y;y=t;}
		if(x<z){t=x;x=z;z=t;}
		tri_a=x;tri_b=y;tri_c=z;
		tri_zx=0;tri_zy=0;
		tri_yx=x;tri_yy=0;
		tri_xx=(x*x+y*y-z*z)/(2*x);tri_xy=Math.sqrt(y*y-tri_xx*tri_xx);
	}	
	public double getPerimeter(){
	return (tri_a+tri_b+tri_c);}	
	public double getArea(){
	double p=0.5*(tri_a+tri_b+tri_c);
    return (Math.sqrt(p*(p-tri_a)*(p-tri_b)*(p-tri_c)));}
}
