
public class StringMethods {

	public static void main(String[] args) {
		String s1="My name is";
		String s2="Vijay Koshti";
		char arr[]= {'I',' ','a','m',' ','S','t','u','d','e','n','t'};
		String s3=new String(arr);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("Concate String: " +s1.concat(s2));
		System.out.println("Length: " + s1.length());
		System.out.println("charAt: " + s1.charAt(3));
		int n=s1.compareTo(s2);
		System.out.println("Compare: " + n);
		boolean x=s1.equalsIgnoreCase(s2);
		System.out.println("Equals: " + x);
		boolean s= s1.startsWith("M");
		System.out.println("StartWith: " + s);
		boolean e= s2.endsWith("i");
		System.out.println("EndWith: " + e);
		int i=s1.indexOf("name");
		System.out.println("IndexOf: " + i);
		int l=s1.lastIndexOf("name");
		System.out.println("Last indexOf: " + l);
		String s4=s2.replace("Vijay", "Vijju");
		System.out.println("Replace: " + s4);
		String s5=s2.replace("i", "u");
		System.out.println("Replace: " + s5);
		String sub=s4.substring(0, 5);
		System.out.println("Substring: " + sub);
		String upper=s1.toUpperCase();
		System.out.println("Uppercase: " + upper);
		String lower=s1.toLowerCase();
		System.out.println("Lovercase: " + lower);
		String demo="   Vijay     Koshti    ";
		System.out.println(demo);
		String trim=demo.trim();
		System.out.println("Trim: " + trim);
		System.out.println("Split String:");
		String sp[];
		sp=s1.split(" ");
		for (int j = 0; j < sp.length; j++) {
			System.out.println(sp[j]);
		}
		
	}

}
