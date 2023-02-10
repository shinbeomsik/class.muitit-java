package 복습;

public class test {

	public static void main(String[] args) {
		String[] palce = {"홍콩","일본","중국","하와이","알래스카"};
		for (int i = 0; i < palce.length; i++) {
			System.out.print(palce[i] + " ");
		}
		System.out.println();
		for (String x : palce) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		char[] color = {'r','g','b','c','d'};
		for (int i = 0; i < color.length; i++) {
			System.out.print(color[i] + " ");
		}
		System.out.println();
		for (char c : color) {
			System.out.print(c + " ");
		}
		System.out.println();
		double[] cm = {188.2, 140.2, 126.5, 160.5, 176.2};
		for (int i = 0; i < cm.length; i++) {
			System.out.print(cm[i] + " ");
		}
		System.out.println();
		for (double d : cm) {
			System.out.print(d + " ");
		}
		System.out.println();
		
	}
}
