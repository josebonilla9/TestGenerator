
package codes;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class ScrollBarUI extends BasicScrollBarUI {

    private final int THUMB_SIZE = 80;

    @Override
    protected Dimension getMaximumThumbSize() {
        if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
            return new Dimension(0, THUMB_SIZE);
        } else {
            return new Dimension(THUMB_SIZE, 0);
        }
    }

    @Override
    protected Dimension getMinimumThumbSize() {
        if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
            return new Dimension(0, THUMB_SIZE);
        } else {
            return new Dimension(THUMB_SIZE, 0);
        }
    }

    @Override
    protected JButton createIncreaseButton(int i) {
        return new ScrollBarButton();
    }

    @Override
    protected JButton createDecreaseButton(int i) {
        return new ScrollBarButton();
    }

    @Override
    protected void paintTrack(Graphics grphcs, JComponent jc, Rectangle rctngl) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int orientation = scrollbar.getOrientation();
        int size, x, y, width, height;
        
        if (orientation == JScrollBar.VERTICAL) {
            size = rctngl.width / 2;
            x = rctngl.x + ((rctngl.width - size) / 2);
            y = rctngl.y;
            width = size;
            height = rctngl.height;
        } else {
            size = rctngl.height / 2;
            y = rctngl.y + ((rctngl.height - size) / 2);
            x = 0;
            width = rctngl.width;
            height = size;
        }
        g2.setColor(new Color(60, 81, 99));
        g2.fillRoundRect(x, y, width, height, 20, 20);
    }

    @Override
    protected void paintThumb(Graphics grphcs, JComponent jc, Rectangle rctngl) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int x = rctngl.x;
        int y = rctngl.y;
        int width = rctngl.width;
        int height = rctngl.height;
        
        if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
            y += 0;
            height -= 0;
        } else {
            x += 8;
            width -= 16;
        }
        g2.setColor(scrollbar.getForeground());
        g2.fillRoundRect(x, y, width, height, 10, 10);
    }

    private class ScrollBarButton extends JButton {

        public ScrollBarButton() {
            setBorder(BorderFactory.createEmptyBorder());
        }
        @Override
        public void paint(Graphics grphcs) {
        }
    }
}