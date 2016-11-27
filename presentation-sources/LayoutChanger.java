import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LayoutChanger{
  private JButton first;
  private JButton second;
  private JButton third;
  private JButton fourth;
  private JFrame frame;
  private JPanel panel;
  private boolean isGrid;
  public LayoutChanger(){
    initComponents();
    layoutComponents();
    frame.setVisible(true);
  }
  private void initComponents(){
    frame = new JFrame("Layout changer");
    frame.setLayout(new BorderLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel  = new JPanel();
    panel.setLayout(new FlowLayout());
    first = new JButton("First");
    second = new JButton("Second");
    third = new JButton("Third");
    fourth = new JButton("Click me!");
    fourth.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
          if(isGrid){
            System.out.println("changing to flow");
            panel.setLayout(new FlowLayout());
            frame.pack();
          }else{
            System.out.println("changing to grid");
            panel.setLayout(new GridLayout(2,2));
            frame.pack();
          }
          isGrid = !isGrid;
        }
      });
  }
  private void layoutComponents(){
    panel.add(first);
    panel.add(second);
    panel.add(third);
    panel.add(fourth);
    frame.add(panel, BorderLayout.CENTER);
    frame.pack();
  }
  public static void main(String[] args){
    new LayoutChanger();
  }
}
