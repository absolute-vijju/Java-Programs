import java.awt.*;
import javax.swing.*;
class GridDemo extends JFrame
{
	GridDemo()
	{
		Container c=getContentPane();
		GridLayout grid=new GridLayout(2,3,50,50);
		c.setLayout(grid);
		JButton b1=new JButton("Button 1");
		JButton b2=new JButton("Button 2");
		JButton b3=new JButton("Button 3");
		JButton b4=new JButton("Button 4");
		JButton b5=new JButton("Button 5");
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
	}
	public static void main(String args[])
	{
		GridDemo demo=new GridDemo();
		demo.setSize(500,400);
		demo.setTitle("Card Layout");
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}