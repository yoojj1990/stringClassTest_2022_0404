package stringClassTest;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Korea";
		String b = "Japan";
		String c = "  USA  ";
		String d = "Korea,Japan,China,USA";
		
		int str_count = a.length(); // 문자열의 길이 (개수)
		System.out.println(str_count);
		
		String ab = a.concat(b); // 문자열 연결
		System.out.println(ab);
		
		String c_trim = c.trim(); // 양쪽 공백 제거
		System.out.println(c_trim);
		System.out.println(c);
		
		String a_0 = a.replace("K", "k"); // 특정 문자 치환
		System.out.println(a_0);
		
		String a_sub = a.substring(3); // 인덱스 3부터 끝까지 출려
		System.out.println(a_sub);
		
		char a_ch = a.charAt(2); // 한글자씩
		System.out.println(a_ch);
		
		String s[] = d.split(","); // 문자열을 구분자로 분리
		for (int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		
		
		
	}

}
