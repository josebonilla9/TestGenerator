
package codes;

import java.awt.*;
import javax.swing.*;

public class CustomScrollBar extends JScrollBar {

    public CustomScrollBar() {
        setUI(new ScrollBarUI());
        setPreferredSize(new Dimension(10, 10));
        setForeground(new Color(105, 255, 255));
        setBackground(new Color(60, 81, 99));
    }
}