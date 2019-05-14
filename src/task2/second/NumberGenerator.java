package task2.second;

public class NumberGenerator {
    private int numberOne;
    private int numberTwo;

    public void setNumberOne() {

        this.numberOne = (int) (Math.random()*1_000);
    }

    public int getNumberOne() {

        return numberOne;
    }

    public void setNumberTwo() {

        this.numberTwo = (int) (Math.random()*1_000);
    }

    public int getNumberTwo() {

        return numberTwo;
    }
}
