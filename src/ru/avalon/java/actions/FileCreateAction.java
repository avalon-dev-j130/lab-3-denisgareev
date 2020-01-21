
package ru.avalon.java.actions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileCreateAction implements Action {

    @Override
    public void run() {
        try {
            Files.createFile(Paths.get("C:\\Users\\JAVA\\Desktop\\testFile555.txt"));
        } catch (IOException ex) {
            Logger.getLogger(FileCreateAction.class.getName()).log(Level.SEVERE, null, ex);
        }
;
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void close() throws Exception {
        
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
