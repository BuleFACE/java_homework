package newTestPackage;
import newMyGraph.*;
public class MyTestGraphs {
public static void main(String[] args)
{
	if(args==null)return;String[] num;
	MyShape[] shapes=new MyShape[args.length];
	for(int i=0;i<args.length;i++) {
		num=args[i].split(",");
		int[] int_num=new int[num.length];char firstChar=num[0].charAt(0);
		for(int j=1;j<num.length;j++) int_num[j]=Integer.parseInt(num[j]);
		if(firstChar=='C'||firstChar=='c') 
			shapes[i]=new Circle(int_num[1],int_num[2],int_num[3]);
		else if(firstChar=='r'||firstChar=='R') 
			shapes[i]=new Rectangle(int_num[1],int_num[2],int_num[3],int_num[4]);
		else if(firstChar=='t'||firstChar=='T') 
			shapes[i]=new Triangle(int_num[1],int_num[2],int_num[3],int_num[4],int_num[5],int_num[6]);
	}
	double area=0,perimeter=0;
	for(int i=0;i<shapes.length;i++) {
		System.out.println(shapes[i].getPerimeter()+" "+shapes[i].getArea());
		area+=shapes[i].getArea();
		perimeter+=shapes[i].getPerimeter();
	}
	System.out.println(area+" "+perimeter);
}
}
