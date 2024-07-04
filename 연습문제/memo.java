package H;

public class memo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		//for 문을 이용해서 주어진 배열의 항목에서 최대값 구하기
		//작성
		for (int i=0; i<array.length; i++) {
			max = array[i] > max ? array[i] : max; 	
		}
		System.out.println("max:" + max);
	}
}
