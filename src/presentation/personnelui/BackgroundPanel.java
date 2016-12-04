package presentation.personnelui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;
/**
 * �б���ͼƬ��panel��
 * @author lewis_chen
 *
 */
public class BackgroundPanel extends JPanel{
	
	private Image image=null;
	
	public BackgroundPanel(Image image){
		this.image=image;
	}
	//�̶�����ͼƬ���������JPanel������ͼƬ������������
	protected void paintComponent(Graphics g){
		g.drawImage(image, 0, 0, this.getWidth(),this.getHeight(),this);
	}
}
