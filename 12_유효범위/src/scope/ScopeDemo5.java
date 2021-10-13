package scope;

public class ScopeDemo5 {
	 static void a(){
	        String title = "coding everybody";
	    }
	    public static void main(String[] args) {
	        a();
	        //System.out.println(title);
	        //주석 처리된 9번라인의 주석을 제거하면 오류가 발생할 것이다. title은 메소드 a에서만 유효하기 때문이다.
	    }
}
