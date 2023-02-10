package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class k팝인기투표2강사님꺼 {

	public static void main(String[] args) {
		//1.필요한 부품을 RAM에 가져다 놓자.
		// ==> 벽돌처럼!!
		//JFram1 . FlowLayout 2. Font 2~3개
		
		JFrame f = new JFrame();
		f.setSize(500, 500);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font1 = new Font("궁서", 1,20);
		Font font2 = new Font("궁서", 1,20);
		
		JLabel l1 = new JLabel();
		l1.setText("인기투표 시스템을 시작합니다.");
		l1.setFont(font2);
		
		JLabel l2 = new JLabel();
		l2.setText("아이유");
		l2.setFont(font1);
		JLabel l3 = new JLabel();
		l3.setText("방탄");
		l3.setFont(font1);
		JLabel l4 = new JLabel();
		l4.setText("뉴진스");
		l4.setFont(font1);
		
		JLabel l5 = new JLabel(); //아이유 투표수 프린트해주는 라벨
		l5.setFont(font2);
		l5.setForeground(Color.red);
		JLabel l6 = new JLabel(); //방탄 투표수 프린트해주는 라벨
		l6.setFont(font2);
		l6.setForeground(Color.red);
		JLabel l7 = new JLabel(); //뉴진스 투표수 프린트해주는 라벨
		l7.setFont(font2);
		l7.setForeground(Color.red);
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		
		ImageIcon icon = new ImageIcon("ive.jpg");
		ImageIcon icon1 = new ImageIcon("nw2.png");
		ImageIcon icon2 = new ImageIcon("oyu.jpg");
		
		b1.setIcon(icon);
		b2.setIcon(icon1);
		b3.setIcon(icon2);
		
		f.add(l1);
		f.add(b1);
		f.add(l2);
		f.add(l5);
		
		f.add(b2);
		f.add(l3);
		f.add(l6);
		
		f.add(b3);
		f.add(l4);
		f.add(l7);
		
		
		b1.addActionListener(new ActionListener() {
			int iu = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
			//버튼 클릭할 때마다 처리할 내용!
				iu++;
				l5.setText(iu + "표");
			}
		});
		b2.addActionListener(new ActionListener() {
			int bt = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				//버튼 클릭할 때마다 처리할 내용!
				bt++;
				l6.setText(bt + "표");
			}
		});
		b3.addActionListener(new ActionListener() {
			int nw = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				//버튼 클릭할 때마다 처리할 내용!
				nw++;
				l7.setText(nw + "표");
			}
		});
		
		
		f.setVisible(true);
		

	}

}
