package calculation;

public class boo_lean {

	public static void main(String[] args) {
        System.out.println(1==2);           //false
        System.out.println(1==1);           //true
        System.out.println("one"=="two");   //false
        System.out.println("one"=="one");   //true
        System.out.println(" ");
        
        System.out.println(1!=2);           //true
        System.out.println(1!=1);           //false
        System.out.println("one"!="two");   //true  
        System.out.println("one"!="one");   //false
        System.out.println(" ");
        
        System.out.println(10>20);       //false
        System.out.println(10>2);            //true
        System.out.println(10>10);           //false
        System.out.println(" ");
        
        System.out.println(10 >= 20); // false
        System.out.println(10 >= 2); // true
        System.out.println(10 >= 10); // true
        System.out.println(" ");
        
        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b); // false 왜?? 같은데??
        System.out.println(a.equals(b)); // true
        // 문자와 문자를 비교할 때는 '=='를 사용하지 않고 .equals를 사용한다
       
	}

}
