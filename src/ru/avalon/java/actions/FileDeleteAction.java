
package ru.avalon.java.actions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileDeleteAction implements Action {

    @Override
    public void run() {
        try {
            Files.delete(Paths.get("C:\\Users\\JAVA\\Desktop\\testDirectory\\testFile.txt"));
            //throw new UnsupportedOperationException("Not supported yet.");
        } catch (IOException ex) {
            Logger.getLogger(FileDeleteAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void close() throws Exception {
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
