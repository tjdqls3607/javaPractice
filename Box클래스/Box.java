public class Box {
    // 멤버 변수 obj: 객체를 저장하기 위한 변수
    private Object obj;

    // 메서드 setObj: 외부에서 객체를 전달받아 멤버 변수 obj에 저장
    public void setObj(Object obj) {
        this.obj = obj;
    }

    // 메서드 getObj: 멤버 변수 obj에 저장된 객체를 반환
    public Object getObj() {
        return obj;
    }
}
