package org.example;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();


        logger.log("Це тестове повідомлення");


        Logger anotherLogger = Logger.getInstance();


        if (logger == anotherLogger) {
            System.out.println("Це той самий екземпляр Logger");
        } else {
            System.out.println("Це різні екземпляри Logger");
        }
    }
}