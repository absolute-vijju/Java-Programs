import java.awt.*;
import java.awt.event.*;
class KeyDemo extends Frame implements KeyListener
{
	TextArea ta;
	String msg="";
	KeyDemo()
	{
		setLayout(new FlowLayout());
		ta=new TextArea(5,25);
		Font f=new Font("Comic Sans MS",Font.BOLD,25);
		ta.setFont(f);
		ta.setForeground(Color.red);
		add(ta);
		ta.addKeyListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void keyPressed(KeyEvent ke)
	{
		int keycode=ke.getKeyCode();
		msg+="\nKey Code: "+keycode;
		String keyname=ke.getKeyText(keycode);
		msg+="\nKey Name: "+keyname;
		ta.setText(msg);
		msg="";
	}
	public void keyTyped(KeyEvent ke)
	{
		
	}
	public void keyReleased(KeyEvent ke)
	{
		int keycode=ke.getKeyCode();
		msg+="\nKey Code: "+keycode;
		String keyname=ke.getKeyText(keycode);
		msg+="\nKey Name: "+keyname;
		ta.setText(msg);
		msg="";
	}
	public static void main(String args[])
	{
		KeyDemo kd=new KeyDemo();
		kd.setSize(400,400);
		kd.setTitle("Catch the Key");
		kd.setVisible(true);
	}
}