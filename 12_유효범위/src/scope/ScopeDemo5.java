package scope;

public class ScopeDemo5 {
	 static void a(){
	        String title = "coding everybody";
	    }
	    public static void main(String[] args) {
	        a();
	        //System.out.println(title);
	        //�ּ� ó���� 9�������� �ּ��� �����ϸ� ������ �߻��� ���̴�. title�� �޼ҵ� a������ ��ȿ�ϱ� �����̴�.
	    }
}
