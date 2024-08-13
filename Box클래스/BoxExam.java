public class BoxExam {
    public static void main(String[] args) {
        // Box 객체 생성
        Box box = new Box();

        // Box 객체에 Object 타입 객체를 저장
        box.setObj(new Object());

        // Box 객체에서 Object 타입 객체를 가져옴
        Object obj = box.getObj();

        // Box 객체에 String 타입 객체를 저장
        box.setObj("hello");

        // Box 객체에서 String 타입 객체를 가져오고, String 타입으로 캐스팅
        String str = (String) box.getObj();

        // String 객체 출력
        System.out.println(str);

        // Box 객체에 Integer 값을 저장 (자동 박싱)
        box.setObj(1);

        // Box 객체에서 Integer 값을 가져오고, int 타입으로 캐스팅 (자동 언박싱)
        int value = (int) box.getObj();

        // 정수 값 출력
        System.out.println(value);
    }
}
