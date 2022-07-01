//Thread는 메인 class에서 사용 안함 extends (class), implements (interface)
public class thread1 {

	public static void main(String[] args) {
		//순차적으로 처리함
		class_box cb = new class_box();	
		for(int a=0;a<10;a++) {
			//cb.run("클래스 처리현황 "+a);
		}
		
		//쓰레드를 이용하여 먼저 처리된 결과 순으로 나오도록 함
		cpu_box cp = null;		
		for(int b=0;b<10;b++) {
			cp = new cpu_box("쓰레드 처리현황 "+b);
			//cp.start();
		}
		
		//쓰레드를 이용하여 강제 예외처리 방식이며, 문제가 발생하더라도 해당 문제가 발생한 쓰레드만 예외처리,  그 외 사항은 모두 처리하는 예시
		call_box bb = null;
		int w = 0;
		String msg = "";
		String msg2 = "";
		while(w<10) {
			if(w==5) {
				msg2 = "5";
			}else {
				msg2 = "";
			}
			bb = new call_box(msg+msg2);	//null초기화 시 nullnull->length 8, ""->0
			bb.start();			
			w++;
		}

	}

}

class call_box extends Thread{
	String callname = null;
	public call_box(String z) {
		this.callname = z;
	}
	@Override
	public void run() {
		try {	//if 밖에 trycatch 놓자
			if(this.callname.length()>0) {	//강제 에러 시켜도 나머지 작동
//				Exception ec = new Exception();
//				throw ec;
				throw new Exception();
			}else {
				System.out.println(this.callname.length());
			}
			//finally -재실행
		} catch (Exception e) {
			System.out.println("해당 값 중 잘못된 값 발생");
		}
		
		
	}
}

class cpu_box extends Thread{	//쓰레드 : 1,2,3각자 알아서 돌아감
	String name = null;
	public cpu_box(String a) {
		this.name = a;
	}
	@Override
	public void run() {	//무조건 작동, 인수값 받을 수 없음-> 생성자-기본메소드,this 이용하자
		
		System.out.println(this.name);
	}
}

class class_box{	//일반 클래스 : 1다 처리될때까지 기다림
	public void run(String name) {
		System.out.println(name);
	}
}