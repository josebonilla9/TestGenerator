
import java.awt.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;


public class Utility {
        
    public static void SetChooserButtonImg(JLabel jLabelButtons, String name) {
        // Carga la imagen y ajusta su tamaño al de las dimensiones del botón
        ImageIcon image = new ImageIcon("src/images/" + name + ".png");
        
        int imgWidth = image.getIconWidth();
        int imgHeight = image.getIconHeight();

        int labelWidth = jLabelButtons.getWidth();
        int labelHeight = jLabelButtons.getHeight();
        
        // Ajusta el tamaño basado en las proporciones
        if (imgWidth < imgHeight) {
            float proporcionWidth = (float) labelWidth / imgWidth;
            int width = Math.round(proporcionWidth * imgWidth);
            int height = Math.round(proporcionWidth * imgHeight);   
            
            Icon icon = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
            jLabelButtons.setIcon(icon);
        } else {
            float proporcionHeight = (float) labelHeight / imgHeight;
            int width = Math.round(proporcionHeight * imgWidth);
            int height = Math.round(proporcionHeight * imgHeight);
            
            Icon icon = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
            jLabelButtons.setIcon(icon);
        }
        
        // Redibuja el botón
        jLabelButtons.repaint();
    }
    
    public static void SetCreateButtonImg(JLabel jLabelButton, String imgName) {
        // Carga la imagen desde el directorio especificado
        ImageIcon image = new ImageIcon("src/images/" + imgName + ".png");
        
        // Obtiene las dimensiones del JLabel
        int labelWidth = jLabelButton.getWidth();
        int labelHeight = jLabelButton.getHeight();

        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH));
        jLabelButton.setIcon(icon);
        
        // Redibuja el botón
        jLabelButton.repaint();
    }
    
    public static void ChangeVisibilityChooserPanel(JPanel chooserPanel, JLabel jLabelButton) {
        if (chooserPanel.isVisible()){
            chooserPanel.setVisible(false);
            SetChooserButtonImg(jLabelButton, "Desplegable_Off");
        } else {
            chooserPanel.setVisible(true);
            SetChooserButtonImg(jLabelButton, "Desplegable_On");
        }
    }
    
    public static void SetAddQuestionInfoButtonImg(JLabel jLabelButton, String imgName, Dimension dimension) {
        // Carga la imagen desde el directorio especificado
        ImageIcon image = new ImageIcon("src/images/" + imgName + ".png");
        

        Icon icon = new ImageIcon(image.getImage().getScaledInstance(dimension.width, dimension.height, Image.SCALE_SMOOTH));
        jLabelButton.setIcon(icon);
        
        // Redibuja el botón
        jLabelButton.repaint();
    }
    
    private static final List<JPanel> panelList = new ArrayList<>();
    
    public static void AddNewPanels(JPanel containerPanel) {
        ContentPanel questionAnswersPanel = new ContentPanel();
        
        panelList.add(questionAnswersPanel);
        
        containerPanel.add(panelList.get(panelList.size() - 1), 0);
        containerPanel.revalidate();
        containerPanel.repaint();

        System.out.println("Se ha agregado otro panel");
        System.out.println("Total de paneles en la lista: " + panelList.size());
    }
    
    public static void RemovePanel(JPanel panel, JPanel containerPanel) {
        panelList.remove(panel);

        containerPanel.remove(panel);

        containerPanel.revalidate();
        containerPanel.repaint();

        System.out.println("Se ha eliminado un panel");
        System.out.println("Total de paneles en la lista: " + panelList.size());
    }
}
