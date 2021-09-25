import java.awt.*;
import java.awt.event.*;
class Images extends Frame
{
	static Image img;
	Images()
	{
		img=Toolkit.getDefaultToolkit().getImage("Prabhas.jpg");
		MediaTracker track=new MediaTracker(this);
		track.addImage(img,0);
		try
		{
			track.waitForID(0);
		}
		catch(InterruptedException ie)
		{
			
		}
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g)
	{
		g.drawImage(img,40,50,750,750,null);
	}
	public static void main(String args[])
	{
		Images i=new Images();
		i.setSize(800,800);
		i.setTitle("My Images");
		i.setIconImage(img);
		i.setVisible(true);
	}
}