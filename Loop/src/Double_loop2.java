
public class Double_loop2 {

	public static void main(String[] args) {
		//while
		int w = 1;
		while(w<=3) {
			//작은 while문의 초기값을 큰 반복문 안에 적용
			int ww = 1;	//밖(위)에 있으면 한바퀴 돈 후 다음부턴 (올라가지 못해) 인식 못하기 때문에 정지해버리기 때문에..(11,12,13,14) ww=4에서 멈춤(ww=1로 초기화불가)
			
			while(ww<=4) {
//				System.out.println(w+" + "+ww);			
				ww++;
			}		
			w++;
		}
		
		
		//do while
		int dw = 1;
		do {
			//do while문 또한 while문같이 초기값을 큰 반복문 안에 설정
			int ddw = 1;
			do {
				System.out.println(dw + " + " + ddw);
				
				ddw++;
			}while(ddw<=4);	//작은 반복문 범위
					
			dw++;
		}while(dw<=3);	//큰 반복문 범위
		
		

	}

}
