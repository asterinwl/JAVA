package object;

//public class Calculator {
//    int left, right;
//    
//    public void setOprands(int left, int right){
//        this.left = left;  // this left는 4째줄 int left, left는 6째줄 int left
//        this.right = right;// this.left, this.right는 Class에서 정의된 left, right를
//                           // this가 없이 사용된 left, right는 Method에서 정의된 left, right
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
//Calculator를 package class로 만듬
  
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
