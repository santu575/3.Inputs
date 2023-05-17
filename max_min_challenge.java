import java.util.Scanner;

public class max_min_challenge {
    public static void main(String[] args) {
        double min = 0;
        double max = 0;
        int loopcount = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number, or any character to exit:");
            String nextentry = sc.nextLine();
            try {
                double validnumber = Double.parseDouble(nextentry);
                if(loopcount == 0 || validnumber < min){
                    min = validnumber;
                }
                if(loopcount == 0|| validnumber > max){
                    max = validnumber;
                }
                loopcount ++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        if(loopcount > 0){
            System.out.println("min = "+min+"max = "+max);
        }else{
            System.out.println("no validnumber enetered");
        }
        sc.close();
    }
}
