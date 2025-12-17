package homework232;

import java.io.FileOutputStream;
import java.io.IOException;

public class MultiplicationTableFile {
    public static void writeTable(int[] values, int cellWidth, String fileName) {

        FileOutputStream fileOutputStream = null;

        try {

            fileOutputStream = new FileOutputStream(fileName);

            StringBuilder sb = new StringBuilder();

            sb.append(" ".repeat(cellWidth));
            for (int v : values)
                sb.append(String.format("%" + cellWidth + "d", v));
            sb.append("\n");


            for (int x : values) {
                sb.append(String.format("%" + cellWidth + "d", x));
                for (int y : values)
                    sb.append(String.format("%" + cellWidth + "d", x * y));
                sb.append("\n");
            }

            fileOutputStream.write(sb.toString().getBytes());
            System.out.println("Таблица записана в файл: " + fileName);

        } catch (IOException e) {
            System.out.println("Ошибка записи файла: " + e.getMessage());
        } finally {
            try {
                if (fileOutputStream != null) fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии файла");
            }
        }
    }
}
