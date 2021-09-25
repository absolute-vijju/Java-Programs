import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CardDemo extends JFrame implements ActionListener
{
	Container c;
	CardLayout card;
	JButton b1,b2,b3,b4;
	CardDemo()
	{
		c=getContentPane();
		card=new CardLayout(50,10);
		c.setLayout(card);
		b1=new JButton("Button 1");
		b2=new JButton("Button 2");
		b3=new JButton("Button 3");
		b4=new JButton("Button 4");
		c.add("First Card",b1);
		c.add("Second Card",b2);
		c.add("Third Card",b3);
		c.add("Fourth Card",b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		card.next(c);
		card.show(c,"Second Card");
	}
	public static void main(String args[])
	{
		CardDemo demo=new CardDemo();
		demo.setSize(400,400);
		demo.setTitle("Card Layout");
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}