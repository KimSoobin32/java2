import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Double_loop1 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("YYYY/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("h/m/s");	//대문자 H는 5->17시
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		//format : 규격화된 형태로 값을 표현할 때 사용하게 됨. (한글 사용도 가능)
		
//		int f;
//		for(f=1;f<=10;f=f+2) {
//			System.out.print(f+" ");
//		}
		
		int money = 10000;
		int coupon = 20;
		double a = coupon * 0.01;
		double b = money * a;
		double c = money - b;	//int c = money - (int)b;
//		System.out.println(a);
//		System.out.println(b);
		System.out.println(c);
		
		/*
		 * 응용문제
		 * 3개의 상품
		 * "바코드로 상품을 입력시켜주세요."금액을 입력하고나서
		 * "할인 %를 입력해주세요."라는 문구와 함께
		 * 해당 할인 숫자를 입력하면
		 * 최종금액이 변경되어 출력
		 */
//		Scanner s = new Scanner(System.in);
//		int p1, p2, p3, d;
//		System.out.println("바코드로 상품을 입력시켜주세요.");
//		p1 = s.nextInt();
//		System.out.println("바코드로 상품을 입력시켜주세요.");
//		p2 = s.nextInt();
//		System.out.println("바코드로 상품을 입력시켜주세요.");
//		p3 = s.nextInt();
//		System.out.println("할인 %를 입력해주세요.");
//		d = s.nextInt();
//		System.out.println(p1 - (p1*(d * 0.01)));
//		System.out.println(p2 - (p2*(d * 0.01)));
//		System.out.println(p3 - (p3*(d * 0.01)));
//		s.close();
		
		int f, ff;
		int total;
		for(f=1;f<=3;f++) {
			//System.out.println(f);
			for(ff=1;ff<=4;ff++) {	//큰반복문 변수를 작은반복문 변수에 넣지 않도록 주의
				total = f + ff;
				System.out.println(f+ " + " +ff +" = "+total);
			}
		}
 
	}

}
