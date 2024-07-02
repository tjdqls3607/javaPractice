package H;

import java.util.Scanner;

public class memo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석| 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo ==1) {
				System.out.println("1.학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			}else if(selectNo ==2) {
				//작성위치
				for(int i=0; i<studentNum; i++) {
					System.out.print("scores[" + i + "]: ");
					int score = Integer.parseInt(scanner.nextLine());
					scores[i] = score;
				}
				
			}else if(selectNo ==3) {
				//작성위치
				for(int i=0; i<studentNum; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			}else if(selectNo ==4) {
				//작성위치
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				for(int i=0; i<studentNum; i++) {
					sum += scores[i];
					if(scores[i]>max) {
						max = scores[i];
					}
				}
				avg = (double) sum/studentNum;
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + avg);
			}else if(selectNo ==5) {
				run = false;
				//작성위치
				
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
