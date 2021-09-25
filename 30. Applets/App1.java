import java.awt.*;
import java.applet.*;
public class App1 extends Applet
{
	String msg="";
	public void init()
	{
		setBackground(Color.yellow);
		setForeground(Color.red);
		Font f=new Font("Comic Sans MS",Font.BOLD,20);
		setFont(f);
		msg+= "init";
	}
	public void start()
	{
		msg+= "start";
	}
	public void stop()
	{
		msg+= "stop";
	}
	public void destroy()
	{
		msg+= "destroy";
	}
}