package 스태틱;

public class 직원 {

	String name;
	int age;
	String gender;

	static int count;
	static int sum;

	
	//객체생성하지 않고 클래스 이름으로 바로 접근해서 아무때나 원할 때 평균을 구하고 싶은경우
	//static메서드로 만들어주세요!
	
	
	public static void getAvg() {
		//static메서드에서 전역변수를 접근 할떄는
		//같은 성격을 가진 static변수만 접근이 가능!!
		//System.out.println(name);
		
		
		System.out.println(sum / count);
	}

	public 직원(String name, int age, String gender) {
		count++;
		this.name = name;
		this.age = age;
		this.gender = gender;
		sum = sum + age;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
