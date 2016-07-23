package Application;


import javax.swing.*;

class Window extends JFrame {
    Window(String title) {
        super(title);
    }

    public void setLocationToCenter() {
        setLocationRelativeTo(null);
    }
}
