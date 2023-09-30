import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.event.ActionEvent;

public class Gasdelivery {
	int sgas=0,mgas=0,bgas=0;
	int Total=0;

	private JFrame frame;
	private JTextField t3;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gasdelivery window = new Gasdelivery();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gasdelivery() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(128, 128, 192));
		frame.setBounds(100, 100, 691, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("Choose Gas Type:");
		l1.setForeground(new Color(135, 206, 235));
		l1.setBounds(38, 5, 136, 30);
		l1.setFont(new Font("Agency FB", Font.BOLD, 25));
		frame.getContentPane().add(l1);
		
		JRadioButton rb1 = new JRadioButton("1] Small Gas");
		rb1.setForeground(new Color(189, 183, 107));
		rb1.setBounds(6, 57, 113, 27);
		rb1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("2] Medium");
		rb2.setForeground(new Color(143, 188, 143));
		rb2.setBounds(6, 101, 101, 27);
		rb2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		frame.getContentPane().add(rb2);
		
		JRadioButton rb3 = new JRadioButton("3] Big ");
		rb3.setForeground(new Color(222, 184, 135));
		rb3.setBounds(6, 142, 71, 27);
		rb3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		frame.getContentPane().add(rb3);
		
		JLabel l2 = new JLabel("Quantity");
		l2.setForeground(new Color(135, 206, 235));
		l2.setFont(new Font("Agency FB", Font.BOLD, 25));
		l2.setBounds(195, 5, 71, 30);
		frame.getContentPane().add(l2);
		
		t3 = new JTextField();
		t3.setBounds(185, 148, 96, 19);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		t1 = new JTextField();
		t1.setForeground(new Color(0, 0, 0));
		t1.setColumns(10);
		t1.setBounds(185, 63, 96, 19);
		frame.getContentPane().add(t1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(185, 107, 96, 19);
		frame.getContentPane().add(t2);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(322, 5, 333, 221);
		frame.getContentPane().add(ta1);
		
		JButton b1 = new JButton("Submit");
		b1.setForeground(new Color(112, 128, 144));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{		
				String msg="";
				if(rb1.isSelected())
				{
				   sgas=Integer.parseInt(t1.getText());
				   msg=msg+"\nYou Select Small gas";
				   Total=Total+sgas*500;
				}
				if(rb2.isSelected())
				{
				   mgas=Integer.parseInt(t2.getText());
				   msg=msg+"\nYou Select medium gas";
				   Total=Total+mgas*1000;
				}
				if(rb3.isSelected())
				{
				
				   bgas=Integer.parseInt(t3.getText());
				   msg=msg+"\nYou Select Big gas";
				   Total=Total+bgas*1500;
				}
				   ta1.setText("\nmsg:"+msg+"\nTotal Cost:"+Total);
			}
		});
		b1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		b1.setBounds(6, 205, 85, 21);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("Print");
		b2.setForeground(new Color(112, 128, 144));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try {
					ta1.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		b2.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		b2.setBounds(111, 205, 85, 21);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("Clear");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				t1.setText("");
				t2.setText("");
				t3.setText("");
			}
		});
		b3.setForeground(new Color(112, 128, 144));
		b3.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		b3.setBounds(223, 205, 85, 21);
		frame.getContentPane().add(b3);
	}
}
