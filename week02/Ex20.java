package week02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    아이디 비밀번호 찾기
 */
public class Ex20 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("spring", "1234");
        map.put("summer", "5678");
        map.put("fall", "a1234");
        map.put("winter", "a5678");

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("아이디와 비밀번호를 입력하세요!!");
            System.out.print("아이디: ");
            String id = scanner.nextLine();
            System.out.print("비밀번호: ");
            String pw = scanner.nextLine();
            if (map.containsKey(id)){
                if (map.get(id).equals(pw)){
                    System.out.println("로그인에 성공하였습니다.");
                    break;
                }else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }
            }else {
                System.out.println("아이디가 존재하지 않습니다.");
            }

        }
    }
}
