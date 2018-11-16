package coding.section12;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/11/16 0016.
 */
public class SimpleAnimatin {
    public int x=20;
    public int y=20;

    public static void main(String[] args) {
        SimpleAnimatin simpleAnimatin=new SimpleAnimatin();
        simpleAnimatin.go();
    }

    private void go() {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(300,300);

        DrawPanel panel=new DrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER,panel);

        for(int i=0;i<100;i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            panel.repaint();

            x++;
            y++;
        }
    }

    class DrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(Color.red);
            g.fillOval(x,y,20,20);
        }
    }
}
