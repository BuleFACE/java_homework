//
//
//Author:William Zhang
public class Average {
public static void main(String[] args) {
	if(args==null) return;;double a=0;
	System.out.print("[");
	for(int i=0;i<args.length;i++) {
		a+=Double.parseDouble(args[i]);
		System.out.print(args[i]+" ");
	}
	System.out.print("].Average"+"="+a/args.length);
}
}
