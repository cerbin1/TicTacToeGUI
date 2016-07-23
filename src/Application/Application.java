package Application;

import javax.swing.*;
import java.awt.*;

public class Application {
    public static void main(String[] args) {
        Window window = new Window("Tic Tac Toe");
        window.init();
        window.setVisible(true);
    }

}
