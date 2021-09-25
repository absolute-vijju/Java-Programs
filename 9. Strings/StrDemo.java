class StrDemo
{
	public static void main(String args[])
	{
		String s1="A book on Java";
		String s2=new String("I like it");
		char arr[]={'D','r','e','a','m','t','e','c','h',' ','P','r','e','s','s'};
		String s3=new String(arr);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("Length of s1: " + s1.length());
		System.out.println("Join: " + s1.concat(s2));
		System.out.println(s1+" from "+s3);
		boolean x=s1.startsWith("A");
		if(x) System.out.println("s1 starts with 'A'");
		else System.out.println("s2 does not starts with A");
		String p=s2.substring(0,7);
		String q=s3.substring(0,9);
		System.out.println(p+q);
		System.out.println("Upper s1: " + s1.toUpperCase());
		System.out.println("Lower s1: " + s1.toLowerCase());
	}
}