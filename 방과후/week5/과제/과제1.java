package 방과후.week5.과제;
import java.util.concurrent.ThreadLocalRandom;

public class 과제1 {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("피카츄");
        Pokemon p2 = new Pokemon("파이리");

        while (!p1.isFainted() && !p2.isFainted()) {
            p1.move();
            p1.attack(p2);
            if (p2.isFainted()) break;

            p2.move();
            p2.attack(p1);
            if (p1.isFainted()) break;

            System.out.println("[현재 체력] " + p1.getName() + ": " + p1.getHp()
                    + " / " + p2.getName() + ": " + p2.getHp());
            System.out.println("-------------------------");
        }


        if (p1.isFainted() && p2.isFainted()) {
            System.out.println("무승부!");
        } else if (p2.isFainted()) {
            System.out.println("🏆 " + p1.getName() + " 승리!");
        } else if (p1.isFainted()) {
            System.out.println("🏆 " + p2.getName() + " 승리!");
        }
    }
}


interface Movable {
    void move();
}

interface Attackable {
    void attack(Pokemon target);
}

class Pokemon implements Movable, Attackable {
    private final String name;
    private int hp;

    public Pokemon(String name) {
        this.name = name;
        this.hp = 100;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public boolean isFainted() {
        return hp <= 0;
    }

    @Override
    public void move() {
        System.out.println("포켓몬 " + name + "이(가) 뛰어다닌다! 🏃");
    }

    @Override
    public void attack(Pokemon target) {
        int damage = ThreadLocalRandom.current().nextInt(10, 31);
        target.hp = Math.max(0, target.hp - damage);

        System.out.println("⚡ 포켓몬 " + name + "이(가) " + target.name + "을(를) 공격했다! (" + damage + " 데미지)");

        if (target.isFainted()) {
            System.out.println("💀 " + target.name + "이(가) 쓰러졌다!");
        }
    }
}

