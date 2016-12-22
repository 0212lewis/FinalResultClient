package presentation.personnelui.WebManager.ManageWebPersonnel;

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
import presentation.personnelui.controller.ManageWebPersonnelUiController;
import runner.WebManagerRunner;
import vo.PersonnelVO;

import java.awt.Image;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ModifyWebSalerMessage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ManageWebPersonnelUiController controller;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private static PersonnelVO vo;
	protected AbstractButton textField;
	protected AbstractButton textField_5;

	/**
	 * Launch the application.
	 */
	/**
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyWebSalerMessage frame = new ModifyWebSalerMessage(vo);
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
	public ModifyWebSalerMessage(PersonnelVO vo) {
		ModifyWebSalerMessage.vo=vo;
		new WebManagerRunner();
		this.controller=new ManageWebPersonnelUiController();
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
		
		
		JLabel webpersonnellabel = new JLabel("修改网站营销人员信息");
		webpersonnellabel.setForeground(Color.WHITE);
		webpersonnellabel.setBounds(625, 15, 343, 84);
		webpersonnellabel.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,30));
		backgroundPanel.add(webpersonnellabel);
		
		JButton btnNewButton_2=new JButton(new ImageIcon("web_return.jpg"));
		btnNewButton_2.setBounds(936, 679, 165, 50);
		backgroundPanel.add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ManageWebPersonnel frame=new ManageWebPersonnel();
				frame.setVisible(true);
				ModifyWebSalerMessage.this.dispose();
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
				ModifyWebSalerMessage.this.dispose();
				AddNewHotel frame=new AddNewHotel();	
				frame.setVisible(true);
			}
		});
		
		JButton button_1 = new JButton(new ImageIcon("web_manageWebPersonnel.jpg"));
		button_1.setBounds(70, 556, 184, 60);
		backgroundPanel.add(button_1);
		
		button_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ModifyWebSalerMessage.this.dispose();
				ManageWebPersonnel frame=new ManageWebPersonnel();	
				frame.setVisible(true);
			}
		});
		
		JButton button = new JButton(new ImageIcon("web_manageHotelPersonnel.jpg"));
		button.setBounds(70, 481, 184, 60);
		backgroundPanel.add(button);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ModifyWebSalerMessage.this.dispose();
				ManageHotelPersonnel frame=new ManageHotelPersonnel();	
				frame.setVisible(true);
			}
		});
		
		JButton button_2 = new JButton(new ImageIcon("web_manageClient.jpg"));
		button_2.setBounds(70, 406, 184, 60);
		backgroundPanel.add(button_2);
		
		button_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ModifyWebSalerMessage.this.dispose();
				ManageClient frame=new ManageClient();
				frame.setVisible(true);
			}
		});
		
		JLabel welcomeLabel = new JLabel("欢迎你！");
		welcomeLabel.setBounds(106, 285, 158, 84);
		welcomeLabel.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,30));
		backgroundPanel.add(welcomeLabel);
		
		JLabel label = new JLabel("工作人员编号：");
		label.setBounds(534, 171, 158, 50);
		label.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label);
	
		
		JLabel label_2 = new JLabel("工作人员姓名：");
		label_2.setBounds(534, 265, 158, 50);
		label_2.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label_2);
		
		JLabel label_3 = new JLabel("联系方式：");
		label_3.setBounds(534, 373, 158, 21);
		label_3.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label_3);
		
		JLabel label_4 = new JLabel("性别：");
		label_4.setBounds(534, 452, 131, 50);
		label_4.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label_4);
		
		textField_2 = new JTextField(vo.getname());
		textField_2.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		textField_2.setOpaque(false);
		textField_2.setBorder(new LineBorder(Color.gray));
		textField_2.setColumns(10);
		textField_2.setBounds(785, 281, 200, 27);
		backgroundPanel.add(textField_2);
		
		textField_3 = new JTextField(vo.getphoneNumber());
		textField_3.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		textField_3.setOpaque(false);
		textField_3.setBorder(new LineBorder(Color.gray));
		textField_3.setColumns(10);
		textField_3.setBounds(785, 370, 200, 27);
		backgroundPanel.add(textField_3);
		
		textField_4 = new JTextField(vo.getsex());
		textField_4.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		textField_4.setOpaque(false);
		textField_4.setBorder(new LineBorder(Color.gray));
		textField_4.setColumns(10);
		textField_4.setBounds(785, 464, 200, 27);
		backgroundPanel.add(textField_4);
		
		JLabel label_5 = new JLabel("身份类型：");
		label_5.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_5.setBounds(534, 532, 131, 50);
		backgroundPanel.add(label_5);
		
		JLabel label_6 = new JLabel(vo.getpersonnelID());
		label_6.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_6.setBounds(785, 171, 158, 50);
		backgroundPanel.add(label_6);
		
		JLabel label_7 = new JLabel(vo.getType());
		label_7.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 20));
		label_7.setBounds(785, 532, 158, 50);
		backgroundPanel.add(label_7);
		
		
		btnNewButton_1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				String personnelId=label_6.getText().toString();
			    
			    String name=textField_2.getText().toString();
			    String phoneNumber=textField_3.getText().toString();
			    String sex=textField_4.getText().toString();
			    String type=label_7.getText().toString();
			    
			    PersonnelVO newvo=new PersonnelVO(personnelId,type,name,sex,phoneNumber,"");
			    
			    boolean q=controller.modifyPersonnel(newvo);
			    
			    if(q==true){
			    	JOptionPane.showMessageDialog(backgroundPanel, "修改成功！","修改结果",JOptionPane.INFORMATION_MESSAGE);
			    }else{
			    	JOptionPane.showMessageDialog(backgroundPanel, "失败","修改结果",JOptionPane.INFORMATION_MESSAGE);
			    }
			}
		});
	}
}
