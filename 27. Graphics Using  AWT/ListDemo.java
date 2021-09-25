import java.awt.*;
import java.awt.event.*;
class ListDemo extends Frame implements ItemListener
{
	int[] msg;
	List lst;
	ListDemo()
	{
		setLayout(new FlowLayout());
		lst=new List(4,true);
		lst.add("English");
		lst.add("Hindi");
		lst.add("Telugu");
		lst.add("Sanskrit");
		lst.add("French");
		add(lst);
		lst.addItemListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void itemStateChanged(ItemEvent ir)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Selected Language: ",100,200);
		msg=lst.getSelectedIndexes();
		for(int i=0;i<msg.length;i++)
		{
			String item=lst.getItem(msg[i]);
			g.drawString(item,100,220+i*20);
		}
	}
	public static void main(String args[])
	{
		ListDemo ld=new ListDemo();
		ld.setSize(400,400);
		ld.setTitle("My ListBox");
		ld.setVisible(true);
	}
}