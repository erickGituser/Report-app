import java.awt.*;
import javax.swing.*;

class ejemplo13 {
    public static void main(String[] args) {
        //Declare a Frame object
        JFrame frame = new JFrame();
        //Declare a label object
        JLabel lbl = new JLabel();
        //Set the image for the label using ImageIcon
        lbl.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\publicidad celulares yemaya\\HONOR-X7-A.png"));
        //Declare a dimension object
        Dimension size = lbl.getPreferredSize();
        //Set the position of the label
        lbl.setBounds(50, 30, size.width, size.height);
        //Add label to the frame
        frame.add(lbl);
        //Set the frame title
        frame.setTitle("Java Swing Example-13");
        //Disable the default layout
        frame.setLayout(null);
        //Set the frame size
        frame.setSize(1200, 1100);
        //Disable the resize option
        frame.setResizable(false);
        //Set frame position
        frame.setLocationRelativeTo(null);
        //Make the frame visible
        frame.setVisible(true);
    }
}