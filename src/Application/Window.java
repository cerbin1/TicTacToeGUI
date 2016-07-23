package Application;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Window extends JFrame {
    Window(String title) {
        super(title);
    }

    void init() {
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 3));
        JButton[] buttons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            JButton button = new JButton();
            buttons[i] = button;
            add(button);
            button.setName("" + i);
            button.addActionListener(e -> System.out.println("click!"));
        }
    }
}
