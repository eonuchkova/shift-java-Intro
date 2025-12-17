package homework23;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = scanner.nextLine();

        if (string.length() <= 1){
            System.out.println("Ошибка: введите более одного символа");
            return;
        }

        String search = "  ";
        String replacement = " ";
        String stringInput = string.replace(search, replacement);

        System.out.println("Поиск символа: ");
        String symbolInput = scanner.nextLine();
        char symbol = symbolInput.charAt(0);

        if (symbol == ' '){
            System.out.println("Ошибка: не используйте пробел");
            return;
        }

        StringBuilder stringUpdated = new StringBuilder(stringInput);
        for (int i = 0; i<stringUpdated.length(); i++) {
            if (stringUpdated.charAt(i) == symbol) {
                stringUpdated.setCharAt(i,' ');
            }
        }
        String stringFinal = stringUpdated.toString();
        while (stringFinal.contains("  ")) {
            stringFinal = stringFinal.replace("  ", " ");
        }

            if (string.equals(stringFinal)) {
            System.out.println("Исходная строка соответствует итоговой строке");
        } else {
        System.out.println("Исходная строка: " + string + "\n"+ "Итоговая строка: " + stringFinal);
        }

    }
}