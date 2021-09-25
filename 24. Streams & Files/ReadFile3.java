import java.io.*;
class ReadFile3
{
	public static void main(String args[]) throws IOException
	{
		int ch;
		FileReader fr=null;
		try{
			fr=new FileReader("text");
		}
		catch(FileNotFoundException fe){
			System.out.print("File not found");
			return;
		}
		while((ch=fr.read())!=-1)
			System.out.print((char)ch);
		fr.close();
	}
}