package org.example;

public class Logger {
    // Створюємо єдину статичну змінну, яка міститиме єдиний екземпляр Logger
    private static Logger instance;

    // Приватний конструктор, щоб запобігти створенню інших екземплярів класу
    private Logger() {
    }

    // Публічний статичний метод для отримання єдиного екземпляру Logger
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Створюємо новий екземпляр, якщо він ще не існує
        }
        return instance; // Повертаємо єдиний екземпляр
    }

    // Метод для запису повідомлення в лог
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}