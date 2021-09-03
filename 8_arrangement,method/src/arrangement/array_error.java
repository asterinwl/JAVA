package arrangement;

public class array_error {

	public static void main(String[] args) {
		String[] members = { "최진혁", "최유빈", "한이람" };
		System.out.println(members[3]);
		//member[2]까지 있는데 [3]을 꺼내라고 하니 오류가 생긴다.
		
		String[] members = new String[3];
		members[0] = "최진혁";
		members[1] = "최유빈";
		members[2] = "한이람";
		members[3] = "이고잉";
		// new String[3] 즉 길이는 3개인데 4개를 불렀으므로 오류가 난다.
	}

}
