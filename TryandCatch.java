public class TryandCatch {
    public static void main(String[] args) {
        try {
            int [] mynumbers  = {1, 3, 45, 24};
            System.out.println(mynumbers[1254]);
        } catch (Exception e) {
            System.out.println("There is an error!");
        }
    }
}
