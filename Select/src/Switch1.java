
public class Switch1 {

	public static void main(String[] args) {
		/*
		 * switch~case : 선택문
		 * 입력된 값 기준으로 case가 발동하여 출력값을 선택하게 됨
		 * default는 case에 내용 중 같은 내용이 존재하지 않을 경우 작동되는 문법
		 * switch(인자값)
		 * 10개 이상 넘어가면 속도 느려짐 (if가 더 빠름)
		 * 결과값이 많지 않을 경우에만 사용
		 */
		int n = 3;
		switch(n) {
		case 1:
			System.out.println("옵션 1을 선택하셨습니다.");
		break;	//필수
		case 2:
			System.out.println("옵션 2을 선택하셨습니다.");
		break;
		case 3:
			System.out.println("옵션 3을 선택하셨습니다.");
		break;
		default:	//case에 없는 내용
			System.out.println("선택한 값이 없습니다.");
		break;
		}
		
		String user = "이 순신";	//문자로 switch문에 인자값 전달
		switch(user) {	//복합 case 형태
		case "이순신":
		case "이 순신":
		case "leesunsin":
			System.out.println("A조 입니다.");
		break;
		case "홍길동":
			System.out.println("B조 입니다.");
		break;
		case "유관순":
			System.out.println("C조 입니다.");
		break;
		default:
			System.out.println("나머지는 D조 입니다.");
		break;
		}

	}

}
