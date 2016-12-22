package presentation.personnelui.WebManager.ManageClient;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import presentation.personnelui.BackgroundPanel;
import presentation.personnelui.WebManager.AddNewHotel.AddNewHotel;
import presentation.personnelui.WebManager.ManageHotelPersonnel.ManageHotelPersonnel;
import presentation.personnelui.WebManager.ManageWebPersonnel.ManageWebPersonnel;
import presentation.personnelui.WebManagerMainUi.MainUi;
import presentation.personnelui.controller.ManageClientUiController;
import runner.WebManagerRunner;
import vo.ClientVO;

public class ManageClient extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private ManageClientUiController controller;

	private DefaultTableModel tablemodel;
	private JPanel contentPane;
	private JTextField txtid;

	/**
	 * Launch the application.
	 */
	/**
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageClient frame = new ManageClient();
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
	public ManageClient() {
		new WebManagerRunner();
		this.controller=new ManageClientUiController();
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
		
		
		JLabel clientlabel = new JLabel("�ͻ���Ϣ");
		clientlabel.setForeground(Color.WHITE);
		clientlabel.setBounds(357, 57, 343, 84);
		clientlabel.setFont(new Font("������ͤ��ϸ�ڼ���",Font.BOLD,30));
		backgroundPanel.add(clientlabel);
		
		JButton btnNewButton = new JButton(new ImageIcon("web_addNewHotel.jpg"));
		btnNewButton.setBounds(70, 631, 184, 60);
		backgroundPanel.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				AddNewHotel frame=new AddNewHotel();	
				frame.setVisible(true);
			}
		});
		
		JButton button_1 = new JButton(new ImageIcon("web_manageWebPersonnel.jpg"));
		button_1.setBounds(70, 556, 184, 60);
		backgroundPanel.add(button_1);
		
		button_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				ManageWebPersonnel frame=new ManageWebPersonnel();	
				frame.setVisible(true);
			}
		});
		
		JButton button = new JButton(new ImageIcon("web_manageHotelPersonnel.jpg"));
		button.setBounds(70, 481, 184, 60);
		backgroundPanel.add(button);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				ManageHotelPersonnel frame=new ManageHotelPersonnel();	
				frame.setVisible(true);
			}
		});
		
		JButton button_2 = new JButton(new ImageIcon("web_manageClient.jpg"));
		button_2.setBounds(70, 406, 184, 60);
		backgroundPanel.add(button_2);
		
		button_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				ManageClient frame=new ManageClient();
				frame.setVisible(true);
			}
		});
		
		JLabel welcomeLabel = new JLabel("��ӭ�㣡");
		welcomeLabel.setBounds(106, 285, 158, 84);
		welcomeLabel.setFont(new Font("������ͤ��ϸ�ڼ���",Font.BOLD,30));
		backgroundPanel.add(welcomeLabel);
		
		Vector<String> columnNames = new Vector<String>();
		columnNames.add("���");
		columnNames.add("����");
		columnNames.add("�Ա�");
		columnNames.add("���֤��");
		columnNames.add("���õ�");
		columnNames.add("��ϵ�绰");
		columnNames.add("�������");
		columnNames.add("����");
		columnNames.add("��Ա�ȼ�");
		columnNames.add("��˾��ַ");
		columnNames.add("�Ƶ���");
		Vector<Vector<String>> rowData=controller.getAllClientVO();
		tablemodel=new DefaultTableModel(rowData, columnNames);
		JTable friends=new JTable(tablemodel);
		//JTable friends = new JTable (rowData, columnNames);  
		JTableHeader tableHeader = friends.getTableHeader(); 
		tableHeader.setPreferredSize(new Dimension(tableHeader.getWidth(), 30));
		friends.setFont(new Font("�����п�",Font.PLAIN,20));
		friends.setPreferredScrollableViewportSize(new Dimension(600, 100));//���ñ��Ĵ�С  
		friends.setRowHeight (50);//����ÿ�еĸ߶�Ϊ20 
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
 		
		
 		JButton searchButton_3 = new JButton(new ImageIcon("web_search.jpg"));
		searchButton_3.setBounds(1148, 120, 71, 29);
		backgroundPanel.add(searchButton_3);
		txtid = new JTextField("id/�ͻ�����/�ֻ�");
		txtid.setBounds(953, 120, 197, 29);
		txtid.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				txtid.setText("");
			}
		});
		backgroundPanel.add(txtid);
		txtid.setColumns(10);
		
		searchButton_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				String text=txtid.getText().toString();
				boolean isNum=Pattern.matches("^\\d+$",text);
				Vector<Vector<String>> clientvolist=controller.getAllClientVO();
				Vector<Vector<String>> volist=new Vector<Vector<String>>();
				if(isNum==true){
					for(int i=0;i<clientvolist.size();i++){
						if(clientvolist.get(i).get(0).equals(text)){
							volist.add(clientvolist.get(i));
						}
						else if(clientvolist.get(i).get(5)==text){
							volist.add(clientvolist.get(i));
						}
					}
					
				}
				if(text.matches("[\\u4e00-\\u9fa5]+")){
					for(int i=0;i<clientvolist.size();i++){
						if(clientvolist.get(i).get(1).equals(text)){
							volist.add(clientvolist.get(i));
						}
					}
				}
				
				friends.setModel(new DefaultTableModel(volist,columnNames));
			}
		});
		JButton btnNewButton_2=new JButton(new ImageIcon("web_return.jpg"));
		btnNewButton_2.setBounds(936, 679, 165, 50);
		backgroundPanel.add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				MainUi frame=new MainUi();
				frame.setVisible(true);
			}
		});
		
		JButton btnNewButton_1 = new JButton(new ImageIcon("web_modify.jpg"));
		btnNewButton_1.setBounds(513, 679, 165, 50);
		backgroundPanel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean q=false;
				ClientVO vo;
				int rowindex  =	friends.getSelectedRow();
				if(rowindex!=-1){
					ManageClient.this.dispose();
					
					String clientid=friends.getValueAt(rowindex,0).toString();
					String name=friends.getValueAt(rowindex, 1).toString();
					String sex=friends.getValueAt(rowindex, 2).toString();
					String identity=friends.getValueAt(rowindex, 3).toString();
					double credit_point=Double.valueOf(friends.getValueAt(rowindex, 4).toString());
					String phonenumber=friends.getValueAt(rowindex, 5).toString();
					String usertype=friends.getValueAt(rowindex, 6).toString();
					String birthday=friends.getValueAt(rowindex, 7).toString();
					int vipgrade=Integer.parseInt(friends.getValueAt(rowindex, 8).toString());
					String companyaddress=friends.getValueAt(rowindex, 9).toString();
					String hotelids=friends.getValueAt(rowindex, 10).toString();
					
					vo=new ClientVO(clientid,name,sex,identity,phonenumber,credit_point,usertype,birthday,vipgrade,companyaddress,hotelids);
	
					ModifyClientMessage frame=new ModifyClientMessage(vo);
					frame.setVisible(true);
				}else{
					JOptionPane.showMessageDialog(scrollPane, "��δѡ��Ҫ�޸ĵĿͻ���","�޸Ľ��",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
	}
}
