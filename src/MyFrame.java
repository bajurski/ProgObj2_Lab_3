import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyFrame extends JFrame implements ActionListener{

    public MyFrame() {
        setTitle("Show multiplication table.");
        setBounds(200, 90, 1000, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

    }
}
