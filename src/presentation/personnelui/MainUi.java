package presentation.personnelui;

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

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;

public class MainUi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUi frame = new MainUi();
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
	public MainUi() {
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
		panel.setBounds(580, 232, 158, 153);
		backgroundPanel.add(panel);
		
		
		JLabel hotelpersonnellabel = new JLabel("欢迎使用");
		hotelpersonnellabel.setForeground(Color.WHITE);
		hotelpersonnellabel.setBounds(553, 83, 343, 84);
		hotelpersonnellabel.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,50));
		backgroundPanel.add(hotelpersonnellabel);
		
		JButton btnNewButton = new JButton("添加新的酒店");
		btnNewButton.setBounds(997, 538, 184, 60);
		backgroundPanel.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				AddNewHotel frame=new AddNewHotel();
				frame.setVisible(true);
			}
		});
		
		
		JButton button_1 = new JButton("管理网站营销人员");
		button_1.setBounds(712, 538, 184, 60);
		backgroundPanel.add(button_1);
		
		button_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				setVisible(false);
				ManageWebPersonnel frame;
				frame = new ManageWebPersonnel();
				frame.setVisible(true);
			}
		});
		
		JButton button = new JButton("管理酒店工作人员");
		button.setBounds(412, 538, 184, 60);
		backgroundPanel.add(button);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				ManageHotelPersonnel frame;
				frame = new ManageHotelPersonnel();
				frame.setVisible(true);
			}
		});
		
		
		JButton button_2 = new JButton("管理客户信息");
		button_2.setBounds(137, 538, 184, 60);
		backgroundPanel.add(button_2);
		
		button_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				ManageClient frame=new ManageClient();
				frame.setVisible(true);
			}
		});
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				ManageHotelPersonnel frame=new ManageHotelPersonnel();
				frame.setVisible(true);
			}
		});
		
		button_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				ManageWebPersonnel frame=new ManageWebPersonnel();
				frame.setVisible(true);
			}
		});
		
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				AddNewHotel frame=new AddNewHotel();
				frame.setVisible(true);
			}
		});
	}
}
