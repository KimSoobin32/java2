import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		
		int num = 3;
		datalist da = new datalist();
		da.array_data(num);
		
		
		//String pay = "신용카드";
		String pay = "계좌이체";
		if(pay.equals("신용카드")) {
			da.pay1();	//해당 조건에 맞는 메소드를 호출
		}else {
			da.pay2(pay);	//메소드에 객체값을 태워서 전달 (보내는 객체값 개수는 무한대 가능)
		}
		
		/*
		 * 응용문제 해당 로드할 class명은 agrees라는 이름을 가지고 있다.
		 * main메소드에서 사용자가 "동의함", "동의안함"을 입력
		 * 동의함으로 입력되었을 경우 "회원가입이 진행됩니다."라는 메시지를 출력하고
		 * 동의안함을 입력 시 "동의를 하셔야 진행됩니다."라고 출력
		 * 단, agrees클래스 안에 void 메소드 한개 또는 두개를 선택하여 코드를 제작
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("약관에 동의하시겠습니까?");
		String a = s.next();
		agrees ag = new agrees();
		ag.agree(a);
		s.close();
	}

}

class datalist{
	/*
	 * static메소드를 활용하는 형태 : 여러 package에서 해당 메소드를 자주 사용해야하는 부분에서는 static을 이용햐여 사용
	 * static(정적 메소드) : 오버라이딩을 사용할 수 없음
	 * void만 사용(동적 메소드) : 오버라이딩을 사용할 수 있음
	 * 오버라이딩 예제
	 * class a{
	 * 	void 메소드
	 * }
	 * class b extend a{
	 * 	void 메소드
	 * }
	 */
	//static 많아질 수록 메모리 사용 증가 -> 속도 느려짐
	public void array_data(int a) {	//static없는 메소드
		int w = 1;
		while(w<10) {
			System.out.println(a*w);
			w++;
		}
	}
	
	public void pay1() {
		System.out.println("신용카드로 결제 진행합니다.");
	}
	public void pay2(String pm) {
		System.out.println(pm+"(으)로 결제 진행합니다.");
	}

}

class agrees{
	public void agree(String a) {
		String msg;
		if(a.equals("동의함")) {
			msg = "회원가입이 진행됩니다.";
		} else if(a.equals("동의안함")) {	//!a.equals("동의함")
			msg = "동의를 하셔야 진행됩니다.";
		} else {
			msg = "동의함/동의안함만 입력가능";
		}
		System.out.println(msg);
	}
}
