import java.util.*;

public class SetExam{
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");       //set에 값을 넣고 싶으면 add사용
        
        Iterator<String> iter = set.iterator(); //iterater 로직
        //iter를 이용해서 set의 내용을 출력하세요.
        while (iter.hasNext()) {        //꺼낼 것이 있다면 true 리턴
            String str = iter.next();   //next() 메소드는 하나를 꺼내면 자동으로 다음것을 참조
            System.out.println(str);
        }
    }
}
