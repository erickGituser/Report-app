import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

class ejemplo14 {
    public static void main(String[] args) {
        //Declare a Frame object
        JFrame frame = new JFrame();
        //Disable default frame layout
        frame.setLayout(null);
        //Create a button object
        JButton btn = new JButton("Generate Number");
        //Set the font type of the button
        btn.setFont(new Font("Verdana", Font.BOLD, 20));
        //Set the button position
        btn.setBounds(45, 50, 250, 40);
        //Add button to the frame
        frame.add(btn);
        //Add the action listener for the button
        btn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        //Create a random object
        Random num = new Random();
        //Generate a random number
        int n = num.nextInt(100) + 1;
        //Convert integer to string
        String rnum = String.valueOf(n);
        //Display the random number in the message box
        JOptionPane.showMessageDialog(frame, "Generated Number: " + rnum);
        }
        });
        //Set the title
        frame.setTitle("Java Swing Example-14");
        //Set the window size
        frame.setSize(350, 200);
        //Disable the resize option
        frame.setResizable(false);
        //Set window position
        frame.setLocationRelativeTo(null);
        //Make the window visible
        frame.setVisible(true);
    }
}