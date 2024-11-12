package codes;


import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Utility {
    
    public static void setButtonImg(JLabel jLabelButton, String imgName, int pointer, Dimension dimension) {
        ImageIcon image = new ImageIcon("src/images/" + imgName + ".png");
        int width = dimension != null ? dimension.width : jLabelButton.getWidth();
        int height = dimension != null ? dimension.height : jLabelButton.getHeight();
        
        if (pointer == 1) {
            float proportion = Math.min((float) width / image.getIconWidth(), (float) height / image.getIconHeight());
            width = Math.round(proportion * image.getIconWidth());
            height = Math.round(proportion * image.getIconHeight());
        }
        
        jLabelButton.setIcon(new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        jLabelButton.repaint();
    }
    
    public static void toggleChooserPanelVisibility(JPanel chooserPanel, JLabel jLabelButton) {
        boolean isVisible = chooserPanel.isVisible();
        chooserPanel.setVisible(!isVisible);
        setButtonImg(jLabelButton, isVisible ? "Desplegable_Off" : "Desplegable_On", 1, null);
    }
    
    public static final List<ContentPanel> panelList = new ArrayList<>();
    
    public static void clearPanelList() {
        panelList.clear();
    }
    
    public static void addNewPanel(JPanel containerPanel, MainFrame mainFrame) {
        ContentPanel questionAnswersPanel = new ContentPanel();
        questionAnswersPanel.mainFrame = mainFrame;
        panelList.add(questionAnswersPanel);
        
        containerPanel.add(questionAnswersPanel, 0);
        containerPanel.revalidate();
        containerPanel.repaint();
    }
    
    public static void removePanel(JPanel panel, JPanel containerPanel) {
        panelList.remove(panel);
        containerPanel.remove(panel);
        containerPanel.revalidate();
        containerPanel.repaint();
    }
    
    public static void writeCSV(String rootName) {
        try (FileWriter fw = new FileWriter("src/codes/" + rootName + ".csv")) {
            for (ContentPanel panel : panelList) {
                if (panel != null) fw.write(panel.toCSV() + "\n");
            }
        } catch (Exception e) {
            System.out.println("Error al escribir el archivo CSV: " + e.getMessage());
        }
    }
    
    public static void readCSV(JPanel containerPanel, String rootName, JLabel messageLabel, MainFrame mainFrame) {
        File file = new File("src/codes/" + rootName + ".csv");
        
        try (Scanner scFile = new Scanner(file)) {
            if (!scFile.hasNextLine()) {
                mainFrame.setDebugMessages(4);
            } else {
                while (scFile.hasNextLine()) {
                    String[] data = scFile.nextLine().split(",");
                    ContentPanel panel = new ContentPanel(mainFrame, data[0], data[1], data[2], data[3], data[4]);
                    panelList.add(panel);
                    containerPanel.add(panel);
                }
                containerPanel.revalidate();
                containerPanel.repaint();
            }
        } catch (FileNotFoundException e) {
            mainFrame.setDebugMessages(3);
            startTimer(3, messageLabel);
        } catch (Exception e) {
            System.out.println("Error al leer el archivo CSV: " + e.getMessage());
            mainFrame.setDebugMessages(2);
        }
    }
    
    public static void startTimer(int seconds, JLabel messageLabel) {
        new Timer(seconds * 1000, e -> messageLabel.setVisible(false)).start();
    }
    
    public static void setDebugMessage(JLabel messageLabel, int messageCode, int timerSeconds) {
        String[] messages = {
            "Pregunta añadida correctamente",
            "Las preguntas han sido cargadas con éxito",
            "Las preguntas han sido guardadas",
            "Pregunta eliminada correctamente",
            "Error en la estructura del archivo de preguntas",
            "No se encontró el archivo de preguntas",
            "Este simulador no tiene preguntas",
            "Algunas preguntas están vacías"
        };
        Color[] colors = {Color.WHITE, new Color(0x86D295), Color.RED, new Color(0xFF9C00)};
        
        String messageText = messages[messageCode - 1] + (messageCode == 1 || messageCode == 4 ? " (actualmente " + panelList.size() + " preguntas)" : "");
        Color color = switch (messageCode) {
            case 1, 4 -> colors[0];
            case 2, 3 -> colors[1];
            case 5, 6, 8 -> colors[2];
            case 7 -> colors[3];
            default -> throw new IllegalArgumentException("Mensaje no reconocido: " + messageCode);
        };
        
        messageLabel.setText(messageText);
        messageLabel.setForeground(color);
        messageLabel.setVisible(true);
        startTimer(timerSeconds, messageLabel);
    }
}