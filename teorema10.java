/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Brayan Puzul
 */
public class teorema10 extends javax.swing.JFrame {

    /**
     * Creates new form teorema11
     */
    public teorema10() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        N1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        N2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        h2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        h1 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        s = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TEOREMA 10");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 200, 50));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("siempre que P(A) > 0.");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 230, 30));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Si en un experimento pueden ocurrir los eventos A y B, entonces P(A ??? B) = P(A)P(B|A), ");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 30));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText(" dos fusibles al azar y se retiran de la caja, uno despu??s del");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 570, 30));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("otro, sin reemplazar el primero, ??cu??l es la probabilidad de que estos fusibles est??n defectuosos?");
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 910, 30));

        N1.setBackground(new java.awt.Color(255, 255, 255));
        N1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        N1.setForeground(new java.awt.Color(0, 0, 0));
        N1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        N1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N1ActionPerformed(evt);
            }
        });
        getContentPane().add(N1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 60, 30));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("unidades, de las cuales");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 220, 30));

        N2.setBackground(new java.awt.Color(255, 255, 255));
        N2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        N2.setForeground(new java.awt.Color(0, 0, 0));
        N2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N2ActionPerformed(evt);
            }
        });
        getContentPane().add(N2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 60, 30));

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 140, 50));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("est??n defectuosas. Si se seleccionan");
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 340, 30));

        h2.setBackground(new java.awt.Color(255, 255, 255));
        h2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        h2.setForeground(new java.awt.Color(0, 0, 0));
        h2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        h2.setOpaque(true);
        getContentPane().add(h2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 60, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 80, 10));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("Suponga que tenemos una caja de fusibles que contiene");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 520, 30));

        resultado.setBackground(new java.awt.Color(255, 204, 51));
        resultado.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        resultado.setForeground(new java.awt.Color(0, 0, 0));
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultado.setOpaque(true);
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 420, 100));

        s1.setBackground(new java.awt.Color(255, 255, 255));
        s1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        s1.setForeground(new java.awt.Color(0, 0, 0));
        s1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s1.setOpaque(true);
        getContentPane().add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 60, 40));

        h1.setBackground(new java.awt.Color(255, 255, 255));
        h1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        h1.setForeground(new java.awt.Color(0, 0, 0));
        h1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        h1.setOpaque(true);
        getContentPane().add(h1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 60, 40));

        s2.setBackground(new java.awt.Color(255, 255, 255));
        s2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        s2.setForeground(new java.awt.Color(0, 0, 0));
        s2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s2.setOpaque(true);
        getContentPane().add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 60, 40));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("x");
        jLabel15.setOpaque(true);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 20, 20));

        s.setBackground(new java.awt.Color(0, 0, 0));
        s.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        s.setForeground(new java.awt.Color(255, 0, 0));
        s.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/13.gif"))); // NOI18N
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });
        getContentPane().add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, 70, 70));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setOpaque(true);
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 80, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 530));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("x");
        jLabel17.setOpaque(true);
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 20, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void N1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_N1ActionPerformed

    private void N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_N2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int fac=1;
double numa;
double numa2;
double division;
double division2;
double num1 = Double.parseDouble(N1.getText());
double num2 = Double.parseDouble(N2.getText()); 
division =num2/num1;
numa=num2-fac;
numa2=num1-fac;
division2 =numa/numa2;
resultado.setText(" = "+division*division2);
s1.setText(""+num2);
s2.setText(""+numa);
h1.setText(""+num1);
h2.setText(""+numa2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        inicio teo2=new inicio();
        teo2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sActionPerformed

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
            java.util.logging.Logger.getLogger(teorema10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teorema10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teorema10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teorema10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teorema10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField N1;
    private javax.swing.JTextField N2;
    private javax.swing.JLabel h1;
    private javax.swing.JLabel h2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel resultado;
    private javax.swing.JButton s;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    // End of variables declaration//GEN-END:variables
}
