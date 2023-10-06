implement a simple 'GUI' implemented project to compute 'LOC' based estimation
IDEA OF THE PROBLEM:
                   1)	LOC stands for Lines Of Code.
                   2)	It's a measure of software size.
                   3)Historical data is collected: previous projects' time and LOC.
                   4)estimated LOC=>(Sop+4*Sms+Spess)/6
                   5)effor=LOC/historical data
                   7)where lr=>labour rate refers to the cost per hour for employing an IT professional
                   6)cost=effort*l.r

REQUIREMENTS:
                   1)JDK.VER.8.0.1
                   2)basic knowledge of GUI
CODE:

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
class gui extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,le,h,cos,lab;
	TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,his,t19,la;
	JButton b;
gui()
{
l1=new JLabel("pin verification");
l2=new JLabel("withdrawal");
l3=new JLabel("Balence Inquiry");
l4=new JLabel("Mini Statement");
l5=new JLabel("optimestic");
l6=new JLabel("most likely");
l7=new JLabel("pessimestic");
l8=new JLabel("Estimated loc");
t1=new TextField();
t2=new TextField();
t3=new TextField();
t4=new TextField();
t5=new TextField();
t6=new TextField();
t7=new TextField();
t8=new TextField();
t9=new TextField();
t10=new TextField();
l9=new JLabel("TOTAL LOC=>");
le=new JLabel("EFORT>");
t11=new TextField();
t12=new TextField();
t13=new TextField();
t14=new TextField();
t15=new TextField();
t16=new TextField();
t17=new TextField();
t18=new TextField();
his=new TextField();
lab=new JLabel("labour rate=>");
la=new TextField();
h=new JLabel("historical data=>");
cos=new JLabel("cost=>");
t19=new TextField();
setSize(600,600);	
t1.setBounds(130,60,55,20);
t2.setBounds(240,60,55,20);
t3.setBounds(350,60,55,20);
t13.setBounds(460,60,55,20);
t4.setBounds(130,100,55,20);
t5.setBounds(240,100,55,20);
t6.setBounds(350,100,55,20);
t14.setBounds(460,100,55,20);
t7.setBounds(130,155,55,20);
t8.setBounds(240,155,55,20);
t9.setBounds(350,155,55,20);
t15.setBounds(460,155,55,20);
t10.setBounds(130,200,55,20);
t11.setBounds(240,200,55,20);
t12.setBounds(350,200,55,20);
t16.setBounds(460,200,55,20);
t17.setBounds(460,250,55,20);
l1.setBounds(10,50,100,40);
l2.setBounds(10,100,100,40);
l3.setBounds(10,150,100,40);
l4.setBounds(10,200,100,40);
l5.setBounds(120,10,100,40);
l6.setBounds(230,10,100,40);
l7.setBounds(340,10,100,40);
l8.setBounds(460,10,100,40);
l9.setBounds(350,240,100,40);
add(t1);
add(t3);
add(t7);
add(t8);
add(t9);
add(t4);
add(l9);
add(t5);
add(t6);
add(t2);
add(l1);
add(l2);
add(l3);
add(l8);
add(l4);
add(l5);
add(l6);
add(t17);
add(l7);
add(t10);
add(t11);
add(t12);
add(t13);
add(t14);
add(t15);
add(t16);
add(le);
add(t18);
add(h);
add(his);
add(lab);
add(la);
setLayout(null);
setVisible(true);
b=new JButton("COMPUTE");
b.setBounds(20,250,100,20);
le.setBounds(20,300,60,20);
t18.setBounds(100,300,100,20);
h.setBounds(300,300,100,20);
his.setBounds(405,300,100,20);
cos.setBounds(20,350,50,20);
t19.setBounds(90,350,100,20);
lab.setBounds(300,350,100,20);
la.setBounds(400,350,100,20);
add(t19);
add(cos);
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
	String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18;
	int x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12;
	double x13,x14,x15,x16;
	s1=t1.getText();
	s2=t2.getText();
	s3=t3.getText();
	s4=t4.getText();
	s5=t5.getText();
	s6=t6.getText();
	s7=t7.getText();
	s8=t8.getText();
	s9=t9.getText();
	s10=t10.getText();
	s11=t11.getText();
	s12=t12.getText();
	s17=his.getText();
	s18=la.getText();
	int hiss=Integer.valueOf(s17);
	int ll=Integer.valueOf(s18);
	x1=Integer.valueOf(s1);
	x2=Integer.valueOf(s2);
    x3=Integer.valueOf(s3);
	x4=Integer.valueOf(s4);
	x5=Integer.valueOf(s5);
	x6=Integer.valueOf(s6);
	x7=Integer.valueOf(s7);
	x8=Integer.valueOf(s8);
	x9=Integer.valueOf(s9);
	x10=Integer.valueOf(s10);
	x11=Integer.valueOf(s11);
	x12=Integer.valueOf(s12);
	x13=Math.ceil((x1+(4*x2)+x3)/6.0);
    x14=Math.ceil((x4+(4*x5)+x6)/6.0);
	x15=Math.ceil((x7+(4*x8)+x9)/6.0);
	x16=Math.ceil((x10+(4*x11)+x12)/6.0);
	/*s13=String.valuOf(x13);
	s14=String.valueOf(x14);
	s15=String.valueOf(x15);
	s16=String.valueOf(x16);
	t13.setText(s13);
	t14.setText(s14);
	t15.setText(s15);
	t16.setText(s16);*/
	 t13.setText(String.valueOf(x13));
     t14.setText(String.valueOf(x14));
     t15.setText(String.valueOf(x15));
     t16.setText(String.valueOf(x16));
	 t17.setText(String.valueOf(x13+x14+x15+x16));
	 double t=x13+x14+x15+x16;
	 double effort=Math.ceil(t/hiss);
	 t18.setText(String.valueOf(Math.ceil((t/hiss))));
	 double c=Math.ceil(effort/ll);
	  t19.setText(String.valueOf(Math.ceil(effort*ll)));
	}
}
public class assignment
{
public static void main(String hj[])
{
new gui();
}
}
                   
                   
