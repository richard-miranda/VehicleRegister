package com.test1.vehicleregister;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import jdk.jfr.Event;

/**
 * Source code of the jPanel and the components stored in it, codes for buttons,
 * manipulation of data in arrays, text fields and so on.
 * @author Richard
 */
public class RegisterPanel extends javax.swing.JFrame {

    /**
     * @return the btEnglish
     */
    public javax.swing.JButton getBtEnglish() {
        return btEnglish;
    }

    /**
     * @param btEnglish the btEnglish to set
     */
    public void setBtEnglish(javax.swing.JButton btEnglish) {
        this.btEnglish = btEnglish;
    }

    /**
     * @return the btExit
     */
    public javax.swing.JButton getBtExit() {
        return btExit;
    }

    /**
     * @param btExit the btExit to set
     */
    public void setBtExit(javax.swing.JButton btExit) {
        this.btExit = btExit;
    }

    /**
     * @return the btPortuguese
     */
    public javax.swing.JButton getBtPortuguese() {
        return btPortuguese;
    }

    /**
     * @param btPortuguese the btPortuguese to set
     */
    public void setBtPortuguese(javax.swing.JButton btPortuguese) {
        this.btPortuguese = btPortuguese;
    }

    /**
     * @return the btSave
     */
    public javax.swing.JButton getBtSave() {
        return btSave;
    }

    /**
     * @param btSave the btSave to set
     */
    public void setBtSave(javax.swing.JButton btSave) {
        this.btSave = btSave;
    }

    /**
     * @return the centralPanel
     */
    public javax.swing.JPanel getCentralPanel() {
        return centralPanel;
    }

