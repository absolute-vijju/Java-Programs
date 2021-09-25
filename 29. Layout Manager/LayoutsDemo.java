import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class LayoutsDemo extends JFrame implements ActionListener
{
	Container c;
	CardLayout card;
	JButton b1;
	LayoutsDemo()
	{
		c=getContentPane();
		card=new CardLayout();
		c.setLayout(card);
		b1=new JButton("Button 1");
		c.add("First Card",b1);
		c.add("Second Card",new MyPanel());
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		card.next(c);
	}
	public static void main(String args[])
	{
		LayoutsDemo demo=new LayoutsDemo();
		demo.setSize(400,400);
		demo.setTitle("Card Layout");
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class MyPanel extends JPanel
{
	JTextField tf;
	JCheckBox cb;
	JButton b;
	MyPanel()
	{
		this.setLayout(new BorderLayout());
		tf=new JTextField("Text Field",15);
		b=new JButton("OK");
		cb=new JCheckBox("CheckBox");
		this.add("North",tf);
		this.add("South",b);
		this.add("East",cb);
	}
}