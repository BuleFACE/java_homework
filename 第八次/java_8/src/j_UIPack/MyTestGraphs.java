//
//
//Author:William Zhang
package j_UIPack;
import javax.swing.JOptionPane;
import myGraph.*;
public class MyTestGraphs {
	public static void main(String[] args)
{
	if(args[0]==null&&args.length<=0) return;
	MyShape[] shapes=new MyShape[Integer.parseInt(args[0])];
	superChoice makechoice=new superChoice();
		makechoice.makeChoice(shapes);
}
}