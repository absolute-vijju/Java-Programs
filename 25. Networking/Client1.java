import java.io.*;
import java.net.*;
class Client1
{
	public static void main(String args[]) throws Exception
	{
		Socket s=new Socket("localhost",777);
		InputStream is=s.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		String str;
		while((str=br.readLine()) !=null)
			System.out.println("From Server: "+str);
		br.close();
		s.close();
	}
}