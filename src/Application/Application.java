package Application;

import javax.swing.*;
import java.awt.*;

public class Application {
    private String previousPlayer = "x";
    private JButton[] buttons;

    private Application(String title) {
        createGameFrame(title);
    }

    private void createGameFrame(String title) {
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
    }

    private void createActionListener(JButton button) {
        if (button.getText().isEmpty()) {
            button.setText(previousPlayer);
            if (previousPlayer.equals("o")) {
                previousPlayer = "x";
            } else {
                previousPlayer = "o";
            }
            checkIfSomeoneWins("x");
        } else {
            System.out.println("Pole zajete");
        }
    }

    private void checkIfSomeoneWins(String player) {
        if (buttons[0].getText().equals(player)) {
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new Application("Tic Tac Toe"));
    }
}
