package object;

public class before_object_2 {
	 public static void sum(int left, int right) {
	        System.out.println(left + right);
	    }
	 
	    public static void main(String[] args) {
	        sum(10, 20);
	        sum(20, 40);
	    }
}

//프로그래밍의 기본은 중복을 제거하는 것이다. 위의 로직은 두개의 값을 더한다는 중복이 존재한다.
//이 중복을 제거하기 위한 방법으로 고려해볼 수 있는 기능이 메소드다.