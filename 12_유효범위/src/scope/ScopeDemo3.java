package scope;

public class ScopeDemo3 {
	
	static int i;
    
    static void a() {
       int i = 0; //5번째 줄의 int i 와 같은 i 이다.
    }
    
	public static void main(String[] args) {
		for (i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }

	}

}
