package 방과후.week4.과제;

public class 과제3 {
    public static void main(String[] args) {
        Student s1 = new Student("준석", 85);

        s1.setScore(95);

        s1.setScore(150);
    }
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        setScore(score);
    }

    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
            System.out.println(score);
        } else {
            System.out.println("잘못된 점수");
        }
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
