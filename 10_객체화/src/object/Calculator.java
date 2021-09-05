package object;

class Calculator {
	 int left, right;
	    
	    public void setOprands(int left, int right){
	        this.left = left;  // this left는 4째줄 int left, left는 6째줄 int left
	        this.right = right;// this.left, this.right는 Class에서 정의된 left, right를
	                           // this가 없이 사용된 left, right는 Method에서 정의된 left, right
	    }
	      
	    public void sum(){
	        System.out.println(this.left+this.right);
	    }
	      
	    public void avg(){
	        System.out.println((this.left+this.right)/2);
	    }
}

//package class는 실행할 수 없고 다른 식에 참고형태로 사용하는 것이다.
//package class는 삼각형모양으로 나온다.