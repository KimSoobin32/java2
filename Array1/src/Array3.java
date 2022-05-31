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
//		Scanner s = new Scanner(System.in);
//		String m[] = {"햄버거", "피자", "치킨", "커피"};
//		String[] ms = new String[4];
//		String a;
//		
//		int ct = 0;
//		for(String f : m) {
//			System.out.println("주문하고자 하는 음식을 선택해주세요.");
//			a = s.next();
//			
//			if(a.equals("주문종료")) {
//				break;
//			} else {
//				ms[ct] = a;
//				ct++;
//			}
//		}
//		System.out.println(Arrays.toString(ms));
//		s.close();
		
		//스캐너 쓰면 반복 돌아가지 않고 멈추기 때문에(입력 기다리느라) 따로 반복 돌려서 데이터 검사해야함 주의
		String menus[] = {"햄버거", "피자", "치킨", "커피"};
		Scanner sc = new Scanner(System.in);
		String user;
		String user_menu[] = new String[4];
		int ct = 0;
//		for(String f : menus) {	//배열의 자료형과 일치해야함 주의
//			/*
//			 * Scanner가 반복문 안에 적용 시 loop로 무조건 반복하지는 않음
//			 * 사용자가 입력할 때마다 반복문 범위만큼 출력하는 형태임
//			 */
//			System.out.println("주문하고자 하는 음식을 선택해주세요.");
//			user = sc.next();
//			if(user.equals("주문종료")) {
//				break;
//			} else {
//				for(String ff : menus) {	//!!
//					if(user.equals(ff)) {
//						user_menu[ct] = ff;
//						ct++;
//					}
//				}
//			}
//		}
		//do while문으로 바꿔보기
		int d = 0;
		int ml = menus.length;
		do {
			System.out.println("주문하고자 하는 음식을 선택해주세요.");
			user = sc.next();
			if(user.equals("주문완료")) {
				break;
			}else {
				int dd = 0;
				do {
					if(user.equals(menus[dd])) {						
						user_menu[ct] = menus[dd];
						//user_menu[ct] = user;
						ct++;
					}
					dd++;
				}while(dd<ml);
			}
			d++;
		}while(d<ml);
		
		
		sc.close();
		System.out.println("주문하신 메뉴는 다음과 같습니다. "+Arrays.toString(user_menu));
		
		
		/*
		 * 응용문제
		 * 배열(Array)
		 * 사용자가 장바구니에 내용을 결제하게됩니다.
		 * 단, 해당 금액 리스트를 출력하지 말고, 최종 전체 결제 금액만 출력
		 * 
		 * 1500 22000 13000 14500 113800 45000
		 */
//		int p[] = {1500,22000,13000,14500,113800,45000};
//		int h = 0;
//		for(int i : p) {
//			h = h + i;
//		}
//		System.out.println(h);
		
		
	}

}
