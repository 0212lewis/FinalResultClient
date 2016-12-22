package presentation.personnelui.WebSaler.ManageWebStrategy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import presentation.personnelui.BackgroundPanel;
import presentation.personnelui.WebSaler.CreditRecharge.CreditRecharge;
import presentation.personnelui.WebSaler.ManageWebStrategy.MakeNewStrategy;
import presentation.personnelui.WebSaler.ViewOrder.ViewOrder;
import presentation.personnelui.WebSalerMainUi.MainUi;
import presentation.personnelui.controller.ManageWebStrategyUiController;
import runner.WebSalerRunner;
import vo.StrategyVO;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class ManageWebStrategy extends JFrame {

	private JPanel contentPane;
	private JTextField txtid;
	private JScrollPane scrollPane;
	private JTable table;
	private ManageWebStrategyUiController controller;
	private DefaultTableModel tablemodel;
	/**
	 * Launch the application.
	 */
	
	/**
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageWebStrategy frame = new ManageWebStrategy();
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
	 * @throws RemoteException 
	 */
	public ManageWebStrategy()  {
		
		new WebSalerRunner();
		this.controller=new ManageWebStrategyUiController();
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
		
		
		JButton button_1 = new JButton(new ImageIcon("web_newStrategy.jpg"));
		button_1.setBounds(727, 678, 165, 50);
		backgroundPanel.add(button_1);
		button_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ManageWebStrategy.this.dispose();
				MakeNewStrategy frame=new MakeNewStrategy();
				frame.setVisible(true);
			}
		});
		
		
		JButton btnNewButton_2=new JButton(new ImageIcon("web_return.jpg"));
		btnNewButton_2.setBounds(936, 678, 165, 50);
		backgroundPanel.add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ManageWebStrategy.this.dispose();
				MainUi frame=new MainUi();
				frame.setVisible(true);
			}
			
		});
		
		JButton button = new JButton(new ImageIcon("web_checkOrder.jpg"));
		button.setBounds(70, 575, 184, 60);
		backgroundPanel.add(button);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ManageWebStrategy.this.dispose();
				ViewOrder frame=new ViewOrder();
				frame.setVisible(true);
			}
		});
		
		JButton button_2 = new JButton(new ImageIcon("web_creditRecharge.jpg"));
		button_2.setBounds(70, 384, 184, 60);
		backgroundPanel.add(button_2);
		button_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ManageWebStrategy.this.dispose();
				CreditRecharge frame=new CreditRecharge();
				frame.setVisible(true);
			}
		});
		
		JButton button_3 = new JButton(new ImageIcon("web_manageWebStrategy.jpg"));
		button_3.setBounds(70, 476, 184, 60);
		backgroundPanel.add(button_3);
		button_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ManageWebStrategy.this.dispose();
				ManageWebStrategy frame=new ManageWebStrategy();
				frame.setVisible(true);
			}
		});
		
		
		JLabel welcomeLabel = new JLabel("��ӭ�㣡");
		welcomeLabel.setBounds(106, 285, 158, 84);
		welcomeLabel.setFont(new Font("������ͤ��ϸ�ڼ���",Font.BOLD,30));
		backgroundPanel.add(welcomeLabel);
		
		JLabel label = new JLabel("����Ӫ������");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 30));
		label.setBounds(422, 29, 343, 84);
		backgroundPanel.add(label);
		
		Vector<String> columnNames=new Vector<String>();
		columnNames.add("���Ա��");
		columnNames.add("��������");
		columnNames.add("��ʼʱ��");
		columnNames.add("����ʱ��");
		columnNames.add("������Ⱥ");
		columnNames.add("�ۿ�");
		Vector<Vector<String>> rowData=null;
		rowData = controller.getAllWebsiteStrategy();  
		tablemodel=new DefaultTableModel(rowData, columnNames);
		JTable friends=new JTable(tablemodel);
		//JTable friends = new JTable (rowData, columnNames);  
		JTableHeader tableHeader = friends.getTableHeader(); 
		tableHeader.setPreferredSize(new Dimension(tableHeader.getWidth(), 30));
		friends.setFont(new Font("�����п�",Font.PLAIN,16));
		friends.setPreferredScrollableViewportSize(new Dimension(600, 100));//���ñ���Ĵ�С  
		friends.setRowHeight (40);//����ÿ�еĸ߶�Ϊ20 
		friends.setRowMargin (3);//�����������е�Ԫ��ľ���
		friends.setRowSelectionAllowed (true);//���ÿɷ�ѡ��.Ĭ��Ϊfalse 
		friends.setSelectionBackground (Color.lightGray);//������ѡ���еı���ɫ 
		friends.setSelectionForeground (Color.black);//������ѡ���е�ǰ��ɫ 
		friends.setGridColor (Color.black);//���������ߵ���ɫ 
		friends.setShowGrid (true);//�Ƿ���ʾ������  
		friends.setShowHorizontalLines (true);//�Ƿ���ʾˮƽ��������
		friends.setShowVerticalLines (true);//�Ƿ���ʾ��ֱ��������  
		friends.doLayout ();  
		friends.setBackground (Color.white); 
		
		DefaultTableCellRenderer   r   =   new   DefaultTableCellRenderer();   
		r.setHorizontalAlignment(JLabel.CENTER);   
		friends.setDefaultRenderer(Object.class,   r);
		JScrollPane scrollPane = new JScrollPane(friends);
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setBounds(350, 156, 873, 508);

 		backgroundPanel.add(scrollPane);
		
		JButton button_4 = new JButton(new ImageIcon("web_detail.jpg"));
		button_4.setBounds(517, 678, 165, 50);
		backgroundPanel.add(button_4);
		
		JButton button_5 = new JButton(new ImageIcon("web_delete.jpg"));
		button_5.setBounds(1031, 87, 165, 50);
		backgroundPanel.add(button_5);
		
		JButton button_6 = new JButton(new ImageIcon("web_modify.jpg"));
		button_6.setBounds(822, 87, 165, 50);
		backgroundPanel.add(button_6);
		button_6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int rowindex=friends.getSelectedRow();
				if(rowindex!=-1){
					String strategyid=friends.getValueAt(rowindex, 0).toString();
					
					StrategyVO vo=controller.getStrategyVO(strategyid);
					dispose();
					ModifyStrategyMessage frame=new ModifyStrategyMessage(vo);
					frame.setVisible(true);
				}else{
					JOptionPane.showMessageDialog(backgroundPanel, "����δѡ��Ҫ�޸ĵĲ��ԣ�", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
				}
				String strategyid=friends.getValueAt(rowindex, 0).toString();
				//StrategyVO vo=controller.getStrategyVO(strategyid);
			}
		});
		
		button_5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int rowindex=friends.getSelectedRow();
				if(rowindex!=-1){
					String strategyid=friends.getValueAt(rowindex, 0).toString();
					boolean q=controller.deleteStrategy(strategyid);
					if(q==true){
						JOptionPane.showMessageDialog(backgroundPanel, "ɾ���ɹ���","ɾ�����",JOptionPane.INFORMATION_MESSAGE);
						ManageWebStrategy.this.dispose();
						ManageWebStrategy frame=new ManageWebStrategy();
						frame.setVisible(true);
						
					}else{
						JOptionPane.showMessageDialog(backgroundPanel, "ɾ��ʧ�ܣ�","ɾ�����",JOptionPane.INFORMATION_MESSAGE);
					}
				}else{
					JOptionPane.showMessageDialog(backgroundPanel, "����δѡȡҪɾ���Ĳ��ԣ���","ɾ�����",JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StrategyVO vo=null;
				int rowindex=friends.getSelectedRow();   
				if(rowindex!=-1){
					ManageWebStrategy.this.dispose();
					String strategyid=friends.getValueAt(rowindex, 0).toString();
					vo=controller.getStrategyVO(strategyid);
					ViewDetails frame=new ViewDetails(vo);
					frame.setVisible(true);
				}else{
					JOptionPane.showMessageDialog(backgroundPanel, "����δѡȡҪ�鿴�Ĳ��ԣ�","��ʾ",JOptionPane.INFORMATION_MESSAGE);
				}
	
			}
		});
	}
}


