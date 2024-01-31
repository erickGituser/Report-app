import java.awt.event.ActionEvent;
import javax.swing.*;

class ejemplo5 {
     public static void main(String[] args) {
        //Declare frame object
        JFrame win = new JFrame();
        //Set the title
        win.setTitle("Java Swing Example-5");
        //Set the window size
        win.setSize(500, 200);
        /*Create a label object, set the position, and add to the frame*/
        JLabel lbl1 = new JLabel("Book Name:", JLabel.LEFT);
        lbl1.setBounds(80,20,100,20);
        win.add(lbl1);
        /*Create text object, set the position, and add to the frame*/
        JTextField bname = new JTextField();
        bname.setBounds(200,20,200,20);
        win.add(bname);
        /*Create a label object, set the position, and add to the frame */
        JLabel lbl2 = new JLabel("Book Price:", JLabel.LEFT);
        lbl2.setBounds(80,50,100,20);
        win.add(lbl2);
        /*Create text object, set the position, and add to the frame*/
        JTextField bprice = new JTextField();
        bprice.setText("0.00");
        bprice.setBounds(200,50,50,20);
        win.add(bprice);
        /*Create a button, set the position, and add to the frame */
        JButton btn = new JButton("Submit");
        btn.setBounds(200, 100, 100, 30);
        win.add(btn);
        //Set window position
        win.setLocationRelativeTo(null);
        //Disable the default layout of the frame
        win.setLayout(null);
        //Make the window visible
        win.setVisible(true);
        //Check whether the input values are valid or invalid
        btn.addActionListener((ActionEvent e) -> {
            int valid =1;
            String title = bname.getText();
            float cost = 0;
            if(title.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Book name can't be empty");
                valid = 0;
            }
            try {
                cost = Float.parseFloat(bprice.getText());
            }
            catch (NumberFormatException eg) {
                JOptionPane.showMessageDialog(null, "Price must be a number.");
                valid=0;
            }
            if(valid == 1)
            {
                String values = "Book Name: " + title + "\nBook Price: $" + cost;
                JOptionPane.showMessageDialog(null, values);
            }
       });
    }
}