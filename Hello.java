package H;

import java.io.IOException;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println("선택> ");
		
		
		String selectStr = scanner.next();
		
		switch(Integer.parseInt(selectStr)) {
		case 1:
			System.out.println("예금액> ");
			balance += Integer.parseInt(scanner.next());
			break;
		
		case 2:
			System.out.println("출금액> ");
			balance -= Integer.parseInt(scanner.next());
			break;
			
		case 3:
			System.out.println("잔고> " + balance);
			break;
		
		case 4:
			run = false;
			break;
		default:
			System.out.println("숫자[1~4]만 입력할 수 있습니다.");
			System.out.println("다시 입력해 주세요.");
			}
		System.out.println();
		
		}
	System.out.println("프로그램 종료");
	}
	
}
