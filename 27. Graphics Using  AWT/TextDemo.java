import java.awt.*;
import java.awt.event.*;
class TextDemo extends Frame implements ActionListener
{
	TextField name,pass;
	TextDemo()
	{
		setLayout(new FlowLayout());
		Label x=new Label("Name: ",Label.LEFT);
		Label y=new Label("Password: ",Label.LEFT);
		name=new TextField(20);
		pass=new TextField(20);
		pass.setEchoChar('*');
		name.setBackground(Color.yellow);
		name.setForeground(Color.red);
		pass.setBackground(Color.yellow);
		pass.setForeground(Color.black);
		Font f=new Font("Comic Sans MS",Font.BOLD,20);
		name.setFont(f);
		add(x);
		add(name);
		add(y);
		add(pass);
		name.addActionListener(this);
		pass.addActionListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		//Graphics g=this.getGraphics();
		g.drawString("Name: "+name.getText(),10,200);
		g.drawString("Password: "+pass.getText(),10,240);
	}
	public static void main(String args[])
	{
		TextDemo mt=new TextDemo();
		mt.setSize(400,400);
		mt.setTitle("TextField");
		mt.setVisible(true);
	}
}