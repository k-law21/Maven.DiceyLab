
package main.java;



public class Dice {

    private int numberOfRolls;

    public Dice(int d) {
        this.numberOfRolls = d;

    }

    public Integer tossAndSum() {
        int result = 0;
        for (int i = 0; i < numberOfRolls; i++) {
            result += (int) (Math.random() * ((6 - 1) + 1) + 1);

        }
        return result;
    }


}
