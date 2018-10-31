//
//
//Author:William Zhang
import javax.swing.JOptionPane;
class UnicodeTool_1
{
    static int[] getUnicodes(String arg)
	{
		char[] chars = arg.toCharArray();
		int[] int_arg=new int[chars.length];
		for (int i=0;i<chars.length;i++)
        int_arg[i]=Integer.parseInt(Integer.toString(chars[i],10));
	    return int_arg;
	}
	static String[] getUnicodesStrings(String arg)
	{
		int[] int_arg=getUnicodes(arg);
		String[] HexString=new String[int_arg.length];
		for (int i=0;i<int_arg.length;i++)
			HexString[i]=Integer.toHexString(int_arg[i]);
		return HexString;
	}
	static String[] getStrings()
	{
		String str="Please input something";
        str=JOptionPane.showInputDialog(null,str);  
        String[] mystr=str.split(" ");
		return mystr;
    }
};
public class UnicodeTool
{
	public static void main(String[] args)
	{
		UnicodeTool_1 hexunicode=new UnicodeTool_1();int n=0;
		String[] mystr=hexunicode.getStrings();String[] HEXSTRING=new String[100];
		for(int i=0;i<mystr.length;i++){
			String[] HexString=hexunicode.getUnicodesStrings(mystr[i]);
			for(int j=0;j<HexString.length;j++)
			{HEXSTRING[n]=HexString[j];n++;}
		}
		JOptionPane.showMessageDialog(null,HEXSTRING,"转化为16进制unicode编码为",1);
    }
};	