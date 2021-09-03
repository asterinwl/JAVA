package calculation;

public class repeat_4 {

	public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println("Coding Everybody " + i);
        }
        // 5¸¦ ¸¸³ª¸é ½ºÅé
        
        for (int a = 0; a < 10; a++) {
            if (a == 5)
                continue;
            System.out.println("Coding Everybody " + a);
        }
        // 5¸¸ »«´Ù
	}

}
