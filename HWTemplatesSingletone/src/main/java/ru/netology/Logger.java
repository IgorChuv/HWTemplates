package ru.netology;

import java.time.format.*;
import java.time.*;

public class Logger {
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private static Logger instance = null;
    protected int num;

    private Logger() {
        this.num = 1;
    }

    public static Logger get() {
        if (instance == null) instance = new Logger();
        return instance;
    }

    void log(String msg) {
        System.out.println("[" + LocalDateTime.now().format(formatter) + " " + num++ + "] " + msg);
    }
}
