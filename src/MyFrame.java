import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.TableColumnModel;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MyFrame {
    int x = 0;
    int y = 0;
    final int[][] tab;
    Container container;
    JFrame frame;
    JDialog dialog;
    JTable table;
    ScrollPane pane;
    public MyFrame() {

        frame = new JFrame();
        container = new Container();

        frame.setTitle("Show multiplication table");
        frame.setBounds(200, 90, 1000, 700);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);
        container = frame.getContentPane();
        tab = new int[11][11];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                int val = i * j;
                if (i == 0) val = j;
                if (j == 0) val = i;
                tab[i][j] = val;
            }
        }
        pane = new ScrollPane();
        table = new JTable(11,11);
        dialog=new JDialog(frame,"testdialog");
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(15);
        columnModel.getColumn(1).setPreferredWidth(15);
        columnModel.getColumn(2).setPreferredWidth(15);
        columnModel.getColumn(3).setPreferredWidth(15);
        columnModel.getColumn(4).setPreferredWidth(15);
        columnModel.getColumn(5).setPreferredWidth(15);
        columnModel.getColumn(6).setPreferredWidth(15);
        columnModel.getColumn(7).setPreferredWidth(15);
        columnModel.getColumn(8).setPreferredWidth(15);
        columnModel.getColumn(9).setPreferredWidth(15);
        columnModel.getColumn(10).setPreferredWidth(15);

        table.setShowGrid(true);
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(i==0 && j==0){
                    table.setValueAt("",0,0);
                } else {
                    table.setValueAt(tab[i][j], i, j);
                }
            }
        }
        pane.add(table);
        pane.setPreferredSize(new Dimension(300,178));

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                dialog.setBounds(e.getX(),e.getY(), 300, 210);
                dialog.add(pane);
                dialog.pack();
                dialog.setVisible(true);
            }
        });
        frame.setVisible(true);
    }
}
