package object;

class Calculator {
	 int left, right;
	    
	    public void setOprands(int left, int right){
	        this.left = left;  // this left�� 4°�� int left, left�� 6°�� int left
	        this.right = right;// this.left, this.right�� Class���� ���ǵ� left, right��
	                           // this�� ���� ���� left, right�� Method���� ���ǵ� left, right
	    }
	      
	    public void sum(){
	        System.out.println(this.left+this.right);
	    }
	      
	    public void avg(){
	        System.out.println((this.left+this.right)/2);
	    }
}

//package class�� ������ �� ���� �ٸ� �Ŀ� �������·� ����ϴ� ���̴�.
//package class�� �ﰢ��������� ���´�.