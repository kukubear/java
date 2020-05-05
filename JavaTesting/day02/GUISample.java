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

/* 프레임 -> 보더레이아웃
 * 화면구성 -> 생성자 이용
 * public -> 접근제한자/공개적인
 * class  : 클래스 -> 객체를 생성하여 쓰기 위한 틀
 * GUISample : 클래스 이름
 * extends : 상속 
 * JFrame ->이게  상속을 해줍니다.
 * implements : 인터페이스(사전에 미리 설계만 해놓은 상태의 것)
 * ActionListener : 동작부분.
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
	


	public GUISample() { //생성자
		f = new JFrame("버튼 만들기 예제"); //객체생성과 제목설정
		
		tf = new JTextField(30);
		
		JPanel p = new JPanel();//패널, 컴포넌트를 올려서 사용합니다. 눈에는 보이지 않음
			
		redBtn = new JButton("Red");//버튼만들기
		blueBtn = new JButton("Blue");
		orangeBtn = new JButton("Orange");
		
		
		b1 = new BorderLayout();//배치관리자 설정
		setLayout(b1);
		
		JPanel p2 = new JPanel();
		p2.add(tf);
		f.add("South",p2);
		
		p.add(redBtn);//패널에 버튼 붙이기
		p.add(blueBtn);
		p.add(orangeBtn);
		
		f.add("North",p);//프레임 북쪽에 패널 붙이기
		
		redBtn.addActionListener(this);//동작
		blueBtn.addActionListener(this);
		orangeBtn.addActionListener(this);
		
		f.setBounds(300, 300, 600, 500);//x,y좌표와 넓이 높이 설정
		f.setVisible(true);//화면보이기
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private void setLayout(BorderLayout b12) {
		// TODO Auto-generated method stub
		
	}











	public static void main(String[] args) {
	GUISample gs1 = new GUISample();




	}
















	@Override//어노테이션 기법
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		
		if(cmd.equals("Red")) {
			redBtn.setBackground(Color.red);
			tf.setText(cmd+"이 선택되었습니다.");
		}else if(cmd.equals("Blue")) {
			blueBtn.setBackground(Color.blue);
			tf.setText(cmd+"이 선택되었습니다.");
		}else if(cmd.equals("Orange")) {
			orangeBtn.setBackground(Color.orange);
			tf.setText(cmd+"이 선택되었습니다.");
		
	}
	}
}