package com.git.epam.jap;

import java.util.concurrent.SynchronousQueue;

/**
 * @implNote Zadanie numer 1: zaimplementuj metody `insert()` oraz `receive()`,
 *  więcej szczegółów na temat zadania znajdziesz w metodzie.
 */
class Queue<V> {

    private final SynchronousQueue<V> sq = new SynchronousQueue<>();

    Queue<V> insert(V value) {
        //TODO 1: dodaj element do kolejki `value` do `SynchronousQueue`,
        //  nie zmieniaj sygnatury metody.
        return null;
    }

    void receive() {
        //TODO 1: wyciągnij element z kolejki i wydrukuj na ekranie.
    }
}
