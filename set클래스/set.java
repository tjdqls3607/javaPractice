// 참고: set의 내용은 for each문 또는 Iterator를 활용해서 출력할 수 있습니다.
  import java.util.*;

public class SetExam{
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("a");
        set.add("b");
        
        System.out.println("set의 내용을 출력합니다.");
        for(String str : set){
            System.out.println(str);
        }
    }
}
