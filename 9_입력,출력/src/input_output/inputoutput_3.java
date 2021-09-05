package input_output;

import java.util.Scanner;  //java.util 패키지 안에 Scanner을 가져온다.

public class inputoutput_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i*1000);
        sc.close();

	}

}
