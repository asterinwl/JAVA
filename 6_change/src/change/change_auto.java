package change;

public class change_auto {

	public static void main(String[] args) {
		double A = 3.0F; // �ڵ� �� ��ȯ 3.0F�� float�ε� double�� ��ȯ
	  //float A = 3.0; �ڵ� �� ��ȯ ����
	  //�ڵ� �� ��ȯ�� ��Ģ�� ǥ�������� ���� ������ Ÿ�Կ��� ���� ������ Ÿ�������� ��ȯ�� ���ȴٴ� ��
	  //byte < short(char) < int < long < float < double
		int a = 3;
		float b = 1.0F;
		double c = a + b;
      //int�� float�� ������ int�� float�� �Ǳ� ������ ���� a�� ����ִ� �� 3�� float Ÿ���� �ȴ�.
	  //float�� double Ÿ���� ������ ���� ���ؼ��� float�� double�� �� ��ȯ�� �ؾ� �Ѵ�.	
	}

}
