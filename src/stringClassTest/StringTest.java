package stringClassTest;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Korea";
		String b = "Japan";
		String c = "  USA  ";
		String d = "Korea,Japan,China,USA";
		
		int str_count = a.length(); // ���ڿ��� ���� (����)
		System.out.println(str_count);
		
		String ab = a.concat(b); // ���ڿ� ����
		System.out.println(ab);
		
		String c_trim = c.trim(); // ���� ���� ����
		System.out.println(c_trim);
		System.out.println(c);
		
		String a_0 = a.replace("K", "k"); // Ư�� ���� ġȯ
		System.out.println(a_0);
		
		String a_sub = a.substring(3); // �ε��� 3���� ������ ���
		System.out.println(a_sub);
		
		char a_ch = a.charAt(2); // �ѱ��ھ�
		System.out.println(a_ch);
		
		String s[] = d.split(","); // ���ڿ��� �����ڷ� �и�
		for (int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		
		
		
	}

}
