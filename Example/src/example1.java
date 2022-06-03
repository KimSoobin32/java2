
public class example1 {

	public static void main(String[] args) {
		/*
		 * 배열 + 기본(클래스)메소드문제 (example1 class안에 메소드)
		 * 1차배열에 다음과 같이 값이 있다.
		 * 배열 리스트는 22,33,44,55,66,77,88,99 이며
		 * 해당 전체 값을 모두 더한 총합계값을 별도의 메소드로 처리되도록 함
		 * 단, 반복문은 do while로 작성
		 */
		int[] a = {22,33,44,55,66,77,88,99};
		//void = 객체 생성 + 인스턴스(메모리 등록)
		//static이면 이미 메모리 올라감, 그냥 plus();
		example1 ex = new example1();
		ex.plus(a);
		ex = null;

	}
	
	public void plus(int arr[]) {	//매개변수와 넘겨지는 배열이름 같지 않도록 하자, 나중에 혼돈올 수 있음
		//System.out.println("test");
		int d = 0;
		int al = arr.length;
		int h = 0;
		do {
			h = h + arr[d];
			d++;
		}while(d<al);
		System.out.println(h);
	}

}
