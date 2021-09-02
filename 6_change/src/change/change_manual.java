package change;

public class change_manual {

	public static void main(String[] args) {
		// float a = 100.0;
		// int b = 100.0F; 자동 형변환이 되지 않는다.
		
		float a = (float)100.0;
		System.out.println(a);
		int b = (int)100.0F;
		System.out.println(b);
		int c = (int)100.1F;
		System.out.println(c); // int 이므로 소수점은 짤린다.

	}

}
