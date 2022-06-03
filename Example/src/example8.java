import java.util.Arrays;
import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {
		/*
		 * 다음 사용자 복권 관련 프로그램을 요청
		 * 사용자가 총 5개의 숫자를 입력
		 * "1~46 번 사이의 숫자를 입력해주세요." (5번 질문)
		 * 사용자가 입력한 5개의 숫자를 배열로 생성(main에서 처리)
		 * 
		 * 외부 class를 이용하여 PC가 직접 당첨번호 5개를 랜덤하게 뽑아낸다.
		 * PC가 뽑은 5개의 숫자를 배열로 생성 (외부 class method로 생성)
		 * 
		 * 별도의 결과 method를 하나 더 생성하여
		 * 사용자가 입력한 5개의 배열 데이터와 PC가 뽑은 배열 데이터를
		 * 해당 method로 전달하여, 출력
		 * 
		 * 사용자 뽑
		 * Pc 뽑
		 * 
		 * 단, 모든 사용하는 반복문은 무조건 do while문으로 작성
		 * 
		 * 하나의 클래스에 두개의 메소드
		 * 하나는 pc뽑, 하나는 사용자,pc 숫자 받음
		 * 메인에는 사용자 입력
		 * 
		 * a에던지고 a에 반복문돌리고 피씨봅고 이거를 b에
		 */

		Scanner s = new Scanner(System.in);
		int input;
		int user_arr[] = new int[5];
		int d1 = 0;
		do {
			System.out.println("1~46 번 사이의 숫자를 입력해주세요.");
			input = s.nextInt();

			user_arr[d1] = input;

			d1++;
		}while(d1<5);
		s.close();
		card c  = new card();
		c.acard(user_arr);
		c = null;
	}

}

class card{
	public void acard(int user1[]) {	//Pc(5)

		int d = 0;
		int pc_arr[] = new int[5];
		do {
			pc_arr[d] = (int)(Math.random()*46)+1;
			d++;
		}while(d<5);
		card.bcard(user1,pc_arr);
	}
	public static void bcard(int user[], int pc[]) {	//사용자(5), Pc(5) 출력

		System.out.println(Arrays.toString(user));
		System.out.println(Arrays.toString(pc));
	}
}