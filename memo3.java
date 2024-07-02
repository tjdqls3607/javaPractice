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
				studentNum = Integer.parseInt(scanner.nextLine());	//학생수는 정수형 입력 변수를 받아서 입력해야함
				scores = new int[studentNum];		//scores라는 배열을 생성 배열의 갯수는 studentNum에게 영향을 받음 예를들어 studentNum 이 3이면 scores배열엔 3개의 배열이 들어감
			}else if(selectNo ==2) {
				for(int i=0; i<studentNum; i++) {	//i를 studentNum만큼 반복 여기서 i는 점수입력으로 예상					System.out.print("scores[" + i + "]: "); 
					int score = Integer.parseInt(scanner.nextLine());	//점수를 입력받는 입력변수사용
					scores[i] = score;	//입력받은 점수는 scores[i]에 학생수만큼 저장
				}
			}else if(selectNo ==3) {
				for(int i=0; i<studentNum; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]); //score[i]에 저장되어있던 점수를 보여줌
				}
			}else if(selectNo ==4) {
				int max = 0; 	//최고점수 변수지정
				int sum = 0;	//평균점수를 구하기 위한 합계점수 변수지정
				double avg = 0.0;	//평균점수 변수 지정
				for(int i=0; i<studentNum; i++) {	//학생수 만큼 i를 반복함
					sum += scores[i];				//scores배열에 있던 점수들을 +=더하여 대입
					if(scores[i]>max) {				//만약 scores[i]가 최고점수보다 크면
						max = scores[i];			//최고점수는 scores[i]
					}
				}
				avg = (double) sum/studentNum;		//평균점수는 총합계 점수 나누기 학생수 타입은 실수(double)
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + avg);
			}else if(selectNo ==5) {
				run = false;
				
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
