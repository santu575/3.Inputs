import java.util.Scanner;

public class exercise28 {
    public static void inputThenPrintSumAndAverage () {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while(sc.hasNextInt()){
            sum += sc.nextInt();
            count ++;
        }
        sc.close();
        System.out.println("SUM = "+sum+" AVG = "+Math.round((double)sum/count));
    }
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
