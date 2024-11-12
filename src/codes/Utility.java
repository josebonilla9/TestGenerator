package codes;


import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Utility {
        
    public static void SetButtonImg(JLabel jLabelButton, String imgName, int pointer, Dimension dimension) {
        int width = 0;
        int height = 0;
                        
        ImageIcon image = new ImageIcon("src/images/" + imgName + ".png");
        
        switch (pointer) {
            case 1 -> {
                int imgWidth = image.getIconWidth();
                int imgHeight = image.getIconHeight();
                int labelWidth = jLabelButton.getWidth();
                int labelHeight = jLabelButton.getHeight();

                float proportion = (imgWidth < imgHeight) ? (float) labelWidth / imgWidth : (float) labelHeight / imgHeight;

                width = Math.round(proportion * imgWidth);
                height = Math.round(proportion * imgHeight);
                break;
            }
            case 2 -> {
                width = dimension.width;
                height = dimension.height;
                break;
            }
        }
        
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        jLabelButton.setIcon(icon);

        jLabelButton.repaint();
    }
    
    public static void ChangeVisibilityChooserPanel(JPanel chooserPanel, JLabel jLabelButton) {
        if (chooserPanel.isVisible()){
            chooserPanel.setVisible(false);
            SetButtonImg(jLabelButton, "Desplegable_Off", 1, null);
        } else {
            chooserPanel.setVisible(true);
            SetButtonImg(jLabelButton, "Desplegable_On", 1, null);
        }
    }
        
    public static final List<ContentPanel> panelList = new ArrayList<>();
    
    public static void clearPanelList() {
        panelList.clear();
    }
    
    public static void AddNewPanels(JPanel containerPanel, MainFrame mainFrame) {
        ContentPanel questionAnswersPanel = new ContentPanel();
        questionAnswersPanel.mainFrame = mainFrame;
        
        panelList.add(questionAnswersPanel);
        
        containerPanel.add(questionAnswersPanel, 0);
        containerPanel.revalidate();
        containerPanel.repaint();
    }
    
    public static void RemovePanel(JPanel panel, JPanel containerPanel) {
        panelList.remove(panel);

        containerPanel.remove(panel);

        containerPanel.revalidate();
        containerPanel.repaint();
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
    
    public static void readCSV(JPanel containerPanel, String rootName, JLabel messageLabel, MainFrame mainFrame) {
        File f = new File("src/codes/" + rootName + ".csv");
        String[] datos;
                        
        try (Scanner scFile = new Scanner(f)) {
            if (!scFile.hasNextLine()){
                mainFrame.setDebugMessages(4);
            } else {
                while (scFile.hasNextLine()) {
                    datos = scFile.nextLine().split(",");
                    ContentPanel questionAnswersPanel = new ContentPanel(mainFrame, datos[0], datos[1], datos[2], datos[3], datos[4]);

                    panelList.add(questionAnswersPanel);
                    containerPanel.add(questionAnswersPanel);
                }
                containerPanel.revalidate();
                containerPanel.repaint();
            }
            
        } catch (FileNotFoundException e) {
            mainFrame.setDebugMessages(3);
            timeCounter(3, messageLabel);
        } catch (Exception e) {
            System.out.println("Se ha producido un error al escribir el archivo CSV: " + e.getMessage());
            mainFrame.setDebugMessages(2);
        }
    }
    
    public static void timeCounter(int seconds, JLabel messageLabel) {
        int delay = seconds * 1000;

        new Timer(delay, e -> messageLabel.setVisible(false)).start();
    }
    
    public static void setDebugMessageQuestion(JLabel messageLabel, int message, int timerSeconds) {
        messageLabel.setVisible(true);
        int counter = panelList.size();
        String messageText;
        Color color;
        Color white = new Color (0xF7F7F7);
        Color green = new Color (0x86D295);
        Color red = new Color (0xEB4151);
        Color yellow = new Color (0xFF9C00);

        switch (message) {
            case 1 -> {
                messageText = "Pregunta añadida correctamente (actualmente " + counter + " preguntas)";
                color = white;
                break;
            }
            case 2 -> {
                messageText = "Las preguntas han sido cargadas con éxito";
                color = green;
                break;
            }
            case 3 -> {
                messageText = "Las preguntas han sido guardadas (" + counter + " en total)";
                color = green;
                break;
            }
            case 4 -> {
                messageText = "Pregunta eliminada correctamente (actualmente " + counter + " preguntas)";
                color = white;
                break;
            }
            case 5 -> {
                messageText = "Error en la estructura del archivo de preguntas";
                color = red;
                break;
            }
            case 6 -> {
                messageText = "No se encontró el archivo de preguntas";
                color = red;
                break;
            }
            case 7 -> {
                messageText = "Este simulador no tiene preguntas";
                color = yellow;
                break;
            }
            case 8 -> {
                messageText = "Algunas preguntas están vacías";
                color = red;
                break;
            }
            default -> throw new AssertionError("Mensaje no reconocido: " + message);
        }
        
        messageLabel.setText(messageText);
        messageLabel.setForeground(color);
        
        timeCounter(timerSeconds, messageLabel);
    }
}