package object;

//public class Calculator {
//    int left, right;
//    
//    public void setOprands(int left, int right){
//        this.left = left;  // this left�� 4°�� int left, left�� 6°�� int left
//        this.right = right;// this.left, this.right�� Class���� ���ǵ� left, right��
//                           // this�� ���� ���� left, right�� Method���� ���ǵ� left, right
//    }
//      
//    public void sum(){
//        System.out.println(this.left+this.right);
//    }
//      
//    public void avg(){
//        System.out.println((this.left+this.right)/2);
//    }
//}
//Calculator�� package class�� ����
  
public class object {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();       
          
        Calculator c2 = new Calculator();
        c2.setOprands(20, 40);
        c2.sum();       
        c2.avg();
    }

}
