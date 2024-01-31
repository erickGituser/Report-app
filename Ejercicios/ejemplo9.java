import javax.swing.*;

class ejemplo9 {
    public static void main(String[] args) {
        //Declare JFrame object
        JFrame frame= new JFrame("Menu Example");
        //Set the window size
        frame.setSize(350, 150);
        //Disable the resize option
        frame.setResizable(false);
        //Declare JMenu objects
        JMenu menuItem, submenuItem;
        //Declare JMenuItem objects
        JMenuItem itm1, itm2, itm3, itm4;
        //Initialize the JMenuItem objects
        itm1=new JMenuItem("Open");
        itm2=new JMenuItem("Save");
        itm3=new JMenuItem("File 1");
        itm4=new JMenuItem("File 2");
        //Define JMenubar object
        JMenuBar mbar=new JMenuBar();
        //Initialize the JMenu objects
        menuItem=new JMenu("File");
        submenuItem=new JMenu("Recent Files");
        //Add menu items
        menuItem.add(itm1);
        menuItem.add(itm2);
        submenuItem.add(itm3);
        submenuItem.add(itm4);
        menuItem.add(submenuItem);
        //Add menu bar item
        mbar.add(menuItem);
        //Add menu bar to frame
        frame.setJMenuBar(mbar);
        //Set the window position
        frame.setLocationRelativeTo(null);
        //Make the window visible
        frame.setVisible(true);
    }
}