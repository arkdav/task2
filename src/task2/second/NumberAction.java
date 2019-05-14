package task2.second;

public class NumberAction {

    public static int highestDigit(int number){
        int maxDigit=0;
        int digit;
        if (NumberValidator.isOneDigit(number)){
            maxDigit=number;
        }
        else{
            while(number>0){
                digit=number%10;
                if(digit>maxDigit) {
                    maxDigit=digit;
                }
                number/=10;
            }
        }
        return maxDigit;
    }

    public static void simpleDividers(int number){
        for(int i=2; i<number; i++){
            if(number%i==0){
                if(NumberValidator.isPrime(i)){
                    System.out.println(i);
                }
            }
        }
    }

    public static int numbersNod(int a, int b) {

        if (a == b) {
            return a;
        }
        else{
            if(a<b){
                int temp=a;
                a=b;
                b=temp;
            }
            int ostatok = a % b;
            while (ostatok != 0) {
                a = b;
                b = ostatok;
                ostatok = a % b;
            }
            return b;
        }
    }


    public static long numbersNok(int a, int b){

        return (long)(a*b/numbersNod(a, b));
    }

}
