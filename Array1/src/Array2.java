
public class Array2 {

	public static void main(String[] args) {
		/*
		 * hong kim park lee jang jung
		 */
		String id[] = {"hong", "kim", "park", "lee", "jang", "jung"};
//		System.out.println(id[4]);
		int word = id[4].length();	//jung 길이(글자 수)
		System.out.println(word);
		
		/*
		 * 응용문제 해당 사용자 리스트 배열
		 * 해당 배열값 중 사용자 아이디 3단어 이상만 출력
		 */
		int a = 0;
		int member = id.length;	//전체 회원수를 파악하기 위함
		int wl;	//각각의 배열 데이터의 문자 갯수 파악
		while(a<member) {
			wl = id[a].length();	//문자 갯수 파악
			if(wl>3) {	//세 단어 이상(불포함)의 데이터만 출력
				System.out.println(id[a]);
			}
			a++;
		}
		
		/*
		 * 응용문제 배열 데이터 다음과 같음
		 * 15 60 11 14 27
		 * 다음 데이터값을 모두 더해서 최종 결과값을 출력 : 127
		 */
		int b[] = {15, 60, 11, 14, 27};
		int d = 0;
		int len = b.length;
		int t = 0;
		do {
			t = t + b[d];			
			d++;
		}while(d<len);
		System.out.println(t);

	}

}
