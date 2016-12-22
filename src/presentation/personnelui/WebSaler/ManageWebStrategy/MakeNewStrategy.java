package presentation.personnelui.WebSaler.ManageWebStrategy;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import presentation.personnelui.BackgroundPanel;
import presentation.personnelui.WebManagerMainUi.MainUi;
import presentation.personnelui.WebSaler.ManageWebStrategy.ManageWebStrategy;
import presentation.personnelui.controller.ManageWebStrategyUiController;
import runner.WebSalerRunner;
import vo.StrategyVO;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class MakeNewStrategy extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_3;
	private JTextField textField_5;
	private ManageWebStrategyUiController controller;

	/**
	 * Launch the application.
	 */
	/**
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MakeNewStrategy frame = new MakeNewStrategy();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
**/
	/**
	 * Create the frame.
	 */
	public MakeNewStrategy() {
		new WebSalerRunner();
		this.setUndecorated(true);
		this.controller=new ManageWebStrategyUiController();
		
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
		
		
		JLabel hotelpersonnellabel = new JLabel("制定新的网站营销策略");
		hotelpersonnellabel.setForeground(Color.WHITE);
		hotelpersonnellabel.setBounds(602, 23, 343, 84);
		hotelpersonnellabel.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,30));
		backgroundPanel.add(hotelpersonnellabel);
		
		JButton btnNewButton_2=new JButton(new ImageIcon("web_return.jpg"));
		btnNewButton_2.setBounds(936, 679, 165, 50);
		backgroundPanel.add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				MakeNewStrategy.this.dispose();
				ManageWebStrategy frame=new ManageWebStrategy();
				frame.setVisible(true);
			}
		});
		
		JButton btnNewButton_1 = new JButton(new ImageIcon("web_publish.jpg"));
		btnNewButton_1.setBounds(513, 679, 165, 50);
		backgroundPanel.add(btnNewButton_1);
		
		JButton button_2 = new JButton(new ImageIcon("web_newStrategy.jpg"));
		button_2.setBounds(77, 474, 184, 60);
		backgroundPanel.add(button_2);
		
		JLabel welcomeLabel = new JLabel("欢迎你！");
		welcomeLabel.setBounds(106, 285, 158, 84);
		welcomeLabel.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,30));
		backgroundPanel.add(welcomeLabel);
		
		JLabel label = new JLabel("策略名称：");
		label.setBounds(415, 111, 131, 50);
		label.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label);
		
		textField = new JTextField();
		textField.setBounds(561, 123, 216, 27);
		textField.setOpaque(false);
		textField.setBorder(new LineBorder(Color.gray));
		backgroundPanel.add(textField);
		textField.setColumns(10);
		
		JLabel label_4 = new JLabel("策略适用人群：");
		label_4.setBounds(846, 119, 158, 34);
		label_4.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label_4);
		
		JLabel label_1 = new JLabel("策略开始时间：");
		label_1.setBounds(415, 176, 177, 50);
		label_1.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label_1);
		textField_10 = new JTextField();
		textField_10.setOpaque(false);
		textField_10.setBorder(new LineBorder(Color.gray));
		textField_10.setBounds(561, 188, 216, 27);
		backgroundPanel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel label_7 = new JLabel("策略结束时间：");
		label_7.setBounds(846, 176, 158, 50);
		label_7.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label_7);
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setOpaque(false);
		textField_11.setBorder(new LineBorder(Color.gray));
		textField_11.setBounds(991, 188, 216, 27);
		backgroundPanel.add(textField_11);
		
		JLabel label_9 = new JLabel("策略简介：");
		label_9.setBounds(415, 241, 131, 50);
		label_9.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label_9);
		JTextArea textArea = new JTextArea();
		textArea.setOpaque(false);
		textArea.setBorder(new LineBorder(Color.gray));
		textArea.setBounds(536, 257, 671, 153);
		backgroundPanel.add(textArea);
		
		JLabel label_2 = new JLabel("酒店地址：");
		label_2.setBounds(415, 402, 131, 50);
		label_2.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label_2);
		
		JLabel lblNewLabel = new JLabel("省/直辖市：");
		lblNewLabel.setBounds(415, 470, 130, 21);
		lblNewLabel.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(lblNewLabel);
		textField_4 = new JTextField("");
		textField_4.setBounds(536, 467, 109, 27);
		textField_4.setOpaque(false);
		textField_4.setBorder(new LineBorder(Color.gray));
		backgroundPanel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_8 = new JLabel("市/县/区：");
		label_8.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		label_8.setBounds(694, 470, 130, 21);
		backgroundPanel.add(label_8);
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setOpaque(false);
		textField_1.setBorder(new LineBorder(Color.gray));
		textField_1.setBounds(791, 467, 117, 27);
		backgroundPanel.add(textField_1);
		
		JLabel label_3 = new JLabel("所属商圈");
		label_3.setBounds(954, 470, 130, 21);
		label_3.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label_3);
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setOpaque(false);
		textField_6.setBorder(new LineBorder(Color.gray));
		textField_6.setBounds(1049, 467, 158, 27);
		backgroundPanel.add(textField_6);
		
		JLabel label_5 = new JLabel("是否针对会员生日：");
		label_5.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		label_5.setBounds(415, 533, 204, 50);
		backgroundPanel.add(label_5);
		
		JLabel label_6 = new JLabel("触发策略的房间数目：");
		label_6.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		label_6.setBounds(846, 533, 224, 50);
		backgroundPanel.add(label_6);
		textField_3 = new JTextField("");
		textField_3.setColumns(10);
		textField_3.setOpaque(false);
		textField_3.setBorder(new LineBorder(Color.gray));
		textField_3.setBounds(1062, 545, 109, 27);
		backgroundPanel.add(textField_3);
		
		JLabel label_10 = new JLabel("策略折扣：");
		label_10.setBounds(415, 598, 131, 50);
		label_10.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,20));
		backgroundPanel.add(label_10);
		textField_5 = new JTextField("");
		textField_5.setColumns(10);
		textField_5.setOpaque(false);
		textField_5.setBorder(new LineBorder(Color.gray));
		textField_5.setBounds(536, 610, 109, 27);
		backgroundPanel.add(textField_5);
		
		String[] temp={"普通客户","普通会员","企业会员"};
		JComboBox comboBox = new JComboBox(temp);
		comboBox.setBounds(993, 123, 150, 27);
		backgroundPanel.add(comboBox);
		
		String[] a={"是","否"};
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(614, 545, 94, 27);
		backgroundPanel.add(comboBox_1);
		
		
		btnNewButton_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

				String name=textField.getText().toString();
				String usertype=comboBox.getSelectedItem().toString();
				String begintime=textField_10.getText().toString();
				String endtime=textField_11.getText().toString();
				String introduction=textArea.getText().toString();
				String province=textField_4.getText().toString(); 
				String city=textField_1.getText().toString();
				String cbd=textField_6.getText().toString();
				String temp=comboBox.getSelectedItem().toString();
				int roomnumber=Integer.parseInt(textField_3.getText().toString());
				double discount=Double.valueOf(textField_5.getText().toString());
				
				
				boolean istobirthday=false;
				if(temp=="是"){
					istobirthday=true;
				}
				StrategyVO vo=new StrategyVO("",name,introduction,begintime,endtime,usertype,province,city,cbd,istobirthday,"website","",roomnumber,"",discount);
				
				boolean result=false;
				result=controller.addStrategy(vo);
				if(result==true){
					JOptionPane.showMessageDialog(backgroundPanel, "发布成功！","发布结果",JOptionPane.INFORMATION_MESSAGE);
					ManageWebStrategy frame=new ManageWebStrategy();
					frame.setVisible(true);
					MakeNewStrategy.this.dispose();
				}else{
					JOptionPane.showMessageDialog(backgroundPanel, "发布失败！","发布结果",JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
		});
	}
}
