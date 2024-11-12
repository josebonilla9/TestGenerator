package codes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public final class ContentPanel extends JPanel {
    
    private String question;
    private String correctAnswer;
    private String incorrectAnswer1;
    private String incorrectAnswer2;
    private String incorrectAnswer3;
    
    public MainFrame mainFrame;
    
    private Dimension buttonDimension = new Dimension(12, 12);
            
    public ContentPanel() {
        initConfig();
    }

    public ContentPanel(MainFrame mainFrame, String question, String correctAnswer, String incorrectAnswer1, String incorrectAnswer2, String incorrectAnswer3) {
        initConfig();
        
        this.mainFrame = mainFrame;
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.incorrectAnswer1 = incorrectAnswer1;
        this.incorrectAnswer2 = incorrectAnswer2;
        this.incorrectAnswer3 = incorrectAnswer3;
        
        questionText.setText(question);
        correctAnswerText.setText(correctAnswer);
        incorrectAnswerText1.setText(incorrectAnswer1);
        incorrectAnswerText2.setText(incorrectAnswer2);
        incorrectAnswerText3.setText(incorrectAnswer3);
        
        adjustFontSizeToFit(questionText);
        adjustFontSizeToFit(correctAnswerText);
        adjustFontSizeToFit(incorrectAnswerText1);
        adjustFontSizeToFit(incorrectAnswerText2);
        adjustFontSizeToFit(incorrectAnswerText3);
    }
    
    public String toCSV() {
        question = questionText.getText();
        correctAnswer = correctAnswerText.getText();
        incorrectAnswer1 = incorrectAnswerText1.getText();
        incorrectAnswer2 = incorrectAnswerText2.getText();
        incorrectAnswer3 = incorrectAnswerText3.getText();
        
        return question + "," + correctAnswer + "," + incorrectAnswer1 + "," + incorrectAnswer2 + "," + incorrectAnswer3;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newQuestionPanel = new codes.RoundedPanel();
        questionPanel = new javax.swing.JPanel();
        questionTitle = new javax.swing.JLabel();
        minusButton = new javax.swing.JLabel();
        questionText = new javax.swing.JTextField();
        answersPanel1 = new javax.swing.JPanel();
        correctAnswerTitle = new javax.swing.JLabel();
        correctAnswerText = new javax.swing.JTextField();
        incorrectAnswerTitle = new javax.swing.JLabel();
        incorrectAnswerText1 = new javax.swing.JTextField();
        incorrectAnswerText2 = new javax.swing.JTextField();
        incorrectAnswerText3 = new javax.swing.JTextField();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(370, 225));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newQuestionPanel.setBackground(new java.awt.Color(26, 40, 55));
        newQuestionPanel.setPreferredSize(new java.awt.Dimension(370, 190));
        newQuestionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        questionPanel.setOpaque(false);

        questionTitle.setFont(new java.awt.Font("Raleway", 0, 10)); // NOI18N
        questionTitle.setForeground(new java.awt.Color(255, 255, 255));
        questionTitle.setText("Pregunta");
        questionTitle.setToolTipText("");
        questionTitle.setPreferredSize(new java.awt.Dimension(338, 12));
        questionPanel.add(questionTitle);

        minusButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menos_Off.png"))); // NOI18N
        minusButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minusButton.setPreferredSize(new java.awt.Dimension(12, 12));
        minusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusButtonMouseClicked(evt);
            }
        });
        questionPanel.add(minusButton);

        questionText.setBackground(new java.awt.Color(72, 82, 93));
        questionText.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        questionText.setForeground(new java.awt.Color(255, 255, 255));
        questionText.setToolTipText("");
        questionText.setBorder(null);
        questionText.setCaretColor(new java.awt.Color(255, 255, 255));
        questionText.setMargin(new java.awt.Insets(2, 20, 2, 6));
        questionText.setOpaque(true);
        questionText.setPreferredSize(new java.awt.Dimension(350, 30));
        questionPanel.add(questionText);

        newQuestionPanel.add(questionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 50));

        answersPanel1.setOpaque(false);

        correctAnswerTitle.setFont(new java.awt.Font("Raleway", 0, 10)); // NOI18N
        correctAnswerTitle.setForeground(new java.awt.Color(255, 255, 255));
        correctAnswerTitle.setText("Respuesta correcta");
        correctAnswerTitle.setToolTipText("");
        correctAnswerTitle.setPreferredSize(new java.awt.Dimension(350, 12));
        answersPanel1.add(correctAnswerTitle);

        correctAnswerText.setBackground(new java.awt.Color(72, 82, 93));
        correctAnswerText.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        correctAnswerText.setForeground(new java.awt.Color(255, 255, 255));
        correctAnswerText.setToolTipText("");
        correctAnswerText.setBorder(null);
        correctAnswerText.setCaretColor(new java.awt.Color(255, 255, 255));
        correctAnswerText.setMargin(new java.awt.Insets(2, 20, 2, 6));
        correctAnswerText.setOpaque(true);
        correctAnswerText.setPreferredSize(new java.awt.Dimension(350, 20));
        answersPanel1.add(correctAnswerText);

        incorrectAnswerTitle.setFont(new java.awt.Font("Raleway", 0, 10)); // NOI18N
        incorrectAnswerTitle.setForeground(new java.awt.Color(255, 255, 255));
        incorrectAnswerTitle.setText("Respuesta incorrecta");
        incorrectAnswerTitle.setToolTipText("");
        incorrectAnswerTitle.setPreferredSize(new java.awt.Dimension(350, 12));
        answersPanel1.add(incorrectAnswerTitle);

        incorrectAnswerText1.setBackground(new java.awt.Color(72, 82, 93));
        incorrectAnswerText1.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        incorrectAnswerText1.setForeground(new java.awt.Color(255, 255, 255));
        incorrectAnswerText1.setToolTipText("");
        incorrectAnswerText1.setBorder(null);
        incorrectAnswerText1.setCaretColor(new java.awt.Color(255, 255, 255));
        incorrectAnswerText1.setMargin(new java.awt.Insets(2, 20, 2, 6));
        incorrectAnswerText1.setOpaque(true);
        incorrectAnswerText1.setPreferredSize(new java.awt.Dimension(350, 20));
        answersPanel1.add(incorrectAnswerText1);

        incorrectAnswerText2.setBackground(new java.awt.Color(72, 82, 93));
        incorrectAnswerText2.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        incorrectAnswerText2.setForeground(new java.awt.Color(255, 255, 255));
        incorrectAnswerText2.setToolTipText("");
        incorrectAnswerText2.setBorder(null);
        incorrectAnswerText2.setCaretColor(new java.awt.Color(255, 255, 255));
        incorrectAnswerText2.setMargin(new java.awt.Insets(2, 20, 2, 6));
        incorrectAnswerText2.setOpaque(true);
        incorrectAnswerText2.setPreferredSize(new java.awt.Dimension(350, 20));
        answersPanel1.add(incorrectAnswerText2);

        incorrectAnswerText3.setBackground(new java.awt.Color(72, 82, 93));
        incorrectAnswerText3.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        incorrectAnswerText3.setForeground(new java.awt.Color(255, 255, 255));
        incorrectAnswerText3.setToolTipText("");
        incorrectAnswerText3.setBorder(null);
        incorrectAnswerText3.setCaretColor(new java.awt.Color(255, 255, 255));
        incorrectAnswerText3.setMargin(new java.awt.Insets(2, 20, 2, 6));
        incorrectAnswerText3.setOpaque(true);
        incorrectAnswerText3.setPreferredSize(new java.awt.Dimension(350, 20));
        answersPanel1.add(incorrectAnswerText3);

        newQuestionPanel.add(answersPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 370, 140));

        add(newQuestionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void minusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusButtonMouseClicked
        JPanel parent = (JPanel) this.getParent();
        if (parent != null) {
            Utility.RemovePanel(this, parent);
        }
    }//GEN-LAST:event_minusButtonMouseClicked

    public void initConfig() {
        initComponents();
        Utility.SetButtonImg(minusButton, "Menos_Off", 2, buttonDimension);
        mouseEventsMinusButton();
    }
    
    public void mouseEventsMinusButton() {
        minusButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
        
                mainFrame.setDebugMessages(1);                
            }
            @Override
            public void mouseEntered(MouseEvent evt) {
                Utility.SetButtonImg(minusButton, "Menos_Off", 2, buttonDimension);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                Utility.SetButtonImg(minusButton, "Menos_Off", 2, buttonDimension); 
            }
        });
    }

    private void adjustFontSizeToFit(JTextField textField) {
        Font font = textField.getFont();
        FontMetrics metrics = textField.getFontMetrics(font);
        int fieldWidth = 350;

        while (metrics.stringWidth(textField.getText()) > fieldWidth && font.getSize() > 10) {
            font = font.deriveFont((float) font.getSize() - 1);
            textField.setFont(font);
            metrics = textField.getFontMetrics(font);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel answersPanel1;
    private javax.swing.JTextField correctAnswerText;
    private javax.swing.JLabel correctAnswerTitle;
    private javax.swing.JTextField incorrectAnswerText1;
    private javax.swing.JTextField incorrectAnswerText2;
    private javax.swing.JTextField incorrectAnswerText3;
    private javax.swing.JLabel incorrectAnswerTitle;
    private javax.swing.JLabel minusButton;
    private codes.RoundedPanel newQuestionPanel;
    private javax.swing.JPanel questionPanel;
    private javax.swing.JTextField questionText;
    private javax.swing.JLabel questionTitle;
    // End of variables declaration//GEN-END:variables
}
