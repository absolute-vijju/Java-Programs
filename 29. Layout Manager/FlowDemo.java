import java.awt.*;
import javax.swing.*;
class FlowDemo extends JFrame
{
	FlowDemo()
	{
		Container c=getContentPane();
		FlowLayout obj=new FlowLayout(FlowLayout.RIGHT,10,10);
		c.setLayout(obj);
		JButton b1=new JButton("Button 1");
		JButton b2=new JButton("Button 2");
		JButton b3=new JButton("Button 3");
		JButton b4=new JButton("Button 4");
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
	}
	public static void main(String args[])
	{
		FlowDemo demo=new FlowDemo();
		demo.setSize(400,400);
		demo.setTitle("Flow Layout");
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}