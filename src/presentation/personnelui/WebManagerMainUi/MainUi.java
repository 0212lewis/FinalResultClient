package presentation.personnelui.WebManagerMainUi;

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
		this.setUndecorated(true);
		//setUndecorated(true);
		setBounds(100, 100, 1280, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image background1=new ImageIcon("background.jpg").getImage();
		Image background2=new ImageIcon("background2.jpg").getImage();
		JPanel backgroundPanel=new BackgroundPanel(background1);
		backgroundPanel.setBounds(0,0,1280,800);
		contentPane.add(backgroundPanel);
		backgroundPanel.setLayout(null);
		
		
		JPanel panel = new BackgroundPanel(background2);
		panel.setBounds(578, 278, 158, 153);
		backgroundPanel.add(panel);
		
		
		JLabel hotelpersonnellabel = new JLabel("»¶Ó­Ê¹ÓÃ");
		hotelpersonnellabel.setForeground(Color.WHITE);
		hotelpersonnellabel.setBounds(551, 129, 343, 84);
		hotelpersonnellabel.setFont(new Font("·½ÕýÀ¼Í¤³¬Ï¸ºÚ¼òÌå",Font.BOLD,50));
		backgroundPanel.add(hotelpersonnellabel);
		
		JButton btnNewButton = new JButton(new ImageIcon("web_addNewHotel.jpg"));
		btnNewButton.setBounds(995, 584, 184, 60);
		backgroundPanel.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				AddNewHotel frame=new AddNewHotel();
				frame.setVisible(true);
			}
		});
		
		
		JButton button_1 = new JButton(new ImageIcon("web_manageWebPersonnel.jpg"));
		button_1.setBounds(710, 584, 184, 60);
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
		
		JButton button = new JButton(new ImageIcon("web_manageHotelPersonnel.jpg"));
		button.setBounds(410, 584, 184, 60);
		backgroundPanel.add(button);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				ManageHotelPersonnel frame=new ManageHotelPersonnel();
				frame.setVisible(true);
			}
		});
		                
		
		JButton button_2 = new JButton(new ImageIcon("web_manageClient.jpg"));
		button_2.setBounds(135, 584, 184, 60);
		backgroundPanel.add(button_2);
		
		button_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				ManageClient frame=new ManageClient();
				frame.setVisible(true);
			}
		});
		

	
	}
}
