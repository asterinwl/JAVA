package calculation;

public class if_2 {

	public static void main(String[] args) {
		 if (true) {
	            System.out.println(1);
	        } else {
	            System.out.println(2);
	        }
		 
		 
		 if (false) {
	            System.out.println(1);
	        } else if (true) {
	            System.out.println(2);
	        } else if (true) {
	            System.out.println(3);
	        } else {
	            System.out.println(4);
	        }
		 //첫 번째 true 값인 2를 변환한다.
		 
		 
		 if(false){
			    System.out.println(1);
			} else if(false) {
			    System.out.println(2);
			} else if(true) {
			    System.out.println(3);
			} else {
			    System.out.println(4);
			}
		 
		 
		 if(false){
			    System.out.println(1);
			} else if(false) {
			    System.out.println(2);
			} else if(false) {
			    System.out.println(3);
			} else {
			    System.out.println(4);
			}
		 
	}

}
