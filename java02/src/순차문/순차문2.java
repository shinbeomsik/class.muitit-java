package 순차문;

//부품이 있는 위치를 알려주는 역활
import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		//기본 순차문 == 입력 --> 처리 -->출력
		//입력 ->부품 사용, 망치같이 언제나 바로 사용할수 있는거
		//다이얼로그 에서 입력한 값은 컴퓨터는 무조건 String으로 인식!
		String data1 = JOptionPane.showInputDialog("정수를 입력하시오-1 ");
		String data2 = JOptionPane.showInputDialog("정수를 입력하시오-2 ");
		
		//처리 ->글자 연결 (+연산자이용, 결합연산자)
		//			 더해지는 데이터가 하나라도 String 이면 결과는 무조건 String
		// String을 int로 변경
		int data11 = Integer.parseInt(data1); // "200" --> 200
		int data22 = Integer.parseInt(data2); // "100" --> 100
		
		double data33 = Double.parseDouble(data1);
		double data44 = Double.parseDouble(data2);
		
		int result = data11 + data22;
		double result2 = data33 + data44;
		
		//출력 ->모니터 화면에 띄움
		
		System.out.println(result);
		System.out.println(result2);
		

	}

}
