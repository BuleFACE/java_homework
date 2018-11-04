//
//
//Author:William Zhang
package j_UIPack;
import myGraph.*;
public class superChoice {
public static void makeChoice(MyShape[] theShapes) {
	String[] choices1= {"[0] Create：建立图形对象","[1] Display all:显示所有图形对象","[2] Compute Area：算出所有图形的面积总和","[3] Exit：退出图形系统"};
	menuClass operateMenu=new menuClass(),graphMenu=new menuClass();
	int choice1=operateMenu.input_choice(choices1);
	switch(choice1)
	{
	case 0:
		while(true) {chooseToBuild toBuild=new chooseToBuild();
		toBuild.buildAShape(theShapes);makeChoice(theShapes);}
	case 1:
		chooseToView toView=new chooseToView();
		toView.makeView(theShapes);makeChoice(theShapes);
	case 2:
		chooseToView toArea=new chooseToView();
		toArea.makeAreas(theShapes);makeChoice(theShapes);
	case 3:
		System.exit(0);
	}
	
		
}
}
