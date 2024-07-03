package H;

public class cars {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	cars(){	
	}
	
	cars(String model) {
		this(model, "은색", 250);
	}
	
	cars(String model, String color) {
		this(model, color, 250);
	}
	
	cars(String model, String color, int maxSpeed){
	this.model = model;
	this.color = color;
	this.maxSpeed = maxSpeed;
	}
}
