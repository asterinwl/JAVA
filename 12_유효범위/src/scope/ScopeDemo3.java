package scope;

public class ScopeDemo3 {
	
	static int i;
    
    static void a() {
       int i = 0; //5��° ���� int i �� ���� i �̴�.
    }
    
	public static void main(String[] args) {
		for (i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }

	}

}
