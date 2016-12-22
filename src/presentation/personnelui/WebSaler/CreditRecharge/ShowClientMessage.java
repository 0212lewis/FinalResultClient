package presentation.personnelui.WebSaler.CreditRecharge;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import presentation.personnelui.BackgroundPanel;
import presentation.personnelui.WebManager.AddNewHotel.AddNewHotel;
import presentation.personnelui.WebManager.ManageClient.ManageClient;
import presentation.personnelui.WebManager.ManageHotelPersonnel.ManageHotelPersonnel;
import presentation.personnelui.WebManager.ManageWebPersonnel.ManageWebPersonnel;
import presentation.personnelui.WebSaler.ManageWebStrategy.ManageWebStrategy;
import presentation.personnelui.WebSaler.ViewOrder.ViewOrder;
import presentation.personnelui.controller.CreditRechargeUiController;
import presentation.personnelui.controller.ManageHotelPersonnelUiController;
import presentation.personnelui.controller.ManageWebStrategyUiController;
import runner.WebManagerRunner;
import runner.WebSalerRunner;
import vo.ClientVO;
import vo.PersonnelVO;
import vo.StrategyVO;

import java.awt.Image;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class ShowClientMessage extends JFrame {

	private JPanel contentPane;
	private CreditRechargeUiController controller;
	private JTextField textField;
	protected AbstractButton textField_5;
	private static ClientVO vo;

	/**
	 * Launch the application.
	 */
	/**
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowClientMessage frame = new ShowClientMessage(vo);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}**/

	/**
	 * Create the frame.
	 */
	public ShowClientMessage(ClientVO vo) {
		this.vo=vo;
		new WebManagerRunner();
		this.controller=new CreditRechargeUiController();
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
		backgroundPanel.setBounds(0,-11,1280,800);
		contentPane.add(backgroundPanel);
		backgroundPanel.setLayout(null);
		
		
		JPanel panel = new BackgroundPanel(background2);
		panel.setBounds(77, 98, 158, 153);
		backgroundPanel.add(panel);
		
		
		JLabel hotelpersonnellabel = new JLabel("查看客户信息");
		hotelpersonnellabel.setForeground(Color.WHITE);
		hotelpersonnellabel.setBounds(625, 24, 343, 84);
		hotelpersonnellabel.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,30));
		backgroundPanel.add(hotelpersonnellabel);
		
		JButton btnNewButton_2=new JButton(new ImageIcon("web_return.jpg"));
		btnNewButton_2.setBounds(634, 683, 165, 50);
		backgroundPanel.add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				CreditRecharge frame=new CreditRecharge();
				frame.setVisible(true);
				ShowClientMessage.this.dispose();
			}
		});
		
		
		JButton button = new JButton(new ImageIcon("web_checkOrder.jpg"));
		button.setBounds(70, 575, 184, 60);
		backgroundPanel.add(button);
		button.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				ShowClientMessage.this.dispose();
				ViewOrder frame=new ViewOrder();
				frame.setVisible(true);
			}
		});
		
		JButton button_2 = new JButton(new ImageIcon("web_creditRecharge.jpg"));
		button_2.setBounds(70, 384, 184, 60);
		backgroundPanel.add(button_2);
		button_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ShowClientMessage.this.dispose();
				CreditRecharge frame=new CreditRecharge();
				frame.setVisible(true);
			}
		});
		
		JButton button_3 = new JButton(new ImageIcon("web_manageWebStrategy.jpg"));
		button_3.setBounds(70, 476, 184, 60);
		backgroundPanel.add(button_3);
		button_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ShowClientMessage.this.dispose();
				ManageWebStrategy frame=new ManageWebStrategy();
				frame.setVisible(true);
			}
		});
		
		JLabel welcomeLabel = new JLabel("欢迎你！");
		welcomeLabel.setBounds(106, 285, 158, 84);
		welcomeLabel.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,30));
		backgroundPanel.add(welcomeLabel);
		
		JLabel label = new JLabel("客户编号：");
		label.setBounds(425, 147, 147, 50);
		label.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label);
		
		JLabel label_6 = new JLabel(vo.getId());
		label_6.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_6.setBounds(546, 147, 264, 50);
		backgroundPanel.add(label_6);
		
		
		JLabel label_1 = new JLabel("客户姓名：");
		label_1.setBounds(836, 147, 131, 50);
		label_1.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label_1);
		
		JLabel label_11 = new JLabel(vo.getName());
		label_11.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_11.setBounds(953, 147, 295, 50);
		backgroundPanel.add(label_11);
	
		
		JLabel label_2 = new JLabel("性别：");
		label_2.setBounds(836, 225, 158, 50);
		label_2.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label_2);
		
		
		JLabel label_12 = new JLabel(vo.getSex());
		label_12.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_12.setBounds(954, 225, 277, 50);
		backgroundPanel.add(label_12);
		
		JLabel label_4 = new JLabel("身份证号：");
		label_4.setBounds(425, 231, 131, 50);
		label_4.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label_4);
		
		JLabel label_9 = new JLabel(vo.getIdentityID());
		label_9.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_9.setBounds(546, 231, 264, 50);
		backgroundPanel.add(label_9);
		
		JLabel label_5 = new JLabel("联系方式：");
		label_5.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_5.setBounds(836, 317, 131, 50);
		backgroundPanel.add(label_5);
		
		JLabel label_7 = new JLabel(vo.getPhoneNumber());
		label_7.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_7.setBounds(953, 319, 251, 50);
		backgroundPanel.add(label_7);
		
		
		JLabel label_8 = new JLabel("信用点：");
		label_8.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_8.setBounds(425, 317, 131, 50);
		backgroundPanel.add(label_8);
		

		JLabel label_10 = new JLabel(String.valueOf(vo.getCredit_point()));
		label_10.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_10.setBounds(546, 317, 264, 50);
		backgroundPanel.add(label_10);
		
		JLabel label_14 = new JLabel("会员类型：");
		label_14.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_14.setBounds(425, 407, 147, 50);
		backgroundPanel.add(label_14);
		
		JLabel label_23 = new JLabel(vo.getClientType());
		label_23.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_23.setBounds(546, 407, 275, 50);
		backgroundPanel.add(label_23);
		
		JLabel label_15 = new JLabel("生日：");
		label_15.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_15.setBounds(836, 407, 105, 50);
		backgroundPanel.add(label_15);
		
		JLabel label_24 = new JLabel(vo.getBirthday());
		label_24.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_24.setBounds(953, 407, 147, 50);
		backgroundPanel.add(label_24);
		
		JLabel label_16 = new JLabel("会员等级：");
		label_16.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_16.setBounds(425, 486, 105, 50);
		backgroundPanel.add(label_16);
		
		JLabel label_25 = new JLabel(String.valueOf(vo.getVipGrade()));
		label_25.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_25.setBounds(546, 486, 165, 50);
		backgroundPanel.add(label_25);
		
		JLabel label_18 = new JLabel("公司地址：");
		label_18.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_18.setBounds(425, 575, 189, 50);
		backgroundPanel.add(label_18);
	
		
		JLabel label_17 = new JLabel(vo.getCompanyAddress());
		label_17.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_17.setBounds(546, 575, 619, 50);
		backgroundPanel.add(label_17);
		
		JLabel label_19 = new JLabel("酒店id：");
		label_19.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_19.setBounds(836, 486, 114, 50);
		backgroundPanel.add(label_19);
		
		JLabel label_28 = new JLabel(vo.getHotelIDS());
		label_28.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_28.setBounds(953, 486, 131, 50);
		backgroundPanel.add(label_28);
		
	
			}
		
	}

