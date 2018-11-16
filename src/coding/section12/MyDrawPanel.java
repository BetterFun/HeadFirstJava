package coding.section12;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Administrator on 2018/11/15 0015.
 */
public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g){
        Random random=new Random();
        g.setColor(Color.blue);
        g.fillRect(50,50,100,100);
        Color color=new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
        g.setColor(color);
        g.fillOval(10,10,50,50);

        Image image=new ImageIcon("C:\\Users\\Administrator\\Pictures\\云.png").getImage();
        g.drawImage(image,100,100,this);

        /*Graphics2D graphics2D= (Graphics2D) g;
        graphics2D.rotate(50.0);*/
    }
}
