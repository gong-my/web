package cond.ex;

public class MoveRateEx {
    public static void main(String[] args) {
        double rating = 7.1;

        if (rating >= 9) {
            System.out.println(rating);
            System.out.println("어비웃타임을 추천 합니다");
        } else if (rating >= 8) {
            System.out.println(rating);
            System.out.println("어비웃타임을 추천 합니다");
            System.out.println("토이스토리를 추천 합니다");
        } else if (rating >= 7.1) {
            System.out.println(rating);
            System.out.println("어비웃타임을 추천 합니다");
            System.out.println("토이스토리를 추천 합니다");
        } else {
            System.out.println("어비웃타임을 추천 합니다");
            System.out.println("토이스토리를 추천 합니다");
            System.out.println("고질라를 추천 합니다");
        }
        System.out.println("---------------------------");
        double rating1 = 8;

        if(rating1 <= 9){
            System.out.println("어비웃타임을 추천 합니다");
        }
        if(rating1 <= 8){
            System.out.println("토이스토리을 추천 합니다");
        }
        if(rating1 <= 7){
            System.out.println("고질라을 추천 합니다");
        }

    }
}
