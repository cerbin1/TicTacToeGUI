package Application;


import javax.swing.*;
import java.awt.*;

class Window {
    private char previousChar = 'x';
    private JButton[] buttons;

    Window(String title) {
        createGameFrame(title);
    }

    JFrame createGameFrame(String title) {
        JFrame frame = new JFrame(title);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridLayout(3, 3));
        buttons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            JButton button = new JButton();
            button.addActionListener(event -> createActionListener(button));
            buttons[i] = button;
            frame.add(button);
        }
        frame.setVisible(true);
        return frame;
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
