package coding.section12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2018/11/15 0015.
 */
public class SimpleListener implements ActionListener {
    public JButton button;
    public JFrame frame;

    public static void main(String[] args) {
        SimpleListener simpleListener=new SimpleListener();
        simpleListener.start();
    }

    private void start() {
        frame=new JFrame();
        button=new JButton("click me");
        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel panel=new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.getContentPane().add(BorderLayout.SOUTH,button);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.button.setText("have been clicked!");
        frame.repaint();

    }
}
