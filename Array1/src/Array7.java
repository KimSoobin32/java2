import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 해당 사용자 정보 데이터 및 각 레벨별 데이터도 함께 제공됨
		 * 그 중 레벨데이터 값에 3미만(미포함) 값만 확인하여
		 * 배열 데이터를 재가공
		 * 
		 * "홍길동", "이순신", "강감찬", "세종대왕", "유관순", "김유신"
		 * 4,3,1,1,2,2
		 * ["강감찬","세종대왕","유관순","김유신"]
		 */
		String member[] = {"홍길동", "이순신", "강감찬", "세종대왕", "유관순", "김유신"};
		int lv[] = {4,3,1,1,2,2};	//조건 기준, member와 데이터 개수 같음, 같은 인덱스번호 
		String ms[] = new String[6];
		int ml = member.length;
		int w = 0;
		int ct = 0;
		do {
			if(lv[w]<3) {
				ms[ct] = member[w];
				ct++;
			}
			w++;
		} while(w<ml);
		System.out.println(Arrays.toString(ms));
		//Arrays.toString : 숫자,문자,소수 []형태로 현재 배열 변수값을 출력하는 함수

	}

}
