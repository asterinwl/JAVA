package input_output;

import java.util.Scanner;  //java.util ��Ű�� �ȿ� Scanner�� �����´�.

public class inputoutput_4 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            System.out.println(sc.nextInt()*1000); 
        }
        sc.close();
    }

}
