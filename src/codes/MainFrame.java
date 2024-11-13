package codes;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainFrame extends JFrame {

    Dimension buttonDimension = new Dimension(18, 18);
    
    public MainFrame() {
        initConfig();
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
        chooserPanel = new codes.RoundedPanel();
        selection1 = new javax.swing.JLabel();
        selection2 = new javax.swing.JLabel();
        selection3 = new javax.swing.JLabel();
        selection4 = new javax.swing.JLabel();
        selection5 = new javax.swing.JLabel();
        addQuestionPanel = new javax.swing.JPanel();
        addQuestionText = new javax.swing.JLabel();
        addButton = new javax.swing.JLabel();
        infoButton = new javax.swing.JLabel();
        infoPanel = new codes.RoundedPanel();
        infoText1 = new javax.swing.JLabel();
        infoText2 = new javax.swing.JLabel();
        infoText3 = new javax.swing.JLabel();
        questionScroll = new javax.swing.JScrollPane();
        questionsPanel = new javax.swing.JPanel();
        lowerPanel = new javax.swing.JPanel();
        createButtonPanel = new codes.RoundedPanel();
        buttonCreate = new javax.swing.JLabel();
        debugText = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(4, 20, 37));
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
        chooserPanel.setPreferredSize(new java.awt.Dimension(368, 180));
        chooserPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selection1.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        selection1.setForeground(new java.awt.Color(255, 255, 255));
        selection1.setText(" Ahora Aprendo");
        selection1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selection1.setPreferredSize(new java.awt.Dimension(370, 30));
        chooserPanel.add(selection1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 360, -1));

        selection2.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        selection2.setForeground(new java.awt.Color(255, 255, 255));
        selection2.setText(" El Cazador");
        selection2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selection2.setPreferredSize(new java.awt.Dimension(370, 30));
        chooserPanel.add(selection2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 360, -1));

        selection3.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        selection3.setForeground(new java.awt.Color(255, 255, 255));
        selection3.setText(" Atrapa los Univercoins");
        selection3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selection3.setPreferredSize(new java.awt.Dimension(370, 30));
        chooserPanel.add(selection3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, 360, -1));

        selection4.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        selection4.setForeground(new java.awt.Color(255, 255, 255));
        selection4.setText(" BAAM");
        selection4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selection4.setPreferredSize(new java.awt.Dimension(370, 30));
        chooserPanel.add(selection4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 360, -1));

        selection5.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        selection5.setForeground(new java.awt.Color(255, 255, 255));
        selection5.setText(" PiensoPalabra");
        selection5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selection5.setPreferredSize(new java.awt.Dimension(370, 30));
        chooserPanel.add(selection5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, 360, -1));

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
        addQuestionPanel.add(infoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        contentPanel.add(addQuestionPanel);

        infoPanel.setBackground(new java.awt.Color(60, 81, 99));
        infoPanel.setPreferredSize(new java.awt.Dimension(370, 80));
        infoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoText1.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        infoText1.setForeground(new java.awt.Color(255, 255, 255));
        infoText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoText1.setText("Añade las preguntas que quieras que aparezcan durante");
        infoPanel.add(infoText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, -1));

        infoText2.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        infoText2.setForeground(new java.awt.Color(255, 255, 255));
        infoText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoText2.setText("la simulación. Luego, pulsa el botón cear para exportar");
        infoPanel.add(infoText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 350, -1));

        infoText3.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        infoText3.setForeground(new java.awt.Color(255, 255, 255));
        infoText3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoText3.setText("el archivo zip que deberas subir a SharePoint.");
        infoPanel.add(infoText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 350, -1));

        contentPanel.add(infoPanel);

        questionScroll.setBackground(new java.awt.Color(4, 20, 37));
        questionScroll.setBorder(null);
        questionScroll.setOpaque(false);
        questionScroll.setPreferredSize(new java.awt.Dimension(390, 620));

        questionsPanel.setBackground(new java.awt.Color(4, 20, 37));
        questionsPanel.setLayout(new javax.swing.BoxLayout(questionsPanel, javax.swing.BoxLayout.PAGE_AXIS));
        questionScroll.setViewportView(questionsPanel);

        contentPanel.add(questionScroll);

        jPanel1.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 430, 670));

        lowerPanel.setOpaque(false);

        createButtonPanel.setBackground(new java.awt.Color(2, 10, 18));
        createButtonPanel.setPreferredSize(new java.awt.Dimension(341, 50));
        createButtonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonCreate.setBackground(new java.awt.Color(2, 10, 18));
        buttonCreate.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        buttonCreate.setForeground(new java.awt.Color(255, 255, 255));
        buttonCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonCreate.setText("Crear");
        buttonCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCreate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        createButtonPanel.add(buttonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 341, 50));

        debugText.setForeground(new java.awt.Color(255, 255, 255));
        debugText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        debugText.setText("Texto Debug");

        javax.swing.GroupLayout lowerPanelLayout = new javax.swing.GroupLayout(lowerPanel);
        lowerPanel.setLayout(lowerPanelLayout);
        lowerPanelLayout.setHorizontalGroup(
            lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lowerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(debugText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(lowerPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(createButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        lowerPanelLayout.setVerticalGroup(
            lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lowerPanelLayout.createSequentialGroup()
                .addComponent(createButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(debugText, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jPanel1.add(lowerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 840, 430, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simulatorChooserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simulatorChooserMouseClicked
        Utility.toggleChooserPanelVisibility(chooserPanel, simulatorChooser);
    }//GEN-LAST:event_simulatorChooserMouseClicked

    public static void main(String args[]) {
        EventQueue.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
    
    public void initConfig() {
        initComponents();
        chooserPanel.setVisible(false);
        infoPanel.setVisible(false);
        debugText.setVisible(false);
        addQuestionPanel.setVisible(false);
        
        Utility.setButtonImg(simulatorChooser, "Desplegable_Off", 1, null);
        Utility.setButtonImg(addButton, "Mas_Off", 2, buttonDimension);
        Utility.setButtonImg(infoButton, "Info_Off", 2, buttonDimension);
        
        showLauncherButtons();
        mouseEventsQuestionButtons();
        scrollBarMod();
    }
    
    MainFrame mainFrame = this;
    
    private boolean isInfoOn = false;
    
    public void mouseEventsQuestionButtons() {
        JLabel[] buttons = { addButton, infoButton };

        for (JLabel button : buttons) {
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    if (button == infoButton) {
                        toggleInfoPanel();
                    } else if (button == addButton) {
                        Utility.addNewPanel(questionsPanel, mainFrame);
                        Utility.setDebugMessage(debugText, 1, 1);
                    }
                }
                @Override
                public void mouseEntered(MouseEvent evt) {
                    if (button == addButton) Utility.setButtonImg(addButton, "Mas_On", 2, buttonDimension);
                }
                @Override
                public void mouseExited(MouseEvent evt) {
                    if (button == addButton) Utility.setButtonImg(addButton, "Mas_Off", 2, buttonDimension);
                }
                @Override
                public void mousePressed(MouseEvent evt) {
                    if (button == addButton) Utility.setButtonImg(addButton, "Mas_Off", 2, buttonDimension);
                }
                @Override
                public void mouseReleased(MouseEvent evt) {
                    if (button == addButton) Utility.setButtonImg(addButton, "Mas_On", 2, buttonDimension);
                }
            });
        }
    }

    private void toggleInfoPanel() {
        isInfoOn = !isInfoOn;
        Utility.setButtonImg(infoButton, isInfoOn ? "Info_On" : "Info_Off", 2, buttonDimension);
        infoPanel.setVisible(isInfoOn);
    }
    
    private int currentIndex = -1;
    private String rootName = "";
    private JLabel[] buttons;
    
    private final Color fontColorWhite = Color.WHITE;
    private final Color bgColorTurq = new Color(105, 255, 255);
    private final Color colorDarkBlue = new Color(2, 10, 18);
    
    public String showLauncherButtons() {
        buttons = new JLabel[] { selection1, selection2, selection3, selection4, selection5 };
        

        for (int i = 0; i < buttons.length; i++) {
            final int index = i;
            buttons[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    updateLauncherSelection(index);
                    setButtonCreateColors(bgColorTurq, colorDarkBlue);
                }
            });
        }

        buttonCreate.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent evt) {
                
                if (currentIndex != -1) {
                    Utility.writeCSV(rootName);
                }
                Utility.setDebugMessage(debugText, 2, 2);

                Timer timer = new Timer(2500, e -> Utility.setDebugMessage(debugText, 3, 2));
                timer.setRepeats(false);
                timer.start();
            }
            @Override
            public void mouseEntered(MouseEvent evt) {
                setButtonCreateColors(colorDarkBlue, fontColorWhite);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                setButtonCreateColors(bgColorTurq, colorDarkBlue);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                setButtonCreateColors(bgColorTurq, colorDarkBlue);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                setButtonCreateColors(colorDarkBlue, fontColorWhite);
            }
        });
        return rootName;
    }

    private void updateLauncherSelection(int index) {
        simulatorChooser.setText(buttons[index].getText());
        Utility.toggleChooserPanelVisibility(chooserPanel, simulatorChooser);
        Utility.clearPanelList();
        questionsPanel.removeAll();
        addQuestionPanel.setVisible(true);

        currentIndex = index;
        rootName = switch (index) {
            case 0 -> "ahoraAprendo";
            case 1 -> "elCazador";
            case 2 -> "atrapaLosUnivercoins";
            case 3 -> "baam";
            case 4 -> "piensoPalabra";
            default -> throw new AssertionError();
        };

        Utility.readCSV(questionsPanel, rootName, debugText, mainFrame);
    }

    private void setButtonCreateColors(Color bg, Color fg) {
        createButtonPanel.setBackground(bg);
        buttonCreate.setForeground(fg);
    }

    public void scrollBarMod() {
        questionScroll.setVerticalScrollBar(new CustomScrollBar());
    }

    public void setDebugMessages(int i) {
        int[][] messages = {{4, 1}, {5, 3}, {6, 3}, {7, 2}, {8, 2}, {9, 3}, {10, 2}, {11, 2}};
        Utility.setDebugMessage(debugText, messages[i - 1][0], messages[i - 1][1]);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButton;
    private javax.swing.JPanel addQuestionPanel;
    private javax.swing.JLabel addQuestionText;
    private javax.swing.JLabel buttonCreate;
    private codes.RoundedPanel chooserPanel;
    private javax.swing.JPanel contentPanel;
    private codes.RoundedPanel createButtonPanel;
    private javax.swing.JLabel debugText;
    private javax.swing.JLabel infoButton;
    private codes.RoundedPanel infoPanel;
    private javax.swing.JLabel infoText1;
    private javax.swing.JLabel infoText2;
    private javax.swing.JLabel infoText3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel lowerPanel;
    private javax.swing.JScrollPane questionScroll;
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