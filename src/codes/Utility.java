package codes;


import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Utility {
        
    public static void SetChooserButtonImg(JLabel jLabelButtons, String name) {
        ImageIcon image = new ImageIcon("src/images/" + name + ".png");
        
        int imgWidth = image.getIconWidth();
        int imgHeight = image.getIconHeight();

        int labelWidth = jLabelButtons.getWidth();
        int labelHeight = jLabelButtons.getHeight();
        
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
        ImageIcon image = new ImageIcon("src/images/" + imgName + ".png");
        

        Icon icon = new ImageIcon(image.getImage().getScaledInstance(dimension.width, dimension.height, Image.SCALE_SMOOTH));
        jLabelButton.setIcon(icon);
        
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
        File f = new File("src/codes/" + rootName + ".csv");
                
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
        File f = new File("src/codes/" + rootName + ".csv");
        String[] datos;
                        
        try (Scanner scFile = new Scanner(f)) {
            while (scFile.hasNextLine()) {
                MainFrame mainFrame = new MainFrame();
                datos = scFile.nextLine().split(",");
                ContentPanel questionAnswersPanel = new ContentPanel(mainFrame, datos[0], datos[1], datos[2], datos[3], datos[4]);
                
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
        int counter = panelList.size();

        messageLabel.setText("Pregunta añadida correctamente (actualmente " + counter + " preguntas).");
        messageLabel.setForeground(new Color (0xF7F7F7));
        
        timeCounter(1, messageLabel);
    }
    
    public static void setDebugMessageQuestionCounter(JLabel messageLabel) {
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