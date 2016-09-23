import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;

class Frame
{
    public Frame (int a, int b)
    {
        JLabel [] label = new JLabel[10];
        for (int c = 0; c < label.length; c++)
        {
            label[c] = new JLabel("Кнопка" + c);
        }

        JButton button1 = new JButton("Кнопка-2");
        button1.setPreferredSize(new Dimension(100, 20));
        button1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                for (int a = 0; a <= 10; a++)
                {
                    System.out.println(a);
                }
            }
        });

        JButton button2 = new JButton("Кнопка-1");
        button2.setPreferredSize(new Dimension(100, 20));
        button2.addActionListener(new AbstractAction()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int [] b = new int [10];
                for (int i = 0; i < b.length; i++);
                System.out.println(Arrays.toString(b));
            }
        });

        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);

        JButton[] button3 = new JButton[10];
        for (int i = 0; i < button3.length; i++)
        {
            button3[i] = new JButton("Кнопка" + i);
            panel.add(button3[i]);
            button3[i].setPreferredSize(new Dimension(100,20));
        }

        JFrame frame = new JFrame();

        frame.setPreferredSize(new Dimension(a, b));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

public class F1
{
    public static void main (String[] args)
    {
        new Frame(500, 500);
    }
}
