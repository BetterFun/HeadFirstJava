package coding.section12.miniMusic.miniMusicPlayer;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Administrator on 2018/11/16 0016.
 */
public class MiniMusicGUI{
    public JFrame frame;

    public void create() {
        frame=new JFrame("My First Music Video!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500,500);

        frame.getContentPane().add(new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                Random random=new Random();
                g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));

                g.fillRect(random.nextInt(150),random.nextInt(150),random.nextInt(150),random.nextInt(150));

            }
        });

    }
}
