
import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
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
    
    public static final List<ContentPanel> panelList = new ArrayList<>();
    
    public static void clearPanelList() {
        panelList.clear();
    }
    
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
    
    public static void writeCSV(String rootName) {
        File f = new File("src/" + rootName + ".csv");
                
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
    
    public static void readCSV(JPanel containerPanel, String rootName, JLabel messageLabel) {
        File f = new File("src/" + rootName + ".csv");
        String[] datos;
                        
        try (Scanner scFile = new Scanner(f)) {
            while (scFile.hasNextLine()) {
                datos = scFile.nextLine().split(",");
                ContentPanel questionAnswersPanel = new ContentPanel(datos[0], datos[1], datos[2], datos[3], datos[4]);
                
                for (String dato : datos) {
                    System.out.println(dato);
                }
                
                panelList.add(questionAnswersPanel);
                containerPanel.add(questionAnswersPanel);
            }
            containerPanel.revalidate();
            containerPanel.repaint();
        } catch (FileNotFoundException e) {
            messageLabel.setVisible(true);

            messageLabel.setText("No se encontró el archivo de preguntas");
            messageLabel.setForeground(new Color (0xEB4151));

            timeCounter(3, messageLabel);
        } catch (Exception e) {
            System.out.println("Se ha producido un error al escribir el archivo CSV: " + e.getMessage());
        }
    }
    
    public static void timeCounter(int seconds, JLabel messageLabel) {
        int delay = seconds * 1000;

        new Timer(delay, e -> messageLabel.setVisible(false)).start();
    }
    
    public static void setDebugMessageQuestion(JLabel messageLabel) {
        messageLabel.setVisible(true);
        int counter = panelList.size() + 1;

        messageLabel.setText("Pregunta añadida correctamente (actualmente " + counter + " preguntas).");
        messageLabel.setForeground(new Color (0xF7F7F7));
        
        timeCounter(1, messageLabel);
    }
    
//    public static void setDebugMessageDeleteQuestion(JLabel debugText) {
//        debugText.setVisible(true);
//        int counter = Utility.panelList.size() - 1;
//
//        debugText.setText("Pregunta eliminada correctamente (actualmente " + counter + " preguntas).");
//        debugText.setForeground(new Color(0xF7F7F7));
//
//        Utility.timeCounter(1, debugText);
//    }
    
    public static void setDebugMessageQuestionCounter(JLabel messageLabel) {
        timeCounter(2, messageLabel);
        
        messageLabel.setVisible(true);
        int counter = panelList.size();

        messageLabel.setText("Las preguntas han sido guardadas (" + counter + " en total)");
        messageLabel.setForeground(new Color (0x86D295));
        
        timeCounter(2, messageLabel);
    }
    
    public static void setDebugMessageQuestion(JLabel messageLabel, String text, Color color, int seconds) {
        messageLabel.setVisible(true);

        messageLabel.setText(text);
        messageLabel.setForeground(color);
        
        timeCounter(seconds, messageLabel);
    }
}