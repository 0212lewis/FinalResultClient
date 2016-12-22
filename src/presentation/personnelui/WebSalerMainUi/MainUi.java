package presentation.personnelui.WebSalerMainUi;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import presentation.personnelui.BackgroundPanel;
import presentation.personnelui.WebManager.AddNewHotel.AddNewHotel;
import presentation.personnelui.WebSaler.CreditRecharge.CreditRecharge;
import presentation.personnelui.WebSaler.ManageWebStrategy.ManageWebStrategy;
import presentation.personnelui.WebSaler.ViewOrder.ViewOrder;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

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
		
		JLabel label = new JLabel("»¶Ó­Ê¹ÓÃ");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("·½ÕýÀ¼Í¤³¬Ï¸ºÚ¼òÌå", Font.BOLD, 50));
		label.setBounds(552, 119, 307, 84);
		backgroundPanel.add(label);
		
		JPanel panel = new BackgroundPanel(background2);
		panel.setBounds(579, 268, 158, 153);
		backgroundPanel.add(panel);
		
		JButton button_1 = new JButton(new ImageIcon("web_creditRecharge.jpg"));
		button_1.setBounds(185, 574, 184, 60);
		backgroundPanel.add(button_1);
		
		JButton button = new JButton(new ImageIcon("web_checkOrder.jpg"));
		button.setBounds(906, 574, 184, 60);
		backgroundPanel.add(button);
		
		JButton button_3 = new JButton(new ImageIcon("web_manageWebStrategy.jpg"));
		button_3.setBounds(565, 574, 184, 60);
		backgroundPanel.add(button_3);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				ViewOrder frame=new ViewOrder();
				frame.setVisible(true);

			}
		});
	
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CreditRecharge frame=new CreditRecharge();
				frame.setVisible(true);
			}
		});
		
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				dispose();
				ManageWebStrategy frame=new ManageWebStrategy();
				frame.setVisible(true);
			}
		});
		
				
	}
}

