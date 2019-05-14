package task2.third;

public class Runner {

    public static void main(String[] args) {

    NumberGenerator myNumber = new NumberGenerator();
    myNumber.setNumber();
    System.out.println("Совершенное: "+NumberValidator.isPerfect(myNumber.getNumber()));

    }
}
