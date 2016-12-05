package Monkey_GUI_Exception;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import Monkey_Methods.Methods;

public class GUI_Start_Show extends JFrame {
	// private JComboBox nameJComboBox;
	private JLabel pictureJLabel1;
	private JButton closeJButton;
	private JLabel Prompt,Prompt1,Prompt2;

	Methods method = new Methods();

	public GUI_Start_Show() {
		createUserInterface();

		// TODO Auto-generated constructor stub
	}

	private String createUserInterface() {

		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		// ��ȡ��󴰿�
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle bounds = new Rectangle(screenSize);
		Insets insets = Toolkit.getDefaultToolkit().getScreenInsets(
				getGraphicsConfiguration());
		bounds.x += insets.left;
		bounds.y += insets.top;
		bounds.width -= insets.left + insets.right;
		bounds.height -= insets.top + insets.bottom;
		System.out.println("�����ܴ�С��" + bounds.x + "   " + bounds.y + "   "
				+ bounds.width + "   " + bounds.height);


		// ��ʾ
		Prompt1 = new JLabel(
				"IP��˿��޷���������adb����");
		Prompt1.setBounds(bounds.x + bounds.width / 35, bounds.y + bounds.height
				/ 13, bounds.width, bounds.height / 13);
		Prompt1.setFont(new Font("����", Font.BOLD, bounds.height / 30));
		Prompt1.setForeground(Color.RED);
		add(Prompt1);

		
		setTitle("���ڼ��������Ϣ");
		setBounds(bounds.x + bounds.width / 4, bounds.y + bounds.height / 4,
				bounds.width / 2, bounds.height / 2);
		contentPane.setBackground(Color.WHITE);
		setResizable(false); // ����󻯰�ť����Ϊ������
		Image img = Toolkit.getDefaultToolkit().getImage(
				GUI_Start_Show.class.getClassLoader().getResource(
						"Tray.png"));
		this.setIconImage(img);// ���ô������Ͻ�ͼ��

		return "";
	}



	public static void main(String[] args) {
		// JFrame.setDefaultLookAndFeelDecorated(true);��windowĬ�ϱ����
		GUI_Start_Show close = new GUI_Start_Show();
		close.setVisible(true);
		close.setDefaultCloseOperation(1);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close.setVisible(false);

	}

}