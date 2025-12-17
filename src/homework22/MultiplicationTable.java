import java.util.Scanner;
import homework232.MultiplicationTableFile;


public class MultiplicationTable {

    public static int getCellWidth(int number) {
        return String.valueOf(number).length();
    }

    public static int doubleSearch(Scanner scanner) throws Exception {
        String s = scanner.next();
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new Exception("Ошибка: введите целое число");
        }
    }

    public static void printTable(int[] values, int cellWidth) {
        System.out.print(" ".repeat(cellWidth));
        for (int v : values) System.out.printf("%" + cellWidth + "d", v);
        System.out.println();

        for (int x : values) {
            System.out.printf("%" + cellWidth + "d", x);
            for (int y : values) System.out.printf("%" + cellWidth + "d", x * y);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;
        int step = 0;

        try {
            System.out.print("Введите первое число: ");
            firstNumber = doubleSearch(scanner);

            System.out.print("Введите второе число: ");
            secondNumber = doubleSearch(scanner);

            System.out.print("Введите шаг: ");
            step = doubleSearch(scanner);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }


        if (firstNumber > secondNumber) {
            System.out.print("Ошибка: первое число должно быть меньше второго");
            return;
        }

        if (step < 0) {
            System.out.print("Ошибка: шаг должен быть больше 0");
            return;
        }

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
        int cellWidth = maxWidth + 1;
        printTable(values, cellWidth);

        MultiplicationTableFile.writeTable(values, cellWidth, "MultiplicationTable.txt");
    }

}