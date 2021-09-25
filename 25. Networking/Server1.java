import java.io.*;
import java.net.*;
class Server1
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss=new ServerSocket(777);
		Socket s=ss.accept();
		System.out.print("Connection Established.");
		OutputStream os=s.getOutputStream();
		PrintStream ps=new PrintStream(os);
		String str="Hello Client";
		ps.println(str);
		ps.println("Bye");
		ps.close();
		ss.close();
		s.close();
	}
}