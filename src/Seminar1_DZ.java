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
        int number = 0;
        System.out.println("Введите целое положительное число: ");
        boolean flag = true;
        while (flag)
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String num = reader.readLine();
            try
            {
                Integer.parseInt(num);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Введите целое число!");
                flag = true;
                continue;
            }

            if(num.length() == 0)
            {
                System.out.println("Вы ничего не ввели! Попробуйте снова!");
                flag = true;

            }
            else if (Integer.parseInt(num) < 0)
            {
                System.out.println("Число должно быть положительным!");
                flag = true;
            }
            else
            {
                number = Integer.parseInt(num);
                flag = false;
            }
        }

        return number;

    }

    // Вычисляю треугольное число
    static int triangleNum(int num)
    {
        return num * (num + 1) / 2;
    }
}
