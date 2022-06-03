
public class example7 {

	public static void main(String[] args) {
		/*
		 * 다차원 배열로 생성 + 외부 class 및 메소드 사용
		 * [data]
		 * {"홍길동","합격"},
		 * {"이순신","합격"},
		 * {"강감찬","불합격"},
		 * {"김유신","합격"},
		 * {"유관순","불합격"},
		 * {"장보고","불합격"}
		 * 
		 * 다차원 배열 형태이며, 해당 값 중 합격자만 출력
		 * 단, 배열값을 외부 클래스 안에 메소드에서 처리
		 * 결과 : 홍길동 이순신 김유신
		 */
		aa a = new aa();
		a.hap();
		a = null;

	}

}

class aa{	//같은 패키지 안에서는 다른 클래스명 써야함
	public void hap() {
		//System.out.println("test");
		String data[][] = { 
			{ "홍길동", "합격" }, 
			{ "이순신", "합격" }, 
			{ "강감찬", "불합격" }, 
			{ "김유신", "합격" }, 
			{ "유관순", "불합격" },
			{ "장보고", "불합격" } 
		};
		int w=0;
		int dl = data.length;	//6
		int ddl = data[0].length;	//2

		while(w<dl) {
			if(data[w][1].equals("합격")) {
				System.out.printf("%s ",data[w][0]);
			}
			w++;
		}
		
//		while(w<dl) {
//			int ww = 0;
//			while(ww<ddl) {
//				if(data[w][ww].equals("합격")) {
//					System.out.printf("%s ",data[w][0]);
//				}
//				//System.out.println(data[w][ww]);
//				ww++;
//			}			
//			w++;
//		}
		
		
		
	}
}
