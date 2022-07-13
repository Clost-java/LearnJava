package LearnJava;

import javax.swing.*;
import java.awt.*;

/**
 * @author:clost
 * @date:2022/7/13
 */
public class GUITest extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        System.out.println(frame.hashCode());
        frame.setTitle("测试窗口");
        frame.setSize(1000,700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GUITest guiTest = new GUITest();
        frame.setBackground(Color.black);
        frame.add(guiTest);

        frame.setVisible(true);


    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.white);
        for (int i = 0; i < 100; i++) {
            g.drawString("♥",(int)(Math.random()*1000),(int)(Math.random()*700));
        }
        g.fillOval(100,100,100,100);
        g.setColor(Color.black);
        g.fillOval(100,100,80,80);

    }
}
