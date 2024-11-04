
public class ContentPanel extends javax.swing.JPanel {

    public ContentPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newQuestionPanel = new javax.swing.JPanel();
        questionTitlePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
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

        questionTitlePanel.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Raleway", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pregunta");
        jLabel2.setToolTipText("");
        jLabel2.setPreferredSize(new java.awt.Dimension(350, 12));
        questionTitlePanel.add(jLabel2);

        jTextField2.setBackground(new java.awt.Color(72, 82, 93));
        jTextField2.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setToolTipText("");
        jTextField2.setBorder(null);
        jTextField2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField2.setMargin(new java.awt.Insets(2, 20, 2, 6));
        jTextField2.setOpaque(true);
        jTextField2.setPreferredSize(new java.awt.Dimension(350, 30));
        questionTitlePanel.add(jTextField2);

        newQuestionPanel.add(questionTitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 50));

        jPanel1.setOpaque(false);

        correctAnswerTitle.setFont(new java.awt.Font("Raleway", 0, 10)); // NOI18N
        correctAnswerTitle.setForeground(new java.awt.Color(255, 255, 255));
        correctAnswerTitle.setText("Respuesta correcta");
        correctAnswerTitle.setToolTipText("");
        correctAnswerTitle.setPreferredSize(new java.awt.Dimension(350, 12));
        jPanel1.add(correctAnswerTitle);

        correctAnswerText.setBackground(new java.awt.Color(72, 82, 93));
        correctAnswerText.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        correctAnswerText.setForeground(new java.awt.Color(255, 255, 255));
        correctAnswerText.setToolTipText("");
        correctAnswerText.setBorder(null);
        correctAnswerText.setCaretColor(new java.awt.Color(255, 255, 255));
        correctAnswerText.setMargin(new java.awt.Insets(2, 20, 2, 6));
        correctAnswerText.setOpaque(true);
        correctAnswerText.setPreferredSize(new java.awt.Dimension(350, 20));
        jPanel1.add(correctAnswerText);

        incorrectAnswerTitle.setFont(new java.awt.Font("Raleway", 0, 10)); // NOI18N
        incorrectAnswerTitle.setForeground(new java.awt.Color(255, 255, 255));
        incorrectAnswerTitle.setText("Respuesta incorrecta");
        incorrectAnswerTitle.setToolTipText("");
        incorrectAnswerTitle.setPreferredSize(new java.awt.Dimension(350, 12));
        jPanel1.add(incorrectAnswerTitle);

        incorrectAnswerText1.setBackground(new java.awt.Color(72, 82, 93));
        incorrectAnswerText1.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        incorrectAnswerText1.setForeground(new java.awt.Color(255, 255, 255));
        incorrectAnswerText1.setToolTipText("");
        incorrectAnswerText1.setBorder(null);
        incorrectAnswerText1.setCaretColor(new java.awt.Color(255, 255, 255));
        incorrectAnswerText1.setMargin(new java.awt.Insets(2, 20, 2, 6));
        incorrectAnswerText1.setOpaque(true);
        incorrectAnswerText1.setPreferredSize(new java.awt.Dimension(350, 20));
        jPanel1.add(incorrectAnswerText1);

        incorrectAnswerText2.setBackground(new java.awt.Color(72, 82, 93));
        incorrectAnswerText2.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        incorrectAnswerText2.setForeground(new java.awt.Color(255, 255, 255));
        incorrectAnswerText2.setToolTipText("");
        incorrectAnswerText2.setBorder(null);
        incorrectAnswerText2.setCaretColor(new java.awt.Color(255, 255, 255));
        incorrectAnswerText2.setMargin(new java.awt.Insets(2, 20, 2, 6));
        incorrectAnswerText2.setOpaque(true);
        incorrectAnswerText2.setPreferredSize(new java.awt.Dimension(350, 20));
        jPanel1.add(incorrectAnswerText2);

        incorrectAnswerText3.setBackground(new java.awt.Color(72, 82, 93));
        incorrectAnswerText3.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        incorrectAnswerText3.setForeground(new java.awt.Color(255, 255, 255));
        incorrectAnswerText3.setToolTipText("");
        incorrectAnswerText3.setBorder(null);
        incorrectAnswerText3.setCaretColor(new java.awt.Color(255, 255, 255));
        incorrectAnswerText3.setMargin(new java.awt.Insets(2, 20, 2, 6));
        incorrectAnswerText3.setOpaque(true);
        incorrectAnswerText3.setPreferredSize(new java.awt.Dimension(350, 20));
        jPanel1.add(incorrectAnswerText3);

        newQuestionPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 370, 140));

        add(newQuestionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 200));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField correctAnswerText;
    private javax.swing.JLabel correctAnswerTitle;
    private javax.swing.JTextField incorrectAnswerText1;
    private javax.swing.JTextField incorrectAnswerText2;
    private javax.swing.JTextField incorrectAnswerText3;
    private javax.swing.JLabel incorrectAnswerTitle;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel newQuestionPanel;
    private javax.swing.JPanel questionTitlePanel;
    // End of variables declaration//GEN-END:variables
}
