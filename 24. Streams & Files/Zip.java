import java.io.*;
import java.util.zip.*;
class Zip
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fis=new FileInputStream("NTD.txt");
		FileOutputStream fos=new FileOutputStream("ZippedFile.txt");
		DeflaterOutputStream dos=new DeflaterOutputStream(fos);
		int data;
		while((data=fis.read())!=-1)
			dos.write(data);
		fis.close();
		dos.close();
	}
}