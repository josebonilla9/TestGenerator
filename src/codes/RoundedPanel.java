package codes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;


public class RoundedPanel extends JPanel {
    private int radius;
    
    public RoundedPanel() {
        this.radius = 20;
        setOpaque(false);
    }
    
    public RoundedPanel(int radius) {
        this.radius = radius;
        setOpaque(false);
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public int getRadius() {
        return this.radius;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2d.setColor((getBackground()));
        g2d.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), radius, radius));
    }
    
    public void setBackgroung(Color bg) {
        super.setBackground(bg);
        repaint();
    }
}
