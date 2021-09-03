package method;

public class method_4 {
	 public static void numbering(int limit) {
	        int i = 0;
	        while (i < limit) {
	            System.out.println(i);
	            i++;
	        }
	    }
	 
	    public static void main(String[] args) {
	        numbering(5);
	    }
	   
	       
		    
}


// public static void numbering() {
//     int limit = 5;
//     int i = 0;
//     while (i < limit) {
//         System.out.println(i);
//         i++;
//     }
// }
// 위의 식과 같은 의미를 지님. 중간에 int limit = 5;을 지정해주는 것보다는 
// numbering(int limit)라고 하고 public static void main(String[] args)에 
// numbering(5);를 넣는 것이 더 좋은 방법임