
import java.awt.*;
import javax.swing.*;


public class ContentPanel extends javax.swing.JPanel {

    public ContentPanel() {
        initComponents();
        Utility.SetAddQuestionInfoButtonImg(minusButton, "Menos_Off", new Dimension(12, 12));   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newQuestionPanel = new javax.swing.JPanel();
        questionPanel = new javax.swing.JPanel();
        questionTitle = new javax.swing.JLabel();
        minusButton = new javax.swing.JLabel();
        questionText = new javax.swing.JTextField();
        answersPanel = new javax.swing.JPanel();
        correctAnswerTitle = new javax.swing.JLabel();
        correctAnswerText = new javax.swing.JTextField();
        incorrectAnswerTitle = new javax.swing.JLabel();
        incorrectAnswerText1 = new javax.swing.JTextField();
        incorrectAnswerText2 = new javax.swing.JTextField();
        incorrectAnswerText3 = new javax.swing.JTextField();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(370, 500));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newQuestionPanel.setBackground(new java.awt.Color(26, 40, 55));
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

        answersPanel.setOpaque(false);

        correctAnswerTitle.setFont(new java.awt.Font("Raleway", 0, 10)); // NOI18N
        correctAnswerTitle.setForeground(new java.awt.Color(255, 255, 255));
        correctAnswerTitle.setText("Respuesta correcta");
        correctAnswerTitle.setToolTipText("");
        correctAnswerTitle.setPreferredSize(new java.awt.Dimension(350, 12));
        answersPanel.add(correctAnswerTitle);

        correctAnswerText.setBackground(new java.awt.Color(72, 82, 93));
        correctAnswerText.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        correctAnswerText.setForeground(new java.awt.Color(255, 255, 255));
        correctAnswerText.setToolTipText("");
        correctAnswerText.setBorder(null);
        correctAnswerText.setCaretColor(new java.awt.Color(255, 255, 255));
        correctAnswerText.setMargin(new java.awt.Insets(2, 20, 2, 6));
        correctAnswerText.setOpaque(true);
        correctAnswerText.setPreferredSize(new java.awt.Dimension(350, 20));
        answersPanel.add(correctAnswerText);

        incorrectAnswerTitle.setFont(new java.awt.Font("Raleway", 0, 10)); // NOI18N
        incorrectAnswerTitle.setForeground(new java.awt.Color(255, 255, 255));
        incorrectAnswerTitle.setText("Respuesta incorrecta");
        incorrectAnswerTitle.setToolTipText("");
        incorrectAnswerTitle.setPreferredSize(new java.awt.Dimension(350, 12));
        answersPanel.add(incorrectAnswerTitle);

        incorrectAnswerText1.setBackground(new java.awt.Color(72, 82, 93));
        incorrectAnswerText1.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        incorrectAnswerText1.setForeground(new java.awt.Color(255, 255, 255));
        incorrectAnswerText1.setToolTipText("");
        incorrectAnswerText1.setBorder(null);
        incorrectAnswerText1.setCaretColor(new java.awt.Color(255, 255, 255));
        incorrectAnswerText1.setMargin(new java.awt.Insets(2, 20, 2, 6));
        incorrectAnswerText1.setOpaque(true);
        incorrectAnswerText1.setPreferredSize(new java.awt.Dimension(350, 20));
        answersPanel.add(incorrectAnswerText1);

        incorrectAnswerText2.setBackground(new java.awt.Color(72, 82, 93));
        incorrectAnswerText2.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        incorrectAnswerText2.setForeground(new java.awt.Color(255, 255, 255));
        incorrectAnswerText2.setToolTipText("");
        incorrectAnswerText2.setBorder(null);
        incorrectAnswerText2.setCaretColor(new java.awt.Color(255, 255, 255));
        incorrectAnswerText2.setMargin(new java.awt.Insets(2, 20, 2, 6));
        incorrectAnswerText2.setOpaque(true);
        incorrectAnswerText2.setPreferredSize(new java.awt.Dimension(350, 20));
        answersPanel.add(incorrectAnswerText2);

        incorrectAnswerText3.setBackground(new java.awt.Color(72, 82, 93));
        incorrectAnswerText3.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        incorrectAnswerText3.setForeground(new java.awt.Color(255, 255, 255));
        incorrectAnswerText3.setToolTipText("");
        incorrectAnswerText3.setBorder(null);
        incorrectAnswerText3.setCaretColor(new java.awt.Color(255, 255, 255));
        incorrectAnswerText3.setMargin(new java.awt.Insets(2, 20, 2, 6));
        incorrectAnswerText3.setOpaque(true);
        incorrectAnswerText3.setPreferredSize(new java.awt.Dimension(350, 20));
        answersPanel.add(incorrectAnswerText3);

        newQuestionPanel.add(answersPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 370, 140));

        add(newQuestionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 370, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void minusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusButtonMouseClicked
        JPanel parent = (JPanel) this.getParent();
            if (parent != null) {
                Utility.RemovePanel(this, parent);
            }
    }//GEN-LAST:event_minusButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel answersPanel;
    private javax.swing.JTextField correctAnswerText;
    private javax.swing.JLabel correctAnswerTitle;
    private javax.swing.JTextField incorrectAnswerText1;
    private javax.swing.JTextField incorrectAnswerText2;
    private javax.swing.JTextField incorrectAnswerText3;
    private javax.swing.JLabel incorrectAnswerTitle;
    private javax.swing.JLabel minusButton;
    private javax.swing.JPanel newQuestionPanel;
    private javax.swing.JPanel questionPanel;
    private javax.swing.JTextField questionText;
    private javax.swing.JLabel questionTitle;
    // End of variables declaration//GEN-END:variables
}
