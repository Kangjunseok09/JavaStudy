package 방과후.week4;

public class 접근제어 {
    public static void main(String[] args) {

        student hyungmin = student.vivigo.nongshim();
        student mingil = student.vivigo.nongshim();

        hyungmin.name = "이형민";
        mingil.name = "성민규";

        System.out.println(hyungmin.name);
        System.out.println(mingil.name);
    }
}

class student{

    public static student vivigo = new student();

    String name;
    String major;
    private int score_ds;

    public student nongshim(){

        return vivigo;
    }

    private student(){};

    public void setScore(int score_ds) {
        if(score_ds <= 100 &&  score_ds >= 0 ) this.score_ds = score_ds;
        else System.out.println("에러");

    }
    public int getScore() {
        return this.score_ds;
    }

}
