package homework5;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите любое трехзнчное число");
        int number = scanner.nextInt();

        int n1 = number /100;
        int n2 = number % 10 ;
        int n3 = number /10 % 10 ;

        if (number > 99 && number < 1000){
            System.out.println( " Сумма введеных чисел = " + (n1 + n2 + n3));

        }else {
            System.out.println("Вы ввели не трехзначное число , повторите попытку");
        }


    }
}
