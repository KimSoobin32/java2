import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int data[] = {5, 10, 15, 20, 25, 30, 35};
		/*
		 * for each문은 인텍스 번호가 필요없이 사용할 경우 사용
		 * for~do while문은 인덱스 번호가 필요할 때 사용
		 * 
		 * [0][1][2] : 인덱스 번호
		 */
		for(int f : data) {	//int가 밖에 있으면 안됨, int f가 순차적으로 data배열값을 받아서 저장시킴
			if(f%2==0) {				
				System.out.println(f);
			}
		}
		
//		String pay[] = {"무통장입금", "신용카드", "휴대폰", "상품권", "쿠폰"};
//		Scanner sc = new Scanner(System.in);
//		System.out.println("결제하고자하는 형태를 선택해주세요.");
//		String pm = sc.next();
//		for(String z : pay) {	//배열데이터가 문자이므로 받는 변수형태또한 문자형을 사용해야함!
//			if(pm.equals(z)) {
//				if(z.equals("휴대폰")) {
//					System.out.println("현재 시스템 점검으로 해당 결제는 사용하실 수 없습니다.");
//					
//				}else {
//					System.out.println(pm+"(으)로 결제 진행됩니다.");
//				}
//				//System.out.println(pm+"(으)로 결제 진행됩니다.");
//			}
//		}
//		sc.close();
		
		/*
		 * 응용문제
		 * {"햄버거", "피자", "치킨", "커피"}
		 * "주문하고자 하는 음식을 선택해주세요."
		 * 해당 질문은 총 4번을 물어보게됩니다.
		 * 단, "주문종료"라고 사용자가 입력 시 그 즉시 주문은 종료되며, 주문내역을 출력
		 */
		Scanner s = new Scanner(System.in);
		String m[] = {"햄버거", "피자", "치킨", "커피"};
		String[] ms = new String[4];
		String a;
		
		int ct = 0;
//		String li = "";
		for(String f : m) {
			System.out.println("주문하고자 하는 음식을 선택해주세요.");
			a = s.next();
//			if(a.equals("주문종료")) {
//				break;
//			} else {			
//				li = li + a;
//			}
			if(a.equals("주문종료")) {
				break;
			} else {
				ms[ct] = f;
				ct++;
			}
		}
		System.out.println(Arrays.toString(ms));
		
//		Scanner s = new Scanner(System.in);
//		String m[] = {"햄버거", "피자", "치킨", "커피"};
//		String a;
//		
//		String li = "";
//		for(String f : m) {
//			System.out.println("주문하고자 하는 음식을 선택해주세요.");
//			a = s.next();
//			if(a.equals("주문종료")) {
//				break;
//			} else {			
//				li = li + a;
//			}
//
//		}		
//		System.out.println(li);
		s.close();
		
		/*
		 * 응용문제
		 * 배열(Array)
		 * 사용자가 장바구네에 내용을 결제하게됩니다.
		 * 단, 해당 금액 리스트를 출력하지 말고, 최종 전체 결제 금액만 출력
		 * 
		 * 1500 22000 13000 14500 113800 45000
		 */
		
	}

}
