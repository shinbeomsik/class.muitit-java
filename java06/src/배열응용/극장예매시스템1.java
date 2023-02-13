package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장 예매시스템");
		f.setSize(400, 500);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("D2coding", 1, 50);

		// 버튼 배열 많이 만들어서 집어 넣을 배열 생성
		// 반복해서 f에 넣어주기
		JLabel result = new JLabel("결과 보이는 곳");
		result.setForeground(Color.red);
		result.setFont(font);

		// 예약 여부를 저장하는 배열을 만들어줍시다.!!
		int[] seat = new int[10];
		// 각 자리에 저장된 값이 0이면 아직 예약 안되었음. 예약되면 1로바꿈!

		JButton[] btn = new JButton[10];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font);
			f.add(btn[i]);

			// 버튼에 액션기능 추가
			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					// e.getActionCommand(); 클릭한 버튼의 글자를 가지고와줌
					String text = e.getActionCommand();
					// System.out.println(text);
					int no = Integer.parseInt(text); // "0" -->0으로 바꿔줌
					// 이미 해당 좌석 번호가 1로 저장되어있는지 확인하고,1이 아니면 예약가능!!!
					if (seat[no] == 1) {//이미 예약되어있어 1들어가있음 예약불가
						result.setText("예약 불가 ");
						result.setForeground(Color.blue);
					}else {//아직 예약이 안되어서 0이 들어있음. 예약가능
						seat[no] = 1; // 에약 좌석을 1로 번경
						result.setText(text + "번 예약완료");
						
					}
				}
			});
		}
		
		f.add(result);
		
		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		total.setFont(font);
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//클릭했을 때 내용 넣기
				//배열에 몇개가 1인지 세어서 더해줌
				int count = 0;
				for (int x : seat) {
					if (x == 1) {
						count++;
					}//if
				}//for
				
				//영화 예매비 1장당 1만원, 결제금액 프린트
				JOptionPane.showMessageDialog(f, (count * 10000) + "원 결제하시면됩니다.");
			}
		});
		
		f.add(total);
		f.setVisible(true);
	}

}
