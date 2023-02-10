package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		// 1.자주 써서 RAM에 언제든 사용할수 있도록 준비되어있음
		// 부품명.기능() ==>망치 같은애
		
		// 2.쓸때마다 제공되는 틀을 이용해서 찍어내어 여러개 만들어 RAM에 
		// 저장해두고 사용! ==> 벽돌
		// 벽돌 b1 = new 벽돌();
		// 벽돌 b2 = new 벽돌();
		// 벽돌 b3 = new 벽돌();
		//JFrame f = new JFrame();
		
		JFrame f = new JFrame();
		f.setSize(400, 200);
		
		f.getContentPane().setBackground(Color.green);
		JLabel l = new JLabel(); //윗글자
		l.setText("당신이 생각한 숫자를 입력하세여.");
		
		JTextField text = new JTextField(20);
		
	
		JButton b = new JButton(); // 버튼
		FlowLayout flow = new FlowLayout();
		Font font = new Font("D2Coding", 1 , 20);
		Font font2 = new Font("D2Coding", 1 , 20);
		
		l.setFont(font);
		l.setBackground(Color.red);
		
		//버튼 배경, 글자색, 폰트 지정
		b.setBackground(Color.red);
		b.setForeground(Color.white);
		b.setFont(font2);
		b.setText("숫자맞추기게임");
		
		text.setFont(font2);
		text.setBackground(Color.pink);
		text.setForeground(Color.blue);
		
		
		f.setLayout(flow);
		f.add(l); // f라는 부품위에 조립해서 올려놔라
		f.add(text);
		f.add(b);
		
	
		
		//맨 아래에 두어야한다!!
		f.setVisible(true);
		
		
		
	}

}
