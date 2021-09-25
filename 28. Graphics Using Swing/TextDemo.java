import javax.swing.*;
import java.awt.*;
class MyPanel extends JPanel
{
	MyPanel()
	{
		this.setBackground(Color.green);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.red);
		g.setFont(new Font("Comic Sans Ms",Font.BOLD,34));
		g.drawString("Hello Learners!",50,100);
	}
}
class TextDemo extends JFrame
{
	TextDemo()
	{
		Container c=this.getContentPane();
		MyPanel mp=new MyPanel();
		c.add(mp);
	}
	public static void main(String args[])
	{
		TextDemo td=new TextDemo();
		td.setTitle("My Swing Frame");
		td.setSize(400,400);
		td.setVisible(true);
		td.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}