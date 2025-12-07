package homework231;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String inputString = scanner.nextLine();


        String regex = "^[a-zA-Zа-яА-Я\\.,?!:; ]+$";
        if (!inputString.matches(regex)) {
            System.out.println("Ошибка: строка содержит недопустимые символы. \nДопустимые знаки препинания: . , ? ! : ;");
            return;
        }

        if (inputString.matches(".*  .*")) {
            inputString = inputString.replaceAll("  +", " ");
        }

        System.out.println("Поиск символа: ");
        String charForReplaceInput = scanner.nextLine();
        char charForReplace = charForReplaceInput.charAt(0);


        if (charForReplace == ' ') {
            System.out.println("Ошибка: не используйте пробел");
            return;
        }
        if (inputString.length() <= 1) {
            System.out.println("Ошибка: введите более одного символа");
            return;
        }

        inputString = inputString.replace(charForReplace, ' ');


        String stringAfterReplacements = inputString.toString();
        while (stringAfterReplacements.contains("  ")) {
            stringAfterReplacements = stringAfterReplacements.replace("  +", " ");
        }

        if (inputString.equals(stringAfterReplacements)) {
            System.out.println("Исходная строка соответствует итоговой строке");
        } else {
            System.out.println("Исходная строка: " + inputString + "\n" + "Итоговая строка: " + stringAfterReplacements);
        }

    }
}