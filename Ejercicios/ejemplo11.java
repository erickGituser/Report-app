import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;

class ejemplo11 {
    public static void main(String[] args) {
        //Create a JFrame object
        JFrame frame = new JFrame("Java Swing Example-11");
        //Create a JToolBar object
        JToolBar toolbar = new JToolBar();
       
        //Create three toolbar buttons
        JButton btnNew = new JButton(new ImageIcon("C:\\Users\\user\\Pictures\\Visual II\\nuevo-documento1.png"));
        JButton btnOpen = new JButton(new ImageIcon("C:\\Users\\user\\Pictures\\Visual II\\carpeta-abierta1.png"));
        JButton btnSave = new JButton(new ImageIcon("C:\\Users\\user\\Pictures\\Visual II\\disquete1.png"));
        //Declare addActionListener methods for three buttons
        btnNew.addActionListener(new ActionListener() {
       
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, "New button is pressed.");
        }
        });
        btnOpen.addActionListener(new ActionListener() {
       
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, "Open button is pressed.");
        }
        });
        btnSave.addActionListener(new ActionListener() {
       
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, "Save button is pressed.");
        }
        });
       
        //Add buttons to the toolbar
        toolbar.add(btnNew);
        toolbar.add(btnOpen);
        toolbar.add(btnSave);
        //Set the frame layout
        frame.setLayout(new BorderLayout());
        //Add toolbar to the frame at the beginning of the frame
        frame.getContentPane().add(toolbar, BorderLayout.PAGE_START);
       
        //Set the window size
        frame.setSize(800, 600);
        //Disable the resize option
        frame.setResizable(false);
        //Set window position
        frame.setLocationRelativeTo(null);
        //Make the window visible
        frame.setVisible(true);
    }
}