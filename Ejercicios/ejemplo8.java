import javax.swing.*;
import java.text.*;
import java.util.*;

class ejemplo8 {
    public static void main(String[] args) {
        //Declare frame object
        JFrame win = new JFrame();
        //Set the title
        win.setTitle("Java Swing Example-8");
        //Set the window size
        win.setSize(350, 150);
        //Disable the resize option
        win.setResizable(false);
        //Set window position
        win.setLocationRelativeTo(null);
        //Define a format object
        SimpleDateFormat formatDate = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss z");
        //Declare the date object
        Date dt = new Date();
        //Create a label object, set the position, and add to the frame
        JLabel lbl = new JLabel(formatDate.format(dt), JLabel.CENTER);
        lbl.setBounds(80,20,100,20);
        win.add(lbl);
        //Make the window visible
        win.setVisible(true);
    }
}