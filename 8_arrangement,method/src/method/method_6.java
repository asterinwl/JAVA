package method;

public class method_6 {
    public static String numbering(int init, int limit) {  //String�� ���ڿ��� �޴´ٴ� ��
        int i = init;
        // ��������� ���ڵ��� output�̶�� ������ ��� ���ؼ� ������ �� ���� �־���.
        String output = "";
        while (i < limit) {
            // ���ڸ� ȭ�鿡 ����ϴ� ��� ���� output�� ��Ҵ�.
            output += i;  // output=output+1�̹Ƿ� ó�� ���ۿ� output=output+1 �� output=""+"1" output="1"�� ���Ѵ�
            i++;
        }
        // �߿�!!! output�� ��� �ִ� ���ڿ��� �޼ҵ� �ܺη� ��ȯ�Ϸ��� �Ʒ��� ���� return Ű���� �ڿ� ��ȯ�Ϸ��� ����
        // ��ġ�ϸ� �ȴ�. 
        return output;
    }
 
    public static void main(String[] args) {   //void�� ����ִ� ���� �ǹ��ϸ� ��ȯ ���� ���ٴ� ���� �ǹ�
        // �޼ҵ� numbering�� ������ ���� ���� result�� ����.
        String result = numbering(1, 5);
        // ���� result�� ���� ȭ�鿡 ����Ѵ�.
        System.out.println(result);
    }

}

// output="" -> output="1" -> i==2 -> output="1,2" -> i==3 -> output="1,2,3" -> i==4 -> output="1,2,3,4" -> i==5 stop
// numbering�� return�Ǵ� ���� ���Ѵ�. �� output�� ���Ѵ�. output�� "1,2,3,4" ���� ������ 1234