//
//
//Author:William Zhang
import javax.swing.JOptionPane;
public class unicodeTool
{
private static String ToUnicode(String cn) {
    char[] chars = cn.toCharArray();
    String returnStr = "";
    for (int i = 0; i < chars.length; i++)
      returnStr += "\\u" + Integer.toString(chars[i], 16);
    return returnStr;}
public static void main(String[] args)
	{
	if(args!=null&&args.length>0)  
        for(int i=0;i<args.length;i++) System.out.print(ToUnicode(args[i]));	
	else{
		String str="Please input anything";
        str=JOptionPane.showInputDialog(null,str);  
	        JOptionPane.showMessageDialog(null,ToUnicode(str),str,1);
        }	
    }
}			