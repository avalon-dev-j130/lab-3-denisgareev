package ru.avalon.java.actions;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Действие, которое копирует файлы в пределах дискового пространства.
 */
public class FileCopyAction implements Action {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        /*
         * TODO №2 Реализуйте метод run класса FileCopyAction
         */
        File original = new File("F:\\Java books\\001 Java. Библиотека профессионала. Том 1,2. 9-е издание.pdf\\Java_Biblioteka_professionala_Tom_1_9-e_izdanie.pdf");
        
        Path originPath = original.toPath();
        Path destination = Paths.get("C:\\temp\\new.pdf");
        try {
            Files.copy(originPath, destination, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            Logger.getLogger(FileCopyAction.class.getName()).log(Level.SEVERE, null, ex);
        }
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("i = " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                System.out.println("I was interrupted!");
//                break;
//            }
//        }
//
//        System.out.println("I'm done");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() throws Exception {
        /*
         * TODO №3 Реализуйте метод close класса FileCopyAction
         */
        interrupt();
    }

    private void interrupt() {
        System.out.println("closed");
        Thread cur = Thread.currentThread();
        System.out.println(cur.getName());
    }
}
