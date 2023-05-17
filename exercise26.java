public class exercise26 {
    public static int getLargestPrime(int number){
        if(number < 2){
            return -1;
        }
        for(int i = number - 1; i >= 2; i--){
            if(number % i == 0){
                number = i;
            }
        }
        return number;
    }
    // another method;
    public static int getLargestPrime1(int number) {
        if (number < 2) {
            return -1;
        }
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                number /= i;
                i--;
            }
        }
        return number;
    }
    public static void main(String[] args) {
        System.out.println(getLargestPrime1(28));
    }
}
