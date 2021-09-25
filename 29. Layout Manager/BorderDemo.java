import java.awt.*;
import javax.swing.*;
class BorderDemo extends JFrame
{
	BorderDemo()
	{
		Container c=getContentPane();
		BorderLayout obj=new BorderLayout(10,10);
		c.setLayout(obj);
		JButton b1=new JButton("Button 1");
		JButton b2=new JButton("Button 2");
		JButton b3=new JButton("Button 3");
		JButton b4=new JButton("Button 4");
		/*c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);*/
		c.add(b1,BorderLayout.NORTH);
		c.add(b2,BorderLayout.EAST);
		c.add(b3,BorderLayout.SOUTH);
		c.add(b4,BorderLayout.CENTER);
	}
	public static void main(String args[])
	{
		BorderDemo demo=new BorderDemo();
		demo.setSize(400,400);
		demo.setTitle("Border Layout");
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}