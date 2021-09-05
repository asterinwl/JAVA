package input_output;

import java.util.Scanner;  //java.util 패키지 안에 Scanner을 가져온다.

public class inputoutput_4 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            System.out.println(sc.nextInt()*1000); 
        }
        sc.close();
    }

}
