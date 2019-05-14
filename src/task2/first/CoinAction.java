package task2.first;

public class CoinAction {

    public static void coinToss(){
        int heads=0;
        int tails=0;
        int flips=flipsNumberGenerator();
        for(int i=0; i<flips; i++){
            if(coinSideGenerator()==0) {
                heads++;
            }
            else{
                tails++;
            }
        }
        resultHeads(heads);
        resultTails(tails);
        flipsNumber(flips);
    }

    public static int coinSideGenerator(){

        return (int)(2 * Math.random());
    }

    public static int flipsNumberGenerator(){

        return (int)(Math.random()*10_000);
    }

    public static void flipsNumber(int n){

        System.out.println("Всего подбрасываний: "+n);
    }

    public static void resultTails(int n){

        System.out.println("Решка выпала: "+n);
    }

    public static void resultHeads(int n){

        System.out.println("Орел выпал: "+n);
    }

}
