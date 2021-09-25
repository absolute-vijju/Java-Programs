import java.io.*;
class CreateFile2
{
	public static void main(String args[]) throws IOException
	{
		String str="This is book on Java."+"\nI'm a learner of Java.";
		FileWriter fw=new FileWriter("text");
		for(int i=0;i<str.length();i++)
			fw.write(str.charAt(i));
		fw.close();
	}
}