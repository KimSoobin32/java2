
public class Switch_loop {

	public static void main(String[] args) {
		String sign = "*";
		int total;
		/* case 안에 각각의 반복문을 사용 가능
		 * 또한 동일한 변수명을 사용 가능하며,
		 * case 각각 다르게 작동하기 때문에 문제가 되는 사항 없음
		 * 단, case는 하나의 조건이 맞을 경우 나머지 case는 절대 작동하지 않음
		 */
		switch(sign) {
		case "+" -> {
			int f;
			total = 0;
			for(f=1;f<=5;f++) {
				total = total + f;
			}
			System.out.println("총 1~5까지 계산된 값은 "+total);
		}
		case "-" -> {
			total = 0;
			System.out.println("음수값은 출력되지 않습니다.");
		}	
		case "*" -> {
			total = 1;
			int d = 1;	//f 써도 됨 변수이름
			do {
				total = total * d;
				d++;
			}while(d<=5);
			System.out.println("총 1~5까지 계산된 값은 "+total);
		}
		case "/" -> {
			total = 0;
		}

		}
		// System.out.println("총 1~5까지 계산된 값은 "+total); 다음과 같이 밑에쓰면 switch case는 먼저 끝나서 for가 작동 안돼서 total 인식 못함
		//또는 int total = 0(6라인에)으로 미리 값 넣으면 sysout밖에 빼도 됨  -> 초기값 매번 바꿔줘서 효율적이진 않음

	}

}
