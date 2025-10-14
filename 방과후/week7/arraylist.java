package 방과후.week7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> ListStudent = new ArrayList();
        System.out.println("=== 학생 관리 프로그램 ===");
        System.out.println("1. 추가 | 2. 수정 | 3. 삭제 | 4. 조회 | 5. 검색 | 6. 개수 | 7. 종료");

        while (true) {
            System.out.print("선택: ");
            int cmd = sc.nextInt();
            if (cmd == 1) {
                System.out.print("이름 입력: ");
                sc.nextLine();
                ListStudent.add(sc.nextLine());
                System.out.println("=> 추가완료!");
            }else if (cmd == 2) {
                System.out.print("수정할 인덱스: ");
                int idx = sc.nextInt();
                System.out.print("새 이름: ");
                sc.nextLine();
                ListStudent.set(idx, sc.nextLine());
                System.out.println("=> 수정 완료!");
            }else if (cmd == 3) {
                System.out.print("삭제할 학생: ");
                String name = sc.nextLine();
                ListStudent.remove(name);
                System.out.println("=> 삭제 완료!");
            }else if (cmd == 4) {
                System.out.println(ListStudent.toString());
            }else if (cmd == 5) {
                System.out.print("검색할 이름: ");
                sc.nextLine();
                System.out.println("=> 인덱스: " + ListStudent.indexOf(sc.nextLine()));
            }else if (cmd == 6) {
                System.out.println("총 학생 : " + ListStudent.size());
            }else if (cmd == 7) {
                System.out.println("프로그램 종료");
                break;
            }
        }


    }
}
