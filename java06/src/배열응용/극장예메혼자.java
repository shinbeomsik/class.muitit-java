package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예메혼자 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(600, 500);
		f.setTitle("극장예매시스템");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("바탕", 1, 15);
		Font font1 = new Font("고딕", 1, 30);
		Font font2 = new Font("d2coding", 1, 50);

		JLabel result = new JLabel();
		result.setText("결과 나오는곳");
		result.setFont(font1);

		JButton[] btn = new JButton[101];
		int[] seat = new int[btn.length];

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font);
			f.add(btn[i]);

			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand();

					int no = Integer.parseInt(text);

					if (seat[no] == 1) {
						result.setText("예약불가");
						result.setForeground(Color.red);
						btn[no].setBackground(Color.red);
					} else {
						seat[no] = 1; // 에약 좌석을 1로 번경
						result.setText(text + "번 예약완료");
						result.setForeground(Color.blue);
						btn[no].setBackground(Color.blue);

					}
				}
			});
		}

		f.add(result);

		JButton total = new JButton("예약내역");
		total.setFont(font2);

		total.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int count = 0;

				for (int x : seat) {
					if (x == 1) {
						count++;
					} // if
				} // for
				JOptionPane.showMessageDialog(f, count * 10000 + "원 입니다");
			}
		});

		f.add(total);
		f.setVisible(true);
	}

}
