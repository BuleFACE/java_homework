//
//
//Author:William Zhang
package j_UIPack;
import javax.swing.JOptionPane;
import myGraph.*;
public class MyTestGraphs {
	public static void main(String[] args)
    {
	if(args==null||args.length<=0) {
		args=new String[1];
        while(true) {
        	args[0]=JOptionPane.showInputDialog(null,"请重新输入最大图形数！","输入错误",JOptionPane.ERROR_MESSAGE);
        if(args[0]==null) System.exit(0);
        if(args[0].equals("")) continue;
        if(Integer.parseInt(args[0])>0) break;
            }
        }	
	MyShape[] shapes=new MyShape[Integer.parseInt(args[0])];
    superChoice.makeChoice(shapes);
    } 
}