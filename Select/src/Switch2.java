import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		/*
		 * 응용문제 사용자가 다음과 같은 질문을 받습니다.
		 * "1~5번까지 숫자를 하나 입력해 주시길 바랍니다."
		 * 결과 내용
		 * 1 : 5% 할인쿠폰
		 * 2 : 10% 할인쿠폰
		 * 3~4 : 택배비 무료
		 * 5 : 다음 기회에
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("1~5번까지 숫자를 하나 입력해 주시길 바랍니다.");
		int n = s.nextInt();
		String msg = "";
		/* 자바 8, 11 ...
		switch(n) {
		case 1:	//n을 String으로 받았다면 "1"
			msg = "5% 할인쿠폰";	//실무에선 변수로 조절
		break;
		case 2:
			msg = "5% 할인쿠폰";
		break;
		case 3:
		case 4:
			msg = "택배비 무료";
		break;
		case 5:
			msg = "다음 기회에";
		break;		
		}
		*/
		
		/* switch version 업 형태 : 자바 14 이상*/
		switch(n) {
		case 1 -> {
			msg = "5% 할인쿠폰";
		}	//break 없이 사용
		case 2 -> {
			msg = "10% 할인쿠폰";
		}
		case 3,4 -> {
			msg = "택배비 무료";
		}
		default -> {
			msg = "다음 기회에";
		}
		
		}
		System.out.println(msg);
		s.close();

	}

}
