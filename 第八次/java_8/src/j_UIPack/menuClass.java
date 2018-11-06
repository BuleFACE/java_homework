//
//
//Author:William Zhang
package j_UIPack;
import javax.swing.JOptionPane;
public class menuClass {
static String getItemsString(String[] items) {
	String Items="";
	for(int i=0;i<items.length;i++) {
		Items+=items[i];
		if(i!=items.length-1) Items+="\n";
	}
	return Items;
}

static int input_choice(String[] paramStr) {
	String items=getItemsString(paramStr);
	String str=JOptionPane.showInputDialog(null,items,"请输入选择",JOptionPane.PLAIN_MESSAGE);
	if(str==null) return paramStr.length+2;
	if(str.length()==0) return paramStr.length+1;
	int num=Integer.parseInt(str);
	while(num<0||num>paramStr.length-1) 
    {
		str=JOptionPane.showInputDialog(null,"请重新输入！","输入错误",JOptionPane.ERROR_MESSAGE);
		num=Integer.parseInt(str);}
    return num;
}
public menuClass() {};
}