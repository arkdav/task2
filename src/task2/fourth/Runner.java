package task2.fourth;

public class Runner {
    public static void main(String[] args) {

        int firstRange=(int)(Math.random()*50_000);
        int secondRange=(int)(Math.random()*50_000);
        if(firstRange==secondRange){
            System.out.println("no");
        }
        else if(firstRange>secondRange){
            int temp=firstRange;
            firstRange=secondRange;
            secondRange=temp;
        }

        System.out.println(firstRange+"   "+secondRange);
        for(int i=firstRange; i<secondRange; i++){
            for(int j=i+1; j<secondRange; j++){
                if(NumberAction.isFriendly(i, j)){
                    System.out.println(i+"  "+j);
                }
            }
        }

    }
}
