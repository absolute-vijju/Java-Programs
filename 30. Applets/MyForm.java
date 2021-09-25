import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyForm extends JApplet implements ActionListener
{
	String str="",str1="",str2="";
	Object x[];
	JLabel n,a,i,lbl;
	JTextField name;
	JTextArea addr;
	JList lst;
	JButton b1,b2;
	Container c;
	public void init()
	{
		JFrame jf=new JFrame();
		c=jf.getContentPane();
		
		c.setBackground(Color.yellow);
		
		c.setLayout(null);
		
		jf.setSize(500,400);
		jf.setTitle("Online Shopping Form");
		jf.setVisible(true);
		
		Font f=new Font("Comic Sans MS",Font.BOLD,26);
		lbl=new JLabel();
		lbl.setFont(f);
		lbl.setForeground(Color.red);
		lbl.setText("VIJAY SALES ONLINE SHOP");
		lbl.setBounds(200,10,500,30);
		c.add(lbl);
		
		n=new JLabel("Name: ",JLabel.LEFT);
		name=new JTextField(30);
		n.setBounds(50,100,100,30);
		name.setBounds(200,100,200,30);
		c.add(n);
		c.add(name);
		
		a=new JLabel("Address: ",JLabel.LEFT);
		addr=new JTextArea(5,50);
		a.setBounds(50,150,100,30);
		addr.setBounds(200,150,200,100);
		c.add(a);
		c.add(addr);
		
		i=new JLabel("Select Items: ",JLabel.LEFT);
		String[] data={"TVs","Washing Machines","DVD Players","Refrigerators"};
		lst=new JList(data);
		i.setBounds(50,270,100,30);
		lst.setBounds(200,270,200,100);
		c.add(i);
		c.add(lst);
		
		b1=new JButton("OK");
		b2=new JButton("Cancel");
		b1.setBounds(200,400,100,30);
		b1.setBounds(350,400,100,30);
		c.add(b1);
		c.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		str=ae.getActionCommand();
		if(str.equals("OK"))
		{
			str1=name.getText()+"\n";
			str1+=addr.getText()+"\n";
			x=lst.getSelectedValues();
			for(int i=0;i<x.length;i++)
				str2+=(String)x[i]+"\n";
			addr.setText(str1+str2);
			str1="";
			str2="";
		}
		else
		{
			name.setText("");
			addr.setText("");
			lst.clearSelection();
		}
	}
}