import java.util.Scanner;

public class MultiplicationTable {

    public static int getCellWidth(int number) {
        return String.valueOf(number).length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Введите шаг: ");
        int step = scanner.nextInt();

        if (firstNumber > secondNumber){
        System.out.print("Ошибка: первое число должно быть меньше второго");
        return;
        }

        if (step < 0){
            System.out.print("Ошибка: шаг должен быть больше 0");
            return;
        }

        //Не понимаю, как добавить проверку на целое число, чтобы при вводе дробного числа выводилось сообщение "Ошибка: введите целое число".
//        if (firstNumber = double firstNumber){
//            System.out.print("Ошибка: введите целое число");
//            return;
//        }

            int count = ((secondNumber - firstNumber) / step) + 1;
        if (firstNumber + step * (count - 1) != secondNumber) count++;

        int[] values = new int[count];
        for (int i = 0, val = firstNumber; val <= secondNumber; i++, val += step) {
            values[i] = val;
        }
        if (values[count - 1] != secondNumber) values[count - 1] = secondNumber;

        int maxWidth = 0;
        for (int x : values) {
            for (int y : values) {
                int w = getCellWidth(x * y);
                if (w > maxWidth) maxWidth = w;
            }
        }

        System.out.print(" ".repeat(maxWidth + 1));
        for (int v : values) System.out.printf("%" + (maxWidth + 1) + "d", v);
        System.out.println();

        for (int x : values) {
            System.out.printf("%" + (maxWidth + 1) + "d", x);
            for (int y : values) System.out.printf("%" + (maxWidth + 1) + "d", x * y);
            System.out.println();
        }
    }
}