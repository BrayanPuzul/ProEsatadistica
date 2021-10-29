
package proyecto;

import java.util.Scanner;


public class teorema1 extends javax.swing.JFrame {

    public teorema1() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    teorema1(inicio aThis, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        datos = new javax.swing.JTextField();
        s = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        boton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        respuesta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(51, 255, 0));
        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 0));
        jLabel6.setText("sera");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 40, 30));

        datos.setBackground(new java.awt.Color(255, 255, 255));
        datos.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        datos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosActionPerformed(evt);
            }
        });
        jPanel1.add(datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 50, 40));

        s.setBackground(new java.awt.Color(0, 0, 0));
        s.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        s.setForeground(new java.awt.Color(255, 0, 0));
        s.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/13.gif"))); // NOI18N
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });
        jPanel1.add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 410, 70, 70));

        jLabel5.setBackground(new java.awt.Color(255, 204, 51));
        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setText("!");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 20, 30));

        boton.setBackground(new java.awt.Color(0, 51, 51));
        boton.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        boton.setForeground(new java.awt.Color(255, 255, 0));
        boton.setText("RESULTADO");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });
        jPanel1.add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 140, 50));

        jLabel4.setBackground(new java.awt.Color(255, 204, 51));
        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("el numero de permutaciones de los objetos ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 360, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("TEOREMA 1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 140, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/200 (2).gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 50, 70));

        respuesta.setBackground(new java.awt.Color(255, 204, 51));
        respuesta.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        respuesta.setForeground(new java.awt.Color(0, 0, 0));
        respuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        respuesta.setOpaque(true);
        jPanel1.add(respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 420, 100));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 255));
        jLabel3.setText("El numero de  permutaciones de n objetos es n!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 500, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fNoiY6.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 990, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datosActionPerformed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        try {
            int factorial=1;
           int factorial2=2;
        int numero= Integer.parseInt(datos.getText());
            for (int i = numero; i > 1; i--) {
                factorial=factorial * i;
            }
            respuesta.setText(""+factorial);
        } catch (NumberFormatException e) {
            respuesta.setText("Solo se puede ingresar numeros");
        }
        
    }//GEN-LAST:event_botonActionPerformed

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        inicio teo2=new inicio();
        teo2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sActionPerformed





    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teorema1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JTextField datos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel respuesta;
    private javax.swing.JButton s;
    // End of variables declaration//GEN-END:variables
}
