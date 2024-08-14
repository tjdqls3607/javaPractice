import java.util.*;

public class MapExam{
    public Map<String, Integer> makeMap(){
        Map<String, Integer> products = new HashMap<>();
        //상품의 이름과 값을 products에 추가해 보세요.
        products.put("가위", 2500);
        products.put("크레파스", 5000);
        
        return products;
    }
    
    public static void main(String[] args){
        MapExam ME = new MapExam();
        System.out.println("가위의 가격은" + ME.makeMap().get("가위") + "입니다.");
        System.out.println("크레파스의 가격은" + ME.makeMap().get("크레파스") + "입니다.");
    }
}
