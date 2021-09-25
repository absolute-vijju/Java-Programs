import java.awt.*;
import java.awt.event.*;
class ChoiceDemo extends Frame implements ItemListener
{
	String msg="";
	Choice ch;
	ChoiceDemo()
	{
		setLayout(new FlowLayout());
		ch=new Choice();
		ch.add("English");
		ch.add("Hindi");
		ch.add("Telugu");
		ch.add("Sanskrit");
		ch.add("French");
		add(ch);
		ch.addItemListener(this);
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
		msg="Selected Language: ";
		msg+=ch.getSelectedItem();
		g.drawString(msg,10,120);
	}
	public static void main(String args[])
	{
		ChoiceDemo cd=new ChoiceDemo();
		cd.setSize(400,400);
		cd.setTitle("My Choice Box");
		cd.setVisible(true);
	}
}