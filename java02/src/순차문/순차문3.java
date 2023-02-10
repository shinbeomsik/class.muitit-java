package 순차문;

//부품이 있는 위치를 알려주는 역활
import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		//기본 순차문 == 입력 --> 처리 -->출력
		//입력 ->부품 사용, 망치같이 언제나 바로 사용할수 있는거
		//다이얼로그 에서 입력한 값은 컴퓨터는 무조건 String으로 인식!
		String data1 = JOptionPane.showInputDialog("키를 입력-1 ");
		String data2 = JOptionPane.showInputDialog("몸무게를 입력-2 ");
		
		
		double data33 = Double.parseDouble(data1);
		double data44 = Double.parseDouble(data2);
		
		double result2 = (data33 - data44) * 0.9;
		
		//출력 ->모니터 화면에 띄움
		
		
		System.out.println(result2);
		JOptionPane.showMessageDialog(null, result2);

	}

}
