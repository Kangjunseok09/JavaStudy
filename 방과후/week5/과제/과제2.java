package 방과후.week5.과제;
import java.util.Scanner;
public class 과제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("플레이어 이름을 입력하세요: ");
        String name = sc.nextLine();
        Player player = new Player(name);

        final int potionPrice = 50;

        while (true) {
            System.out.println("\n=== 포션 상점 ===");
            System.out.println("현재 골드: " + player.getGold());
            System.out.println("포션 가격: " + potionPrice);
            System.out.print("구매하시겠습니까? (yes/no) > ");
            String input = sc.nextLine().trim().toLowerCase();

            if (input.equals("yes")) {
                try {
                    player.buyPotion(potionPrice);
                } catch (NotEnoughGoldException e) {
                    System.out.println("구매 실패: " + e.getMessage());
                }
                System.out.println("남은 골드: " + player.getGold());
            } else if (input.equals("no")) {
                System.out.println("상점을 종료합니다. 👋");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. (yes/no만 입력해주세요)");
            }
        }

        sc.close();
    }
}

class NotEnoughGoldException extends Exception {
    public NotEnoughGoldException(String message) {
        super(message);
    }
}

class Player {
    private String name;
    private int gold;

    public Player(String name) {
        this.name = name;
        this.gold = 100;
    }

    public int getGold() {
        return gold;
    }

    public void buyPotion(int price) throws NotEnoughGoldException {
        if (gold < price) {
            throw new NotEnoughGoldException("골드가 부족합니다!");
        }
        gold -= price;
        System.out.println("포션을 구매했습니다!");
    }
}