    /**
     * @param centralPanel the centralPanel to set
     */
    public void setCentralPanel(javax.swing.JPanel centralPanel) {
        this.centralPanel = centralPanel;
    }

    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    /**
     * @return the jScrollPane2
     */
    public javax.swing.JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    /**
     * @param jScrollPane2 the jScrollPane2 to set
     */
    public void setjScrollPane2(javax.swing.JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    /**
     * @return the jTable1
     */
    public javax.swing.JTable getjTable1() {
        return jTable1;
    }

    /**
     * @param jTable1 the jTable1 to set
     */
    public void setjTable1(javax.swing.JTable jTable1) {
        this.jTable1 = jTable1;
    }

    /**
     * @return the labelCarBrand
     */
    public javax.swing.JLabel getLabelCarBrand() {
        return labelCarBrand;
    }

    /**
     * @param labelCarBrand the labelCarBrand to set
     */
    public void setLabelCarBrand(javax.swing.JLabel labelCarBrand) {
        this.labelCarBrand = labelCarBrand;
    }

    /**
     * @return the labelCarModel
     */
    public javax.swing.JLabel getLabelCarModel() {
        return labelCarModel;
    }

    /**
     * @param labelCarModel the labelCarModel to set
     */
    public void setLabelCarModel(javax.swing.JLabel labelCarModel) {
        this.labelCarModel = labelCarModel;
    }

    /**
     * @return the labelCodeRenavam
     */
    public javax.swing.JLabel getLabelCodeRenavam() {
        return labelCodeRenavam;
    }

    /**
     * @param labelCodeRenavam the labelCodeRenavam to set
     */
    public void setLabelCodeRenavam(javax.swing.JLabel labelCodeRenavam) {
        this.labelCodeRenavam = labelCodeRenavam;
    }

    /**
     * @return the labelLanguage
     */
    public javax.swing.JLabel getLabelLanguage() {
        return labelLanguage;
    }

    /**
     * @param labelLanguage the labelLanguage to set
     */
    public void setLabelLanguage(javax.swing.JLabel labelLanguage) {
        this.labelLanguage = labelLanguage;
    }

    /**
     * @return the labelOwnerEmail
     */
    public javax.swing.JLabel getLabelOwnerEmail() {
        return labelOwnerEmail;
    }

    /**
     * @param labelOwnerEmail the labelOwnerEmail to set
     */
    public void setLabelOwnerEmail(javax.swing.JLabel labelOwnerEmail) {
        this.labelOwnerEmail = labelOwnerEmail;
    }

    /**
     * @return the labelOwnerName
     */
    public javax.swing.JLabel getLabelOwnerName() {
        return labelOwnerName;
    }

    /**
     * @param labelOwnerName the labelOwnerName to set
     */
    public void setLabelOwnerName(javax.swing.JLabel labelOwnerName) {
        this.labelOwnerName = labelOwnerName;
    }

    /**
     * @return the labelOwnerPhone
     */
    public javax.swing.JLabel getLabelOwnerPhone() {
        return labelOwnerPhone;
    }

    /**
     * @param labelOwnerPhone the labelOwnerPhone to set
     */
    public void setLabelOwnerPhone(javax.swing.JLabel labelOwnerPhone) {
        this.labelOwnerPhone = labelOwnerPhone;
    }

    /**
     * @return the labelTitle
     */
    public javax.swing.JLabel getLabelTitle() {
        return labelTitle;
    }

    /**
     * @param labelTitle the labelTitle to set
     */
    public void setLabelTitle(javax.swing.JLabel labelTitle) {
        this.labelTitle = labelTitle;
    }

    /**
     * @return the labelYear
     */
    public javax.swing.JLabel getLabelYear() {
        return labelYear;
    }

    /**
     * @param labelYear the labelYear to set
     */
    public void setLabelYear(javax.swing.JLabel labelYear) {
        this.labelYear = labelYear;
    }

    /**
     * @return the panelTranslation
     */
    public javax.swing.JPanel getPanelTranslation() {
        return panelTranslation;
    }

    /**
     * @param panelTranslation the panelTranslation to set
     */
    public void setPanelTranslation(javax.swing.JPanel panelTranslation) {
        this.panelTranslation = panelTranslation;
    }

    /**
     * @return the tbData
     */
    public javax.swing.JTable getTbData() {
        return tbData;
    }

    /**
     * @param tbData the tbData to set
     */
    public void setTbData(javax.swing.JTable tbData) {
        this.tbData = tbData;
    }

    /**
     * @return the tfCarBrand
     */
    public javax.swing.JTextField getTfCarBrand() {
        return tfCarBrand;
    }

    /**
     * @param tfCarBrand the tfCarBrand to set
     */
    public void setTfCarBrand(javax.swing.JTextField tfCarBrand) {
        this.tfCarBrand = tfCarBrand;
    }

    /**
     * @return the tfCarModel
     */
    public javax.swing.JTextField getTfCarModel() {
        return tfCarModel;
    }

    /**
     * @param tfCarModel the tfCarModel to set
     */
    public void setTfCarModel(javax.swing.JTextField tfCarModel) {
        this.tfCarModel = tfCarModel;
    }

    /**
     * @return the tfCarYear
     */
    public javax.swing.JTextField getTfCarYear() {
        return tfCarYear;
    }

    /**
     * @param tfCarYear the tfCarYear to set
     */
    public void setTfCarYear(javax.swing.JTextField tfCarYear) {
        this.tfCarYear = tfCarYear;
    }

    /**
     * @return the tfCodeRenavam
     */
    public javax.swing.JTextField getTfCodeRenavam() {
        return tfCodeRenavam;
    }

    /**
     * @param tfCodeRenavam the tfCodeRenavam to set
     */
    public void setTfCodeRenavam(javax.swing.JTextField tfCodeRenavam) {
        this.tfCodeRenavam = tfCodeRenavam;
    }

    /**
     * @return the tfOwnerEmail
     */
    public javax.swing.JTextField getTfOwnerEmail() {
        return tfOwnerEmail;
    }

    /**
     * @param tfOwnerEmail the tfOwnerEmail to set
     */
    public void setTfOwnerEmail(javax.swing.JTextField tfOwnerEmail) {
        this.tfOwnerEmail = tfOwnerEmail;
    }

    /**
     * @return the tfOwnerName
     */
    public javax.swing.JTextField getTfOwnerName() {
        return tfOwnerName;
    }

    /**
     * @param tfOwnerName the tfOwnerName to set
     */
    public void setTfOwnerName(javax.swing.JTextField tfOwnerName) {
        this.tfOwnerName = tfOwnerName;
    }

    /**
     * @return the tfOwnerPhone
     */
    public javax.swing.JTextField getTfOwnerPhone() {
        return tfOwnerPhone;
    }

    /**
     * @param tfOwnerPhone the tfOwnerPhone to set
     */
    public void setTfOwnerPhone(javax.swing.JTextField tfOwnerPhone) {
        this.tfOwnerPhone = tfOwnerPhone;
    }

    /**
     * Creates new form RegisterPanel
     */
    public RegisterPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSpinner1 = new javax.swing.JSpinner();
        centralPanel = new javax.swing.JPanel();
        labelCarBrand = new javax.swing.JLabel();
        labelCarModel = new javax.swing.JLabel();
        labelYear = new javax.swing.JLabel();
        labelCodeRenavam = new javax.swing.JLabel();
        labelOwnerName = new javax.swing.JLabel();
        labelOwnerEmail = new javax.swing.JLabel();
        labelOwnerPhone = new javax.swing.JLabel();
        tfCarBrand = new javax.swing.JTextField();
        tfCarModel = new javax.swing.JTextField();
        tfCarYear = new javax.swing.JTextField();
        tfOwnerName = new javax.swing.JTextField();
        tfOwnerEmail = new javax.swing.JTextField();
        tfCodeRenavam = new javax.swing.JTextField();
        tfOwnerPhone = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        labelTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();
        panelTranslation = new javax.swing.JPanel();
        labelLanguage = new javax.swing.JLabel();
        btPortuguese = new javax.swing.JButton();
        btEnglish = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        panelOrder = new javax.swing.JPanel();
        labelOrder = new javax.swing.JLabel();
        btOrderName = new javax.swing.JButton();
        btOrderBrand = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        centralPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelCarBrand.setText("Marca:");

        labelCarModel.setText("Modelo:");

        labelYear.setText("Ano:");

        labelCodeRenavam.setText("Renavam:");

        labelOwnerName.setText("Nome do Proprietário:");

        labelOwnerEmail.setText("Email:");

        labelOwnerPhone.setText("Telefone:");

        tfCarYear.setToolTipText("");

        btSave.setText("Salvar");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout centralPanelLayout = new javax.swing.GroupLayout(centralPanel);
        centralPanel.setLayout(centralPanelLayout);
        centralPanelLayout.setHorizontalGroup(
            centralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centralPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btSave)
                    .addGroup(centralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(centralPanelLayout.createSequentialGroup()
                            .addComponent(labelCarBrand)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCarBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(centralPanelLayout.createSequentialGroup()
                            .addComponent(labelCodeRenavam)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCodeRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(centralPanelLayout.createSequentialGroup()
                            .addComponent(labelOwnerName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfOwnerName))
                        .addGroup(centralPanelLayout.createSequentialGroup()
                            .addComponent(labelOwnerEmail)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfOwnerEmail))
                        .addGroup(centralPanelLayout.createSequentialGroup()
                            .addComponent(labelOwnerPhone)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfOwnerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(centralPanelLayout.createSequentialGroup()
                            .addComponent(labelCarModel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCarModel))
                        .addGroup(centralPanelLayout.createSequentialGroup()
                            .addComponent(labelYear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCarYear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        centralPanelLayout.setVerticalGroup(
            centralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centralPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCarBrand)
                    .addComponent(tfCarBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(centralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCarModel)
                    .addComponent(tfCarModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(centralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelYear)
                    .addComponent(tfCarYear, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(centralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodeRenavam)
                    .addComponent(tfCodeRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(centralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOwnerName)
                    .addComponent(tfOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(centralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelOwnerEmail)
                    .addComponent(tfOwnerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(centralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOwnerPhone)
                    .addComponent(tfOwnerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btSave)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        labelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Cadastro de Veículos");
        labelTitle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Ano", "Renavam", "Nome Proprietário", "Email", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbData);
        if (tbData.getColumnModel().getColumnCount() > 0) {
            tbData.getColumnModel().getColumn(4).setMinWidth(80);
        }

        panelTranslation.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelLanguage.setText("Idioma:");

        btPortuguese.setText("Português");
        btPortuguese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPortugueseActionPerformed(evt);
            }
        });

        btEnglish.setText("Inglês");
        btEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnglishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTranslationLayout = new javax.swing.GroupLayout(panelTranslation);
        panelTranslation.setLayout(panelTranslationLayout);
        panelTranslationLayout.setHorizontalGroup(
            panelTranslationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTranslationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLanguage)
                    .addGroup(panelTranslationLayout.createSequentialGroup()
                        .addComponent(btPortuguese)
                        .addGap(18, 18, 18)
                        .addComponent(btEnglish)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTranslationLayout.setVerticalGroup(
            panelTranslationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranslationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLanguage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTranslationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPortuguese)
                    .addComponent(btEnglish))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btExit.setText("Fechar");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        btDelete.setText("Remover Registro");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        panelOrder.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelOrder.setText("Ordenar:");

        btOrderName.setText("Nome do proprietário");
        btOrderName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrderNameActionPerformed(evt);
            }
        });

        btOrderBrand.setText("Marca");
        btOrderBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrderBrandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOrderLayout = new javax.swing.GroupLayout(panelOrder);
        panelOrder.setLayout(panelOrderLayout);
        panelOrderLayout.setHorizontalGroup(
            panelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelOrder)
                    .addGroup(panelOrderLayout.createSequentialGroup()
                        .addComponent(btOrderName)
                        .addGap(18, 18, 18)
                        .addComponent(btOrderBrand)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelOrderLayout.setVerticalGroup(
            panelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOrderName)
                    .addComponent(btOrderBrand))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelTranslation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(centralPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(229, 229, 229)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btExit, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btDelete, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(centralPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btDelete)
                        .addGap(43, 43, 43)
                        .addComponent(btExit))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panelTranslation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    /**
     *
     * @param array
     */
   
    
    
    public class NameSorter implements Comparator<Car>{
    @Override
    public int compare(Car o1, Car o2) {
        return o2.getCarOwner().compareToIgnoreCase(o1.getCarOwner());
    }
}
    
    public class BrandSorter implements Comparator<Car>{
    @Override
    public int compare(Car o1, Car o2) {
        return o2.getCarBrand().compareToIgnoreCase(o1.getCarBrand());
    }
}
    
    /**
     * Method that contains the actions to be performed when the save button is
     * clicked, includes a verification to know if any of the text fields are
     * empty, and if so, the action of saving can't be conclude.
     * It also insert the data on a arraylist and then in a object type to be 
     * loaded to the jtable, after that the text fields are cleared.
     **/
    
    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        // TODO add your handling code here:
        
        if(tfCarBrand.getText().isBlank()){
            if(boolLanguage == 0){
                JOptionPane.showMessageDialog(null, "O campo Marca está vazio!");
            }
            else{
                JOptionPane.showMessageDialog(null, "The field Brand is empty!");
            }
                 
        }else if(tfCarModel.getText().isBlank()){
            if(boolLanguage == 0){
                JOptionPane.showMessageDialog(null, "O campo Modelo está vazio!");
            }
            else{
                JOptionPane.showMessageDialog(null, "The field Model is empty!");
            }
                 
        }else if(tfCarYear.getText().isBlank()){
            if(boolLanguage == 0){
                JOptionPane.showMessageDialog(null, "O campo Ano está vazio!");
            }
            else{
                JOptionPane.showMessageDialog(null, "The field Year is empty!");
            }
                 
        }else if(tfCodeRenavam.getText().isBlank()){
            if(boolLanguage == 0){
                JOptionPane.showMessageDialog(null, "O campo Renavam está vazio!");
            }
            else{
                JOptionPane.showMessageDialog(null, "The field Renavam Code is empty!");
            }
                 
        }else if(tfOwnerName.getText().isBlank()){
            if(boolLanguage == 0){
                JOptionPane.showMessageDialog(null, "O campo Nome do Proprietário está vazio!");
            }
            else{
                JOptionPane.showMessageDialog(null, "The field Owner's Name is empty!");
            }
                 
        }else if(tfOwnerEmail.getText().isBlank()){
            if(boolLanguage == 0){
                JOptionPane.showMessageDialog(null, "O campo Email está vazio!");
            }
            else{
                JOptionPane.showMessageDialog(null, "The field Email is empty!");
            }
                 
        }else if(tfOwnerPhone.getText().isBlank()){
           if(boolLanguage == 0){
                JOptionPane.showMessageDialog(null, "O campo Telefone está vazio!");
            }
            else{
                JOptionPane.showMessageDialog(null, "The field Phone is empty!");
            }
                 
        }
        
        
        else{
        Car car = new Car();
        CarDAO carDAO = new CarDAO();
        DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("yyyy");
        
        car.setCarBrand(getTfCarBrand().getText());
        car.setCarModel(getTfCarModel().getText());
        car.setCarYear(Year.parse(getTfCarYear().getText(), dtFormat));
        car.setCodeRenavam(Long.parseLong(getTfCodeRenavam().getText()));
        car.setCarOwner(getTfOwnerName().getText());
        car.setOwnerEmail(getTfOwnerEmail().getText());
        car.setOwnerPhone(Long.parseLong(getTfOwnerPhone().getText()));
        
        carDAO.addCar(car);
        DefaultTableModel tabelModel = (DefaultTableModel) tbData.getModel();
        ArrayList<Car> carsList = carDAO.getCarsList();
        Object rowData[] = new Object[7];
               
        
        for(int i = 0; i < carsList.size(); i++){
            
            rowData[0] = carsList.get(i).getCarBrand();
            rowData[1] = carsList.get(i).getCarModel();
            rowData[2] = carsList.get(i).getCarYear();
            rowData[3] = carsList.get(i).getCodeRenavam();
            rowData[4] = carsList.get(i).getCarOwner();
            rowData[5] = carsList.get(i).getOwnerEmail();
            rowData[6] = carsList.get(i).getOwnerPhone();
            
            tabelModel.addRow(rowData);
            tabelModel.fireTableDataChanged();
            
        }
          
        
        tfCarBrand.setText("");
        tfCarModel.setText("");
        tfCarYear.setText("");
        tfCodeRenavam.setText("");
        tfOwnerEmail.setText("");
        tfOwnerName.setText("");
        tfOwnerPhone.setText("");
       
        }
    }//GEN-LAST:event_btSaveActionPerformed

    /**
     * Method to delete the selected rows in the jTable
     **/
    
    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tabelModel = (DefaultTableModel) tbData.getModel();
        
        int[] rows = tbData.getSelectedRows();
            for(int i=0;i<rows.length;i++){
                tabelModel.removeRow(rows[i]-i);
   }
    }//GEN-LAST:event_btDeleteActionPerformed

    int boolLanguage = 0;
    /**
     * Method to change the names of all the readable components of the panel
     * to English language
     **/
    
    private void btEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnglishActionPerformed
        // TODO add your handling code here:
        labelCarBrand.setText("Brand:");
        labelCarModel.setText("Model:");
        labelCodeRenavam.setText("Renavam Code:");
        labelOwnerName.setText("Owner's Name:");
        labelOwnerPhone.setText("Phone:");
        labelYear.setText("Year:");
        labelTitle.setText("Vehicles Registration:");
        labelLanguage.setText("Language:");
        labelOrder.setText("Order by:");
        btDelete.setText("Delete Regist");
        btEnglish.setText("English");
        btPortuguese.setText("Portuguese");
        btSave.setText("Save");
        btExit.setText("Exit");
        btOrderName.setText("Owner's Name");
        btOrderBrand.setText("Brand");
        
        DefaultTableModel tableModel = (DefaultTableModel) tbData.getModel();
        String[] headers = {"Brand", "Model", "Year", "Renavam Code","Owner's Name","Email", "Phone"};
        
        tableModel.setColumnIdentifiers(headers);
        boolLanguage = 1;
        
    }//GEN-LAST:event_btEnglishActionPerformed

     /**
     * Method to change the names of all the readable components of the panel
     * to Portuguese language
     **/ 
    
    private void btPortugueseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPortugueseActionPerformed
        // TODO add your handling code here:
        
        labelCarBrand.setText("Marca:");
        labelCarModel.setText("Modelo:");
        labelCodeRenavam.setText("Renavam:");
        labelOwnerName.setText("Nome do proprietário:");
        labelOwnerPhone.setText("Telefone:");
        labelYear.setText("Ano:");
        labelTitle.setText("Cadastro de Veículos:");
        labelLanguage.setText("Idioma:");
        labelOrder.setText("Ordenar:");
        btDelete.setText("Remover Registro");
        btEnglish.setText("Inglês");
        btPortuguese.setText("Português");
        btSave.setText("Salvar");
        btExit.setText("Fechar");
        btOrderName.setText("Nome do proprietário");
        btOrderBrand.setText("Marca");
        
        DefaultTableModel tableModel = (DefaultTableModel) tbData.getModel();
        String[] headers = {"Marca", "Modelo", "Ano", "Renavam","Nome do proprietário","Email", "Telefone"};
        
        tableModel.setColumnIdentifiers(headers);
        boolLanguage = 0;
    }//GEN-LAST:event_btPortugueseActionPerformed

    private void btOrderNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrderNameActionPerformed
        // TODO add your handling code here:           
    }//GEN-LAST:event_btOrderNameActionPerformed

    private void btOrderBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrderBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btOrderBrandActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEnglish;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btOrderBrand;
    private javax.swing.JButton btOrderName;
    private javax.swing.JButton btPortuguese;
    private javax.swing.JButton btSave;
    private javax.swing.JPanel centralPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelCarBrand;
    private javax.swing.JLabel labelCarModel;
    private javax.swing.JLabel labelCodeRenavam;
    private javax.swing.JLabel labelLanguage;
    private javax.swing.JLabel labelOrder;
    private javax.swing.JLabel labelOwnerEmail;
    private javax.swing.JLabel labelOwnerName;
    private javax.swing.JLabel labelOwnerPhone;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelYear;
    private javax.swing.JPanel panelOrder;
    private javax.swing.JPanel panelTranslation;
    private javax.swing.JTable tbData;
    private javax.swing.JTextField tfCarBrand;
    private javax.swing.JTextField tfCarModel;
    private javax.swing.JTextField tfCarYear;
    private javax.swing.JTextField tfCodeRenavam;
    private javax.swing.JTextField tfOwnerEmail;
    private javax.swing.JTextField tfOwnerName;
    private javax.swing.JTextField tfOwnerPhone;
    // End of variables declaration//GEN-END:variables
}
