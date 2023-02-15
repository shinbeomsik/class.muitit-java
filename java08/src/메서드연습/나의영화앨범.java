package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나의영화앨범 {
	static int index = 2; // 현재 2부터 시작

	public static void main(String[] args) {
		String[] title = { "더 퍼스트 슬램덩크", "앤트맨과 와스프: 퀀텀매니아", "아바타: 물의 길", "장화신은 고양이: 끝내주는 모험", "교섭" };
		String[] img = { "001.png", "002.png", "003.png", "004.png", "005.png" };
		double[] jumsu = { 9.28, 9.13, 8.82, 8.43, 6.26 };

		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setBackground(Color.green);

		Font font = new Font("바탕", Font.BOLD, 40);// 객체 생성을 하는데, 특정한 입력값을 넣지않으면 못만들게 할수있음

		// 배치부품(객체)를 바꾸어주지 않으면 경계레이아웃을 사용하도록 셋팅 되어있음
		// BorderLayout

		JLabel top = new JLabel(title[2]);
		top.setFont(font);
		top.setHorizontalAlignment(0);
		top.setForeground(Color.red);
		f.add(top, BorderLayout.NORTH);

		ImageIcon icon = new ImageIcon(img[2]);

		JLabel center = new JLabel(icon);
		center.setFont(font);
		f.add(center, BorderLayout.CENTER);

		JLabel under = new JLabel(jumsu[2] + ""); // String.valueOf(jumsu[2]) 이거는 int,double이든 String로 바꿔줌
		under.setFont(font);
		under.setHorizontalAlignment(0);
		under.setForeground(Color.blue);
		f.add(under, BorderLayout.SOUTH);

		// 액션처리 하는 방법
		// 1)액션기능을 add
		// 2)클릭액션이 있을 때 처리할 부품으 만들어주세요.
		// 3)클릭액션이 있을 때 어떻게 처리할지 내용을 코딩해주세요.
		JButton left = new JButton("왼  쪽");
		left.setFont(font);
		left.setBackground(Color.LIGHT_GRAY);
		f.add(left, BorderLayout.WEST);

		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index != 0) {
					// 현재 인덱스보다 하나 적은 값들로 top,center,under를 setting
					top.setText(title[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					under.setText(jumsu[index - 1] + "");
					index = index - 1;
				} else {
					JOptionPane.showMessageDialog(f, "여기가 왼쪽 끝입니다.");
				}
			}
		});

		JButton right = new JButton("오른쪽");
		right.setFont(font);
		right.setBackground(Color.lightGray);
		f.add(right, BorderLayout.EAST);
		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index != 4) {
					// 현재 인덱스보다 하나 적은 값들로 top,center,under를 setting
					top.setText(title[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					under.setText(jumsu[index + 1] + "");
					index = index + 1;
				}else {
					JOptionPane.showMessageDialog(f, "여기가 오른쪽 끝입니다.");
				}
			}
		});

		// 프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}

}
