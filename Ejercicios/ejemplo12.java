import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.table.JTableHeader;


class ejemplo12 {
    public static void main(String[] args) {
   
        //Declare the JFrame object
        JFrame frame = new JFrame("Java Swing Example-12");
        //Declare an array of objects
        Object[][] Sales = {
        {"January", "Dhanmondi", 120, 20000},
        {"February", "Mirpur", 340, 50000},
        {"March", "Mogbazar", 502, 60793},
        {"April", "Jatrabari", 444, 55000},
        {"May", "Malibagh", 390, 48000}
        };
        //Declare an array to store the table heading
        String[] colHeader = {"Month", "Branch", "Sales items", "Sales amount" };
        //Declare the JTable object
        JTable table = new JTable(Sales, colHeader);
        //Set the font color of the table
        table.setForeground(Color.MAGENTA);
        //Set the table viewpoint height
        table.setFillsViewportHeight(true);
        //Declare JTableHeading object
        JTableHeader tableHeader = table.getTableHeader();
        //Set the background color of the table heading
        tableHeader.setBackground(Color.BLUE);
        //Set the font color of the table heading
        tableHeader.setForeground(Color.CYAN);
        //Declare the label to display table caption
        JLabel tblCaption = new JLabel("Sales details Information");
        //Set font setting for the table caption
        tblCaption.setFont(new Font("Times New Roman",Font.TRUETYPE_FONT,25));
        tblCaption.setForeground(Color.RED);
        //Declare the JScrollPane object
        JScrollPane scrollPane = new JScrollPane(table);
        //Set the layout and add the table caption and scroll into the frame content
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(tblCaption,BorderLayout.PAGE_START);
        frame.getContentPane().add(scrollPane,BorderLayout.CENTER);
        //Set the width and height of the frame
        frame.setSize(500, 175);
        //Disable the resize option
        frame.setResizable(false);
        //Set window position
        frame.setLocationRelativeTo(null);
        //Make the frame visible
        frame.setVisible(true);
    }
}