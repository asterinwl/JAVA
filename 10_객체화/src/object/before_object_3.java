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
//�Է°�(left, right)�� ����ȭ��Ű�� �޼ҵ��(sum, avg)�� �� ���� ����ϸ� �ڵ��� ���� ���� �� �ְ� �ȴ�.