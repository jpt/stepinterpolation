/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepinterpolation;
import java.math.BigDecimal;
import java.awt.Color; 
/**
 *
 * @author xx
 */
public class stepinterpolationui extends javax.swing.JFrame {

    /**
     * Creates new form stepinterpolationui
     */
    public stepinterpolationui() {
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

        jLabelA = new javax.swing.JLabel();
        jTextFieldA = new javax.swing.JTextField();
        jSeparatorA = new javax.swing.JSeparator();
        jLabelValueA = new javax.swing.JLabel();
        jTextFieldValueA = new javax.swing.JTextField();
        jLabelValueB = new javax.swing.JLabel();
        jTextFieldValueB = new javax.swing.JTextField();
        jLabelB = new javax.swing.JLabel();
        jTextFieldB = new javax.swing.JTextField();
        jSeparatorB = new javax.swing.JSeparator();
        jLabelValueC = new javax.swing.JLabel();
        jTextFieldValueC = new javax.swing.JTextField();
        jLabelC = new javax.swing.JLabel();
        jTextFieldC = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelLeastStepNumber = new javax.swing.JLabel();
        jTextFieldGreatestStepNumber = new javax.swing.JTextField();
        jLabelGreatestStepNumber = new javax.swing.JLabel();
        jTextFieldLeastStepNumber = new javax.swing.JTextField();
        jLabelStepWidth = new javax.swing.JLabel();
        jLabelDecimals = new javax.swing.JLabel();
        jTextFieldStepWidth = new javax.swing.JTextField();
        jComboBoxDecimals = new javax.swing.JComboBox<>();
        jButtonCalculate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCoeff = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelA.setText("step number A");

        jTextFieldA.setText("1");
        jTextFieldA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAActionPerformed(evt);
            }
        });

        jSeparatorA.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelValueA.setText("value at  A");

        jTextFieldValueA.setText("20");

        jLabelValueB.setText("value at  B");

        jTextFieldValueB.setText("220");

        jLabelB.setText("step number B");

        jTextFieldB.setText("9");
        jTextFieldB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBActionPerformed(evt);
            }
        });

        jSeparatorB.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelValueC.setText("value at  C");

        jLabelC.setText("step number C");

        jTextFieldC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCActionPerformed(evt);
            }
        });

        jLabelLeastStepNumber.setText("least step number:");

        jTextFieldGreatestStepNumber.setText("9");
        jTextFieldGreatestStepNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGreatestStepNumberActionPerformed(evt);
            }
        });

        jLabelGreatestStepNumber.setText("greatest step number:");

        jTextFieldLeastStepNumber.setText("1");
        jTextFieldLeastStepNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLeastStepNumberActionPerformed(evt);
            }
        });

        jLabelStepWidth.setText("step width:");

        jLabelDecimals.setText("decimals:");

        jTextFieldStepWidth.setText("1");
        jTextFieldStepWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStepWidthActionPerformed(evt);
            }
        });

        jComboBoxDecimals.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        jButtonCalculate.setText("calculate");
        jButtonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalculateActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("coeff. k:");

        jTextFieldCoeff.setEditable(false);
        jTextFieldCoeff.setBackground(jTextFieldCoeff.getBackground());
        jTextFieldCoeff.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCoeff.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelLeastStepNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldLeastStepNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelGreatestStepNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldGreatestStepNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelStepWidth)
                            .addComponent(jLabelDecimals))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxDecimals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCoeff))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldStepWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelA)
                            .addComponent(jLabelValueA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldA)
                            .addComponent(jTextFieldValueA, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparatorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelB)
                            .addComponent(jLabelValueB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldValueC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparatorB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelC)
                            .addComponent(jLabelValueC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldValueB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelC)
                            .addComponent(jTextFieldB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelValueC)
                            .addComponent(jTextFieldValueB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparatorB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelB)
                                    .addComponent(jTextFieldC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelValueB)
                                    .addComponent(jTextFieldValueC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparatorA, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelA)
                                    .addComponent(jTextFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelValueA)
                                    .addComponent(jTextFieldValueA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLeastStepNumber)
                    .addComponent(jTextFieldLeastStepNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStepWidth)
                    .addComponent(jTextFieldStepWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCalculate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelGreatestStepNumber)
                        .addComponent(jTextFieldGreatestStepNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelDecimals)
                        .addComponent(jComboBoxDecimals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jTextFieldCoeff, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAActionPerformed

    private void jTextFieldBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBActionPerformed

    private void jTextFieldCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCActionPerformed

    private void jTextFieldGreatestStepNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGreatestStepNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGreatestStepNumberActionPerformed

    private void jTextFieldLeastStepNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLeastStepNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLeastStepNumberActionPerformed

    private void jTextFieldStepWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStepWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStepWidthActionPerformed

    private void jButtonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalculateActionPerformed
        String result = "step number \tvalue\n";
        double stepA = Double.parseDouble(jTextFieldA.getText());
        double valueA = Double.parseDouble(jTextFieldValueA.getText());
        double stepB = Double.parseDouble(jTextFieldB.getText());
        double valueB = Double.parseDouble(jTextFieldValueB.getText());
        double stepC = Double.NaN;
        if (!jTextFieldC.getText().equals("")){
            stepC = Double.parseDouble(jTextFieldC.getText());
        }
        double valueC = Double.NaN;
        if (!jTextFieldValueC.getText().equals("")){
            valueC = Double.parseDouble(jTextFieldValueC.getText());
        }
        double leastStepNumber = Double.parseDouble(jTextFieldLeastStepNumber.getText());
        double greatestStepNumber = Double.parseDouble(jTextFieldGreatestStepNumber.getText());
        double stepWidth = Double.parseDouble(jTextFieldStepWidth.getText());
        double numberOfSteps = (greatestStepNumber-leastStepNumber+1)/stepWidth;
        int decimals = Integer.parseInt(jComboBoxDecimals.getSelectedItem().toString());
        double x,y,k;
        if (valueA == 0) { 
            k = 1;
        } else {
            k = Math.log(valueB/valueA);
        }
        for(int i = 0; i < numberOfSteps; i++) {
            x = leastStepNumber + i * stepWidth;
            if (Double.isNaN(stepC) || Double.isNaN(valueC)) {
                if (valueA*valueB == 0) {
                    y = expoRect(x,stepA,valueA,stepB,valueB);
                } else {
                    y = expo(x,stepA,valueA,stepB,valueB);
                }
            } else {
                k = findK(stepA,valueA,stepB,valueB,stepC,valueC);
                y = expoRect(x,k,stepA,valueA,stepB,valueB);
            }
            result += BigDecimal.valueOf(x).setScale(decimals, BigDecimal.ROUND_HALF_UP) 
                    + "\t" + BigDecimal.valueOf(y).setScale(decimals, BigDecimal.ROUND_HALF_UP) 
                    + "\n";
        }
        jTextArea1.setText(result);
        jTextFieldCoeff.setText(String.valueOf(BigDecimal.valueOf(k).setScale(5, 
                BigDecimal.ROUND_HALF_UP)));
        //change color of coefficient text field (red = warning)
        if (k<0) {
            jTextFieldCoeff.setBackground(Color.RED);
        } else {
            jTextFieldCoeff.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jButtonCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(stepinterpolationui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stepinterpolationui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stepinterpolationui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stepinterpolationui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stepinterpolationui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalculate;
    private javax.swing.JComboBox<String> jComboBoxDecimals;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelB;
    private javax.swing.JLabel jLabelC;
    private javax.swing.JLabel jLabelDecimals;
    private javax.swing.JLabel jLabelGreatestStepNumber;
    private javax.swing.JLabel jLabelLeastStepNumber;
    private javax.swing.JLabel jLabelStepWidth;
    private javax.swing.JLabel jLabelValueA;
    private javax.swing.JLabel jLabelValueB;
    private javax.swing.JLabel jLabelValueC;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparatorA;
    private javax.swing.JSeparator jSeparatorB;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldA;
    private javax.swing.JTextField jTextFieldB;
    private javax.swing.JTextField jTextFieldC;
    private javax.swing.JTextField jTextFieldCoeff;
    private javax.swing.JTextField jTextFieldGreatestStepNumber;
    private javax.swing.JTextField jTextFieldLeastStepNumber;
    private javax.swing.JTextField jTextFieldStepWidth;
    private javax.swing.JTextField jTextFieldValueA;
    private javax.swing.JTextField jTextFieldValueB;
    private javax.swing.JTextField jTextFieldValueC;
    // End of variables declaration//GEN-END:variables

    // Methods by Linus Romer:
    
    // This is an exponential function
    // (discrete function is a geometric sequence)
    // (this is how Luc(as) de Groot likes it)
    // y = ya*(ya/yb)^((x-xa)/(xa-xb))
    private static double expo(double x, double xa, double ya, 
            double xb, double yb) {
        return ya*Math.pow(ya/yb,(x-xa)/(xa-xb));
    }

    // expoSquare is an exponential function (concentrating on the square
    // (0,0) to (1,1)
    // y = (exp(k*x)-1)/(e^k-1)
    private static double expoSquare(double x, double k) {
        if (k == 0) {
            return x;
        } else {
            return (Math.exp(k*x)-1)/(Math.exp(k)-1);
        }
    }
    
    // expoRect is an exponential function (concentrating on the rectangular
    // (xa,ya) to (xb,yb)
    private static double expoRect(double x, double k, double xa, double ya, 
            double xb, double yb) {
        return (yb-ya)*expoSquare((x-xa)/(xb-xa),k)+ya;
    }

    // expoRect is an exponential function (concentrating on the rectangular
    // (xa,ya) to (xb,yb)
    private static double expoRect(double x, double xa, double ya, 
            double xb, double yb) {
        return expoRect(x,1,xa,ya,xb,yb);
    }
    
    private static double findK(double xa, double ya, 
            double xb, double yb, double xc, double yc) {
        // find k such that xc and yc is as near as possible on curve
        double ka = -99; 
        double kb = 100;
        double k = 1;
        for(int i = 0; i < 100; i++) {
            k = (ka+kb)/2;
            if (expoRect(xc,k,xa,ya,xb,yb)*Math.signum(yb-ya) 
                    > yc*Math.signum(yb-ya) ) {
                ka = k;
            } else {
                kb = k;
            }
        }
        return k;
    }

}

