package coding.section12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2018/11/15 0015.
 */
public class SimpleGuil {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JButton button=new JButton("click me");
        button.setSize(5,5);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);

        frame.setSize(300,300);
        frame.setVisible(true);
    }

}
