import java.awt.*;
import java.applet.*;
public class MyApp extends Applet
{
	public void init()
	{
		setBackground(Color.yellow);
	}
	public void paint(Graphics g)
	{
		Font f=new Font("Comic Sans MS",50,50);
		g.setFont(f);
		g.drawString("Hello Applets!",50,100);
	}
}