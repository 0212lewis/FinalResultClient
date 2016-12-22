package presentation.personnelui.WebManager.ManageWebPersonnel;
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
import presentation.personnelui.WebManager.ManageClient.ManageClient;
import presentation.personnelui.WebManager.ManageHotelPersonnel.ManageHotelPersonnel;
import presentation.personnelui.WebManager.ManageHotelPersonnel.ModifyMessage;
import presentation.personnelui.WebManagerMainUi.MainUi;
import presentation.personnelui.controller.ManageWebPersonnelUiController;
import presentation.personnelui_hotelWorker.AddNewHotel.AddNewHotel;
import runner.WebManagerRunner;
import vo.PersonnelVO;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class ManageWebPersonnel extends JFrame {

	private JPanel contentPane;
	private JTextField txtid;
	private ManageWebPersonnelControllerService controller;
	private DefaultTableModel tablemodel;
	/**
	 * Launch the application.
	 */
	/**
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageWebPersonnel frame = new ManageWebPersonnel();
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
	public ManageWebPersonnel() {
		
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
		
		
		JLabel webpersonnellabel = new JLabel("网站营销人员信息");
		webpersonnellabel.setForeground(Color.WHITE);
		webpersonnellabel.setBounds(357, 57, 343, 84);
		webpersonnellabel.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,30));
		backgroundPanel.add(webpersonnellabel);
		
		
		Vector<String> columnNames = new Vector<String>();
		columnNames.add("编号");
		columnNames.add("姓名");
		columnNames.add("联系电话");
		columnNames.add("性别");
		columnNames.add("身份类型");
		Vector<Vector<String>> rowData=null;
		rowData = controller.getAllWebSalers();
		tablemodel=new DefaultTableModel(rowData, columnNames);
		JTable friends=new JTable(tablemodel);
		//JTable friends = new JTable (rowData, columnNames);  
		JTableHeader tableHeader = friends.getTableHeader(); 
		tableHeader.setPreferredSize(new Dimension(tableHeader.getWidth(), 30));
		friends.setFont(new Font("华文行楷",Font.PLAIN,20));
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
		
		JButton btnNewButton_2=new JButton(new ImageIcon("web_return.jpg"));
		btnNewButton_2.setBounds(936, 679, 165, 50);
		backgroundPanel.add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ManageWebPersonnel.this.dispose();
				MainUi frame=new MainUi();
				frame.setVisible(true);
			}
		});
		
		JButton btnNewButton_1 = new JButton(new ImageIcon("web_modify.jpg"));
		btnNewButton_1.setBounds(513, 679, 165, 50);
		btnNewButton_1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean q=false;
				PersonnelVO vo;
				int rowindex  =	friends.getSelectedRow();
				if(rowindex!=-1){
					ManageWebPersonnel.this.dispose();
					String personnelid=friends.getValueAt(rowindex,0).toString();
					String name=friends.getValueAt(rowindex, 1).toString();
					String phonenumber=friends.getValueAt(rowindex, 2).toString();
					String sex=friends.getValueAt(rowindex, 3).toString();
					String type=friends.getValueAt(rowindex, 4).toString();

					vo=new PersonnelVO(personnelid,type,name,sex,phonenumber,"");
					ModifyWebSalerMessage frame=new ModifyWebSalerMessage(vo);
					frame.setVisible(true);
				}
				else if(rowindex==-1){
					JOptionPane.showMessageDialog(scrollPane, "您未选择要修改的人员！","修改结果",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		backgroundPanel.add(btnNewButton_1);
		
		
		
		JButton btnNewButton = new JButton(new ImageIcon("web_addNewHotel.jpg"));
		btnNewButton.setBounds(70, 631, 184, 60);
		backgroundPanel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				AddNewHotel frame=new AddNewHotel();
				frame.setVisible(true);
				ManageWebPersonnel.this.dispose();
			}
		});
		
		JButton button_1 = new JButton(new ImageIcon("web_manageWebPersonnel.jpg"));
		button_1.setBounds(70, 556, 184, 60);
		backgroundPanel.add(button_1);
		button_1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ManageWebPersonnel frame=new ManageWebPersonnel();
				frame.setVisible(true);
				ManageWebPersonnel.this.dispose();
				
			}
		});
		
		JButton button = new JButton(new ImageIcon("web_manageHotelPersonnel.jpg"));
		button.setBounds(70, 481, 184, 60);
		backgroundPanel.add(button);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ManageHotelPersonnel frame=new ManageHotelPersonnel();
				frame.setVisible(true);
				ManageWebPersonnel.this.dispose();
			}
		});
		
		JButton button_2 = new JButton(new ImageIcon("web_manageClient.jpg"));
		button_2.setBounds(70, 406, 184, 60);
		backgroundPanel.add(button_2);
		button_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ManageClient frame=new ManageClient();
				frame.setVisible(true);
				ManageWebPersonnel.this.dispose();
			}
		});
		
		JLabel welcomeLabel = new JLabel("欢迎你！");
		welcomeLabel.setBounds(106, 285, 158, 84);
		welcomeLabel.setFont(new Font("方正兰亭超细黑简体",Font.BOLD,30));
		backgroundPanel.add(welcomeLabel);
		
		txtid = new JTextField("id/名称/号码");
		txtid.setBounds(953, 120, 197, 29);
		backgroundPanel.add(txtid);
		txtid.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				txtid.setText("");
			}
		});
		txtid.setColumns(10);
		
		JButton searchButton_3 = new JButton(new ImageIcon("web_search.jpg"));
		searchButton_3.setBounds(1148, 120, 71, 29);
		backgroundPanel.add(searchButton_3);
		searchButton_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String text=txtid.getText().toString();
				boolean isNum=Pattern.matches("^\\d+$",text);
				Vector<Vector<String>>personnelvolist=controller.getAllWebSalers();
				Vector<Vector<String>> volist=new Vector<Vector<String>>();
				if(isNum==true){
					for(int i=0;i<personnelvolist.size();i++){
						if(personnelvolist.get(i).get(0).equals(text)){
							volist.add(personnelvolist.get(i));
						}
						else if(personnelvolist.get(i).get(1).equals(text)){
							volist.add(personnelvolist.get(i));
						}
					}
					
				}
				if(text.matches("[\\u4e00-\\u9fa5]+")){
					for(int i=0;i<personnelvolist.size();i++){
						if(personnelvolist.get(i).get(2).equals(text)){
							volist.add(personnelvolist.get(i));
						}
					}
				}
				if("".equals(text)||text==null){
					JOptionPane.showMessageDialog(backgroundPanel, "请正确输入要搜索的信息！", "提示", JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					friends.setModel(new DefaultTableModel(volist,columnNames));	
				}
			}
		});
		
		JButton button_3 = new JButton(new ImageIcon("web_addNewWebPersonnel.jpg"));
		button_3.setBounds(726, 679, 165, 50);
		backgroundPanel.add(button_3);
		button_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ManageWebPersonnel.this.dispose();
				AddNewWebSaler frame=new AddNewWebSaler();
				frame.setVisible(true);
			}
		});
		
	}
}
