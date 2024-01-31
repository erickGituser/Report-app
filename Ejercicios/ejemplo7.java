import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;

class ejemplo7 {
    public static void main(String[] args) {
        //Create a JFileChooser object
        JFileChooser fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
       
        //Open the Save dialog box
        int Val = fc.showSaveDialog(null);
       
        //Check whether the Save button is selected or not
        if (Val == JFileChooser.APPROVE_OPTION)
        {
            //Set the filename taken from the Save dialog box
            File sFile = fc.getSelectedFile();
            //Create the path object
            Path path = Paths.get(sFile.getAbsolutePath());
           
            //Store the content that will be written in the file
            String strVal = "The content of the new file";
            //Convert string to byte array
            byte[] strArray = strVal.getBytes();
           
            //Try-catch block to write into the file
            try {
                //Write the content into the file
                Files.write(path, strArray);
            }
            catch (IOException ex) {
                //Print the error message
                System.out.print("File Path does not exist.");
            }
        }
    }
}