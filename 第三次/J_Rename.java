//
//
//Author:William Zhang
public class J_Rename
{
private static String CnToUnicode(char cn) {
    String returnStr = "";
    return returnStr += "\\u" + Integer.toString(cn, 16);
}
public static void main(String args[])
{
	String name="张朔源";
	char[] chars = name.toCharArray();
	for(int i=0;i<chars.length;i++){
		System.out.println(chars[i]+"="+CnToUnicode(chars[i]));
	}
}}