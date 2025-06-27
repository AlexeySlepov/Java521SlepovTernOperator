import java.util.Scanner;

public class TaskTwo {
    // TODO: Напишите программу, которая сравнивает два введенных числа и
    //  выводит наибольшее из них с использованием тернарного оператора
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа:");
        double firstNumber = scan.nextDouble();
        double secondNumber = scan.nextDouble();
        double largerNumber = firstNumber > secondNumber ? firstNumber : secondNumber;
        System.out.println("Наибольшее число - " + largerNumber);
    }
}
