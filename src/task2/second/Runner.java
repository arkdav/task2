package task2.second;


public class Runner {

    public static void main(String[] args) {
       NumberGenerator nums = new NumberGenerator();
        nums.setNumberOne();
        nums.setNumberTwo();
        System.out.println(nums.getNumberOne()+"   "+nums.getNumberTwo());
        System.out.println("Наибольшая цифра: "+NumberAction.highestDigit(nums.getNumberOne()));
        System.out.println("Палиндром: "+NumberValidator.isPalindrome(nums.getNumberOne()));
        System.out.println("Простое: "+NumberValidator.isPrime(nums.getNumberOne()));
        System.out.println("Простые делители: ");
        NumberAction.simpleDividers(nums.getNumberOne());
        System.out.println("НОД: "+(NumberAction.numbersNod(nums.getNumberOne(), nums.getNumberTwo())));
        System.out.println("НОК: "+NumberAction.numbersNok(nums.getNumberOne(), nums.getNumberTwo()));

    }

}
