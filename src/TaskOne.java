import java.util.Scanner;

public class TaskOne {
    //TODO: Напишите программу, которая проверяет, является ли введенное пользователем число четным или нечетным,
    // с помощью тернарного оператора.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scan.nextInt();
        String result = number % 2 == 0 ? "Четное" : "Нечетное";
        System.out.println("Число " + number + " - " + result);
    }
}