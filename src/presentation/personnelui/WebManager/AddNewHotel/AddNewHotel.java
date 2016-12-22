package presentation.personnelui.WebManager.AddNewHotel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import presentation.personnelui.BackgroundPanel;
import presentation.personnelui.WebManager.ManageClient.ManageClient;
import presentation.personnelui.WebManager.ManageHotelPersonnel.ManageHotelPersonnel;
import presentation.personnelui.WebManager.ManageWebPersonnel.ManageWebPersonnel;
import presentation.personnelui.WebManagerMainUi.MainUi;
import presentation.personnelui.controller.AddNewHotelUiController;
import runner.WebManagerRunner;
import vo.HotelVO;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class AddNewHotel extends JFrame {

	private JPanel contentPane;
	private AddNewHotelUiController controller;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_2;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	/**
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewHotel frame = new AddNewHotel();
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
	public AddNewHotel() {
		new WebManagerRunner();
		this.controller=new AddNewHotelUiController();
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
		
		
		JLabel hotelpersonnellabel = new JLabel("添加新的酒店");
		hotelpersonnellabel.setForeground(Color.WHITE);
		hotelpersonnellabel.setBounds(680, 15, 343, 84);
		hotelpersonnellabel.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,30));
		backgroundPanel.add(hotelpersonnellabel);
		
		JButton btnNewButton_2=new JButton(new ImageIcon("web_return.jpg"));
		btnNewButton_2.setBounds(936, 666, 165, 50);
		backgroundPanel.add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				AddNewHotel.this.dispose();
				MainUi frame=new MainUi();
				frame.setVisible(true);
			}
		});
		
		JButton btnNewButton_1 = new JButton(new ImageIcon("web_add.jpg"));
		btnNewButton_1.setBounds(512, 666, 165, 50);
		backgroundPanel.add(btnNewButton_1);
		
		
		
		JButton btnNewButton = new JButton(new ImageIcon("web_addNewHotel.jpg"));
		btnNewButton.setBounds(70, 631, 184, 60);
		backgroundPanel.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				AddNewHotel.this.dispose();
				AddNewHotel frame=new AddNewHotel();	
				frame.setVisible(true);
			}
		});
		
		JButton button_1 = new JButton(new ImageIcon("web_manageWebPersonnel.jpg"));
		button_1.setBounds(70, 556, 184, 60);
		backgroundPanel.add(button_1);
		
		button_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				AddNewHotel.this.dispose();
				ManageWebPersonnel frame=new ManageWebPersonnel();	
				frame.setVisible(true);
			}
		});
		
		JButton button = new JButton(new ImageIcon("web_manageHotelPersonnel.jpg"));
		button.setBounds(70, 481, 184, 60);
		backgroundPanel.add(button);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				AddNewHotel.this.dispose();
				ManageHotelPersonnel frame=new ManageHotelPersonnel();	
				frame.setVisible(true);
			}
		});
		
		JButton button_2 = new JButton(new ImageIcon("web_manageClient.jpg"));
		button_2.setBounds(70, 406, 184, 60);
		backgroundPanel.add(button_2);
		
		button_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				AddNewHotel.this.dispose();
				ManageClient frame=new ManageClient();
				frame.setVisible(true);
			}
		});
		
		JLabel welcomeLabel = new JLabel("欢迎你！");
		welcomeLabel.setBounds(106, 285, 158, 84);
		welcomeLabel.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,30));
		backgroundPanel.add(welcomeLabel);
		
		JLabel label = new JLabel("酒店名称：");
		label.setBounds(416, 98, 131, 50);
		label.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label);
		
		textField = new JTextField();
		textField.setBounds(527, 109, 152, 32);
		textField.setOpaque(false);
		textField.setBorder(new LineBorder(Color.gray));
		backgroundPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("星级：");
		lblNewLabel.setBounds(751, 112, 81, 21);
		lblNewLabel.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(lblNewLabel);
		
		String[] grade={"1","2","3","4","5"};
		JComboBox comboBox = new JComboBox(grade);
		comboBox.setOpaque(false);
		comboBox.setBounds(824, 106, 109, 34);
		backgroundPanel.add(comboBox);
		
		JLabel label_1 = new JLabel("酒店简介：");
		label_1.setBounds(416, 163, 131, 50);
		label_1.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(527, 179, 609, 141);
		textArea.setOpaque(false);
		textArea.setBorder(new LineBorder(Color.gray));
		backgroundPanel.add(textArea);
		
		JLabel label_2 = new JLabel("酒店地址：");
		label_2.setBounds(416, 351, 131, 50);
		label_2.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label_2);
		
		JLabel label_3 = new JLabel("所属商圈：");
		label_3.setBounds(780, 357, 117, 39);
		label_3.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label_3);
		
		JLabel label_4 = new JLabel("酒店设施");
		label_4.setBounds(416, 410, 131, 50);
		label_4.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label_4);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(526, 426, 609, 141);
		textArea_1.setOpaque(false);
		textArea_1.setBorder(new LineBorder(Color.gray));
		backgroundPanel.add(textArea_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setOpaque(false);
		textField_1.setBorder(new LineBorder(Color.gray));
		textField_1.setBounds(880, 361, 96, 32);
		backgroundPanel.add(textField_1);
		
		textField_4 = new JTextField("省/直辖市：");
		textField_4.setBounds(527, 361, 125, 32);
		textField_4.setOpaque(false);
		textField_4.setBorder(new LineBorder(Color.gray));
		textField_4.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				textField_4.setText("");
			}
		});
		backgroundPanel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField("市/县/区：");
		textField_5.setColumns(10);
		textField_5.setOpaque(false);
		textField_5.setBorder(new LineBorder(Color.gray));
		textField_5.setBounds(669, 361, 96, 32);
		textField_5.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				textField_5.setText("");
			}
		});
		backgroundPanel.add(textField_5);
		
		textField_6 = new JTextField("详细地址：");
		textField_6.setColumns(10);
		textField_6.setOpaque(false);
		textField_6.setBorder(new LineBorder(Color.gray));
		textField_6.setBounds(1003, 361, 133, 32);
		textField_6.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				textField_6.setText("");
			}
		});
		backgroundPanel.add(textField_6);
		
		JLabel label_5 = new JLabel("房间类型和价格：");
		label_5.setBounds(416, 588, 181, 50);
		label_5.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setOpaque(false);
		textField_2.setBorder(new LineBorder(Color.gray));
		textField_2.setBounds(594, 598, 220, 32);
		backgroundPanel.add(textField_2);
		
		JLabel label_7 = new JLabel("联系电话：");
		label_7.setBounds(849, 588, 131, 50);
		label_7.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label_7);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setOpaque(false);
		textField_7.setBorder(new LineBorder(Color.gray));
		textField_7.setBounds(952, 598, 184, 32);
		backgroundPanel.add(textField_7);

		btnNewButton_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

				String hotelname=textField.getText().toString();
				int hotelgrade=Integer.parseInt(comboBox.getSelectedItem().toString());
				String introduction=textArea.getText().toString();
				String province=textField_4.getText().toString();
				String city=textField_5.getText().toString();
				String cbd=textField_1.getText().toString();
				String address=textField_6.getText().toString();
				String facility=textArea_1.getText().toString();
				String roomtypeandprice=textField_2.getText().toString();
				String telephone=textField_7.getText().toString();
				String company=textField_7.getText().toString();
				HotelVO vo=new HotelVO(province,city,cbd,address,hotelname,hotelgrade,introduction,facility,roomtypeandprice,company,telephone);
				
				if((hotelname!="")&&(introduction!="")&&(province!="")&&(city!="")&&(cbd!="")&&(address!="")&&(facility!="")&&(roomtypeandprice!="")&&(telephone!="")&&(company!="")&&(comboBox.getSelectedItem().toString()!="")){
					String result=controller.addHotel(vo);
					if(result!=""){
						int temp=JOptionPane.showConfirmDialog(null, "添加成功！酒店编号为："+result+"  是否为其添加工作人员？", "添加结果", JOptionPane.YES_NO_OPTION);
					 if(temp==0){
						AddNewHotelPersonnel frame=new AddNewHotelPersonnel();
						frame.setVisible(true);
						dispose();
					}
					}else{
						JOptionPane.showMessageDialog(backgroundPanel, "添加失败","添加结果",JOptionPane.INFORMATION_MESSAGE);
				}
				}
				else{
					JOptionPane.showMessageDialog(backgroundPanel, "请完整填写信息！","添加结果",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
	}
}