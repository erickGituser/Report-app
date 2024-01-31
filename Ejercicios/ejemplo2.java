import java.awt.*;
import javax.swing.*;

class ejemplo2 {
  public static void main(String[] args) {
   //Declare frame object
   JFrame win = new JFrame();
   //Set the title
   win.setTitle("Java Swing Example-2");
   //Set the window size
   win.setSize(400, 200);
   //Create label object
   JLabel lbl = new JLabel("Simple Java Swing application");
   //Set label font color
   lbl.setForeground(Color.blue);
   //Set the label position
   lbl.setBounds(100,20,250,100);
   //Add label to frame
   win.add(lbl);
   //Create a button
   JButton btn = new JButton("Close");
   //Set the button position
   btn.setBounds(150, 100, 80, 30);
   //Add button to frame
   win.add(btn);
   //Set window position
   win.setLocationRelativeTo(null);
   //Disable default layout of the frame
   win.setLayout(null);
   //Make the window visible
   win.setVisible(true);
 }
}