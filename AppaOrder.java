import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AppaOrder extends JFrame implements ActionListener
{
	JLabel icon,labTitle2,labTitle1,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,nextStatement,sponsorState,sponsorIcon,lblBG;
	JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19,bt20,next,process;
	JTextArea cartView;
	JTextField CartName,total, totalHolder,cashbox,changebox,cashStatement,changeStatement;
	int x1=159,x2=199,y1=259,y2=299,z1=359,z2=399;
	int Total=0;
	int cash;
	int change;
	String OrderList="";

	public AppaOrder()
	{

		setSize(1366,786);
		setVisible(true);
		Container x = getContentPane();
		x.setBackground(new Color(255,255,255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		labTitle1 = new JLabel(new ImageIcon("F:/OOP_as/AppaPics/title.png"));
		labTitle2 = new JLabel(new ImageIcon("F:/OOP_as/AppaPics/title2.png"));
		icon = new JLabel(new ImageIcon("F:/OOP_as/AppaPics/logo.jpg"));
		bt1 = new JButton(new ImageIcon("F:/OOP_as/Pics/Grizzly_Backpack.png"));
		bt2 = new JButton(new ImageIcon("F:/OOP_as/Pics/Grizzly_Pants.png"));
		bt3 = new JButton(new ImageIcon("F:/OOP_as/Pics/Grizzly_Shirt.png"));
		bt4 = new JButton(new ImageIcon("F:/OOP_as/Pics/Grizzly_Sliders.png"));
		bt5 = new JButton(new ImageIcon("F:/OOP_as/Pics/Icebear_Backpack.png"));
		bt6 = new JButton(new ImageIcon("F:/OOP_as/Pics/Icebear_Pants.png"));
		bt7 = new JButton(new ImageIcon("F:/OOP_as/Pics/Icebear_Pullover.png"));
		bt8 = new JButton(new ImageIcon("F:/OOP_as/Pics/Icebear_Shirt.png"));
		bt9 = new JButton(new ImageIcon("F:/OOP_as/Pics/Icebear_Sliders.png"));
		bt10 = new JButton(new ImageIcon("F:/OOP_as/Pics/Panda_Backpack.png"));
		bt11 = new JButton(new ImageIcon("F:/OOP_as/Pics/Panda_Pants.png"));
		bt12 = new JButton(new ImageIcon("F:/OOP_as/Pics/Panda_Pullover.png"));
		bt13 = new JButton(new ImageIcon("F:/OOP_as/Pics/Panda_Shirt.png"));
		bt14 = new JButton(new ImageIcon("F:/OOP_as/Pics/Panda_Sliders.png"));
		bt15 = new JButton(new ImageIcon("F:/OOP_as/Pics/WBB_Backpack.png"));
		bt16 = new JButton(new ImageIcon("F:/OOP_as/Pics/WBB_Sliders.png"));
		bt17 = new JButton(new ImageIcon("F:/OOP_as/Pics/WBB_Sneakers.png"));
		bt18 = new JButton(new ImageIcon("F:/OOP_as/Pics/WBB1_Shirt.png"));
		bt19 = new JButton(new ImageIcon("F:/OOP_as/Pics/WWB2_Shirt.png"));
		bt20 = new JButton(new ImageIcon("F:/OOP_as/Pics/WWB3_Shirt.png"));
		next = new JButton(new ImageIcon("F:/OOP_as/AppaPics/next.png"));
		t1 = new JLabel("Price:P"+x1);
		t2 = new JLabel("Price: P"+x1);
		t3 = new JLabel("Price: P"+x1);
		t4 = new JLabel("Price: P"+x1);
		t5 = new JLabel("Price: P"+x2);
		t6 = new JLabel("Price: P"+x2);
		t7 = new JLabel("Price: P"+x2);
		t8 = new JLabel("Price: P"+y1);
		t9 = new JLabel("Price: P"+y1);
		t10 = new JLabel("Price: P"+y1);
		t11 = new JLabel("Price: P"+y1);
		t12 = new JLabel("Price: P"+y1);
		t13 = new JLabel("Price: P"+y2);
		t14 = new JLabel("Price: P"+y2);
		t15 = new JLabel("Price: P"+y2);
		t16 = new JLabel("Price: P"+z1);
		t17 = new JLabel("Price: P"+z1);
		t18 = new JLabel("Price: P"+z1);
		t19 = new JLabel("Price: P"+z2);
		t20 = new JLabel("Price: P"+z2);
		process = new JButton("Compute");
		process.setFont(new Font("Ink Free",Font.PLAIN,20));
		nextStatement = new JLabel("Next Customer");

		cartView = new JTextArea(25,40);
		cartView.setEnabled(false);
		cartView.setBackground(new Color(100,100,100));
		CartName = new JTextField(" "+" "+" "+" "+" "+" "+" "+" "+" "+" "+" "+" "+" "+" "+" "+" "+"Check Here!");
		CartName.setFont(new Font("Segoe Script",Font.PLAIN,20));
		total = new JTextField("      Payment:   ");
		total.setFont(new Font("Ink Free",Font.PLAIN,20));
		totalHolder = new JTextField(20);
		totalHolder.setFont(new Font("Ink Free",Font.PLAIN,20));
		cashbox = new JTextField(20);
		cashbox.setFont(new Font("Ink Free",Font.PLAIN,20));
		changebox = new JTextField(20);
		changebox.setFont(new Font("Ink Free",Font.PLAIN,20));
		cashStatement = new JTextField(" "+"Enter Your Cash:"   );
		cashStatement.setFont(new Font("Ink Free",Font.PLAIN,16));
		changeStatement = new JTextField(" "+" "+" "+" "+"Change:");
		changeStatement.setFont(new Font("Ink Free",Font.PLAIN,20));

		add(labTitle1);
		labTitle1.setBounds(150,25,514,98);

		add(labTitle2);
		labTitle2.setBounds(700,25,328,154);

		add(icon);
		icon.setBounds(20,5,50,50);

		add(bt1);
		bt1.setBounds(50,200,90,90);
		add(t1);
		t1.setBounds(50,290,100,30);
		bt1.addActionListener(this);

		add(bt2);
		bt2.setBounds(160,200,90,90);
		add(t2);
		t2.setBounds(160,290,100,30);
		bt2.addActionListener(this);

		add(bt3);
		bt3.setBounds(270,200,90,90);
		add(t3);
		t3.setBounds(270,290,100,30);
		bt3.addActionListener(this);

		add(bt4);
		bt4.setBounds(380,200,90,90);
		add(t4);
		t4.setBounds(380,290,100,30);
		bt4.addActionListener(this);

		add(bt5);
		bt5.setBounds(490,200,90,90);
		add(t5);
		t5.setBounds(490,290,100,30);
		bt5.addActionListener(this);

		add(bt6);
		bt6.setBounds(600,200,90,90);
		add(t6);
		t6.setBounds(600,290,100,30);
		bt6.addActionListener(this);

		add(bt7);
		bt7.setBounds(710,200,90,90);
		add(t7);
		t7.setBounds(710,290,100,30);
		bt7.addActionListener(this);

		add(bt8);
		bt8.setBounds(50,330,90,90);
		add(t8);
		t8.setBounds(50,420,100,30);
		bt8.addActionListener(this);

		add(bt9);
		bt9.setBounds(160,330,90,90);
		add(t9);
		t9.setBounds(160,420,100,30);
		bt9.addActionListener(this);

		add(bt10);
		bt10.setBounds(270,330,90,90);
		add(t10);
		t10.setBounds(270,420,100,30);
		bt10.addActionListener(this);

		add(bt11);
		bt11.setBounds(380,330,90,90);
		add(t11);
		t11.setBounds(380,420,100,30);
		bt11.addActionListener(this);

		add(bt12);
		bt12.setBounds(490,330,90,90);
		add(t12);
		t12.setBounds(490,420,100,30);
		bt12.addActionListener(this);

		add(bt13);
		bt13.setBounds(600,330,90,90);
		add(t13);
		t13.setBounds(600,420,100,30);
		bt13.addActionListener(this);

		add(bt14);
		bt14.setBounds(710,330,90,90);
		add(t14);
		t14.setBounds(710,420,100,30);
		bt14.addActionListener(this);

		add(bt15);
		bt15.setBounds(50,460,90,90);
		add(t15);
		t15.setBounds(50,550,100,30);
		bt15.addActionListener(this);

		add(bt16);
		bt16.setBounds(160,460,90,90);
		add(t16);
		t16.setBounds(160,550,100,30);
		bt16.addActionListener(this);

		add(bt17);
		bt17.setBounds(270,460,90,90);
		add(t17);
		t17.setBounds(270,550,100,30);
		bt17.addActionListener(this);

		add(bt18);
		bt18.setBounds(380,460,90,90);
		add(t18);
		t18.setBounds(380,550,100,30);
		bt18.addActionListener(this);

		add(bt19);
		bt19.setBounds(490,460,90,90);
		add(t19);
		t19.setBounds(490,550,100,30);
		bt19.addActionListener(this);

		add(bt20);
		bt20.setBounds(600,460,90,90);
		add(t20);
		t20.setBounds(600,550,100,30);
		bt20.addActionListener(this);

		add(next);
		next.setBounds(710,460,90,90);
		add(nextStatement);
		nextStatement.setBounds(710,550,100,30);
		next.addActionListener(this);

		add(cartView);
		cartView.setBounds(850,250,400,250);

		add(CartName);
		CartName.setBounds(850,198,402,50);

		add(total);
		total.setBounds(850,505,134,50);

		add(totalHolder);
		totalHolder.setBounds(983,505,266,50);

		add(cashStatement);
		cashStatement.setBounds(850,555,134,50);

		add(cashbox);
		cashbox.setBounds(983,550,266,55);

		add(changeStatement);
		changeStatement.setBounds(850,605,134,50);

		add(changebox);
		changebox.setBounds(983,605,266,50);

		add(process);
		process.setBounds(850,655,400,50);
		process.addActionListener(this);

		setLayout(null);
	}

	public void actionPerformed(ActionEvent exec)
	{
			if(exec.getSource()==bt1||exec.getSource()==bt2||exec.getSource()==bt3||exec.getSource()==bt4)
			{
				if(exec.getSource()==bt1)
				{
				int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
				int subtotal = x1*qty;
				OrderList="\n Prod 01 \t Grizzly Backpack "+" "+" "+ qty+"\t" +x1+"\t" + subtotal;
				Total+=subtotal;
				cartView.setText(OrderList);
				totalHolder.setText(Integer.toString(Total));
				}
				if(exec.getSource()==bt2)
				{
				int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
				int subtotal = x1*qty;
				OrderList+="\n Prod 02 \t Grizzly Pants \t" +qty + "\t" + x1 + "\t" + subtotal;
				Total+=subtotal;
				cartView.setText(OrderList);
				totalHolder.setText(Integer.toString(Total));
				}
				if(exec.getSource()==bt3)
				{
				int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
				int subtotal = x1*qty;
				OrderList+="\n Prod 03 \t Grizzly Shirt \t" +qty + "\t" + x1 + "\t" + subtotal;
				Total+=subtotal;
				cartView.setText(OrderList);
				totalHolder.setText(Integer.toString(Total));
				}
				if(exec.getSource()==bt4)
				{
				int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
				int subtotal = x1*qty;
				OrderList+="\n Prod 04 \t Grizzly Sliders \t" +qty + "\t" + x1 + "\t" + subtotal;
				Total+=subtotal;
				cartView.setText(OrderList);
				totalHolder.setText(Integer.toString(Total));
				}

			}
			if(exec.getSource()==bt5||exec.getSource()==bt6||exec.getSource()==bt7)
			{
				if(exec.getSource()==bt5)
				{
					int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
					int subtotal=x2*qty;
					OrderList+="\n Prod 05\t Icebear Backpack"+" "+" "+qty+"\t"+x2+"\t"+subtotal;
					Total+=subtotal;
					cartView.setText(OrderList);
					totalHolder.setText(Integer.toString(Total));
				}
				if(exec.getSource()==bt6)
				{
					int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
					int subtotal=x2*qty;
					OrderList+="\n Prod 06\t Icebear Pants \t"+qty+"\t"+x2+"\t"+subtotal;
					Total+=subtotal;
					cartView.setText(OrderList);
					totalHolder.setText(Integer.toString(Total));
				}
				if(exec.getSource()==bt7)
				{
					int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
					int subtotal=x2*qty;
					OrderList+="\n Prod 07\t Icebear Pullover"+" "+" "+qty+"\t"+x2+"\t"+subtotal;
					Total+=subtotal;
					cartView.setText(OrderList);
					totalHolder.setText(Integer.toString(Total));
				}
			}
			if(exec.getSource()==bt8||exec.getSource()==bt9||exec.getSource()==bt10||exec.getSource()==bt11||exec.getSource()==bt12)
			{
				if(exec.getSource()==bt8)
				{
					int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
					int subtotal=y1*qty;
					OrderList+="\n Prod 08\t Icebear Shirt \t"+qty+"\t"+y1+"\t"+subtotal;
					Total+=subtotal;
					cartView.setText(OrderList);
					totalHolder.setText(Integer.toString(Total));
				}
				if(exec.getSource()==bt9)
				{
					int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
					int subtotal=y1*qty;
					OrderList+="\n Prod 09\t Icebear Sliders"+" "+" "+qty+"\t"+y1+"\t"+subtotal;
					Total+=subtotal;
					cartView.setText(OrderList);
					totalHolder.setText(Integer.toString(Total));
				}
				if(exec.getSource()==bt10)
				{
					int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
					int subtotal=y1*qty;
					OrderList+="\n Prod 010\t Panda Backpack"+" "+" "+qty+"\t"+y1+"\t"+subtotal;
					Total+=subtotal;
					cartView.setText(OrderList);
					totalHolder.setText(Integer.toString(Total));
				}
				if(exec.getSource()==bt11)
				{
					int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
					int subtotal=y1*qty;
					OrderList+="\n Prod 011\t Panda Pants \t"+qty+"\t"+y1+"\t"+subtotal;
					Total+=subtotal;
					cartView.setText(OrderList);
					totalHolder.setText(Integer.toString(Total));
				}
				if(exec.getSource()==bt12)
				{
					int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
					int subtotal=y1*qty;
					OrderList+="\n Prod 012\t Panda Pullover"+" "+" "+qty+"\t"+y1+"\t"+subtotal;
					Total+=subtotal;
					cartView.setText(OrderList);
					totalHolder.setText(Integer.toString(Total));
				}
			}
			if(exec.getSource()==bt13||exec.getSource()==bt14||exec.getSource()==bt15)
			{
				if(exec.getSource()==bt13)
				{
					int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
					int subtotal=y2*qty;
					OrderList+="\n Prod 013\t Panda Shirt \t"+qty+"\t"+y2+"\t"+subtotal;
					Total+=subtotal;
					cartView.setText(OrderList);
					totalHolder.setText(Integer.toString(Total));
				}
				if(exec.getSource()==bt14)
				{
					int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
					int subtotal=y2*qty;
					OrderList+="\n Prod 014\t Panda Sliders \t"+qty+"\t"+y2+"\t"+subtotal;
					Total+=subtotal;
					cartView.setText(OrderList);
					totalHolder.setText(Integer.toString(Total));
				}
				if(exec.getSource()==bt15)
				{
					int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
					int subtotal=y2*qty;
					OrderList+="\n Prod 015\t We Bare Bear Backpack "+" "+" "+qty+"\t"+y2+"\t"+subtotal;
					Total+=subtotal;
					cartView.setText(OrderList);
					totalHolder.setText(Integer.toString(Total));
				}
			}
			if(exec.getSource()==bt16||exec.getSource()==bt17||exec.getSource()==bt18)
			{
				if(exec.getSource()==bt16)
				{
					int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
					int subtotal=z1*qty;
					OrderList+="\n Prod 016\t We Bear Bare Sliders "+" "+" "+qty+"\t"+z1+"\t"+subtotal;
					Total+=subtotal;
					cartView.setText(OrderList);
					totalHolder.setText(Integer.toString(Total));
				}
				if(exec.getSource()==bt17)
				{
					int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
					int subtotal=z1*qty;
					OrderList+="\n Prod 017\t We Bare Bear Sneakers "+" "+" "+qty+"\t"+z1+"\t"+subtotal;
					Total+=subtotal;
					cartView.setText(OrderList);
					totalHolder.setText(Integer.toString(Total));
				}
				if(exec.getSource()==bt18)
				{
					int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
					int subtotal=z1*qty;
					OrderList+="\n Prod 018\t We Bare Bear Shirt 1 "+" "+" "+qty+"\t"+z1+"\t"+subtotal;
					Total+=subtotal;
					cartView.setText(OrderList);
					totalHolder.setText(Integer.toString(Total));
				}
			}
			if(exec.getSource()==bt19||exec.getSource()==bt20)
			{
				if(exec.getSource()==bt19)
				{
					int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
					int subtotal=z2*qty;
					OrderList+="\n Prod 019\t We Bear Bare Shirt 2"+" "+" "+qty+"\t"+z2+"\t"+subtotal;
					Total+=subtotal;
					cartView.setText(OrderList);
					totalHolder.setText(Integer.toString(Total));
				}
				if(exec.getSource()==bt20)
				{
					int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
					int subtotal=z2*qty;
					OrderList+="\n Prod 020\t  Bear Bare Shirt 3"+" "+" "+qty+"\t"+z2+"\t"+subtotal;
					Total+=subtotal;
					cartView.setText(OrderList);
					totalHolder.setText(Integer.toString(Total));
				}
			}
			if (exec.getSource()==next)
			{
					OrderList="";
					cartView.setText(OrderList);
					Total=0;
					totalHolder.setText("");
					cash=0;
					cashbox.setText("");
					change=0;
					changebox.setText("");
					JOptionPane.showMessageDialog(null,"Next Customer Please!");
			}
			if (exec.getSource()==process)
			{
				int c = Integer.parseInt(cashbox.getText());
				int t = Integer.parseInt(totalHolder.getText());
				if(c>t)
				{
					int a,b,change;
					a = Integer.parseInt(totalHolder.getText());
					b = Integer.parseInt(cashbox.getText());
					change = b-a;
					changebox.setText(Integer.toString(change));
				}
				if (c<t)
				{
					JOptionPane.showMessageDialog(null,"Insufficent Funds!");
					cashbox.setText("");
				}
			}
	}
	public static void main(String[] args)
	{
		AppaOrder x = new AppaOrder();
	}
}