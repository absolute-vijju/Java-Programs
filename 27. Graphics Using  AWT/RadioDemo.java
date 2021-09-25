import java.awt.*;
import java.awt.event.*;
class RadioDemo extends Frame implements ItemListener
{
	String msg="";
	CheckboxGroup cbg;
	Checkbox c1,c2;
	RadioDemo()
	{
		setLayout(new FlowLayout());
		cbg=new CheckboxGroup();
		c1=new Checkbox("Yes",cbg,true);
		c2=new Checkbox("No",cbg,false);
		add(c1);
		add(c2);
		c1.addItemListener(this);
		c2.addItemListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="Current Selection: ";
		msg+=cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg,10,100);
	}
	public static void main(String args[])
	{
		RadioDemo rd=new RadioDemo();
		rd.setSize(400,400);
		rd.setTitle("Radio Button");
		rd.setVisible(true);
	}
}