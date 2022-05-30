
public class Double_loop3 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 다음 결과값이 출력되도록 for문으로 작성
		 * 5+2=7
		 * 5+3=8
		 * 5+4=9
		 * 5+5=10
		 * 6+2=8
		 * 6+3=9
		 * 6+4=10
		 * 6+5=11
		 * ...
		 * 9+5=14
		 */
		
		int a, aa, tot;
		for(a=5;a<=9;a++) {
			for(aa=2;aa<=5;aa++) {
				tot = a + aa;
//				System.out.println(a + "+" + aa + "=" + tot);
			}
		}
		
		/*
		 * 응용문제 더블 while문으로 제작
		 * 9*7=63
		 * 9*6=54
		 * 9*5=45
		 * 8*7=56
		 * 8*6=42
		 * 8*5=40
		 * 7*7=49
		 * 7*6=42
		 * 7*5=35
		 */
		int b = 9;
		int g;
		while(b>=7) {
			int bb = 7;
			
			while(bb>=5) {
				g = b * bb;
//				System.out.println(b+"*"+bb+"="+g);
				bb--;
			}
			
			b--;
		}
		
		/*
		 * 응용문제 다음 결과값을 보고 do while문으로 제작
		 * 5+4=9
		 * 5+5=10
		 * 5+6=11
		 * 5+7=12
		 * 4+4=8
		 * 4+5=9
		 * 4+6=10
		 * 4+7=11
		 * ...
		 * 3+7=10
		 */
		int c = 5;
		do {
			int cc = 4;
			do {
				System.out.println(c+"+"+cc+"="+(c+cc));
				cc++;
			}while(cc<=7);
			
			
			c--;
		}while(c>=3);
		

	}

}
