import java.util.Random;
import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("0부터 10까지 숫자를 하나 선택하세요.");
		int no = s.nextInt();
		//memorys m = new memorys();
		//메모리 반환
		memorys m = null;
		m = new memorys();
		m.ms(no);
		m = null;	//초기화(메모리 지움)
		
		/*
		 * memorys m = new memorys();
		 * m.ms();
		 * m = null;	//해당 인스턴스를 비움
		 */
		
		m = new memorys();
		m.rd();
		
	}

}

class memorys{
	public void ms(int user) {
		//System.out.println("test");
		//Math.random() 랜덤메소드 사용법 - 기본 자료형은 double
		/*
		 * random => 보안코드, 인증코드, 추첨, 룰렛
		 */
		double a = Math.random();	//0.0 ~ 1.0까지
		int b = (int)(Math.random()*10);	//0 ~ 9	,double -> int로 변경 (괄호 주의!)
		int w = 0;
		while(w<=10) {
			int c = (int)(Math.random()*9)+1; //1~9	//*10은 10개가 나온다는 뜻, +1은 1부터 시작한다는 뜻
			//System.out.printf("%d ",c);
			w++;
		}
		//System.out.println(c);
		
//		System.out.println(a);
		System.out.println(b);
		if(user==b) {
			System.out.println("당첨");
		}else {
			System.out.println("다음 기회에");
		}
	}
	
	public void rd() {	//random util 사용법
		Random r = new Random();	//random 객체 생성 및 인스턴스 적용
		//System.out.println(r.nextInt(10));	//0~9까지		,r.nextInt를 사용	,r.nextInt(10)+1 : 1~9
		int w = 0;
		while(w<=5) {
			System.out.println(r.nextInt(45)+1);	//로또 1~45
			w++;
		}
		r = null;
	}
}