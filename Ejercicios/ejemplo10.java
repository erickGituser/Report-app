import javax.swing.*;
import java.awt.event.*;

class ejemplo10 {
    public static void main(String[] args) {
        //Declare JFrame object
        JFrame frame = new JFrame();
        //Set the title
        frame.setTitle("Java Popup Menu Example");
        //Set the window size
        frame.setSize(350, 250);
        //Disable the resize option
        frame.setResizable(false);
        //Define a JPopupMenu object
        JPopupMenu popup = new JPopupMenu();
        //Define the first menu item
        JMenuItem menuItem = new JMenuItem("New File");
       
        //Add listener code for the first menu item
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "New file is clicked!");
            }
        });
       
        //Add the first menu item to the popup menu
        popup.add(menuItem);
       
        //Define the second menu item
        menuItem = new JMenuItem("Open File");
        //Add listener code for the second menu item
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Open File is clicked!");
            }
        });
       
        //Add the second menu item to the popup menu
        popup.add(menuItem);
       
        //Define the third menu item
        menuItem = new JMenuItem("Save File");
        //Add listener code for the third menu item
        menuItem.addActionListener(new ActionListener() {
       
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Save File is clicked!");
            }
        });
       
        //Add the third menu item to the popup menu
        popup.add(menuItem);
        //Add mouse listener for the JFrame
        frame.addMouseListener(new MouseAdapter() {
       
            @Override
            public void mousePressed(MouseEvent e) {
                showPopup(e);
            }
           
            @Override
            public void mouseReleased(MouseEvent e) {
                showPopup(e);
            }
           
            private void showPopup(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popup.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        //Set window position
        frame.setLocationRelativeTo(null);
        //Make the window visible
        frame.setVisible(true);
    }
}