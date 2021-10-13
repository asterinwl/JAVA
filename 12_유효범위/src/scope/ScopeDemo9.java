package scope;

class C3 {
    int v = 10;
 
    void m() {
    	int v = 20;
        System.out.println(this.v); //this는 전역변수를 사용하자는 것이다.
    } 
}

public class ScopeDemo9 {
	
    public static void main(String[] args) {
        C3 c1 = new C3();
        c1.m();
    }

}

// 객체지향 덕분에 좀 더 안심하고 전역변수를 사용하게 되었지만, 객체도 크기가 커지면 관리의 이슈가 생겨난다. 
// 객체지향 프로그래밍에서도 가급적이면 전역변수의 사용을 자제하는 것이 좋고, 
// 동시에 단일 객체가 너무 비대해지지 않도록 적절하게 규모를 쪼개는 것도 중요하다.