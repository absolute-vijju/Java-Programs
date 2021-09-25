import java.awt.*;
import java.awt.event.*;
class Message extends Frame
{
	Message()
	{
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g)
	{
		this.setBackground(new Color(100,20,20));
		Font f=new Font("Comic Sans MS",Font.BOLD+Font.ITALIC,30);
		g.setFont(f);
		g.setColor(Color.green);
		g.drawString("Hello! How are you?",100,100);
	}
	public static void main(String args[])
	{
		Message m=new Message();
		m.setSize(500,500);
		m.setTitle("This is my text");
		m.setVisible(true);
	}
}