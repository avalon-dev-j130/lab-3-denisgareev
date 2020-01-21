package ru.avalon.java.actions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Действие, которое перемещает файлы в пределах дискового
 * пространства.
 */
public class FileMoveAction implements Action {
    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
       
        try {
            //создание файла
            Path testFilePath = Files.createFile(Paths.get("C:\\Users\\JAVA\\Desktop\\testFile.txt"));
            
            //создание директории
            Path testDirectory = Files.createDirectory(Paths.get("C:\\Users\\JAVA\\Desktop\\testDirectory"));
            
            //перемещение файла в созданную директорию
            Path testFile = Files.move(testFilePath, Paths.get("C:\\Users\\JAVA\\Desktop\\testDirectory\\testFile.txt"), REPLACE_EXISTING);
            
            /*
            * TODO №4 Реализуйте метод run класса FileMoveAction
            */
            //throw new UnsupportedOperationException("Not implemented yet!");
        } catch (IOException ex) {
            Logger.getLogger(FileMoveAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() throws Exception {
        /*
         * TODO №5 Реализуйте метод close класса FileMoveAction
         */
        throw new UnsupportedOperationException("Not implemented yet!");
    }

}
