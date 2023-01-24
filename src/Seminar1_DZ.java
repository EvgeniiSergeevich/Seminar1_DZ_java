import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Seminar1_DZ {
    public static void main(String[] args) throws IOException {
        System.out.println(enterInt());
    }
    static int enterInt() throws IOException {
        System.out.println("Введите целое число: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int enter = Integer.parseInt(num);
        return enter;
    }
}
