package main.java;
import main.java.Dice;
import main.java.Simulation;

public class Bins {

        private int numberOfDie;
        private int numberOfTimesTossed;


        public Bins ( int numberOfDie , int numberOfTimesTossed){
            this.numberOfDie = numberOfDie;
            this.numberOfTimesTossed = numberOfTimesTossed;

        }



    public double [] saveRolls(){
            Dice die = new Dice(numberOfDie);
            double[] saveOcurrences = new double[numberOfDie * 6];


            for(int i = 0; i < numberOfTimesTossed; i++){
                saveOcurrences[die.tossAndSum() - 1] += 1;

            }
            return saveOcurrences;

        }
        public  void printOccurrences(){
            double[] result = saveRolls();

            for(int i = numberOfDie-1; i < result.length; i++){
                System.out.printf("%4d %s %7.0f %s %1.2f %s", i+1," : ", result[i], " : ", result[i]/numberOfTimesTossed, "  ");

                for(int j = 0; j < (result[i]/numberOfTimesTossed)*100; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

