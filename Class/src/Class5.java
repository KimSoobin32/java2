import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		Member2.lists2();	//메모리에서 로드
		
		Member2 mb2 = new Member2();	//static이 없는 함수이므로 객체 및 인스턴스를 생성 ,static 없으면 선언해야 함
		mb2.lists();	//인스턴스(메모리)에 있는 메소드를 로드
		
		Member2.list3("유관순", 123456);
		
		/*
		 * 응용문제 for_in라는 일반 메소드(메모리)가 있다.
		 * 프로그램 실행 시 다음과 같이 질문
		 * "사용하실 구구단 숫자를 하나 입력해주세요."
		 * [결과] - 해당 메소드에서 결과를 출력
		 * 만약 사용자가 3단을 입력 시
		 * 3*1=3 ... 3*9=27 출력되어야 함. (for문으로 제작)
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("사용하실 구구단 숫자를 하나 입력해주세요.");
		int ug = s.nextInt();
		Member2.for_in(ug);
		s.close();

	}

}

class Member2{
	
	public void lists() {	//메모리에 별도의 할당없이 메소드 함수만 선언
		String a = "홍길동";
		System.out.println(a);
	}
	public static void lists2() {	//메모리 올려놓은 형태(static)
		String a = "이순신";
		System.out.println(a);
	}
	//Member2에 일반함수(메모리), 이름 list3, 메소드 안에 3개의 필드를 세팅
	//문자 user_name, 숫자 user_tel, 숫자 user_point
	public static void list3(String nm, int pw) {
		//메소드에서 전달 받는 값(nm)을 바로 사용할 경우 (nm.equals("유관순"))
		
		int user_pw = pw;	//메소드에 객체값을 첨부하여 로드 후 메소드 안에 별도의 필드명을 이용하여 전달받는 형식
//		System.out.println(nm);
		if(nm.equals("유관순") && user_pw == 123456) {
			System.out.println("회원 확인이 되었습니다.");
		}else {
			System.out.println("비회원입니다.");
		}
	}
	
	public static void for_in(int g) {
		int a;
		for(a=1; a<=9; a++) {
			System.out.println(g+"*"+a+"="+g*a);
		}
	}
}