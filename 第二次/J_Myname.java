public class J_Myname
{
private static String cnToUnicode(String cn) {
    char[] chars = cn.toCharArray();
    String returnStr = "";
    for (int i = 0; i < chars.length; i++) {
      returnStr += "\\u" + Integer.toString(chars[i], 16);
    }
    return returnStr;
}
public static void main(String args[]) {
String name="�ҵ���������˷Դ";
System.out.println(name+"    "+cnToUnicode(name));
}
}
