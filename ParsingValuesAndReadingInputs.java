
public class ParsingValuesAndReadingInputs {

    public static void main(String[] args) {
        // int currentyear = 2023;
        // String yourDob = "2004";
        // System.out.println("Age = "+(currentyear + yourDob));
        // // converting String into integer
        // int dob = Integer.parseInt(yourDob);
        // System.out.println("Age = "+ (currentyear - dob));
        System.out.println(getinput(2023    ));
    }
    public static String getinput(int currentyear){
        String name = System.console().readLine("Hi, What's your name?");
        System.out.println("hi "+ name + " Thanks for texting");
        String dateofbirth = System.console().readLine("What year were you born?");
        int age = currentyear - Integer.parseInt(dateofbirth);
        return "well, your age is " + age;
    }
}