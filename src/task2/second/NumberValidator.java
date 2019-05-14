package task2.second;

public class NumberValidator {

    public static boolean isOneDigit(int number){

        return number<10;
    }

    public static boolean isPalindrome(int number){
        int direct=number;
        int reverse=0;
        while(direct!=0){
            int remainder=direct%10;
            reverse=reverse*10+remainder;
            direct/=10;
        }
        return direct==reverse;
    }

    public static boolean isPrime(int number){
        if (number>=2) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
