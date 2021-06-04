package ru.netology;

import java.util.*;

public class Main {

    public static String printList(List<Integer> list) {
        StringBuilder values = new StringBuilder();
        for (Integer val : list) {
            values.append(val);
            values.append(" ");
        }
        return values.toString();
    }

    public static void main(String[] args) {
        Random random = new Random();
        Logger logger = Logger.get();
        Scanner scanner = new Scanner(System.in);
        List<Integer> userList = new ArrayList<>();
        List<Integer> filteredUserList;

        logger.log("Начало работы программы");

        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Здравствуйте! Введите размер списка: ");
        int listSize = scanner.nextInt();
        System.out.print("Введите верхнюю границу значений элементов: ");
        int bound = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        for (int i = 0; i < listSize; i++) {
            userList.add(random.nextInt(bound));
        }
        System.out.println("Вот случайный список: " + printList(userList));

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int userThreshold = scanner.nextInt();
        Filter userFilter = new Filter(userThreshold);
        filteredUserList = userFilter.filterOut(userList);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + printList(filteredUserList));

        logger.log("Конец работы программы");
    }
}