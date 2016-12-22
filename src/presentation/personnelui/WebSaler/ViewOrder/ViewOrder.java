package presentation.personnelui.WebSaler.ViewOrder;

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

import po.OrderPO;
import presentation.personnelui.BackgroundPanel;
import presentation.personnelui.WebSaler.CreditRecharge.CreditRecharge;
import presentation.personnelui.WebSaler.ManageWebStrategy.ManageWebStrategy;
import presentation.personnelui.WebSalerMainUi.MainUi;
import runner.WebSalerRunner;
import vo.OrderVO;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.util.Vector;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
public class ViewOrder extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private DefaultTableModel tablemodel;
	private presentation.personnelui.controller.ViewOrderUiController controller;
	/**
	 * Launch the application.
	 */
	/**
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewOrder frame = new ViewOrder();
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
	public ViewOrder(){
		new WebSalerRunner();
		this.controller=new presentation.personnelui.controller.ViewOrderUiController();
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
		
		JButton btnNewButton_2=new JButton(new ImageIcon("web_return.jpg"));
		btnNewButton_2.setBounds(980, 674, 165, 50);
		backgroundPanel.add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ViewOrder.this.dispose();
				MainUi frame=new MainUi();
				frame.setVisible(true);
			}
		});
		
		JButton button = new JButton(new ImageIcon("web_checkOrder.jpg"));
		button.setBounds(70, 575, 184, 60);
		backgroundPanel.add(button);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ViewOrder frame=new ViewOrder();
				frame.setVisible(true);
			}
		});
		JButton button_2 = new JButton(new ImageIcon("web_creditRecharge.jpg"));
		button_2.setBounds(70, 384, 184, 60);
		backgroundPanel.add(button_2);
		
		button_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				CreditRecharge frame=new CreditRecharge();
				frame.setVisible(true);
			}
		});
		JButton button_3 = new JButton(new ImageIcon("web_manageWebStrategy.jpg"));
		button_3.setBounds(70, 476, 184, 60);
		backgroundPanel.add(button_3);
		
		button_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ManageWebStrategy frame=new ManageWebStrategy();
				frame.setVisible(true);
			}
		});
		
		JLabel welcomeLabel = new JLabel("欢迎你！");
		welcomeLabel.setBounds(106, 285, 158, 84);
		welcomeLabel.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,30));
		backgroundPanel.add(welcomeLabel);
		
		JLabel label = new JLabel("查看订单");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("方正兰亭超细黑简体", Font.BOLD, 30));
		label.setBounds(422, 29, 343, 84);
		backgroundPanel.add(label);
		
		Vector<String> columnNames = new Vector<String>();
		columnNames.add("订单号");
		columnNames.add("客户id");
		columnNames.add("预定时间");
		columnNames.add("订单状态");
		columnNames.add("房间号");
		columnNames.add("房间类型");
		Vector<Vector<String>> rowData=null;
		Vector<Vector<String>> result=new Vector<Vector<String>>();
		rowData = controller.getAllAbnormalOrders();
		rowData.addAll(controller.getAllUnexecutedOrders());
		
		tablemodel=new DefaultTableModel(rowData, columnNames);
		JTable friends=new JTable(tablemodel);
		//JTable friends = new JTable (rowData, columnNames);  
		JTableHeader tableHeader = friends.getTableHeader(); 
		tableHeader.setPreferredSize(new Dimension(tableHeader.getWidth(), 30));
		friends.setFont(new Font("华文行楷",Font.PLAIN,20));
		friends.setBorder(null);
		friends.setPreferredScrollableViewportSize(new Dimension(600, 100));//设置表格的大小  
		friends.setRowHeight (50);//设置每行的高度为20 
		friends.setRowMargin (3);//设置相邻两行单元格的距离
		friends.setRowSelectionAllowed (true);//设置可否被选择.默认为false 
		friends.setSelectionBackground (Color.lightGray);//设置所选择行的背景色 
		friends.setSelectionForeground (Color.black);//设置所选择行的前景色 
		friends.setGridColor (Color.black);//设置网格线的颜色 
		friends.setShowGrid (true);//是否显示网格线  
		friends.setShowHorizontalLines (true);//是否显示水平的网格线
		friends.setShowVerticalLines (true);//是否显示垂直的网格线  
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
 		
		textField = new JTextField();
		textField.setText("输入客户id以搜索异常订单");
		textField.setColumns(10);
		textField.setBounds(786, 108, 344, 29);
		textField.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				textField.setText("");
			}
		});
		backgroundPanel.add(textField);
		
		JButton button_1 = new JButton(new ImageIcon("web_search.jpg"));
		button_1.setBounds(1126, 108, 79, 29);
		backgroundPanel.add(button_1);
		button_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String text=textField.getText().toString();
				Vector<Vector<String>> volist=controller.getAllAbnormalOrders();
				
				Vector<Vector<String>> result=new Vector<Vector<String>>();
				if("".equals(text)||text==null){
					JOptionPane.showMessageDialog(backgroundPanel, "您尚未输入要查询的订单号！", "提示", JOptionPane.INFORMATION_MESSAGE);
				}else{
					boolean isNum=Pattern.matches("^\\d+$",text);
					boolean checkid=false;
					if(isNum==true){
						for(int i=0;i<volist.size();i++){
							if(text.equals(volist.get(i).get(1))){
								//result.addAll(controller.getClientAbnormalOrders(text));
								checkid=true;
							}
						}
						if(checkid==true){
							result.addAll(controller.getClientAbnormalOrders(text));
							friends.setModel(new DefaultTableModel(volist,columnNames));
						}else{
							JOptionPane.showMessageDialog(backgroundPanel, "客户id不存在 ！", "提示",JOptionPane.INFORMATION_MESSAGE);
						}
					}else{
						JOptionPane.showMessageDialog(backgroundPanel, "输入格式有误！", "提示",JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
		
		JButton button_4 = new JButton(new ImageIcon("web_detail.jpg"));
		button_4.setBounds(494, 674, 165, 50);
		backgroundPanel.add(button_4);
		button_4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int rowindex=friends.getSelectedRow();
				if(rowindex!=-1){
					String orderID=friends.getValueAt(rowindex, 0).toString();
					OrderVO vo=controller.getOrderVO1(orderID);
					ViewOrder.this.dispose();
					ViewOrderDetails frame=new ViewOrderDetails(vo);
					frame.setVisible(true);
				}else{
					JOptionPane.showMessageDialog(backgroundPanel, "您尚未选择要查看的订单！", "提示", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
		JButton button_5 = new JButton(new ImageIcon("web_withdraw.jpg"));
		button_5.setBounds(728, 674, 165, 50);
		backgroundPanel.add(button_5);
		
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index=friends.getSelectedRow();
					if(index!=-1){
						String orderID=friends.getValueAt(index,0).toString();
						
						boolean q=controller.withdrawAbnormalOrder(orderID);
						if(q==true){
							JOptionPane.showMessageDialog(backgroundPanel, "撤销成功！","结果", JOptionPane.INFORMATION_MESSAGE);
							ViewOrder.this.dispose();
							ViewOrder frame=new ViewOrder();
							frame.setVisible(true);
							
						}else{
							JOptionPane.showMessageDialog(backgroundPanel, "撤销失败！","结果", JOptionPane.INFORMATION_MESSAGE);
						}	
					}
					else{
						JOptionPane.showMessageDialog(backgroundPanel, "您尚未选取需要撤销异常的订单！！","结果", JOptionPane.INFORMATION_MESSAGE);
					}
			}
		});
	}
}

