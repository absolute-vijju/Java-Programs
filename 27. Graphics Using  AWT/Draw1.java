import java.awt.*;
import java.awt.event.*;
class Draw1 extends Frame
{
	Draw1()
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
		g.setColor(Color.blue);
		g.fillRect(40,40,200,200);
		g.setColor(Color.yellow);
		g.fillOval(90,70,80,80);
		g.setColor(Color.black);
		g.fillOval(110,95,10,10);
		g.fillOval(145,95,10,10);
		g.drawLine(130,95,130,115);
		g.setColor(Color.red);
		g.fillArc(113,115,35,20,0,-180);
	}
	public static void main(String args[])
	{
		Draw1 d=new Draw1();
		d.setSize(400,400);
		d.setTitle("My Drawing");
		d.setVisible(true);
	}
}

