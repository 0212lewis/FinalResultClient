package presentation.clientUI_book;


/*
 * 
 * �ͻ����ж���Ԥ�������鿴�Ƶ��������ԭ��
 */

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import presentation.clientUI_account.BackgroundPanel;
import vo.HotelVO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class bookDetailUI extends JFrame
{

	private JPanel contentPane;
	private JTextField txtDestination;
	private JTextField txtCheckInDate;
	private JTextField txtKeyWord;
	private JTextField destination;
	private JTextField checkInDate;
	private JTextField txtHotelGrade;
	private JTextArea txtHotelName;
	
	private JButton searchButton;
	private JComboBox<String> comboBox_hotelGrade;
	private JButton lastPageButton;
	private JButton nextPageButton;

	private bookUI ui;
	private JTextComponent lowestPrice;
	private JButton otherButton;
	private JTextArea txtRoomAmount;
	private JTextArea txtHotelRoomType;
	private JLabel pageLabel;
	private JLabel type_1;
	private JLabel client_1;
	private JLabel price_1;
	private JButton book_1;
	private Component type_2;
	private Component client_2;
	private JLabel price_2;
	private BackgroundPanel backgroundPanel;
	private Image room;
	private Image background4;
	
	private bookDetailUIControllerService controller;
	
	private String[] roomTypes ;
	
	private int index =0;
	
	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public bookDetailUI(HotelVO vo)
	{
		controller = new bookDetailUIController(vo.getHotelID());
		roomTypes = vo.getRoomTypeAndPrice().split("/");
		//����JFrame��һЩ����
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200,800);
		setLocationRelativeTo(null);
	
		//JPanel ������
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//���ñ���
		Image background3 = new ImageIcon("background3.jpg").getImage();
		backgroundPanel = new BackgroundPanel(background3);
		backgroundPanel.setBounds(0, 0, 1200, 800);
		contentPane.add(backgroundPanel);
		backgroundPanel.setLayout(null);
		
		//��ʾ�ڽ������������ JLabel
		JLabel searchLabel = new JLabel("\u641C\u7D22\u6761\u4EF6");
		searchLabel.setForeground(Color.WHITE);
		searchLabel.setBounds(71, 90, 202, 50);
		searchLabel.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 30));
		backgroundPanel.add(searchLabel);
		
		//��ʾ�ڽ���ġ�Ŀ�ĵء�����
		txtDestination = new JTextField();
		txtDestination.setForeground(Color.WHITE);
		txtDestination.setBackground(SystemColor.activeCaption);
		txtDestination.setText("Ŀ�ĵ�");
		txtDestination.setBounds(71, 170, 170, 40);
		txtDestination.setColumns(10);
		txtDestination.setMargin(new Insets(0, 20, 0, 0));
		txtDestination.setEditable(false);
		txtDestination.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		backgroundPanel.add(txtDestination);
		
		//��ʾ��ҳ���ϵġ���ס���ڡ�����
		txtCheckInDate = new JTextField();
		txtCheckInDate.setForeground(Color.WHITE);
		txtCheckInDate.setBackground(SystemColor.activeCaption);
		txtCheckInDate.setText("��ס����");
		txtCheckInDate.setColumns(10);
		txtCheckInDate.setBounds(71, 270, 170, 40);
		txtCheckInDate.setMargin(new Insets(0, 20, 0, 0));
		txtCheckInDate.setEditable(false);
		txtCheckInDate.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		backgroundPanel.add(txtCheckInDate);
		
		//��ʾ��ҳ���ϵġ��ؼ��ʡ�����
		txtKeyWord = new JTextField();
		txtKeyWord.setForeground(Color.WHITE);
		txtKeyWord.setBackground(SystemColor.activeCaption);
		txtKeyWord.setText("�ؼ���");
		txtKeyWord.setColumns(10);
		txtKeyWord.setBounds(71, 470, 170, 40);
		txtKeyWord.setMargin(new Insets(0, 20, 0, 0));
		txtKeyWord.setEditable(false);
		txtKeyWord.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		backgroundPanel.add(txtKeyWord);
		
		//
		destination = new JTextField();
		destination.setEditable(false);
		destination.setBackground(new Color(245, 255, 250));
		destination.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		destination.setColumns(10);
		destination.setBounds(71, 210, 170, 50);
		destination.setMargin(new Insets(0, 20, 0, 20));
		destination.setText(vo.getHotelCity()+"/"+vo.getHotelCBD());
		backgroundPanel.add(destination);
		
		checkInDate = new JTextField();
		checkInDate.setEditable(true);
		checkInDate.setBackground(new Color(245, 255, 250));
		checkInDate.setText("2016-12-02");
		checkInDate.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		checkInDate.setColumns(10);
		checkInDate.setBounds(71, 310, 170, 50);
		checkInDate.setMargin(new Insets(0, 20, 0, 20));
		backgroundPanel.add(checkInDate);
		
		txtHotelGrade = new JTextField();
		txtHotelGrade.setText("�Ƶ꼶��");
		txtHotelGrade.setMargin(new Insets(0, 20, 0, 0));
		txtHotelGrade.setForeground(Color.WHITE);
		txtHotelGrade.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		txtHotelGrade.setEditable(false);
		txtHotelGrade.setColumns(10);
		txtHotelGrade.setBackground(SystemColor.activeCaption);
		txtHotelGrade.setBounds(71, 370, 170, 40);
		backgroundPanel.add(txtHotelGrade);
		
		//������ť
		searchButton = new JButton(new ImageIcon("search.jpg"));
		searchButton.setBounds(71, 710, 170, 60);
		backgroundPanel.add(searchButton);
		
		//�Ƶ��Ǽ�������
		comboBox_hotelGrade = new JComboBox<String>();
		comboBox_hotelGrade.setBackground(new Color(245, 255, 250));
		comboBox_hotelGrade.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		comboBox_hotelGrade.setModel(new DefaultComboBoxModel(new String[] {"  \u4E0D\u9650", "  \u4E94\u661F\u7EA7/\u8C6A\u534E", "  \u56DB\u661F\u7EA7/\u9AD8\u6863", "  \u4E09\u661F\u7EA7/\u8212\u9002", "  \u4E8C\u661F\u7EA7\u4EE5\u4E0B/\u7ECF\u6D4E"}));
		comboBox_hotelGrade.setBounds(71, 410, 170, 50);
		backgroundPanel.add(comboBox_hotelGrade);
		
		//������ľƵ�����
		txtHotelName = new JTextArea();
		txtHotelName.setForeground(new Color(192, 192, 192));
		txtHotelName.setBackground(new Color(245, 255, 250));
		txtHotelName.setMargin(new Insets(10, 10, 10, 10));
		txtHotelName.setLineWrap(true);
		txtHotelName.setText("(\u9009\u586B)\u9152\u5E97\u540D\u79F0");
		txtHotelName.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		txtHotelName.setBounds(71, 510, 170, 50);
		backgroundPanel.add(txtHotelName);
		
		Image hotel = new ImageIcon("hotel.jpg").getImage();
		
		//��һҳ��ť
		lastPageButton = new JButton(new ImageIcon("lastPage.jpg"));
		lastPageButton.setBounds(360, 710, 170, 60);
		backgroundPanel.add(lastPageButton);
		
		//��һҳ��ť
		nextPageButton = new JButton(new ImageIcon("nextPage.jpg"));
		nextPageButton.setBounds(975, 710, 170, 60);
		backgroundPanel.add(nextPageButton);
		
		//�������ʾ��ҳ���ϵľƵ����� ��Ҫ��������
		JTextArea hotelName = new JTextArea();
		hotelName.setEditable(false);
		hotelName.setText(vo.getHotelName());
		hotelName.setOpaque(false);
		hotelName.setMargin(new Insets(10, 10, 10, 10));
		hotelName.setForeground(new Color(25, 25, 112));
		hotelName.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 35));
		hotelName.setColumns(10);
		hotelName.setBackground(new Color(176, 224, 230));
		hotelName.setBounds(483, 50, 350, 50);
		backgroundPanel.add(hotelName);
		
		//��ʾ��ҳ���ϵľƵ��ַ ��Ҫ��������
		JTextArea hotelAddress = new JTextArea();
		hotelAddress.setEditable(false);
		hotelAddress.setText(vo.getHotelAddress());
		hotelAddress.setOpaque(false);
		hotelAddress.setMargin(new Insets(10, 10, 10, 10));
		hotelAddress.setForeground(new Color(0, 0, 128));
		hotelAddress.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 16));
		hotelAddress.setColumns(10);
		hotelAddress.setBounds(490, 101, 350, 40);
		backgroundPanel.add(hotelAddress);
		
		//��ʾ��ҳ���ϵġ����͡�����
		JLabel lblNewLabel = new JLabel("����");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		lblNewLabel.setBounds(490, 181, 100, 30);
		backgroundPanel.add(lblNewLabel);
		
		background4 = new ImageIcon("background4.jpg").getImage();
		
		//������Ƭ
		room = new ImageIcon("room.jpg").getImage();
		
		BackgroundPanel hotelPanel = new BackgroundPanel(hotel);
		hotelPanel.setBounds(360, 60, 120, 120);
		backgroundPanel.add(hotelPanel);
		
		//��ͼ۸� �������Ҫ�������õ�
		lowestPrice = new JTextArea();
		lowestPrice.setEditable(false);
		lowestPrice.setText(String.valueOf(findMin(vo.getRoomTypeAndPrice())));
		lowestPrice.setOpaque(false);
		lowestPrice.setForeground(new Color(255, 99, 71));
		lowestPrice.setFont(new Font("����", Font.BOLD | Font.ITALIC, 50));
		lowestPrice.setBounds(975, 60, 144, 60);
		backgroundPanel.add(lowestPrice);
		
		//�����"��"����������Ҫ��������
		JTextArea textArea_14 = new JTextArea();
		textArea_14.setEditable(false);
		textArea_14.setText("��");
		textArea_14.setOpaque(false);
		textArea_14.setMargin(new Insets(10, 10, 10, 10));
		textArea_14.setForeground(new Color(255, 69, 0));
		textArea_14.setFont(new Font("����", Font.BOLD | Font.ITALIC, 16));
		textArea_14.setColumns(10);
		textArea_14.setBounds(1105, 84, 40, 40);
		backgroundPanel.add(textArea_14);
		
		//��Ҫ��������ķ�������
		txtHotelRoomType = new JTextArea();
		txtHotelRoomType.setText("defaultRoomType");
		txtHotelRoomType.setMargin(new Insets(10, 10, 10, 10));
		txtHotelRoomType.setLineWrap(true);
		txtHotelRoomType.setForeground(Color.LIGHT_GRAY);
		txtHotelRoomType.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		txtHotelRoomType.setBackground(new Color(245, 255, 250));
		txtHotelRoomType.setBounds(71, 560, 170, 50);
		backgroundPanel.add(txtHotelRoomType);
		
		//��Ҫ��������ķ�����Ŀ
		txtRoomAmount = new JTextArea();
		txtRoomAmount.setText("defaultRoomAmount");
		txtRoomAmount.setMargin(new Insets(10, 10, 10, 10));
		txtRoomAmount.setLineWrap(true);
		txtRoomAmount.setForeground(Color.LIGHT_GRAY);
		txtRoomAmount.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		txtRoomAmount.setBackground(new Color(245, 255, 250));
		txtRoomAmount.setBounds(71, 610, 170, 50);
		backgroundPanel.add(txtRoomAmount);
		
		//�����Ƶ�İ�ť
		otherButton = new JButton(new ImageIcon("search2.jpg"));
		otherButton.setBounds(975, 120, 170, 60);
		otherButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				bookDetailUI.this.dispose();
				ui.setVisible(true);
			}
			
		});
		backgroundPanel.add(otherButton);
		
		JLabel label = new JLabel("�������");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		label.setBounds(670, 181, 100, 30);
		backgroundPanel.add(label);
		
		JLabel label_3 = new JLabel("�۸�");
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		label_3.setBounds(900, 181, 100, 30);
		backgroundPanel.add(label_3);
		
		initPageLabel();
		
		initPanel1();
		
		initPanel2();
		
		initPanel3();
		
		initPanel4();
		
		initPanel5();
		
	}
	
	/**
	 * �ҳ��Ƶ����ͷ������͵ļ۸�
	 * @param roomTypeAndPrice �������ͺͼ۸�
	 * */
	private double findMin(String roomTypeAndPrice) {
		
		String types[] = roomTypeAndPrice.split("/");//�������ͺͼ۸������
		if(types.length==0){
			//����Ϊ0
			return 0;
		}else{
			double min = Double.valueOf(types[0].split("[|]")[1]);
			for(String str:types){
				if(Double.valueOf(str.split("[|]")[1])<=min){
					//�������� �ҳ���Сֵ
					min = Double.valueOf(str.split("[|]")[1]);
				}
			}
			return min;
		}
	}
	private void initPageLabel() {
		
		pageLabel = new JLabel("��1ҳ ��3ҳ");
		pageLabel.setFont(new Font("����", Font.BOLD, 15));
		pageLabel.setBounds(704, 716, 120, 29);
		backgroundPanel.add(pageLabel);
	}

	private void initPanel5() {
		
		BackgroundPanel backgroundPanel_5 = new BackgroundPanel(background4);
		backgroundPanel_5.setLayout(null);
		backgroundPanel_5.setBounds(360, 611, 785, 90);
		backgroundPanel.add(backgroundPanel_5);
		
		BackgroundPanel roomPanel_5 = new BackgroundPanel(room);
		roomPanel_5.setBounds(0, 0, 90, 90);
		backgroundPanel_5.add(roomPanel_5);
		
		JLabel type_5 = new JLabel("\u6807\u51C6\u5355\u4EBA\u95F4");
		type_5.setForeground(new Color(0, 0, 128));
		type_5.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		type_5.setBounds(104, 26, 118, 30);
		backgroundPanel_5.add(type_5);
		
		JLabel client_5 = new JLabel("\u666E\u901A\u5BA2\u6237");
		client_5.setForeground(new Color(0, 0, 128));
		client_5.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		client_5.setBounds(310, 26, 100, 30);
		backgroundPanel_5.add(client_5);
		
		JLabel price_5 = new JLabel("\u00A5499");
		price_5.setForeground(new Color(255, 69, 0));
		price_5.setFont(new Font("����", Font.BOLD, 20));
		price_5.setBounds(540, 26, 63, 30);
		backgroundPanel_5.add(price_5);
		
		JButton book_5 = new JButton(new ImageIcon("book.jpg"));
		book_5.setBounds(660, 23, 100, 45);
		backgroundPanel_5.add(book_5);
	}

	private void initPanel4() {
		
		BackgroundPanel backgroundPanel_4 = new BackgroundPanel(background4);
		backgroundPanel_4.setLayout(null);
		backgroundPanel_4.setBounds(360, 511, 785, 90);
		backgroundPanel.add(backgroundPanel_4);
		
		BackgroundPanel roomPanel_4 = new BackgroundPanel(room);
		roomPanel_4.setBounds(0, 0, 90, 90);
		backgroundPanel_4.add(roomPanel_4);
		
		JLabel type_4 = new JLabel("\u6807\u51C6\u5355\u4EBA\u95F4");
		type_4.setForeground(new Color(0, 0, 128));
		type_4.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		type_4.setBounds(104, 26, 118, 30);
		backgroundPanel_4.add(type_4);
		
		JLabel client_4 = new JLabel("\u666E\u901A\u5BA2\u6237");
		client_4.setForeground(new Color(0, 0, 128));
		client_4.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		client_4.setBounds(310, 26, 100, 30);
		backgroundPanel_4.add(client_4);
		
		JLabel price_4 = new JLabel("\u00A5499");
		price_4.setForeground(new Color(255, 69, 0));
		price_4.setFont(new Font("����", Font.BOLD, 20));
		price_4.setBounds(540, 26, 63, 30);
		backgroundPanel_4.add(price_4);
		
		JButton book_4 = new JButton(new ImageIcon("book.jpg"));
		book_4.setBounds(660, 23, 100, 45);
		backgroundPanel_4.add(book_4);
	}

	private void initPanel3() {
		
		BackgroundPanel backgroundPanel_3 = new BackgroundPanel(background4);
		backgroundPanel_3.setLayout(null);
		backgroundPanel_3.setBounds(360, 411, 785, 90);
		backgroundPanel.add(backgroundPanel_3);
		
		BackgroundPanel roomPanel_3 = new BackgroundPanel(room);
		roomPanel_3.setBounds(0, 0, 90, 90);
		backgroundPanel_3.add(roomPanel_3);
		
		JLabel type_3 = new JLabel("\u6807\u51C6\u5355\u4EBA\u95F4");
		type_3.setForeground(new Color(0, 0, 128));
		type_3.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		type_3.setBounds(104, 26, 118, 30);
		backgroundPanel_3.add(type_3);
		
		JLabel client_3 = new JLabel("\u666E\u901A\u5BA2\u6237");
		client_3.setForeground(new Color(0, 0, 128));
		client_3.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		client_3.setBounds(310, 26, 100, 30);
		backgroundPanel_3.add(client_3);
		
		JLabel price_3 = new JLabel("\u00A5499");
		price_3.setForeground(new Color(255, 69, 0));
		price_3.setFont(new Font("����", Font.BOLD, 20));
		price_3.setBounds(540, 26, 63, 30);
		backgroundPanel_3.add(price_3);
		
		JButton book_3 = new JButton(new ImageIcon("book.jpg"));
		book_3.setBounds(660, 23, 100, 45);
		backgroundPanel_3.add(book_3);
	}

	private void initPanel2() {
		
		BackgroundPanel backgroundPanel_2 = new BackgroundPanel(background4);
		backgroundPanel_2.setLayout(null);
		backgroundPanel_2.setBounds(360, 311, 785, 90);
		backgroundPanel.add(backgroundPanel_2);
		
		BackgroundPanel roomPanel_2 = new BackgroundPanel(room);
		roomPanel_2.setBounds(0, 0, 90, 90);
		backgroundPanel_2.add(roomPanel_2);
		
		//�������� ��Ҫ��������
		type_2 = new JLabel("���˼�");
		type_2.setForeground(new Color(0, 0, 128));
		type_2.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		type_2.setBounds(104, 26, 118, 30);
		backgroundPanel_2.add(type_2);
		
		//������� 
		client_2 = new JLabel("101");
		client_2.setForeground(new Color(0, 0, 128));
		client_2.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		client_2.setBounds(310, 26, 100, 30);
		backgroundPanel_2.add(client_2);
		
		//�۸�
	    price_2 = new JLabel("\u00A5499");
		price_2.setForeground(new Color(255, 69, 0));
		price_2.setFont(new Font("����", Font.BOLD, 20));
		price_2.setBounds(540, 26, 63, 30);
		backgroundPanel_2.add(price_2);
		
		JButton book_2 = new JButton(new ImageIcon("book.jpg"));
		book_2.setBounds(660, 23, 100, 45);
		backgroundPanel_2.add(book_2);
	}

	private void initPanel1() {
		
		BackgroundPanel backgroundPanel_1 = new BackgroundPanel(background4);
		backgroundPanel_1.setLayout(null);
		backgroundPanel_1.setBounds(360, 211, 785, 90);
		backgroundPanel.add(backgroundPanel_1);
		BackgroundPanel roomPanel_1 = new BackgroundPanel(room);
		roomPanel_1.setBounds(0, 0, 90, 90);
		backgroundPanel_1.add(roomPanel_1);//���÷���ͼƬ
		
		//�������� ��Ҫ�������õ�
		type_1 = new JLabel("��׼���˼�");
		type_1.setForeground(new Color(0, 0, 128));
		type_1.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		type_1.setBounds(104, 26, 118, 30);
		backgroundPanel_1.add(type_1);
		
	    //���ÿͻ� һ������Ϊ�������
		client_1 = new JLabel("��ͨ�ͻ�");
		client_1.setForeground(new Color(0, 0, 128));
		client_1.setFont(new Font("������ͤ��ϸ�ڼ���", Font.BOLD, 20));
		client_1.setBounds(310, 26, 100, 30);
		backgroundPanel_1.add(client_1);
		
		//����۸� ��Ҫ��������
		price_1 = new JLabel("\u00A5499");
		price_1.setForeground(new Color(255, 69, 0));
		price_1.setFont(new Font("����", Font.BOLD, 20));
		price_1.setBounds(540, 26, 63, 30);
		backgroundPanel_1.add(price_1);
		
		//Ԥ����ť ��Ҫ��������
		book_1 = new JButton(new ImageIcon("book.jpg"));
		book_1.setBounds(660, 23, 100, 45);
		backgroundPanel_1.add(book_1);
	}

	public void setBookUI(bookUI ui){
		this.ui = ui;
	}
}


