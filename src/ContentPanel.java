
public class ContentPanel extends javax.swing.JPanel {

    public ContentPanel() {
        initComponents();
        Utility.SetAddQuestionInfoButtonImg(addButton, "Mas_Off");
        Utility.SetAddQuestionInfoButtonImg(infoButton, "Info_On");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addQuestionPanel = new javax.swing.JPanel();
        addQuestionText = new javax.swing.JLabel();
        addButton = new javax.swing.JLabel();
        infoButton = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(370, 500));
        setRequestFocusEnabled(false);

        addQuestionPanel.setOpaque(false);
        addQuestionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addQuestionText.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        addQuestionText.setForeground(new java.awt.Color(255, 255, 255));
        addQuestionText.setText("Añadir una pregunta");
        addQuestionPanel.add(addQuestionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Mas_Off.png"))); // NOI18N
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.setPreferredSize(new java.awt.Dimension(18, 18));
        addQuestionPanel.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        infoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Info_Off.png"))); // NOI18N
        infoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoButton.setPreferredSize(new java.awt.Dimension(18, 18));
        addQuestionPanel.add(infoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        add(addQuestionPanel);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButton;
    private javax.swing.JPanel addQuestionPanel;
    private javax.swing.JLabel addQuestionText;
    private javax.swing.JLabel infoButton;
    // End of variables declaration//GEN-END:variables
}
