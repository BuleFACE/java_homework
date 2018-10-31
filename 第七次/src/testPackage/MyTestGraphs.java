package testPackage;
import javax.swing.JOptionPane;
import newMyGraph.*;
public class MyTestGraphs {
public static void main(String[] args)
{
	String[] choices= {"1.圆形","2.三角形","3.矩形\n请输入序号:"};
	menuClass graphMenu=new menuClass();
	int choice=graphMenu.input_choice(choices);
	String createData=null;
	switch(choice)
	{
	case 1:
		createData=JOptionPane.showInputDialog(null,"请依次输入圆的圆心坐标及半径","建立圆形",JOptionPane.PLAIN_MESSAGE);break;
	case 2:
		createData=JOptionPane.showInputDialog(null,"请依次输入三个点的坐标","建立三角形",JOptionPane.PLAIN_MESSAGE);break;
	case 3:
		createData=JOptionPane.showInputDialog(null,"请依次输入两个角的坐标","建立矩形",JOptionPane.PLAIN_MESSAGE);break;
	}
	String[] stringData=createData.split(",");
		int[] intData=new int[stringData.length];
		for(int i=0;i<stringData.length;i++) intData[i]=Integer.parseInt(stringData[i]);	
	switch(choice)
	{
	case 1:
	{
		Circle circle=new Circle(intData[0],intData[1],intData[2]);
		JOptionPane.showMessageDialog(null,"面积为"+circle.getArea()+"\n周长为"+circle.getPerimeter(),"计算结果",1);
	    break;
	}
	case 2:
	{
		Triangle triangle=new Triangle(intData[0],intData[1],intData[2],intData[3],intData[4],intData[5]);
		JOptionPane.showMessageDialog(null,"面积为"+triangle.getArea()+"\n周长为"+triangle.getPerimeter(),"计算结果",1);
	    break;
	}
	case 3:
	{
		Rectangle rectangle=new Rectangle(intData[0],intData[1],intData[2],intData[3]);
		JOptionPane.showMessageDialog(null,"面积为"+rectangle.getArea()+"\n周长为"+rectangle.getPerimeter(),"计算结果",1);
	    break;
	}
	}
}
}