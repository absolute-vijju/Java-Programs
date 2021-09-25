import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
class ButtonDemo2 extends JFrame
{
	JButton b;
	ButtonDemo2()
	{
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon ii=new ImageIcon("smily.jpg");
		b=new JButton("Click Me!",ii);
		b.setBackground(Color.yellow);
		b.setForeground(Color.red);
		b.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		Border bd=BorderFactory.createBevelBorder(BevelBorder.RAISED);
		b.setBorder(bd);
		b.setToolTipText("This is a Button");
		b.setMnemonic('C');
		c.add(b);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		ButtonDemo2 obj=new ButtonDemo2();
		obj.setTitle("My Buttons");
		obj.setSize(500,400);
		obj.setVisible(true);
	}
}