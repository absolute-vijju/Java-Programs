import java.awt.*;
import java.applet.*;
public class Animate2 extends Applet
	{
		public void paint(Graphics g)
		{
			Image img1=getImage(getDocumentBase(),"fig1.gif");
			Image img2=getImage(getDocumentBase(),"fig2.gif");
			Image img3=getImage(getDocumentBase(),"fig3.gif");
			Image img4=getImage(getDocumentBase(),"fig4.gif");
			for(;;)
			{
				try
				{
					g.drawImage(img1,50,50,null);
					Thread.sleep(20);
					g.drawImage(img2,50,50,null);
					Thread.sleep(20);
					g.drawImage(img3,50,50,null);
					Thread.sleep(20);
					g.drawImage(img4,50,50,null);
					Thread.sleep(20);
				}
				catch(InterruptedException ie)
				{
					
				}
			}
		}
	}