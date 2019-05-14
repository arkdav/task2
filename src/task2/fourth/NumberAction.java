package task2.fourth;

public class NumberAction {

    public static boolean isFriendly(int a, int b){
            return (notEqual(a, b) && sumDivisors(a)==b && sumDivisors(b)==a);
    }

    public static int sumDivisors(int n){
        int sumDivisors=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sumDivisors+=i;
            }
        }
        return sumDivisors;
    }
    public static boolean notEqual(int a, int b){

        return a!=b;
    }
}
