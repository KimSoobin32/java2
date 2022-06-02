import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 다음 문자 배열 데이터값이 있다.
		 * a1 : "홍길동", "이순신", "강감찬", "유관순", "김유신"
		 * a2 : 100, 80, 39, 60, 55
		 * "검색하고자하는 이름을 적어주세요." 출력
		 * 검색어에 이순신이라고 검색을 하게되면
		 * "이순신님은 80점입니다." 라고 출력
		 */
		
		Scanner s = new Scanner(System.in);
		String a1[] = {"홍길동", "이순신", "강감찬", "유관순", "김유신"};
		String a2[] = {"100", "80", "39", "60", "55"};
		
		
		String a3[][] = {
				{"홍길동", "이순신", "강감찬", "유관순", "김유신"},
				{"100", "80", "39", "60", "55"}
		};
		
		System.out.println("검색하고자하는 이름을 적어주세요.");
		String name = s.next();	//사용자가 입력한 데이터
		mem m = new mem();
		m.aa(a1, a2, name);
		
		System.out.println("검색하고자하는 이름을 적어주세요2.");
		String name2 = s.next();
		mem2.aa(a3, name2);
		
		
		s.close();
	}

}

class mem{
	public void aa(String a1[], String a2[], String n) {
		//System.out.println("test");
		int w = 0;
		int al = a1.length;
		String msg="";
		boolean ck = false;
		while(w<al) {
			if(n.equals(a1[w])) {
				msg = a1[w]+"님은 "+a2[w]+"점입니다.";
				ck = true;
			}
			w++;
		}
		if(ck == false) {
			msg = "해당 멤버 아님.";
		}
		System.out.println(msg);
	}
}

class mem2{
	public static void aa(String a3[][], String n) {
		//System.out.println("test");
		int f, ff;
		int al = a3.length;
		int adl = a3[0].length;
		String msg="";
		boolean ck = false;
		for(f=0;f<adl;f++) {
			for(ff=0;ff<al;ff++) {
				if(n.equals(a3[ff][f])) {
					System.out.println(a3[ff][f]+ " " +a3[1][f]);
					ck = true;
				}
			}
		}
		if(ck == false) {
			msg = "해당 멤버 아님.";
		}
		System.out.println(msg);
	}
}

