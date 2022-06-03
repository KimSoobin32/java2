import java.util.Scanner;

public class example6 {

	public static void main(String[] args) {
		/*
		 * 2차배열이며, 2차배열 데이터는 다음과 같다.
		 * user_list : "홍길동", "이순신", "강감찬", "유관순", "세종대왕", "김유신", "계백장군"
		 * user_point : 3000 1000 25000 19800 5750 3630 0
		 * 
		 * 프로그램 시작과 동시에
		 * "포인트를 검색할 고객명을 입력하세요."
		 * 입력한 값은 별도의 class를 제작하여 해당 메소드값으로 매개변수를 이용하여 전달 후
		 * 해당 결과값을 출력
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("포인트를 검색할 고객명을 입력하세요.");
		String name = s.next();
		point p = new point();
		p.search(name);
		s.close();
		p = null;
	}

}

class point{
	public void search(String n) {
		//System.out.println("test");
		String user[][] = {
				{"홍길동", "이순신", "강감찬", "유관순", "세종대왕", "김유신", "계백장군"},
				{"3000", "1000", "25000", "19800", "5750", "3630", "0"}
		};
		int w=0;
		int ul = user.length;
		int udl = user[0].length;
		while(w<ul){
			int ww = 0;
			while(ww<udl) {
				//System.out.println(user[w][ww]);
				if(n.equals(user[w][ww])) {
					System.out.printf("%s님의 포인트는 %s P입니다.",user[0][ww],user[1][ww]);
				}
				ww++;
			}
			w++;
		}
		
	}
}