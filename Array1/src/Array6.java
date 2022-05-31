import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		/*
		 * 응용문제 다음 중 장바구네이 여러개의 상품이 담겨져있음
		 * 그 중 택배비가 별도로 측정되는 금액만 추출
		 * 택배비 30000원 이상(포함)
		 * 15000 48000 67000 8000 118200 49800 6000 18700
		 * 
		 * [48000,67000,118200,49800]
		 */
		int a[] = {15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700};
		int b[] = new int[8];	//[null,null,null,null,null,null,null,null]
		int w = 0;
		int ct = 0;
		while(w<a.length) {
			if(a[w]>=30000) {
				b[ct] = a[w];
				ct++;	//조건 맞을 때만 인덱스 증가
			}
			w++;
		}
		System.out.println(Arrays.toString(b));

	}

}
