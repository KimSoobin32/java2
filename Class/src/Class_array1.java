
import java.util.Scanner;

public class Class_array1 {

	public static void main(String[] args) {
		//클래스 + 메소드 + 배열
		String users[] = {"홍길동", "이순신", "김유신"};
		//arrays.lists(users);
		
		/*
		 * 응용문제 사용자가 자신의 이름을 입력
		 * 사용자 이름을 해당 class로 보내서 등록된 사용자인지
		 * 미가입 사용자인지를 확인하는 코드를 작성
		 * 등록된 사용자일 경우 "가입이 되어있습니다."라고 출력하고
		 * 확인이 되지 않을 경우 "미가입자입니다."라고 출력
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("사용자 성함을 입력해 주시길 바랍니다.");
		String name = s.next();
		arrays.lists(users, name);
		s.close();
	}
	

}

class arrays{
//	public arrays() {
//		arrays ar = new arrays();
//	}
	public static void lists(String a[], String n) {
		//System.out.println(Arrays.toString(a));
		String[] arr = a;
		String msg = "";	//메소드로 해당 값을 전달할 때는 비어있는 값을 명확하게 적용해야 함
		//String "" or null, int 0으로 표현
		boolean ck = false;
		int f = 0;
		int al = arr.length;
		while(f<al) {
			if(n.equals(arr[f])) {
				msg = ("가입이 되어있습니다.");
				ck = true;
			}
			f++;
		}
		if(ck==false) {
			msg = "미가입자입니다.";
		}
		arrays ar = new arrays();
		ar.message(msg);	//msg 변수 이미 대기하고 있기 때문에 초기값 지정해줘야 함
//		arrays ar = null;
	}
	public void message(String m) {
		System.out.println(m);
	}
}