package input_output;

import java.util.Scanner;
import java.io.*;
 
public class inputoutput_5 {

	public static void main(String[] args) {
		try {
            File file = new File("out.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextInt()) {
                System.out.println(sc.nextInt()*1000); 
            }
            sc.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }

	}

}
