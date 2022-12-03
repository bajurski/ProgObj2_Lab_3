import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyFrame extends JFrame implements ActionListener{

    public MyFrame() {
        setTitle("Registration Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

    }
}
