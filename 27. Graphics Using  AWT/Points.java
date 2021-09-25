import java.awt.*;
import java.awt.event.*;
class Points extends Frame
{
	Points()
	{
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		for(;;)
		{
			int x=(int)(Math.random()*800);
			int y=(int)(Math.random()*600);
			g.drawLine(x,y,x,y);
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException ie)
			{
				
			}
		}
	}
	public static void main(String args[])
	{
		Points obj=new Points();
		obj.setBackground(Color.black);
		obj.setSize(500,400);
		obj.setTitle("Random Dots");
		obj.setVisible(true);
	}
}