package arrangement;

public class array_error {

	public static void main(String[] args) {
		String[] members = { "������", "������", "���̶�" };
		System.out.println(members[3]);
		//member[2]���� �ִµ� [3]�� ������� �ϴ� ������ �����.
		
		String[] members = new String[3];
		members[0] = "������";
		members[1] = "������";
		members[2] = "���̶�";
		members[3] = "�̰���";
		// new String[3] �� ���̴� 3���ε� 4���� �ҷ����Ƿ� ������ ����.
	}

}
