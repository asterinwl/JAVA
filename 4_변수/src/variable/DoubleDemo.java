package variable;

public class DoubleDemo {

	public static void main(String[] args) {
		double a = 1.1; 
		System.out.println(a+1.1); 
		 
		a = 2.1; 
		System.out.println(a+1.1);
		
		// int a = 1.1; 
		// System.out.println(a+1.1);
		// 위의 코드에서 에러가 발생하는 이유는 변수 a는 정수(int)인데 값으로 1.1이라는 실수를 대입하려고 했기 때문이다.
		// int=정수 , double=실수
	}

}
