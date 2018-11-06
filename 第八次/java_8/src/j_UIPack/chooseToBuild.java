//
//
//Author:William Zhang
package j_UIPack;

import javax.swing.JOptionPane;
import myGraph.*;
public class chooseToBuild {
	public static int allShapes=0;
	static String[] choices2= {"[0]Circle：新加一个圆对象","[1]Rectangle：新加一个矩形对象","[2]Triangle：新加一个三角形对象","[3]Square：新加一个正方形对象","[4]Back：返回主功能选择对话框"};	
	public static void buildAShape(MyShape[] theShape) {
		if(allShapes==theShape.length) 
		{
			JOptionPane.showMessageDialog(null,"已达到最大图形数！","建立图形对象",JOptionPane.ERROR_MESSAGE);
		    superChoice.makeChoice(theShape);
		}
		int theChoice=-1;
	    theChoice=menuClass.input_choice(choices2);
		if(theChoice==-1) buildAShape(theShape);
	    String createData=null;
	    if(theChoice<0||theChoice==5||theChoice==6||theChoice>7) {
	    	JOptionPane.showMessageDialog(null,"请重新输入选项！","输入错误",JOptionPane.OK_OPTION);
	    	buildAShape(theShape);
	    }	
		switch(theChoice)
		{
		case 0:
			createData=JOptionPane.showInputDialog(null,"请依次输入圆的圆心坐标及半径","建立圆形",JOptionPane.PLAIN_MESSAGE);
			if(createData==null) buildAShape(theShape);
			if(createData.equals("")) {JOptionPane.showMessageDialog(null,"请重新输入参数！","输入错误",JOptionPane.OK_OPTION);
	    	buildAShape(theShape);}
			break;
		case 1:
			createData=JOptionPane.showInputDialog(null,"请依次输入三个点的坐标","建立三角形",JOptionPane.PLAIN_MESSAGE);
			if(createData==null) buildAShape(theShape);
			if(createData.equals("")) {JOptionPane.showMessageDialog(null,"请重新输入参数！","输入错误",JOptionPane.OK_OPTION);
	    	buildAShape(theShape);}
			break;
		case 2:
			createData=JOptionPane.showInputDialog(null,"请依次输入两个角的坐标","建立矩形",JOptionPane.PLAIN_MESSAGE);
			if(createData==null) buildAShape(theShape);
			if(createData.equals("")) {JOptionPane.showMessageDialog(null,"请重新输入参数！","输入错误",JOptionPane.OK_OPTION);
	    	buildAShape(theShape);}
			break;
		case 3:
			createData=JOptionPane.showInputDialog(null,"请依次输入两个角的坐标","建立正方形",JOptionPane.PLAIN_MESSAGE);
			if(createData==null) buildAShape(theShape);
			if(createData.equals("")) {JOptionPane.showMessageDialog(null,"请重新输入参数！","输入错误",JOptionPane.OK_OPTION);
	    	buildAShape(theShape);}break;
		case 4:
			superChoice.makeChoice(theShape);	
		case 7:
			superChoice.makeChoice(theShape);
		}
		String[] stringData=createData.split(",");
			int[] intData=new int[stringData.length];
			int i=0;
			for(String s:stringData) {intData[i]=Integer.parseInt(s);i++;}	
		switch(theChoice)
		{
		case 0:
			theShape[allShapes]=new Circle(intData[0],intData[1],intData[2]);break;		    
		case 2:
			theShape[allShapes]=new Triangle(intData[0],intData[1],intData[2],intData[3],intData[4],intData[5]);break;
		case 1:
			theShape[allShapes]=new Rectangle(intData[0],intData[1],intData[2],intData[3]);break;  
		case 3:
			theShape[allShapes]=new Square(intData[0],intData[1],intData[2],intData[3]);break;
		}
		allShapes++;
		if(theShape[allShapes-1]!=null) 
			JOptionPane.showMessageDialog(null,"已建立一个新的"+theShape[allShapes-1].point().name+"对象","建立图形对象",JOptionPane.PLAIN_MESSAGE);   
		if(allShapes==theShape.length) 
		{
			JOptionPane.showMessageDialog(null,"已达到最大图形数！","建立图形对象",JOptionPane.CANCEL_OPTION);
		    superChoice.makeChoice(theShape);
		}
		buildAShape(theShape);
	}
}
