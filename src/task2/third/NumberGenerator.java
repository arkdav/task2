package task2.third;

public class NumberGenerator {
    private int number;

    public void setNumber() {

        this.number = (int) (Math.random()*1_000_000);
        }

    public int getNumber() {

        return number;
    }

}
