//
//
//Author:William Zhang
package j_UIPack;
import javax.swing.JOptionPane;

import myGraph.*;
public class superChoice {
public static void makeChoice(MyShape[] theShapes) {
	String[] choices1= {"[0] Create：建立图形对象","[1] Display all:显示所有图形对象","[2] Compute Area：算出所有图形的面积总和","[3] Exit：退出图形系统"};
	int choice1=menuClass.input_choice(choices1);
	switch(choice1)
	{
	case 0:
		
		chooseToBuild.buildAShape(theShapes);makeChoice(theShapes);
	case 1:
		chooseToView.makeView(theShapes);makeChoice(theShapes);
	case 2:
		chooseToView.makeAreas(theShapes);makeChoice(theShapes);
	case 3:
		System.exit(0);
	case 5:
		JOptionPane.showMessageDialog(null,"请重新输入选项！","输入错误",JOptionPane.OK_OPTION);
		makeChoice(theShapes);
	case 6:System.exit(0);
	}		
}
}
