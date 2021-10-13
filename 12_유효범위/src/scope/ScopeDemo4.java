package scope;

public class ScopeDemo4 {
	  public static void main(String[] args) {
		 for (int i = 0; i < 5; i++) {
	            System.out.println(i);
	        }
	        // System.out.println(i);
		    // 반복문에서 선언된 변수 i는 반복문 밖에서는 유효하지 않기 때문에 8행은 오류가 생긴다.
	    }
}
