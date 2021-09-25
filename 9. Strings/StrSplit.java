class StrSplit
{
	public static void main(String args[])
	{
		String str="Hello! This is a book on Java";
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
	}
}