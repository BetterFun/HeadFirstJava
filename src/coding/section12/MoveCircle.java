package coding.section12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2018/11/15 0015.
 */
public class MoveCircle implements ActionListener{

    public static void main(String[] args) throws InterruptedException {
        MoveCircle moveCircle=new MoveCircle();
        moveCircle.start(new int[]{100,100});
    }

    private void start(int[] end) throws InterruptedException {
        JFrame frame=new JFrame();
        JButton button=new JButton();

        button.setText("clicked");
        button.addActionListener(this);
        frame.getContentPane().add(BorderLayout.SOUTH,button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
        int[] location={10,10};

        while (!(location[0] == end[0] && location[1] == end[1])){
            frame.getContentPane().add(BorderLayout.CENTER,new JPanel(){
                @Override
                protected void paintComponent(Graphics g) {
                    g.setColor(Color.red);
                    g.fillOval(location[0],location[1],30,30);
                }
            });
            Thread.sleep(50);
            frame.repaint();
            location[0]+=1;
            location[1]+=1;
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
