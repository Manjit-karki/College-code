//INFO: Java AWT study

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class myframe {

  public static void main(String[] args) {

    Frame f = new Frame("Box");
    Button b = new Button("Click me");

    f.setLayout(null);
    b.setBounds(100, 80, 100, 30);

    f.add(b);

    f.setSize(300, 200);
    f.setVisible(true);

    b.addActionListener(e -> JOptionPane.showMessageDialog(f, "Hello world!"));

    f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        f.dispose();
      }
    });
  }
}

