
public class thread2 {
	//Thread는 순차적으로 결과값이 절대 안나옴
	public static void main(String[] args) {
		/*
		 * 응용문제 Thread를 이용하여 각 배열의 값을 내림차순으로 모두 더하여 결과 출력
		 * 응용프로그램 제작
		 * 
		 */
		int data[] = {6,9,10,15,3,17};
		//int data[] = {6};
		/*힌트 : 6이라는 배열 값이 인수값으로 Thread로 전달
		 * 6+5+4+3+2+1 최종결과값만 print => 21
		 * 
		 */
		int w=0;
		int ea = data.length;
		pr p = null;
		while(w<ea){
			p = new pr(data[w]);			
			p.start();
			w++;
		}
		

	}

}

class pr extends Thread{
	int num=0;
	public pr(int n) {	//쓰레드에서 값을 사용하기 위한 기본 메소드
		this.num = n;
	}
	@Override
	public void run() {		//run메소드는 절대 인수값을 못받음, run에서 값처리
		int c = this.num;
		int tot = 0;
		while(c>0) {
			tot += c;			
			c--;
		}
		System.out.println(tot);
	}
}

