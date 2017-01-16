package Application;


import javax.swing.*;
import java.awt.*;

class Window extends JFrame {
    private char previousChar = 'x';
    private JButton[] buttons;

    Window(String title) {
        super(title);
    }

    void initializeFrame() {
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 3));
        buttons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            JButton button = new JButton();
            button.addActionListener(event -> createActionListener(button));
            buttons[i] = button;
            add(button);
        }
        setVisible(true);
    }

    private void createActionListener(JButton button) {
        if (button.getText().equals("")) {
            button.setIcon(new ImageIcon("src\\images\\" + previousChar + ".jpg"));
            if (previousChar == 'o') {
                previousChar = 'x';
            } else {
                previousChar = 'o';
            }
        } else {
            System.out.println("pole zajete");
        }
    }
}
