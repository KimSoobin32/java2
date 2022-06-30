//Thread 사용방식
public class Thread1 {

	public static void main(String[] args) {
		int w=0;
		while(w<6) {
//			box b = new box(w);
//			Thread t = new Thread(b);	//스레드 생성
//			t.start();	//thread는 무조건 start로 실행, 인수 넣을 수 없음
			//한명 접속할때마다 스레드 추가.. 하나 나가면 쓰레드 하나 종료, 나머지는 가동 중..
			w++;
		}
		
		for(int f=0;f<10;f++) {
		
			box2 b2 = new box2(f);
			
			//쓰레드 메소드를 호출하여 해당 클래스에 CPU한개를 할당함 -> 10개의 cpu, 코어 많을 수록 빠름 코어 개수만큼 동시작업가능(n스레드)
			Thread t2 = new Thread(b2);	//스레드 선언(스레드로 작동시킬 클래스 명), 같은 이름 클래스가 여러개로 분할됨
			t2.start();	//스레드 작동시킬 명령어
			
			//동시 여러작업, 돌릴때마다 결과 달라짐
			//하나의 클래스가지고 여러개의 방식, 한명령어로 여러 작업
		}
			
		
				

	}

}

/* Extends Thread */
//extends 방법1
class box extends Thread{
	int no = 0;
	public box(int a) {
		this.no = a;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			
		}catch (Exception e) { }
		System.out.println(this.no);
	}
}

/* interface Runnable Thread */
//implements 방법2
class box2 implements Runnable{	//이 방법만 써도 됨
	int no = 0;
	public box2(int b) {
		this.no=b;
	}
	
	@Override
	public void run() {	//스레드의 기본 메소드, Thread 쓰면 무조건 run메소드 써야 함
		try {
			Thread.sleep(1000);
			//스위치로 각각 메소드 호출, 1이면뭐 2면뭐..
		} catch (Exception e) { }
		System.out.println(this.no);
		
	}
}

