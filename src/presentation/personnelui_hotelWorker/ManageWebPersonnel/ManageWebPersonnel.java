package presentation.personnelui_hotelWorker.ManageWebPersonnel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

import presentation.personnelui.BackgroundPanel;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class ManageWebPersonnel extends JFrame {

	private JPanel contentPane;
	private JTextField txtid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageWebPersonnel frame = new ManageWebPersonnel();
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
	public ManageWebPersonnel() {
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
		
		
		JLabel webpersonnellabel = new JLabel("��վӪ����Ա��Ϣ");
		webpersonnellabel.setForeground(Color.WHITE);
		webpersonnellabel.setBounds(357, 57, 343, 84);
		webpersonnellabel.setFont(new Font("������ͤ��ϸ�ڼ���",Font.BOLD,30));
		backgroundPanel.add(webpersonnellabel);
		
		JButton btnNewButton_2=new JButton("����");
		btnNewButton_2.setBounds(936, 679, 165, 50);
		backgroundPanel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("�޸�");
		btnNewButton_1.setBounds(513, 679, 165, 50);
		backgroundPanel.add(btnNewButton_1);
		
		
		
		JButton btnNewButton = new JButton("����µľƵ�");
		btnNewButton.setBounds(70, 631, 184, 60);
		backgroundPanel.add(btnNewButton);
		
		JButton button_1 = new JButton("������վӪ����Ա");
		button_1.setBounds(70, 556, 184, 60);
		backgroundPanel.add(button_1);
		
		JButton button = new JButton("����Ƶ깤����Ա");
		button.setBounds(70, 481, 184, 60);
		backgroundPanel.add(button);
		
		JButton button_2 = new JButton("����ͻ���Ϣ");
		button_2.setBounds(70, 406, 184, 60);
		backgroundPanel.add(button_2);
		
		JLabel welcomeLabel = new JLabel("��ӭ�㣡");
		welcomeLabel.setBounds(106, 285, 158, 84);
		welcomeLabel.setFont(new Font("������ͤ��ϸ�ڼ���",Font.BOLD,30));
		backgroundPanel.add(welcomeLabel);
		
		/*JLabel idLabel = new JLabel("���");
		idLabel.setBounds(407, 181, 48, 32);
		backgroundPanel.add(idLabel);
		
		JLabel label = new JLabel("����");
		label.setBounds(533, 181, 48, 32);
		backgroundPanel.add(label);
		
		JLabel label_1 = new JLabel("�Ա�");
		label_1.setBounds(664, 187, 36, 21);
		backgroundPanel.add(label_1);
		
		JLabel label_2 = new JLabel("��ϵ�绰");
		label_2.setBounds(792, 187, 81, 21);
		backgroundPanel.add(label_2);
		
		JLabel label_3 = new JLabel("������");
		label_3.setBounds(949, 187, 81, 21);
		backgroundPanel.add(label_3);
		
		JLabel label_6 = new JLabel("�Ƶ���");
		label_6.setBounds(1102, 181, 87, 32);
		backgroundPanel.add(label_6);
		*/
		
		txtid = new JTextField("id/����/����");
		txtid.setBounds(953, 120, 197, 29);
		backgroundPanel.add(txtid);
		txtid.setColumns(10);
		
		JButton searchButton_3 = new JButton("����");
		searchButton_3.setBounds(1148, 120, 71, 29);
		backgroundPanel.add(searchButton_3);
		
		//PersonnelPO po=new PersonnelPO()
		
		
		final Object[] columnNames = {"���", "����", "�Ա�","��ϵ�绰","�������","�Ƶ���"};   
		Object[][] rowData = {{"151250021", "��Զ־", "��", "1378313210","��ͨ��Ա","1111111"},
				};
		JTable friends = new JTable (rowData, columnNames);  
		friends.setPreferredScrollableViewportSize(new Dimension(600, 100));//���ñ��Ĵ�С  
		friends.setRowHeight (30);//����ÿ�еĸ߶�Ϊ20 
		friends.setRowHeight (0, 20);//���õ�1�еĸ߶�Ϊ15 
		friends.setRowMargin (3);//�����������е�Ԫ��ľ���
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
		JScrollPane scrollPane = new JScrollPane(friends);
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setBounds(350, 156, 873, 508);

 		backgroundPanel.add(scrollPane);
		
		
		
		
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}
}
