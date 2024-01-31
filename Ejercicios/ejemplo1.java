import javax.swing.*;

class ejemplo1 {
    public static void main(String[] args) {
         //Declare JFrame object
           JFrame frame = new JFrame();
           //Set the title
           frame.setTitle("Java Swing Example-1");
           //Set the frame size
           frame.setSize(500, 500);
           //Disable the resize option
           frame.setResizable(false);
           //Set frame position to the center of the screen
           frame.setLocationRelativeTo(null);
           //Make the frame visible
           frame.setVisible(true);
    }
}