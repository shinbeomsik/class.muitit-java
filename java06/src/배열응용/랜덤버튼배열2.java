package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// 1.프레임을 만들어보기
		JFrame f = new JFrame();

		// 2.프레임 설정해보기
		f.setSize(1200, 800);
		f.setTitle("버튼500개 만들어보기");

		// 레이아웃 부품 설정 X
		f.setLayout(null);
		// 3.버튼을 넣을 배열을 먼저 만들기 (500개)
		JButton[] button = new JButton[500]; // 기본형이 아닌 데이터는 참조형
		// 참조형 배열에 null로 초기화

		// 4.버튼을 500개 만들어서 배열에 넣어주기
		Random r = new Random();
		
		Color[] colors = {Color.red, Color.blue, Color.white, Color.gray, Color.green, Color.orange};
			
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton(i + "번 버튼 ");
			int x = r.nextInt(1000);
			int y = r.nextInt(700);
			button[i].setBounds(x, y, 90, 50);
			// 5.버튼 배열에 있는 버튼을 꺼내서 위치를 지정후 f에 붙여주세요.
			button[i].setBackground(colors[r.nextInt(colors.length)]);
			f.add(button[i]);
		}

		// 심화)) 버튼 색을 몇 가지 지정해서 임의로 설정, 힌트 Color 배열


		
		// 심화)) f에 배경색을 넣어보세요

		f.getContentPane().setBackground(Color.DARK_GRAY);

		f.setVisible(true);
	}

}
