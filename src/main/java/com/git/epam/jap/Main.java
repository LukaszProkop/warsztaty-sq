package com.git.epam.jap;

import java.util.stream.IntStream;

/**
 * @implNote Zadanie numer 2 znajduje się w metodzie  `queueService()`
 */
class Main {
    private static final Queue<Integer> integerQueue = new Queue<>();

    public static void main(String[] args) {
        IntStream.iterate(1, i->i+1)
                .limit(20)
                .forEach(Main::queueService);
    }

    private static void queueService(int value) {
        //TODO 2: zaimplementuj tę metodę tak aby elementy były wyciągane w odpowiedniej kolejności (1-20),
        //  nie zmieniaj sygnatury metody oraz kodu w ostatniej linii.

        integerQueue.insert(value).receive();
    }
}
