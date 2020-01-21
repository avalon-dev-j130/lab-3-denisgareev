package ru.avalon.java.actions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Абстрактное представление о действии, как функциональном
 * элементе приложения.
 * <p>
 * Действие является потоковым объектом, что позволяет
 * исполнять несколько действий параллельно и не блокировать
 * основной поток исполнения.
 */
public interface Action extends Runnable, AutoCloseable {
    
    public ExecutorService executor = Executors.newFixedThreadPool(5);
    
    /**
     * Запускает потоковый объект на исполнение в отдельном
     * потоке исполнения.
     */
    default void start() {
        /*
         * TODO №1 Реализуйте метод start интерфейса Action.
         */
        Thread thread = new Thread(this);
        System.out.println(thread.getName());
        thread.start();
    }
    
    default void stop() {
        Thread cur = Thread.currentThread();
        System.out.println(cur.getName());
    };
    
}
