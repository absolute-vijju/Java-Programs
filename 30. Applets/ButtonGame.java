import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonGame extends JApplet implements MouseMotionListener,MouseListener
{
	JButton b;
	JLabel lbl;
	static int score=0;
	public void init()
	{
		Container c=getContentPane();
		c.setLayout(null);
		ImageIcon ii=new ImageIcon("gameimg1.gif");
		b=new JButton("Click Me!",ii);
		Font f=new Font("Comic Sans MS",Font.BOLD,20);
		b.setFont(f);
		b.setBounds(400,300,250,75);
		c.add(b);
		lbl=new JLabel();
		Font f2=new Font("Impact",Font.PLAIN,30);
		lbl.setFont(f2);
		lbl.setText("Score: "+score);
		lbl.setBounds(550,20,150,50);
		c.add(lbl);
		b.addMouseMotionListener(this);
		b.addMouseListener(this);
	}
	public void mouseDragged(MouseEvent me)
	{
		int x=(int)(600*Math.random());
		int y=(int)(500*Math.random());
		b.setBounds(x,y,250,75);
	}
	public void mouseMoved(MouseEvent me)
	{
		int x=(int)(600*Math.random());
		int y=(int)(500*Math.random());
		b.setBounds(x,y,250,75);
	}
	public void mouseClicked(MouseEvent e)
	{
		ImageIcon ii=new ImageIcon("gameimg2.gif");
		b.setIcon(ii);
		lbl.setForeground(Color.red);
		score+=100;
		lbl.setText("Score: "+score);
	}
	public void mouseEntered(MouseEvent e)
	{
		int x=(int)(600*Math.random());
		int y=(int)(500*Math.random());
		b.setBounds(x,y,250,75);
	}
	public void mouseExited(MouseEvent e)
	{
		ImageIcon ii=new ImageIcon("gameimg1.gif");
		b.setIcon(ii);
	}
	public void mousePressed(MouseEvent e)
	{
		
	}
	public void mouseReleased(MouseEvent e)
	{
		
	}
}