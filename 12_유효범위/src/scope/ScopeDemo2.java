package scope;

public class ScopeDemo2 {
	
	static int i;
    
    static void a() {
        i = 0; //5번째 줄의 int i 와 상관없는 i 이다. 따라서 결과는 무한 0
    }
    
	public static void main(String[] args) {
		for (i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }

	}

}
