package task2.third;

public class NumberValidator {

    public static boolean isPerfect(int number){
        int sumDivisors=0;
        for(int i=1; i<number; i++){
            if(number%i==0){
                sumDivisors+=i;
            }
        }
        return (sumDivisors==number);
    }
}
