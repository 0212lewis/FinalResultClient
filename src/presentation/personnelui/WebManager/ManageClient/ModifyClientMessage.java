package presentation.personnelui.WebManager.ManageClient;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import presentation.personnelui.BackgroundPanel;
import presentation.personnelui.WebManager.AddNewHotel.AddNewHotel;
import presentation.personnelui.WebManager.ManageClient.ManageClient;
import presentation.personnelui.WebManager.ManageHotelPersonnel.ManageHotelPersonnel;
import presentation.personnelui.WebManager.ManageWebPersonnel.ManageWebPersonnel;
import presentation.personnelui.WebManagerMainUi.MainUi;
import presentation.personnelui.controller.AddNewHotelUiController;
import presentation.personnelui.controller.ManageClientUiController;
import presentation.personnelui.controller.ManageHotelPersonnelUiController;
import runner.WebManagerRunner;
import vo.ClientVO;
import vo.HotelVO;
import vo.PersonnelVO;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class ModifyClientMessage extends JFrame {

	private JPanel contentPane;
	private ManageClientUiController controller;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private static ClientVO vo;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	/**
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyClientMessage frame = new ModifyClientMessage(vo);
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
	public ModifyClientMessage(ClientVO vo) {
		this.vo=vo;
		new WebManagerRunner();
		this.controller=new ManageClientUiController();
		this.setUndecorated(true);
		
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
		
		
		JLabel hotelpersonnellabel = new JLabel("�޸Ŀͻ���Ϣ");
		hotelpersonnellabel.setForeground(Color.WHITE);
		hotelpersonnellabel.setBounds(680, 15, 343, 84);
		hotelpersonnellabel.setFont(new Font("������ͤ��ϸ�ڼ���",Font.BOLD,30));
		backgroundPanel.add(hotelpersonnellabel);
		
		JButton btnNewButton_2=new JButton(new ImageIcon("web_return.jpg"));
		btnNewButton_2.setBounds(936, 679, 165, 50);
		backgroundPanel.add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ModifyClientMessage.this.dispose();
				ManageClient frame=new ManageClient();
				frame.setVisible(true);
			}
		});
		
		JButton btnNewButton_1 = new JButton(new ImageIcon("web_save.jpg"));
		btnNewButton_1.setBounds(513, 679, 165, 50);
		backgroundPanel.add(btnNewButton_1);
		
		
		
		JButton btnNewButton = new JButton(new ImageIcon("web_addNewHotel.jpg"));
		btnNewButton.setBounds(70, 631, 184, 60);
		backgroundPanel.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ModifyClientMessage.this.dispose();
				AddNewHotel frame=new AddNewHotel();	
				frame.setVisible(true);
			}
		});
		
		JButton button_1 = new JButton(new ImageIcon("web_manageWebPersonnel.jpg"));
		button_1.setBounds(70, 556, 184, 60);
		backgroundPanel.add(button_1);
		
		button_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ModifyClientMessage.this.dispose();
				ManageWebPersonnel frame=new ManageWebPersonnel();	
				frame.setVisible(true);
			}
		});
		
		JButton button = new JButton(new ImageIcon("web_manageHotelPersonnel.jpg"));
		button.setBounds(70, 481, 184, 60);
		backgroundPanel.add(button);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ModifyClientMessage.this.dispose();
				ManageHotelPersonnel frame=new ManageHotelPersonnel();	
				frame.setVisible(true);
			}
		});
		
		JButton button_2 = new JButton(new ImageIcon("web_manageClient.jpg"));
		button_2.setBounds(70, 406, 184, 60);
		backgroundPanel.add(button_2);
		
		button_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ModifyClientMessage.this.dispose();
				ManageClient frame=new ManageClient();
				frame.setVisible(true);
			}
		});
		
		JLabel welcomeLabel = new JLabel("��ӭ�㣡");
		welcomeLabel.setBounds(106, 285, 158, 84);
		welcomeLabel.setFont(new Font("������ͤ��ϸ�ڼ���",Font.BOLD,30));
		backgroundPanel.add(welcomeLabel);
		
		JLabel label = new JLabel("�ͻ���ţ�");
		label.setBounds(415, 111, 263, 50);
		label.setFont(new Font("������ͤ��ϸ�ڼ���",Font.BOLD,20));
		backgroundPanel.add(label);
		
		JLabel label_1 = new JLabel("�ͻ�������");
		label_1.setBounds(415, 201, 131, 50);
		label_1.setFont(new Font("������ͤ��ϸ�ڼ���",Font.BOLD,20));
		backgroundPanel.add(label_1);
	
		
		JLabel label_2 = new JLabel("�Ա�");
		label_2.setBounds(415, 299, 158, 50);
		label_2.setFont(new Font("������ͤ��ϸ�ڼ���",Font.BOLD,20));
		backgroundPanel.add(label_2);
		
		JLabel label_3 = new JLabel("���֤�ţ�");
		label_3.setBounds(415, 407, 158, 21);
		label_3.setFont(new Font("������ͤ��ϸ�ڼ���",Font.BOLD,20));
		backgroundPanel.add(label_3);
		
		JLabel label_4 = new JLabel("����ֵ��");
		label_4.setBounds(415, 486, 131, 50);
		label_4.setFont(new Font("������ͤ��ϸ�ڼ���",Font.BOLD,20));
		backgroundPanel.add(label_4);
		
		textField_1 = new JTextField(vo.getName());
		textField_1.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		textField_1.setOpaque(false);
		textField_1.setBorder(new LineBorder(Color.gray));
		textField_1.setColumns(10);
		textField_1.setBounds(578, 213, 200, 27);
		backgroundPanel.add(textField_1);
		
		textField_2 = new JTextField(vo.getSex());
		textField_2.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		textField_2.setOpaque(false);
		textField_2.setBorder(new LineBorder(Color.gray));
		textField_2.setColumns(10);
		textField_2.setBounds(578, 311, 200, 27);
		backgroundPanel.add(textField_2);
		
		textField_3 = new JTextField(vo.getIdentityID());
		textField_3.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		textField_3.setOpaque(false);
		textField_3.setBorder(new LineBorder(Color.gray));
		textField_3.setColumns(10);
		textField_3.setBounds(578, 404, 200, 27);
		backgroundPanel.add(textField_3);
		
		JLabel label_5 = new JLabel("��ϵ�绰��");
		label_5.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		label_5.setBounds(415, 566, 131, 50);
		backgroundPanel.add(label_5);
		
		textField_5 = new JTextField(vo.getPhoneNumber());
		textField_5.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		textField_5.setOpaque(false);
		textField_5.setBorder(new LineBorder(Color.gray));
		textField_5.setColumns(10);
		textField_5.setBounds(578, 578, 200, 27);
		backgroundPanel.add(textField_5);
		
		JLabel label_6 = new JLabel("��Ա���ͣ�");
		label_6.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		label_6.setBounds(838, 111, 263, 50);
		backgroundPanel.add(label_6);
		
		textField_6 = new JTextField(vo.getClientType());
		textField_6.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		textField_6.setOpaque(false);
		textField_6.setBorder(new LineBorder(Color.gray));
		textField_6.setColumns(10);
		textField_6.setBounds(978, 123, 200, 27);
		backgroundPanel.add(textField_6);
		
		JLabel label_7 = new JLabel("���գ�");
		label_7.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		label_7.setBounds(838, 201, 263, 50);
		backgroundPanel.add(label_7);
		
		textField_7 = new JTextField(vo.getBirthday());
		textField_7.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		textField_7.setOpaque(false);
		textField_7.setBorder(new LineBorder(Color.gray));
		textField_7.setColumns(10);
		textField_7.setBounds(978, 213, 200, 27);
		backgroundPanel.add(textField_7);
		
		JLabel label_8 = new JLabel("��Ա�ȼ���");
		label_8.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		label_8.setBounds(838, 299, 263, 50);
		backgroundPanel.add(label_8);
		
		//System.out.println(vo.getVipGrade());
		textField_8 = new JTextField(String.valueOf(vo.getVipGrade()));
		//System.out.println(vo.getVipGrade());
		textField_8.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		textField_8.setOpaque(false);
		textField_8.setBorder(new LineBorder(Color.gray));
		textField_8.setColumns(10);
		textField_8.setBounds(978, 311, 200, 27);
		backgroundPanel.add(textField_8);
		
		JLabel label_9 = new JLabel("��ҵ��ַ��");
		label_9.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		label_9.setBounds(838, 390, 138, 50);
		backgroundPanel.add(label_9);
		
		textField_9 = new JTextField(vo.getCompanyAddress());
		textField_9.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		textField_9.setOpaque(false);
		textField_9.setBorder(new LineBorder(Color.gray));
		textField_9.setColumns(10);
		textField_9.setBounds(978, 402, 200, 27);
		backgroundPanel.add(textField_9);
		
		JLabel label_10 = new JLabel("�Ƶ�id��");
		label_10.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		label_10.setBounds(838, 486, 138, 50);
		backgroundPanel.add(label_10);
		
		textField_10 = new JTextField(vo.getHotelIDS());
		textField_10.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		textField_10.setOpaque(false);
		textField_10.setBorder(new LineBorder(Color.gray));
		textField_10.setColumns(10);
		textField_10.setBounds(978, 498, 200, 27);
		backgroundPanel.add(textField_10);
		
		JLabel label_11 = new JLabel(vo.getId());
		label_11.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		label_11.setBounds(578, 111, 263, 50);
		backgroundPanel.add(label_11);
		
		JLabel label_12 = new JLabel(String.valueOf(vo.getCredit_point()));
		label_12.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		label_12.setBounds(578, 481, 184, 50);
		backgroundPanel.add(label_12);
		
		
		btnNewButton_1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				String clientid=label_11.getText().toString();
			    String name=textField_1.getText().toString();
			    String sex=textField_2.getText().toString();
			    String identityid=textField_3.getText().toString();
			    double credit=Double.valueOf(label_12.getText().toString());
			    String phoneNumber=textField_5.getText().toString();
			    String type=textField_6.getText().toString();
			    String birthday=textField_7.getText().toString();
			    int vipgrade=Integer.valueOf(textField_8.getText());
			    String companyaddress=textField_9.getText().toString();
			    String hotelid=textField_10.getText().toString();
			    
			    ClientVO newvo=new ClientVO(clientid,name,sex,identityid,phoneNumber,credit,type,birthday,vipgrade,companyaddress,hotelid);
			    
			    boolean q=controller.changeClientMessage(newvo);
			    
			    if(q==true){
			    	JOptionPane.showMessageDialog(backgroundPanel, "�޸ĳɹ���","�޸Ľ��",JOptionPane.INFORMATION_MESSAGE);
			    }else{
			    	JOptionPane.showMessageDialog(backgroundPanel, "ʧ��","�޸Ľ��",JOptionPane.INFORMATION_MESSAGE);
			    }
			}
		});
	}
}