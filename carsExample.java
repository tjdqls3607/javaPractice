package H;

public class carsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cars car1 = new cars();
		System.out.println("car1.company: " + car1.company);
		System.out.println();
		
		cars car2 = new cars("자가용");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println();
		
		cars car3 = new cars("자가용", "빨강");
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println();
		
		cars car4 = new cars("택시", "검정", 200);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " +car4.color);
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
	}

}
