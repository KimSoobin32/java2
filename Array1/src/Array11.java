import java.util.Arrays;

public class Array11 {

	public static void main(String[] args) {
		/*
		 * 웅용문제
		 * 다음 배열값이 있습니다. 해당 배열값을 비교하여
		 * 사용자 정보를 출력
		 * Adata = hong kim park jang lee soun
		 * Bdata = 80 100 46 38 65 88
		 * 
		 * 결과 배열에 따른 조건은 60점 이상(포함) 중 합격자만 출력
		 * 결과배열[hong, kim, lee, soun]
		 */
		//풀이는 금요일날..
		String a[] = {"hong", "kim", "park", "jang", "lee", "soun"};
		int b[] = {80, 100, 46, 38, 65, 88};
		String na[] = new String[6];
		int w = 0;
		int wl = a.length;
		int ct = 0;
		while(w<wl) {
			if(b[w]>=60) {
				na[ct] = a[w];
				ct++;
			}
			w++;
		};
		System.out.println(Arrays.toString(na));

	}

}
