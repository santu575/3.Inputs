import java.util.Scanner;

public class ReadingInput_challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter your 5 numbers - ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the "+i+"th number");
            int num = sc.nextInt();
            sum = num + sum;
        }
        System.out.println("The sum of all numbers is "+sum);
        sc.close();
    }
}
