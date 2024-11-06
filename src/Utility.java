
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


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
    
    public static void ChangeVisibilityChooserPanel(JPanel chooserPanel, JLabel jLabelButton) {
        if (chooserPanel.isVisible()){
            chooserPanel.setVisible(false);
            SetChooserButtonImg(jLabelButton, "Desplegable_Off");
        } else {
            chooserPanel.setVisible(true);
            SetChooserButtonImg(jLabelButton, "Desplegable_On");
        }
    }
    
    public static void SetImgWithDimension(JLabel jLabelButton, String imgName, Dimension dimension) {
        // Carga la imagen desde el directorio especificado
        ImageIcon image = new ImageIcon("src/images/" + imgName + ".png");
        

        Icon icon = new ImageIcon(image.getImage().getScaledInstance(dimension.width, dimension.height, Image.SCALE_SMOOTH));
        jLabelButton.setIcon(icon);
        
        // Redibuja el botón
        jLabelButton.repaint();
    }
    
    private static final List<ContentPanel> panelList = new ArrayList<>();
    
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
    
    public static void writeCSV() {
        File f = new File("src/questions.csv");
                
        try (FileWriter fw = new FileWriter(f)) {
            for (ContentPanel questionAnswersPanel : panelList) {
                if (questionAnswersPanel != null) {
                    fw.write(questionAnswersPanel.toCSV() + "\n");
                }
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error al escribir el archivo CSV: " + e.getMessage());
        }
    }
    
    public static void readCSV(JPanel containerPanel) {
        File f = new File("src/questions.csv");
        String[] datos;
                        
        try (Scanner scFile = new Scanner(f)) {
            while (scFile.hasNextLine()) {
                datos = scFile.nextLine().split(",");
                ContentPanel questionAnswersPanel = new ContentPanel(datos[0], datos[1], datos[2], datos[3], datos[4]);
                
                for (String dato : datos) {
                    System.out.println();
                }
                
                panelList.add(questionAnswersPanel);
                
                containerPanel.add(panelList.get(0), 0);
                containerPanel.revalidate();
                containerPanel.repaint();
                
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error al escribir el archivo CSV: " + e.getMessage());
        }
    }
}