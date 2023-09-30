import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Starbuckss {

	private JFrame frame;
	private JTextField tf5;
	private JTextField tf4;
	private JTextField tf3;
	private JTextField tf2;
	private JTextField tf1;
	JCheckBox cb1;
	JCheckBox cb2;
	JCheckBox cb3;
	JCheckBox cb4;
	JCheckBox cb5;
	private JTable t;
	private JScrollPane scrollPane;
	private JTextField tf6;
	int i;
	int sum;
	JButton b2;
	JButton b3;
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Starbuckss window = new Starbuckss();
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
	public Starbuckss() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(45, 147, 114));
		frame.getContentPane().setForeground(new Color(64, 128, 128));
		frame.setBounds(100, 100, 1201, 677);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ADITYA SANTOSH MALI\\Downloads\\name.png"));
		lblNewLabel.setBounds(0, 0, 650, 145);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Add- Kunal Plaza,");
		lblNewLabel_1.setForeground(new Color(152, 251, 152));
		lblNewLabel_1.setBackground(new Color(128, 128, 128));
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.ITALIC, 18));
		lblNewLabel_1.setBounds(698, 10, 168, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Near Pratiba college");
		lblNewLabel_1_1.setForeground(new Color(152, 251, 152));
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT", Font.ITALIC, 18));
		lblNewLabel_1_1.setBounds(698, 40, 168, 29);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ph No.-020-837465876");
		lblNewLabel_1_1_1.setForeground(new Color(152, 251, 152));
		lblNewLabel_1_1_1.setFont(new Font("Tw Cen MT", Font.ITALIC, 18));
		lblNewLabel_1_1_1.setBounds(698, 68, 198, 29);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("MENU");
		lblNewLabel_2.setForeground(new Color(62, 55, 72));
		lblNewLabel_2.setFont(new Font("Wide Latin", Font.ITALIC, 25));
		lblNewLabel_2.setBounds(76, 192, 198, 38);
		frame.getContentPane().add(lblNewLabel_2);
		
		 cb2 = new JCheckBox("Caffé Americano");
		cb2.setBackground(new Color(64, 128, 128));
		cb2.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		cb2.setBounds(53, 302, 207, 29);
		frame.getContentPane().add(cb2);
		
		 cb1 = new JCheckBox("Café au Lait");
		cb1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		cb1.setBackground(new Color(64, 128, 128));
		cb1.setBounds(53, 251, 207, 29);
		frame.getContentPane().add(cb1);
		
		 cb4 = new JCheckBox("Cappuccino");
		cb4.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		cb4.setBackground(new Color(64, 128, 128));
		cb4.setBounds(53, 410, 207, 29);
		frame.getContentPane().add(cb4);
		
		cb3 = new JCheckBox("Caffé Mocha");
		cb3.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		cb3.setBackground(new Color(64, 128, 128));
		cb3.setBounds(53, 355, 207, 29);
		frame.getContentPane().add(cb3);
		
		cb5 = new JCheckBox("Golden Turmeric Latte");
		cb5.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		cb5.setBackground(new Color(64, 128, 128));
		cb5.setBounds(53, 467, 207, 29);
		frame.getContentPane().add(cb5);
		
		JLabel lblNewLabel_2_1 = new JLabel("QUANTITY");
		lblNewLabel_2_1.setForeground(new Color(62, 55, 72));
		lblNewLabel_2_1.setFont(new Font("Wide Latin", Font.ITALIC, 25));
		lblNewLabel_2_1.setBounds(326, 192, 261, 38);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		tf5 = new JTextField();
		tf5.setBounds(338, 469, 239, 29);
		frame.getContentPane().add(tf5);
		tf5.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setColumns(10);
		tf4.setBounds(338, 412, 239, 29);
		frame.getContentPane().add(tf4);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(338, 355, 239, 29);
		frame.getContentPane().add(tf3);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(338, 302, 239, 29);
		frame.getContentPane().add(tf2);
		
		tf1 = new JTextField();
		tf1.setColumns(10);
		tf1.setBounds(338, 251, 239, 29);
		frame.getContentPane().add(tf1);
		
		
		
		
		
		JButton b1 = new JButton("BUY");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cb1.isSelected())
				{
					String CA="Café au Lait";
					int QUANTITY=Integer.parseInt(tf1.getText());
					int PRICE =100;
					int TOTAL =QUANTITY*PRICE;
					
					String QUANTITY1= Integer.toString(QUANTITY);
					String PRICE1= Integer.toString(PRICE);
					String TOTAL1= Integer.toString(TOTAL);
					
		DefaultTableModel model=(DefaultTableModel)t.getModel();
		model.addRow(new Object[]
				{
				 CA,
				 QUANTITY1,
				 PRICE1,
				 TOTAL1, 
				});
				}
				if(cb2.isSelected())
				{
					String CA="Caffe Americano";
					int QUANTITY=Integer.parseInt(tf2.getText());
					int PRICE =200;
					int TOTAL =QUANTITY*PRICE;
					
					String QUANTITY1= Integer.toString(QUANTITY);
					String PRICE1= Integer.toString(PRICE);
					String TOTAL1= Integer.toString(TOTAL);
					
		DefaultTableModel model=(DefaultTableModel)t.getModel();
		model.addRow(new Object[]
				{
				 CA,
				 QUANTITY1,
				 PRICE1,
				 TOTAL1, 
				});
				}
				if(cb3.isSelected())
				{
					String CA="Caffé Mocha";
					int QUANTITY=Integer.parseInt(tf3.getText());
					int PRICE =300;
					int TOTAL =QUANTITY*PRICE;
					
					String QUANTITY1= Integer.toString(QUANTITY);
					String PRICE1= Integer.toString(PRICE);
					String TOTAL1= Integer.toString(TOTAL);
					
		DefaultTableModel model=(DefaultTableModel)t.getModel();
		model.addRow(new Object[]
				{
				 CA,
				 QUANTITY1,
				 PRICE1,
				 TOTAL1, 
				});
				}
				if(cb4.isSelected())
				{
					String CA="Cappuccino";
					int QUANTITY=Integer.parseInt(tf4.getText());
					int PRICE =400;
					int TOTAL =QUANTITY*PRICE;
					
					String QUANTITY1= Integer.toString(QUANTITY);
					String PRICE1= Integer.toString(PRICE);
					String TOTAL1= Integer.toString(TOTAL);
					
		DefaultTableModel model=(DefaultTableModel)t.getModel();
		model.addRow(new Object[]
				{
				 CA,
				 QUANTITY1,
				 PRICE1,
				 TOTAL1, 
				});
				}
				if(cb5.isSelected())
				{
					String CA="Golden Turmeric Latte";
					int QUANTITY=Integer.parseInt(tf5.getText());
					int PRICE =500;
					int TOTAL =QUANTITY*PRICE;
					
					String QUANTITY1= Integer.toString(QUANTITY);
					String PRICE1= Integer.toString(PRICE);
					String TOTAL1= Integer.toString(TOTAL);
					
		DefaultTableModel model=(DefaultTableModel)t.getModel();
		model.addRow(new Object[]
				{
				 CA,
				 QUANTITY1,
				 PRICE1,
				 TOTAL1, 
				});
				}
				}
				});
		
		
		b1.setForeground(new Color(64, 0, 0));
		b1.setBackground(new Color(128, 255, 0));
		b1.setFont(new Font("Teko SemiBold", Font.BOLD, 24));
		b1.setBounds(53, 549, 134, 38);
		frame.getContentPane().add(b1);
		
		b2 = new JButton("TOTAL");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				DefaultTableModel model=(DefaultTableModel)t.getModel();
				for( i=0;i<t.getRowCount();i++)
				{
					
					 sum = sum+Integer.parseInt(t.getValueAt(i, 3).toString());
					tf6.setText(Integer.toString(sum));
					//sum=0;
				}
				sum=0;

			}
		});
		b2.setForeground(new Color(64, 0, 0));
		b2.setFont(new Font("Teko SemiBold", Font.BOLD, 24));
		b2.setBackground(new Color(128, 255, 0));
		b2.setBounds(698, 549, 134, 38);
		frame.getContentPane().add(b2);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(698, 207, 442, 289);
		frame.getContentPane().add(scrollPane);
		
		t = new JTable();
		scrollPane.setViewportView(t);
		t.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NAME", "QUANTITY", "PRICE", "TOTAL"
			}
		));
		
		tf6 = new JTextField();
		tf6.setColumns(10);
		tf6.setBounds(919, 552, 148, 38);
		frame.getContentPane().add(tf6);
		
		JButton b3 = new JButton("CLEAR");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b3)
				{
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
					tf4.setText("");
					tf5.setText("");
					tf6.setText("");
					DefaultTableModel model = (DefaultTableModel) t.getModel();
					model.setRowCount(0);
				}
				
			}
		});
		b3.setForeground(new Color(64, 0, 0));
		b3.setFont(new Font("Teko SemiBold", Font.BOLD, 24));
		b3.setBackground(new Color(128, 255, 0));
		b3.setBounds(387, 549, 134, 38);
		frame.getContentPane().add(b3);
	}
}
