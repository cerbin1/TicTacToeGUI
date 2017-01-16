package Application;

import java.awt.*;

public class Application {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new Window("Tic Tac Toe"));
    }
}
