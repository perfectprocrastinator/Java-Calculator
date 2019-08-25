import	java.awt.*;
import	java.awt.event.*;
class MyFrame1 implements ActionListener
{
	Frame f;
	TextField tf;
	Button b9;
	Button b8;
	Button b7;
	Button b6;
	Button b5;
	Button b4;
	Button b3;
	Button b2;
	Button b1;
	Button b0;
	Button bs,bm,bsub,bdiv,bc;
	Button be;
	int n1,n2,c;
	 String s1,s2;
	 String s4,s5,s6;
	MyFrame1()
	{
		f=new Frame("My Frame");
		tf=new TextField();
		b9=new Button("9");
		b8=new Button("8");
		b7=new Button("7");
		b6=new Button("6");
		b5=new Button("5");
		b4=new Button("4");
		b3=new Button("3");
		b2=new Button("2");
		b1=new Button("1");
		b0=new Button("0");
		bs=new Button("+");
		bsub=new Button("-");
		bm=new Button("*");
		bdiv=new Button("/");
		be=new Button("=");
		
		bc=new Button("CLEAR");
		
		tf.setBounds(100,100,800,50);
		b9.setBounds(700,200,100,50);
		b8.setBounds(400,200,100,50);
		b7.setBounds(100,200,100,50);
		b6.setBounds(700,300,100,50);
		b5.setBounds(400,300,100,50);
		b4.setBounds(100,300,100,50);
		b3.setBounds(700,400,100,50);
		b2.setBounds(400,400,100,50);
		b1.setBounds(100,400,100,50);
		b0.setBounds(400,500,100,50);
		bs.setBounds(100,500,100,50);
		be.setBounds(700,500,100,50);
		
		bsub.setBounds(100,600,100,50);
		bdiv.setBounds(400,600,100,50);
		bm.setBounds(700,600,100,50);
		bc.setBounds(100,700,100,50);
		b9.addActionListener(this);
		b8.addActionListener(this);
		b7.addActionListener(this);
		b6.addActionListener(this);
		b5.addActionListener(this);
		b4.addActionListener(this);
		b3.addActionListener(this);
		b2.addActionListener(this);
		b1.addActionListener(this);
		b0.addActionListener(this);
		bs.addActionListener(this);
		be.addActionListener(this);
		bm.addActionListener(this);
		bsub.addActionListener(this);
		bdiv.addActionListener(this);
		bc.addActionListener(this);
		
		f.add(tf);
		f.add(b9);
		f.add(b8);
		f.add(b7);
		f.add(b6);
		f.add(b5);
		f.add(b4);
		f.add(b3);
		f.add(b2);
		f.add(b1);
		f.add(b0);
		f.add(bs);
		f.add(be);
		f.add(bsub);
		f.add(bm);
		f.add(bdiv);
		f.add(bc);
		
		f.setLayout(null);
		f.setSize(1000,1000);
		f.setVisible(true);
	}
	public	void	actionPerformed(ActionEvent e)

{
	if	(e.getSource()==bc)
		
{
	s6=tf.getText();
int n=Integer.parseInt(s6);

	n=n/10;
	s6 = Integer.toString(n);
 tf.setText(s6);

}
if	(e.getSource()==b9)
{
	 s4=tf.getText();
	 s5="9";
	s6=s4+s5;
	\
tf.setText(s6);

}
if	(e.getSource()==b8)
{
s4=tf.getText();
	 s5="8";
	 s6=s4+s5;
tf.setText(s6);
}
if	(e.getSource()==b7)
{
 s4=tf.getText();
	 s5="7";
	 s6=s4+s5;
tf.setText(s6);

}
if	(e.getSource()==b6)
{
 s4=tf.getText();
	 s5="6";
	 s6=s4+s5;
tf.setText(s6);

}
if	(e.getSource()==b5)
{
 s4=tf.getText();
	 s5="5";
	 s6=s4+s5;
tf.setText(s6);
}
if	(e.getSource()==b4)
{
 s4=tf.getText();
	 s5="4";
	 s6=s4+s5;
tf.setText(s6);
}
if	(e.getSource()==b3)
{
 s4=tf.getText();
	 s5="3";
	 s6=s4+s5;
tf.setText(s6);
}
if	(e.getSource()==b2)
{
 s4=tf.getText();
	 s5="2";
	 s6=s4+s5;
tf.setText(s6);
}
if	(e.getSource()==b1)
{
 s4=tf.getText();
	 s5="1";
	 s6=s4+s5;
tf.setText(s6);
}
if	(e.getSource()==b0)
{
 s4=tf.getText();
	 s5="0";
	 s6=s4+s5;
tf.setText(s6);
}
if	(e.getSource()==bs)
{
	 s1=tf.getText();
   n1=Integer.parseInt(s1);
tf.setText("");
c=1;
}
if	(e.getSource()==bm)
{
	 s1=tf.getText();
   n1=Integer.parseInt(s1);
tf.setText("");
c=3;
}
if	(e.getSource()==bsub)
{
	 s1=tf.getText();
   n1=Integer.parseInt(s1);
tf.setText("");
c=2;
}
if	(e.getSource()==bdiv)
{
	 s1=tf.getText();
   n1=Integer.parseInt(s1);
tf.setText("");
c=4;
}
if	(e.getSource()==be)
{
  s2=tf.getText();
 n2=Integer.parseInt(s2);
 if(c==1)
tf.setText(String.valueOf(n1+n2));
if(c==2)
tf.setText(String.valueOf(n1-n2));
if(c==3)
tf.setText(String.valueOf(n1*n2));
if(c==4)
tf.setText(String.valueOf(n1/n2));
}
}
	public static void main(String args[])
	{

		MyFrame1 f=new MyFrame1();
		
	}
}