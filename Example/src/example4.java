import java.util.Arrays;
import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		/*
		 * 배열생성하지 않고 + 기본(클래스)메소드 문제
		 * 사용자가 다음 질문에 값을 입력
		 * "학급 학생 이름을 입력해주세요." (5번 질문)
		 * 무조건 총 데이터는 5개가 생성되어짐
		 * 별도의 메소드에서 해당 사용자가 입력한 값을 리스트로 구성하여 출력
		 * 예시) 사용자가 입력한 형태 :  hong kim park lee jang
		 * 
		 * 결과) hong kim park lee jang
		 */
		
		Scanner s = new Scanner(System.in);
		
		String lists = "";
		int f;
		for(f=0;f<=4;f++) {
			System.out.println("학급 학생 이름을 입력해주세요.");
			String u = s.next();
			lists += (u+" ");
		}
		student(lists);
		s.close();
		
		
	}
	
	public static void student(String n) {
		//String a[] = new String[5]; 여기에 넣으면 계속 초기화됨...null,null,null...
//
//		String a[] = new String[5];
//		a[i] = n;
//		
//		String memory = n;
//
//		System.out.println(n+" "+i);
//		if(i==4) {			
//			System.out.println(Arrays.toString(a));
//		}
		//System.out.println(n);
		//n = n.trim();
		String userin[] = n.split(" ");	//split : 문자열 또는 숫자열을 특정문자 기준으로 배열을 만들 수 있는 명령어
		System.out.println(Arrays.toString(userin));
	}

}
