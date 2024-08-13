import java.util.Random;

public class MathExam{
    public static void main(String[] args){
        double value4 = Math.random();
        double value5 = Math.sqrt(121);
        System.out.println("2의 10승 = " + Math.pow(2, 10));
        System.out.println("16의 1/2승 = : " + Math.pow(16, 0.5));
        System.out.println("log200 = " + Math.log10(200));
        System.out.println("둘 중에 작은 수 = " + Math.min(1000000,30));
        System.out.println("둘 중에 큰 수 = " + Math.max(1000000,30));
        System.out.println("주어진 수의 절댓값 = " + Math.abs(-498729));
        System.out.println("0이상 1.0 미만 랜덤한 실수값 = " + value4);
        System.out.println("주어진 값의 제곱근 = " + value5);
    }
}
