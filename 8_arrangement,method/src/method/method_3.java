package method;

public class method_3 {
	
	 public static void numbering() {
	        int i = 0;
	        while (i < 10) {
	            System.out.println(i);
	            i++;
	        }
	    }
	public static void main(String[] args) {
		 numbering();
	     numbering();
	     numbering();
	     numbering();
	     numbering();
	}

}
//자 그럼 main 메소드가 무엇인지 알아보자. main 메소드는 규칙이다. 
//여러분이 만들고 싶은 프로그램이 있다면 여러분은 반드시 public static void main(String[] args)가 이끄는 중괄호 
//안에 실행되기를 기대하는 로직을 위치시켜야 한다. 이것은 약속이기 때문에 여러분은 약속을 지켜야 한다