import javax.swing.*;
import java.awt.*;
class FrameDemo extends JFrame
{
	public static void main(String args[])
	{
		FrameDemo fd=new FrameDemo();
		Container c=fd.getContentPane();
		c.setBackground(Color.green);
		fd.setTitle("My Frame");
		fd.setSize(400,400);
		fd.setVisible(true);
		fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}