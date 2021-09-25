import java.awt.*;
import javax.swing.*;
class BoxDemo extends JFrame
{
	BoxDemo()
	{
		JLabel l1=new JLabel("Enter Name: ");
		JTextField t1=new JTextField(20);
		t1.setMaximumSize(t1.getPreferredSize());
		
		Box hor1=Box.createHorizontalBox();
		hor1.add(l1);
		hor1.add(Box.createHorizontalStrut(20));
		hor1.add(t1);
		
		JLabel l2=new JLabel("Enter Password: ");
		JTextField t2=new JTextField(20);
		t2.setMaximumSize(t1.getPreferredSize());
		
		Box hor2=Box.createHorizontalBox();
		hor2.add(l2);
		hor2.add(Box.createHorizontalStrut(20));
		hor2.add(t2);
		
		JButton b1=new JButton("OK");
		JButton b2=new JButton("Cancel");
		
		Box hor3=Box.createHorizontalBox();
		hor3.add(b1);
		hor3.add(Box.createHorizontalGlue());
		hor3.add(b2);
		
		Box ver=Box.createVerticalBox();
		ver.add(hor1);
		ver.add(Box.createVerticalStrut(100));
		ver.add(hor2);
		ver.add(Box.createVerticalStrut(100));
		ver.add(hor3);
		
		Container c=getContentPane();
		c.add(ver);
	}
	public static void main(String args[])
	{
		BoxDemo demo=new BoxDemo();
		demo.setSize(400,350);
		demo.setVisible(true);
		demo.setTitle("Contact Form");
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}