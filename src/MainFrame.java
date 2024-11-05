
import java.awt.*;
import javax.swing.*;


public final class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        showImg();
        chooserPanel.setVisible(false);
        showLauncherButtons();
        showQuestionPanels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        simulatorTypePanel = new javax.swing.JPanel();
        simulatorTypeText = new javax.swing.JLabel();
        simulatorChooser = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        chooserPanel = new javax.swing.JPanel();
        selection1 = new javax.swing.JLabel();
        selection2 = new javax.swing.JLabel();
        selection3 = new javax.swing.JLabel();
        selection4 = new javax.swing.JLabel();
        selection5 = new javax.swing.JLabel();
        chooserBackground = new javax.swing.JLabel();
        addQuestionPanel = new javax.swing.JPanel();
        addQuestionText = new javax.swing.JLabel();
        addButton = new javax.swing.JLabel();
        infoButton = new javax.swing.JLabel();
        questionsPanel = new javax.swing.JPanel();
        lowerPanel = new javax.swing.JPanel();
        buttonCreate = new javax.swing.JLabel();
        debugText = new javax.swing.JLabel();
        mainBackground = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(430, 932));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Crea tu simulador teórico");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 300, 40));

        simulatorTypePanel.setOpaque(false);

        simulatorTypeText.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        simulatorTypeText.setForeground(new java.awt.Color(255, 255, 255));
        simulatorTypeText.setText("Tipo de Simulador");

        simulatorChooser.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        simulatorChooser.setForeground(new java.awt.Color(255, 255, 255));
        simulatorChooser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        simulatorChooser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Desplegable_Off.png"))); // NOI18N
        simulatorChooser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simulatorChooser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        simulatorChooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simulatorChooserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout simulatorTypePanelLayout = new javax.swing.GroupLayout(simulatorTypePanel);
        simulatorTypePanel.setLayout(simulatorTypePanelLayout);
        simulatorTypePanelLayout.setHorizontalGroup(
            simulatorTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(simulatorTypePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(simulatorTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
            .addComponent(simulatorChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        simulatorTypePanelLayout.setVerticalGroup(
            simulatorTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, simulatorTypePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(simulatorTypeText)
                .addGap(18, 18, 18)
                .addComponent(simulatorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel1.add(simulatorTypePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 350, 90));

        contentPanel.setOpaque(false);

        chooserPanel.setBackground(new java.awt.Color(57, 68, 80));
        chooserPanel.setMinimumSize(new java.awt.Dimension(368, 180));
        chooserPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selection1.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        selection1.setForeground(new java.awt.Color(255, 255, 255));
        selection1.setText(" Ahora Aprendo");
        selection1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selection1.setPreferredSize(new java.awt.Dimension(370, 30));
        chooserPanel.add(selection1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        selection2.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        selection2.setForeground(new java.awt.Color(255, 255, 255));
        selection2.setText(" El Cazador");
        selection2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selection2.setPreferredSize(new java.awt.Dimension(370, 30));
        chooserPanel.add(selection2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        selection3.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        selection3.setForeground(new java.awt.Color(255, 255, 255));
        selection3.setText(" Atrapa los Univercoins");
        selection3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selection3.setPreferredSize(new java.awt.Dimension(370, 30));
        chooserPanel.add(selection3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, -1, -1));

        selection4.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        selection4.setForeground(new java.awt.Color(255, 255, 255));
        selection4.setText(" BAAM");
        selection4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selection4.setPreferredSize(new java.awt.Dimension(370, 30));
        chooserPanel.add(selection4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        selection5.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        selection5.setForeground(new java.awt.Color(255, 255, 255));
        selection5.setText(" PiensoPalabra");
        selection5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selection5.setPreferredSize(new java.awt.Dimension(370, 30));
        chooserPanel.add(selection5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 145, -1, -1));

        chooserBackground.setBackground(new java.awt.Color(0, 0, 0));
        chooserPanel.add(chooserBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 180));

        contentPanel.add(chooserPanel);

        addQuestionPanel.setOpaque(false);
        addQuestionPanel.setPreferredSize(new java.awt.Dimension(348, 30));
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
        infoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoButtonMouseClicked(evt);
            }
        });
        addQuestionPanel.add(infoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        contentPanel.add(addQuestionPanel);

        questionsPanel.setOpaque(false);
        questionsPanel.setPreferredSize(new java.awt.Dimension(370, 800));
        questionsPanel.setLayout(new javax.swing.BoxLayout(questionsPanel, javax.swing.BoxLayout.PAGE_AXIS));
        contentPanel.add(questionsPanel);

        jPanel1.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 370, 670));

        lowerPanel.setOpaque(false);

        buttonCreate.setBackground(new java.awt.Color(255, 255, 255));
        buttonCreate.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        buttonCreate.setForeground(new java.awt.Color(255, 255, 255));
        buttonCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Boton_Off.png"))); // NOI18N
        buttonCreate.setText("Crear");
        buttonCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCreate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        debugText.setForeground(new java.awt.Color(255, 255, 255));
        debugText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        debugText.setText("Texto Debug");

        javax.swing.GroupLayout lowerPanelLayout = new javax.swing.GroupLayout(lowerPanel);
        lowerPanel.setLayout(lowerPanelLayout);
        lowerPanelLayout.setHorizontalGroup(
            lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lowerPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(buttonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lowerPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(debugText, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        lowerPanelLayout.setVerticalGroup(
            lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lowerPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(buttonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lowerPanelLayout.createSequentialGroup()
                    .addContainerGap(78, Short.MAX_VALUE)
                    .addComponent(debugText)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(lowerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 830, 430, -1));

        mainBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N
        jPanel1.add(mainBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 932));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simulatorChooserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simulatorChooserMouseClicked
        Utility.ChangeVisibilityChooserPanel(chooserPanel, simulatorChooser);
    }//GEN-LAST:event_simulatorChooserMouseClicked

    
    private void infoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoButtonMouseClicked
        
    }//GEN-LAST:event_infoButtonMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
    
    public void showImg() {
        Utility.SetChooserButtonImg(simulatorChooser, "Desplegable_Off");
        Utility.SetCreateButtonImg(buttonCreate, "Boton_Off");
        Utility.SetAddQuestionInfoButtonImg(addButton, "Mas_Off", new Dimension(18, 18));
        Utility.SetAddQuestionInfoButtonImg(infoButton, "Info_Off", new Dimension(18, 18));      
    }
    
    public void showLauncherButtons() {
        JLabel[] buttons = {
            selection1, selection2, selection3, selection4, selection5
        };

        for (int i = 0; i < buttons.length; i++) {
            final int index = i;

            buttons[i].addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    simulatorChooser.setText(buttons[index].getText());
                    Utility.ChangeVisibilityChooserPanel(chooserPanel, simulatorChooser);
                }
            });
        }
    }
        
    public void showQuestionPanels() {
        
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Utility.AddNewPanels(questionsPanel);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButton;
    private javax.swing.JPanel addQuestionPanel;
    private javax.swing.JLabel addQuestionText;
    private javax.swing.JLabel buttonCreate;
    private javax.swing.JLabel chooserBackground;
    private javax.swing.JPanel chooserPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel debugText;
    private javax.swing.JLabel infoButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel lowerPanel;
    private javax.swing.JLabel mainBackground;
    private javax.swing.JPanel questionsPanel;
    private javax.swing.JLabel selection1;
    private javax.swing.JLabel selection2;
    private javax.swing.JLabel selection3;
    private javax.swing.JLabel selection4;
    private javax.swing.JLabel selection5;
    private javax.swing.JLabel simulatorChooser;
    private javax.swing.JPanel simulatorTypePanel;
    private javax.swing.JLabel simulatorTypeText;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
