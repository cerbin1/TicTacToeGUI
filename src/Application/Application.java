package Application;

import javax.swing.*;
import java.awt.*;

public class Application {
    public static void main(String[] args) {
        JFrame window = new Window("Tic Tac Toe");
        window.setSize(300, 300);


        window.setLocationRelativeTo(null);

        window.setVisible(true);
    }

}
