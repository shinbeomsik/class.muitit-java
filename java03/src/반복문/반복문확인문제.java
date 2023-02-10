package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 반복문확인문제 {

	public static void main(String[] args) {
	 
		JFrame f = new JFrame();
		f.setSize(300, 350);
		f.getContentPane().setBackground(Color.green);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("D2Coding", 1 ,40);
		
		JButton b1 = new JButton();
		b1.setFont(font);
		b1.setText("별 10개");
		b1.setBackground(Color.magenta);
		JButton b2 = new JButton();
		b2.setFont(font);
		b2.setText("커피*5");
		b2.setBackground(Color.cyan);
		JButton b3 = new JButton();
		b3.setFont(font);
		b3.setText("커피*우유3");
		b3.setBackground(Color.magenta);
		JButton b4 = new JButton();
		b4.setFont(font);
		b4.setText("1:짱!");
		b4.setBackground(Color.cyan);
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		//1) 버튼에다가 액션기능을 추가하겠다고 설정
		//2) 클릭 액션이 있을때 어떤 부품이 액션 처리를 어떻게 할지 코딩해주면됨.
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 써주세요!
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
				System.out.println();
				
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
				
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println((i + 1) + ":짱!");
				}
				
			}
		});
		
		f.setVisible(true);
	}

}
