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
		 //ù ��° true ���� 2�� ��ȯ�Ѵ�.
		 
		 
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
