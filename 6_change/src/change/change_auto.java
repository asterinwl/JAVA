package change;

public class change_auto {

	public static void main(String[] args) {
		double A = 3.0F; // 자동 형 변환 3.0F는 float인데 double로 변환
	  //float A = 3.0; 자동 형 변환 실패
	  //자동 형 변환의 원칙은 표현범위가 좁은 데이터 타입에서 넓은 데이터 타입으로의 변환만 허용된다는 것
	  //byte < short(char) < int < long < float < double
		int a = 3;
		float b = 1.0F;
		double c = a + b;
      //int와 float가 붙으면 int가 float가 되기 때문에 변수 a에 담겨있는 값 3은 float 타입이 된다.
	  //float가 double 타입의 변수에 담기기 위해서는 float가 double로 형 변환을 해야 한다.	
	}

}
