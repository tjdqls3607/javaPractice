import java.util.*;

public class ListExam {

    // 두 배열을 받아서 하나의 List로 합쳐 반환하는 메서드
    public List<String> addArray(String[] arr1, String[] arr2) {
        // String 타입을 저장할 수 있는 ArrayList 생성
        List<String> list = new ArrayList<String>();

        // 첫 번째 배열의 모든 요소를 리스트에 추가
        for (String str : arr1) {
            list.add(str);     
        }

        // 두 번째 배열의 모든 요소를 리스트에 추가
        for (String str : arr2) {
            list.add(str);
        }

        // 합쳐진 리스트 반환
        return list;
    }

    public static void main(String[] args) {
        // ListExam 클래스의 인스턴스를 생성
        ListExam LE = new ListExam();

        // 첫 번째 배열 생성 및 초기화
        String[] arr1 = {"임", "의"};

        // 두 번째 배열 생성 및 초기화
        String[] arr2 = {"의", "리", "스", "트"};

        // 두 배열을 합쳐서 리스트로 반환받음
        List<String> list = LE.addArray(arr1, arr2);

        // 리스트의 크기(원소의 개수)를 출력
        System.out.println("List의 원소의 수는 " + list.size() + " 개 입니다.");

        // 리스트의 각 원소를 출력
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List의 " + (i + 1) + "번째 원소는 '" + list.get(i) + "' 입니다.");
        }
    }
}
