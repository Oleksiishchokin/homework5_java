package homework5;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(99,1000);
        System.out.println(number);

        int firstNumber = number / 100;
        int thertNumber = number % 10;
        int secondNumber = number /10 % 10;



        if (firstNumber >= secondNumber && firstNumber >= thertNumber){
            System.out.println(firstNumber);


        } else if (secondNumber >= firstNumber && secondNumber >= thertNumber) {
            System.out.println(secondNumber);


        } else if (thertNumber >= firstNumber && thertNumber >= secondNumber){

            System.out.println(thertNumber);

        }



    }
    }


