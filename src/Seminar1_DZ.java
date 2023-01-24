import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



// Написать программу вычисления n-ого треугольного числа
// Ввод числа с консоли
// Вычисляю треугольное число
// Вывожу найденное число в консоль

public class Seminar1_DZ {
    public static void main(String[] args) throws IOException {
        int num = enterInt();
        int t = triangleNum(num);
        System.out.printf("%d -е треугольное число равно %d", num, t);
    }

    // Ввод числа с консоли
    static int enterInt() throws IOException
    {
        System.out.println("Введите целое число: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        return Integer.parseInt(num);
    }

    static int triangleNum(int num)
    {
        return num * (num + 1) / 2;
    }
}
