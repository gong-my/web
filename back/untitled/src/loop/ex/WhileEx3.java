package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int max = 100;

        while (i <= max) {
            sum += i;
            System.out.println("i : " + i +  " sum : " + sum);
            i++;
        }
    }
}