import java.io.*;
class ReadFile
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fin=new FileInputStream("myfile.txt");
		System.out.print("File Contents");
		int ch;
		while((ch=fin.read())!=-1)
			System.out.print((char)ch);
		fin.close();
	}
}