/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import control.Principal;

/**
 *
 * @author GHOST
 */
public class Frame1 extends javax.swing.JFrame {
    private Principal p=new Principal();

    /**
     * Creates new form Frame1
     */
    public Frame1() {
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

        nA = new javax.swing.JTextField();
        bSuma = new javax.swing.JButton();
        nB = new javax.swing.JTextField();
        bResta = new javax.swing.JButton();
        bMult = new javax.swing.JButton();
        bDivision = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        result = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bSuma.setText("+");
        bSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSumaActionPerformed(evt);
            }
        });

        bResta.setText("-");
        bResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRestaActionPerformed(evt);
            }
        });

        bMult.setText("*");
        bMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultActionPerformed(evt);
            }
        });

        bDivision.setText("/");
        bDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivisionActionPerformed(evt);
            }
        });

        jLabel2.setText("=");

        result.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bSuma)
                                .addGap(135, 135, 135)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bDivision)
                                    .addComponent(bResta)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bMult))
                                .addGap(27, 27, 27)
                                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(nA, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(nB, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSuma)
                    .addComponent(bResta))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDivision)
                    .addComponent(bMult))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSumaActionPerformed
       p.suma();
    }//GEN-LAST:event_bSumaActionPerformed

    private void bRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRestaActionPerformed
        p.resta();
    }//GEN-LAST:event_bRestaActionPerformed

    private void bMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultActionPerformed
        p.multi();
    }//GEN-LAST:event_bMultActionPerformed

    private void bDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivisionActionPerformed
        p.divi();
    }//GEN-LAST:event_bDivisionActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDivision;
    private javax.swing.JButton bMult;
    private javax.swing.JButton bResta;
    private javax.swing.JButton bSuma;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField nA;
    public javax.swing.JTextField nB;
    public javax.swing.JTextField result;
    // End of variables declaration//GEN-END:variables
}
