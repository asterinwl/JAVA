package object;

public class before_object_3 {
	public static void avg(int left, int right) {
        System.out.println((left + right) / 2);
    }
 
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }
 
    public static void main(String[] args) {
        int left, right;
 
        left = 10;
        right = 20;
 
        sum(left, right);
        avg(left, right);
 
        left = 20;
        right = 40;
 
        sum(left, right);
        avg(left, right);
    }
}
//입력값(left, right)을 변수화시키고 메소드들(sum, avg)가 이 값을 사용하면 코드의 양을 줄일 수 있게 된다.