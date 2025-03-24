package cond.ex;

public class GradeSwitchEx {
    public static void main(String[] args) {
        String grade = "B";

        switch (grade) {
            case "A":
                System.out.println(grade + " 탁월한 성과입니다");
                break;
            case "B":
                System.out.println(grade + " 좋은 성과입니다");
                break;
            case "C":
                System.out.println(grade + " 준수한 성과입니다");
                break;
            case "D":
                System.out.println(grade + " 향상이 필요 합니다");
                break;
            case "F":
                System.out.println(grade + " 불합격 입니다");
                break;
            default:
                System.out.println("잘못된 학점입니다");
        }
    }
}
