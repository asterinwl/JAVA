package calculation;

public class base {

	public static void main(String[] args) {
		 // result 의 값은 3
        int result = 1 + 2;
        System.out.println(result);
  
        // result 의 값은 2
        result = result - 1;
        System.out.println(result);
  
        // result 의 값은 4
        result = result * 2;
        System.out.println(result);
  
        // result 의 값은 2
        result = result / 2;
        System.out.println(result);
  
        // result 의 값은 10
        result = result + 8;
        // result 의 값은 3
        result = result % 7;
        System.out.println(result);
        
        
        int a = 3;
        System.out.println(0%a);
        System.out.println(1%a);
        System.out.println(2%a);
        System.out.println(3%a);
        System.out.println(4%a);
        System.out.println(5%a);
        System.out.println(6%a);
        
        
        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString+secondString;
        System.out.println(thirdString);

	}

}
