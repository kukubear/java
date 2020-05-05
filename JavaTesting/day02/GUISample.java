package day02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/* ������ -> �������̾ƿ�
 * ȭ�鱸�� -> ������ �̿�
 * public -> ����������/��������
 * class  : Ŭ���� -> ��ü�� �����Ͽ� ���� ���� Ʋ
 * GUISample : Ŭ���� �̸�
 * extends : ��� 
 * JFrame ->�̰�  ����� ���ݴϴ�.
 * implements : �������̽�(������ �̸� ���踸 �س��� ������ ��)
 * ActionListener : ���ۺκ�.
 */

//GUI Sample
public class GUISample extends JFrame implements ActionListener {
	
	private JButton redBtn;
	private JButton blueBtn;
	private JButton orangeBtn;
	private BorderLayout b1;
	private Container p;
	private JFrame f;
	private JTextField tf;
	


	public GUISample() { //������
		f = new JFrame("��ư ����� ����"); //��ü������ ������
		
		tf = new JTextField(30);
		
		JPanel p = new JPanel();//�г�, ������Ʈ�� �÷��� ����մϴ�. ������ ������ ����
			
		redBtn = new JButton("Red");//��ư�����
		blueBtn = new JButton("Blue");
		orangeBtn = new JButton("Orange");
		
		
		b1 = new BorderLayout();//��ġ������ ����
		setLayout(b1);
		
		JPanel p2 = new JPanel();
		p2.add(tf);
		f.add("South",p2);
		
		p.add(redBtn);//�гο� ��ư ���̱�
		p.add(blueBtn);
		p.add(orangeBtn);
		
		f.add("North",p);//������ ���ʿ� �г� ���̱�
		
		redBtn.addActionListener(this);//����
		blueBtn.addActionListener(this);
		orangeBtn.addActionListener(this);
		
		f.setBounds(300, 300, 600, 500);//x,y��ǥ�� ���� ���� ����
		f.setVisible(true);//ȭ�麸�̱�
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private void setLayout(BorderLayout b12) {
		// TODO Auto-generated method stub
		
	}











	public static void main(String[] args) {
	GUISample gs1 = new GUISample();




	}
















	@Override//������̼� ���
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		
		if(cmd.equals("Red")) {
			redBtn.setBackground(Color.red);
			tf.setText(cmd+"�� ���õǾ����ϴ�.");
		}else if(cmd.equals("Blue")) {
			blueBtn.setBackground(Color.blue);
			tf.setText(cmd+"�� ���õǾ����ϴ�.");
		}else if(cmd.equals("Orange")) {
			orangeBtn.setBackground(Color.orange);
			tf.setText(cmd+"�� ���õǾ����ϴ�.");
		
	}
	}
}