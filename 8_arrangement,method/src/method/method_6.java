package method;

public class method_6 {
    public static String numbering(int init, int limit) {  //String은 문자열을 받는다는 말
        int i = init;
        // 만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
        String output = "";
        while (i < limit) {
            // 숫자를 화면에 출력하는 대신 변수 output에 담았다.
            output += i;  // output=output+1이므로 처음 시작에 output=output+1 즉 output=""+"1" output="1"로 변한다
            i++;
        }
        // 중요!!! output에 담겨 있는 문자열을 메소드 외부로 반환하려면 아래와 같이 return 키워드 뒤에 반환하려는 값을
        // 배치하면 된다. 
        return output;
    }
 
    public static void main(String[] args) {   //void는 비어있는 것을 의미하며 반환 값이 없다는 것을 의미
        // 메소드 numbering이 리턴한 값이 변수 result에 담긴다.
        String result = numbering(1, 5);
        // 변수 result의 값을 화면에 출력한다.
        System.out.println(result);
    }

}

// output="" -> output="1" -> i==2 -> output="1,2" -> i==3 -> output="1,2,3" -> i==4 -> output="1,2,3,4" -> i==5 stop
// numbering은 return되는 값을 취한다. 즉 output을 취한다. output은 "1,2,3,4" 따라서 정답은 1234