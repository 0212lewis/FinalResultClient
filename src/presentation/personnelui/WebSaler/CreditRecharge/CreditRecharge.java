package presentation.personnelui.WebSaler.CreditRecharge;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import presentation.personnelui.BackgroundPanel;
import presentation.personnelui.WebSaler.ManageWebStrategy.ManageWebStrategy;
import presentation.personnelui.WebSaler.ViewOrder.ViewOrder;
import presentation.personnelui.WebSalerMainUi.MainUi;
import presentation.personnelui.controller.CreditRechargeUiController;
import runner.WebSalerRunner;
import vo.ClientVO;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class CreditRecharge extends JFrame {

	private JPanel contentPane;
	private JTextField txtid;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private CreditRechargeUiController controller;
	
	private String clientId;
	/**
	 * Launch the application.
	 */
	/**
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
	}**/

	/**
	 * Create the frame.
	 */
	public CreditRecharge() {
		new WebSalerRunner();
		this.controller=new CreditRechargeUiController();
		init();
		
	}
	
	public void init(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
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
		
		JButton btnNewButton_2=new JButton(new ImageIcon("web_return.jpg"));
		btnNewButton_2.setBounds(875, 528, 165, 50);
		backgroundPanel.add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				MainUi frame=new MainUi();
				frame.setVisible(true);
				CreditRecharge.this.dispose();
			}
			
		});
		
		JButton button = new JButton(new ImageIcon("web_checkOrder.jpg"));
		button.setBounds(70, 575, 184, 60);
		backgroundPanel.add(button);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				CreditRecharge.this.dispose();
				ViewOrder frame=new ViewOrder();
				frame.setVisible(true);
			}
		});
		
		JButton button_2 = new JButton(new ImageIcon("web_creditRecharge.jpg"));
		button_2.setBounds(70, 384, 184, 60);
		backgroundPanel.add(button_2);
		button_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				CreditRecharge.this.dispose();
				CreditRecharge frame=new CreditRecharge();
				frame.setVisible(true);
			}
		});
		
		JButton button_3 = new JButton(new ImageIcon("web_manageWebStrategy.jpg"));
		button_3.setBounds(70, 476, 184, 60);
		backgroundPanel.add(button_3);
		button_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				CreditRecharge.this.dispose();
				ManageWebStrategy frame=new ManageWebStrategy();
				frame.setVisible(true);
			}
		});
		
		
		JLabel welcomeLabel = new JLabel("欢迎你！");
		welcomeLabel.setBounds(106, 285, 158, 84);
		welcomeLabel.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,30));
		backgroundPanel.add(welcomeLabel);
		
		JLabel label = new JLabel("信用充值");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("华文行楷", Font.BOLD, 50));
		label.setBounds(687, 80, 343, 84);
		backgroundPanel.add(label);
		
		textField = new JTextField();
		textField.setBounds(825, 266, 205, 42);
		textField.setOpaque(false);
		textField.setBorder(new LineBorder(Color.gray));
		textField.setFont(new Font("华文行楷",Font.HANGING_BASELINE,25));
		backgroundPanel.add(textField);
		textField.setColumns(10);
		
		JButton button_1 = new JButton(new ImageIcon("web_recharge.jpg"));
		button_1.setBounds(530, 528, 165, 50);
		backgroundPanel.add(button_1);
		
		JLabel lblNewLabel = new JLabel("请输入需要充值的客户id：");
		lblNewLabel.setBounds(500, 249, 314, 77);
		lblNewLabel.setFont(new Font("华文行楷",Font.HANGING_BASELINE,25));
		backgroundPanel.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("充值数额：");
		label_1.setFont(new Font("华文行楷", Font.ITALIC, 25));
		label_1.setBounds(500, 377, 328, 77);
		backgroundPanel.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("华文行楷", Font.ITALIC, 25));
		textField_1.setOpaque(false);
		textField_1.setBorder(new LineBorder(Color.gray));
		textField_1.setColumns(10);
		textField_1.setBounds(825, 390, 205, 42);
		backgroundPanel.add(textField_1);
		
		JButton button_4 = new JButton(new ImageIcon("web_check.jpg"));
		button_4.setBounds(1098, 265, 111, 42);
		backgroundPanel.add(button_4);
		button_4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				boolean q=false;
				String clientid=textField.getText();
				if("".equals(clientid)||clientid==null){
					JOptionPane.showMessageDialog(backgroundPanel, "您尚未输入任何客户id！", "操作结果", JOptionPane.INFORMATION_MESSAGE);
				}else{
				
					q=controller.checkID(clientid);
					if(q==true){
						ClientVO vo=controller.getClientVO(clientid);
						ShowClientMessage frame=new ShowClientMessage(vo);
						frame.setVisible(true);
						CreditRecharge.this.dispose();
					}else{
						JOptionPane.showMessageDialog(backgroundPanel, "输入的id不存在！", "操作结果", JOptionPane.INFORMATION_MESSAGE);
						
					}
				}
				
				
			}
		});
		
		
		
		button_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				boolean q=false;
				boolean p=false;
				String clientid=textField.getText().toString();
				double credit=Double.valueOf(textField_1.getText().toString());
				
				q=controller.checkID(clientid);
				if(q==true){
					p=controller.addCredit(clientid, credit);
					if(p==true){
						ClientVO vo=controller.getClientVO(clientid);
						int index=JOptionPane.showConfirmDialog(backgroundPanel, "充值成功！是否要查看该客户信用点信息？", "操作结果",JOptionPane.YES_NO_OPTION);
						if(index==0){
							CreditRecharge.this.dispose();
							ShowClientMessage frame=new ShowClientMessage(vo);
							frame.setVisible(true);
					}else{
						CreditRecharge.this.dispose();
						CreditRecharge frame=new CreditRecharge();
						frame.setVisible(true);
					}
				}
				
				}else{
				
				}
			}
		});
		
	}
}

