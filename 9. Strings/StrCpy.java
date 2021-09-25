class StrCpy
{
	public static void main(String args[])
	{
		String str="Hello! This is a book on Java";
		char arr[]=new char[20];
		str.getChars(7,21,arr,0);
		System.out.println(arr);
	}
}