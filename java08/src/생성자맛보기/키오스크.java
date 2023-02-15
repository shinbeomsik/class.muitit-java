package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 키오스크 {

	 static int count; // 0으로 초기화, 전역변수!
	 final static int PRICE = 5000; // final은 변경불가, 상수
	 // 상수변수를 쓸 때는 잘보이라고 변수명을 모두 대문자로!를 권장!!!

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		f.setTitle("중국집키오스크");
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(null);

		Font font = new Font("바탕", 1, 30);
		Font font1 = new Font("d2coding", 2, 25);

		JLabel iconimg = new JLabel();
		ImageIcon icon = new ImageIcon("입구.png");
		iconimg.setBounds(100, 300, 450, 290);
		iconimg.setIcon(icon);
		
		JLabel label = new JLabel("개수 :");
		label.setBounds(500, 75, 100, 50);
		label.setFont(font1);
		
		JTextField count2 = new JTextField(10);
		count2.setBounds(600, 75, 200, 50);
		count2.setBackground(Color.yellow);
		
		JLabel result = new JLabel("결제 금액  0원");
		result.setBounds(600, 400, 400, 100);
		result.setFont(font);
		result.setForeground(Color.red);

		JButton jja = new JButton("짜장");
		jja.setBounds(50, 50, 100, 100);
		jja.setFont(font);
		jja.setBackground(Color.black);
		jja.setForeground(Color.WHITE);

		jja.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("jja2.jpg");
				iconimg.setIcon(icon);
				count++;
				count2.setText(count + "개");
				result.setText("결제금액 " + (count * PRICE) + "원");
			}
		});

		JButton bong = new JButton("짬뽕");
		bong.setBounds(200, 50, 100, 100);
		bong.setFont(font);
		bong.setBackground(Color.red);
		bong.setForeground(Color.WHITE);

		bong.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("bong2.jpg");
				iconimg.setIcon(icon);
				count++;
				count2.setText(count + "개");
				result.setText("결제금액 " + (count * PRICE) + "원");

			}
		});
		JButton udon = new JButton("우동");
		udon.setBounds(350, 50, 100, 100);
		udon.setFont(font);
		udon.setBackground(Color.LIGHT_GRAY);
		udon.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("udon2.jpg");
				iconimg.setIcon(icon);
				count++;
				count2.setText(count + "개");
				result.setText("결제금액 " + (count * PRICE) + "원");

			}
		});


		f.add(jja);
		f.add(bong);
		f.add(udon);
		f.add(label);
		f.add(count2);
		f.add(iconimg);
		f.add(result);
		
		f.setVisible(true);

	}

}
