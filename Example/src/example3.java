public class example3 {

	public static void main(String[] args) {
		/*
		 * 배열 + 기본(클래스)메소드 문제
		 * product  : "수박","참외","사과","배","딸기","키위","바나나","망고"
		 * moneys : 35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900
		 * 장바구니에 해당 상품을 모두 담았다.
		 * 단, 그중 사과와 바나나는 제외하고 총 결제 금액 출력, 결과 : 75600
		 */
		String product[] = {"수박","참외","사과","배","딸기","키위","바나나","망고"};
		int moneys[] = {35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900};
		example3 ex3 = new example3();
		ex3.basket2(product, moneys);
		ex3 = null;
	}
	
	public void basket2(String p[], int m[]) {
		//System.out.println("test");
		int pl = p.length;
		int d = 0;
		int h = 0;
		do {
			if(!p[d].equals("사과") && !p[d].equals("바나나")) {
				 h = h + m[d];
			}
			d++;
		}while(d<pl);
		System.out.println(h);
	}

}
