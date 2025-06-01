package week01;
/*
    문자열
 */
public class Ex10 {
    public static void main(String[] args) {
        String s = "Good Morning";
        System.out.println("charAt : " + s.charAt(7)); // charAt : r
        System.out.println("startWith : "  + s.startsWith("good")); // startsWith : false
        System.out.println("endsWith : "  + s.endsWith("good")); // endsWith : false
        System.out.println("equals : " + s.equals("good morning")); // equals : false

        System.out.println("indexOf : " + s.indexOf("Mor")); // indexOf : 5
        System.out.println("indexOf : " + s.indexOf("n"));  // indexOf : 8
        System.out.println("lastIndexOf : " + s.lastIndexOf("n"));  // lastIndexOf : 10 뒤에꺼 먼저

        System.out.println("length : " + s.length());   // length : 12

        System.out.println("replace : " + s.replace("Good", "a"));  // replace : a Morning
        System.out.println("replace : " + s.replace("o", "a"));     // replace : Gaad Marning
        System.out.println("replace : " + s.replace("[Good]", "a"));// replace : Good Morning 바뀌지 않음
        System.out.println("replaceFirst : " + s.replaceFirst("o", "a")); // replace : Gaod Morning

        System.out.println("replaceAll : " + s.replaceAll("Good", "a"));
        System.out.println("replaceAll : " + s.replaceAll("[Good]", "a"));
        System.out.println("replaceAll : " + s.replaceAll("[^G]", "a"));
        System.out.println("replaceAll : " + s.replaceAll("^[G]", "a"));
        System.out.println("replaceAll : " + s.replaceAll("[G]$", "a"));

    }
}
