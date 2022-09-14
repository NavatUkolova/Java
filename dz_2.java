//Написать программу вычисления n-ого треугольного числа. url

import java.util.Scanner;
import java.util.InputMismatchException;
public class dz_2 {
    
    public static int triangleNumber(int n) {

        return (n + 1) * n / 2;
    }

    public static void main(String[] args) {

        try (Scanner console = new Scanner(System.in)) {
            System.out.print("Введите число n для нахождения n-го треугольного числа --> ");

            int n = console.nextInt();

            if (n <= 0) {
                System.out.println("Число должно быть больше 0");
            } else {
                System.out.printf("%d-е треугольное число - %d\n", n, triangleNumber(n));
            }
        }

        catch (InputMismatchException e) {
            System.out.println("Неверный ввод числа");
        }
    }
}

