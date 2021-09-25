import java.awt.*;
import java.awt.event.*;
class ScrollDemo extends Frame implements AdjustmentListener
{
	String msg="";
	Scrollbar s1;
	ScrollDemo()
	{
		setLayout(null);
		s1=new Scrollbar(Scrollbar.VERTICAL,0,30,0,400);
		s1.setBounds(250,50,30,200);
		add(s1);
		s1.addAdjustmentListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="ScrollBar Position: ";
		msg+=s1.getValue();
		g.drawString(msg,20,150);
		msg="Minimum Value: ";
		msg+=s1.getMinimum();
		g.drawString(msg,20,170);
		msg+=s1.getMaximum();
		g.drawString(msg,20,190);
	}
	public static void main(String args[])
	{
		ScrollDemo sd=new ScrollDemo();
		sd.setSize(400,400);
		sd.setTitle("My ScrollBar");
		sd.setVisible(true);
	}
}