package presentation.personnelui.CreditRecharge;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import presentation.personnelui.BackgroundPanel;

import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.DefaultCellEditor; 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;

public class CreditRecharge extends JFrame {

	private JPanel contentPane;
	private JTextField txtid;
	private JScrollPane scrollPane;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreditRecharge frame = new CreditRecharge();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CreditRecharge() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setUndecorated(true);
		setBounds(100, 100, 1280, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image background1=new ImageIcon("background1.jpg").getImage();
		Image background2=new ImageIcon("background2.jpg").getImage();
		JPanel backgroundPanel=new BackgroundPanel(background1);
		backgroundPanel.setBounds(0,0,1280,800);
		contentPane.add(backgroundPanel);
		backgroundPanel.setLayout(null);
		
		
		JPanel panel = new BackgroundPanel(background2);
		panel.setBounds(77, 98, 158, 153);
		backgroundPanel.add(panel);
		
		JButton btnNewButton_2=new JButton("����");
		btnNewButton_2.setBounds(739, 639, 165, 50);
		backgroundPanel.add(btnNewButton_2);
		
		JButton button = new JButton("�鿴����");
		button.setBounds(70, 551, 184, 60);
		backgroundPanel.add(button);
		
		JButton button_2 = new JButton("���ó�ֵ");
		button_2.setBounds(70, 406, 184, 60);
		backgroundPanel.add(button_2);
		
		JLabel welcomeLabel = new JLabel("��ӭ�㣡");
		welcomeLabel.setBounds(106, 285, 158, 84);
		welcomeLabel.setFont(new Font("������ͤ��ϸ�ڼ���",Font.BOLD,30));
		backgroundPanel.add(welcomeLabel);
		
		JLabel label = new JLabel("���ó�ֵ");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 30));
		label.setBounds(422, 29, 343, 84);
		backgroundPanel.add(label);
		
		final Object[] columnNames = {"�ͻ�����", "����ʱ��", "��ֵ����","����"};   
		Object[][] rowData = {{"�˴�", "20161111", "100", ""},
				{"������","20170120","50",""}};  
		JTable friends = new JTable (rowData, columnNames);  
		friends.setPreferredScrollableViewportSize(new Dimension(600, 100));//���ñ��Ĵ�С  
		friends.setRowHeight (30);//����ÿ�еĸ߶�Ϊ20 
		friends.setRowHeight (0, 20);//���õ�1�еĸ߶�Ϊ15 
		friends.setRowMargin (5);//�����������е�Ԫ��ľ���
		friends.setRowSelectionAllowed (true);//���ÿɷ�ѡ��.Ĭ��Ϊfalse 
		friends.setSelectionBackground (Color.white);//������ѡ���еı���ɫ 
		friends.setSelectionForeground (Color.red);//������ѡ���е�ǰ��ɫ 
		friends.setGridColor (Color.black);//���������ߵ���ɫ 
		friends.setShowGrid (false);//�Ƿ���ʾ������  
		friends.setShowHorizontalLines (false);//�Ƿ���ʾˮƽ��������
		friends.setShowVerticalLines (true);//�Ƿ���ʾ��ֱ��������  
		friends.doLayout ();  
		friends.setBackground (Color.lightGray); 
		DefaultTableCellRenderer   r   =   new   DefaultTableCellRenderer();   
		r.setHorizontalAlignment(JLabel.CENTER);   
		friends.setDefaultRenderer(Object.class,   r);
		
		JScrollPane scrollPane_1 = new JScrollPane(friends);
		scrollPane_1.setBounds(422, 152, 790, 472);
		backgroundPanel.add(scrollPane_1);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}
}

