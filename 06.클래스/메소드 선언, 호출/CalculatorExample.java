package H;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("rewult1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x,y);
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();

	}

}
