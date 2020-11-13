public class FizzBuzz {


    public static String fizzBuzz(int number) {
        int fizz = number % 3;
        int buzz = number % 5;
        if (fizz == 0&& buzz == 0)
            return "FizzBuzz";

        if (fizz == 0)
            return "Fizz";

        if (buzz == 0)
            return "Buzz";

        return number + "";
    }
}
