import java.util.Scanner;

public class TaskThree {
// TODO:Напишите программу, которая проверяет,
//  делится ли введенное пользователем число нацело на 2 и 5 или на 3 и 7.
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scan.nextInt();
        if(number % 3 == 0 && number % 7 == 0){
            System.out.println("Число " + number + " делится на 3 и  на 7 нацело.");
        }
        else if (number % 2 == 0 && number % 5 == 0){
            System.out.println("Число " + number + " делится на 2 и на 5 нацело.");
        }
        else {
            System.out.println("Число " + number + " не делится нацело.");
        }
    }
}
