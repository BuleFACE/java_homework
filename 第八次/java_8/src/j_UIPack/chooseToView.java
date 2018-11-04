//
//
//Author:William Zhang
package j_UIPack;
import myGraph.*;
import javax.swing.JOptionPane;
public class chooseToView {
public void makeView(MyShape[] theShape) {
	String[] properties=new String[chooseToBuild.allShapes+2];
	properties[0]="图形个数："+chooseToBuild.allShapes;int i=1;
	properties[chooseToBuild.allShapes+1]="["+(chooseToBuild.allShapes+1)+"]"+"Back：返回主功能选择对话框";
	for(MyShape shape:theShape) {
		properties[i]="["+i+"]"+shape.getProperty();
		i++;
		if(i>chooseToBuild.allShapes) break;
	}
	menuClass amenu=new menuClass();
	if(amenu.input_choice(properties)==chooseToBuild.allShapes) superChoice.makeChoice(theShape);
}
public void makeAreas(MyShape[] theShape) {
	String[] areas=new String[chooseToBuild.allShapes+2];
	areas[0]="图形个数："+chooseToBuild.allShapes;int i=1;double s=0;
	for(MyShape shape:theShape) {	
		areas[i]="["+i+"]"+shape.getProperty()+"  面积="+shape.getArea();
		s+=shape.getArea();
		i++;
		if(i>chooseToBuild.allShapes) break;
	}
	areas[chooseToBuild.allShapes+1]="总面积："+s+"\n["+(chooseToBuild.allShapes+1)+"]"+"Back：返回主功能选择对话框";
	menuClass amenu=new menuClass();
	if(amenu.input_choice(areas)==chooseToBuild.allShapes) superChoice.makeChoice(theShape);
}
}
