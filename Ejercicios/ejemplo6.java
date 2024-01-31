import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

class ejemplo6 {
    public static void main(String[] args) {
       //Create a JFileChooser object
       JFileChooser fc = new         JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
       //Disable all file types selection
       fc.setAcceptAllFileFilterUsed(false);
       //Set the filter
       FileNameExtensionFilter filter = new      FileNameExtensionFilter("Text Files", "txt");
       //Apply the filter
       fc.addChoosableFileFilter(filter);

       //Display open dialog box
       int Val = fc.showOpenDialog(null);

       //Check Open button is selected or not
       if (Val == JFileChooser.APPROVE_OPTION)
       {
           BufferedReader buffer = null;
           try
           {
                //Read the selected file
                File sFile = fc.getSelectedFile();
                //Read the path
                File file = new File(sFile.getAbsolutePath());
                //Initialize the BufferedReader object
                buffer = new BufferedReader(new FileReader(file));
                //Declare variables to store the file content
                String storage="", line;
                //Read the file
                while ((line = buffer.readLine()) != null)
                    //Store the file content
                    storage = storage+line+"\n";
                    //Print the file content in the console
                    System.out.println(storage);
                } catch (FileNotFoundException ex) {
                    System.out.println("File does not exist.");
                } catch (IOException ex) {
                    System.out.println("Unable to access the file.");
            }
        }
    }
}