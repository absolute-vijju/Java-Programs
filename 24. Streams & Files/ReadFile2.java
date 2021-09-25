import java.io.*;
class ReadFile2
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a File name: ");
		String fname=br.readLine();
		FileInputStream fin=null;
		try{
			fin=new FileInputStream(fname);
		}
		catch(FileNotFoundException fe){
			System.out.print("File not found");
			return;
		}
		BufferedInputStream bin=new BufferedInputStream(fin);
		System.out.println("File Contents");
		int ch;
		while((ch=fin.read())!=-1)
			System.out.print((char)ch);
		bin.close();
	}
}