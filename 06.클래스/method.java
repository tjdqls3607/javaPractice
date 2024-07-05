package H;

public class method {
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    public static void main(String[] args) {
        method  myCar = new method();
        myCar.speed = 60;
        myCar.run();
    }
}
