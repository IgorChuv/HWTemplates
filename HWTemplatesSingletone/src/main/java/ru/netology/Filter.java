package ru.netology;

import java.util.*;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.get();
        logger.log("Запускаем фильтрацию");
        List<Integer> result = new ArrayList<>();
        for (int number : source) {
            if (number > threshold) {
                logger.log("Число " + number + " подходит");
                result.add(number);
            } else {
                logger.log("Число " + number + " не подходит");
            }
        }
        return result;
    }
}