package ru.avalon.java;

import ru.avalon.java.console.ConsoleUI;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.avalon.java.actions.Action;
import ru.avalon.java.actions.FileCopyAction;
import ru.avalon.java.actions.FileCreateAction;
import ru.avalon.java.actions.FileDeleteAction;
import ru.avalon.java.actions.FileMoveAction;

/**
 * Лабораторная работа №3
 * <p>
 * Курс: "Программирование на платформе Java. Разработка многоуровневых
 * приложений"
 * <p>
 * Тема: "Потоки исполнения (Threads) и многозадачность"
 *
 * @author Daniel Alpatov <danial.alpatov@gmail.com>
 */
public class Lab3 extends ConsoleUI<Commands> {

    static Action lastAction;

    /**
     * Точка входа в приложение.
     *
     * @param args
     */
    public static void main(String[] args) {
        new Lab3().run();
    }

    /**
     * Конструктор класса.
     * <p>
     * Инициализирует экземпляр базового типа с использоавнием перечисления
     * {@link Commands}.
     */
    Lab3() {
        super(Commands.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onCommand(Commands command) throws IOException {
        switch (command) {
            case copy:
                FileCopyAction fca = new FileCopyAction();
                lastAction = fca;
                fca.start();

                /*
                 * TODO №6 Обработайте команду copy
                 */
                break;
            case move:
                FileMoveAction fma = new FileMoveAction();
                fma.start();
                /*
                 * TODO №7 Обработайте команду move
                 */
                break;
            case delete:
                FileDeleteAction fda = new FileDeleteAction();
                fda.start();
                
            case cancel:
                if (lastAction != null) {
                    try {
                        lastAction.stop();
                    } catch (Exception ex) {
                        Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            case create:
                FileCreateAction fcca = new FileCreateAction();
                fcca.start();
                
            case exit:
                close();
                break;
            /*
                 * TODO №9 Обработайте необработанные команды
             */
        }
    }

}
