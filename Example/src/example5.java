public class example5 {

	public static void main(String[] args) {
		/*
		 * 2차배열 + 기본(클래스)메소드 문제
		 * 등록된 고객중 vip 고객만 리스트를 출력
		 * 
		 * user_list : "홍길동", "이순신", "강감찬", "유관순", "세종대왕", "김유신", "계백장군"
		 * user_level : "gold", "vip", "guest", "gold", "vip" ,"vip", "guest"
		 * 
		 * 결과 출력 : 이순신, 세종대왕, 김유신,
		 * 
		 * [그룹인덱스][데이터인덱스]
		 */
		String user[][] = {
				{"홍길동", "이순신", "강감찬", "유관순", "세종대왕", "김유신", "계백장군"},
				{"gold", "vip", "guest", "gold", "vip" ,"vip", "guest"}				
		};
		lev(user);

	}
	
	public static void lev(String u[][]) {
		int w = 0;
		int udl = u[0].length;	//7
		int gp = u.length;	//2
//
//		while(w<udl) {
//			if(u[1][w].equals("vip")) {
//
//				System.out.printf("%s, ",u[0][w]);
//			}
//			w++;
//		}
		while(w<gp) {
			int ww = 0;
			while(ww<udl) {
				//System.out.println(u[w][ww]);
				if(u[w][ww].equals("vip")) {
					System.out.println(u[0][ww]);
				}
				ww++;
			}
			w++;
		}

		
	}

}
