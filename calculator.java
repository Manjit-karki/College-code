import java.awt.*;
import java.awt.event.*;

public class calculator {

  public static void main(String[] args) {
    Frame frame = new Frame("Calculator");

    TextField display = new TextField();
    display.setEditable(false);
    display.setFont(new Font("Arial", Font.PLAIN, 24));
    frame.add(display, BorderLayout.NORTH);

    Panel panel = new Panel();
    panel.setLayout(new GridLayout(5, 4, 10, 10));

    Button b1 = new Button("7");
    Button b2 = new Button("8");
    Button b3 = new Button("9");
    Button b4 = new Button("/");

    Button b5 = new Button("4");
    Button b6 = new Button("5");
    Button b7 = new Button("6");
    Button b8 = new Button("*");

    Button b9 = new Button("1");
    Button b10 = new Button("2");
    Button b11 = new Button("3");
    Button b12 = new Button("-");

    Button b13 = new Button("0");
    Button b14 = new Button(".");
    Button b15 = new Button("=");
    Button b16 = new Button("+");

    Button b17 = new Button("C");
    Label l1 = new Label();
    Label l2 = new Label();
    Label l3 = new Label();

    panel.add(b1);
    panel.add(b2);
    panel.add(b3);
    panel.add(b4);

    panel.add(b5);
    panel.add(b6);
    panel.add(b7);
    panel.add(b8);

    panel.add(b9);
    panel.add(b10);
    panel.add(b11);
    panel.add(b12);

    panel.add(b13);
    panel.add(b14);
    panel.add(b15);
    panel.add(b16);

    panel.add(b17);
    panel.add(l1);
    panel.add(l2);
    panel.add(l3);

    frame.add(panel, BorderLayout.CENTER);
    frame.setSize(400, 500);
    frame.setVisible(true);
    frame.setResizable(false);

    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        frame.dispose();
      }
    });
  }
}
