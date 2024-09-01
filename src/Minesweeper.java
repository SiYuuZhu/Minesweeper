import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

public class Minesweeper extends JFrame {

    private JLabel statusbar;
    private JLabel timebar;
//    private Board board;
    private int n_mines=40;
    private int n_rows=16;
    private int n_cols=16;

    public Minesweeper() {
        initUI();
    }

    private void initUI() {
        statusbar = new JLabel("");
        timebar=new JLabel(" time");


        add(timebar,BorderLayout.NORTH);
        add(statusbar, BorderLayout.SOUTH);

        add(new Board(statusbar,timebar));

        setResizable(false);
        pack();

        setTitle("踩地雷");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var ex = new Minesweeper();
            ex.setVisible(true);
        });
    }
}
