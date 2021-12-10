/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codigo;

/**
 *
 * @author joelg
 */
public class VentanaCalculadora extends javax.swing.JFrame {

   double operando1 = 0; //guarda el primer número que metamos
   String operacion = ""; //guarda la operación pulsada
    
    public VentanaCalculadora() {
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

        pantalla = new javax.swing.JLabel();
        boton07 = new javax.swing.JButton();
        boton08 = new javax.swing.JButton();
        boton09 = new javax.swing.JButton();
        boton05 = new javax.swing.JButton();
        boton04 = new javax.swing.JButton();
        boton06 = new javax.swing.JButton();
        boton02 = new javax.swing.JButton();
        boton01 = new javax.swing.JButton();
        boton03 = new javax.swing.JButton();
        boton00 = new javax.swing.JButton();
        botonSuma = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        botonDivision = new javax.swing.JButton();
        botonResta = new javax.swing.JButton();
        botonMultiplicacion = new javax.swing.JButton();
        botonElevadoCuad = new javax.swing.JButton();
        botonRaizCuad = new javax.swing.JButton();
        botonPorcentaje = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantalla.setBackground(new java.awt.Color(0, 0, 0));
        pantalla.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        pantalla.setForeground(new java.awt.Color(0, 255, 0));
        pantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantalla.setText("0");
        pantalla.setOpaque(true);
        getContentPane().add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 390, 71));

        boton07.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton07.setText("7");
        boton07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton07ActionPerformed(evt);
            }
        });
        getContentPane().add(boton07, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 64, 64));

        boton08.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton08.setText("8");
        boton08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton08ActionPerformed(evt);
            }
        });
        getContentPane().add(boton08, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 64, 64));

        boton09.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton09.setText("9");
        boton09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton09ActionPerformed(evt);
            }
        });
        getContentPane().add(boton09, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 64, 64));

        boton05.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton05.setText("5");
        boton05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton05ActionPerformed(evt);
            }
        });
        getContentPane().add(boton05, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 64, 64));

        boton04.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton04.setText("4");
        boton04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton04ActionPerformed(evt);
            }
        });
        getContentPane().add(boton04, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 64, 64));

        boton06.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton06.setText("6");
        boton06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton06ActionPerformed(evt);
            }
        });
        getContentPane().add(boton06, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 64, 64));

        boton02.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton02.setText("2");
        boton02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton02ActionPerformed(evt);
            }
        });
        getContentPane().add(boton02, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 64, 64));

        boton01.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton01.setText("1");
        boton01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton01ActionPerformed(evt);
            }
        });
        getContentPane().add(boton01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 64, 64));

        boton03.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton03.setText("3");
        boton03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton03ActionPerformed(evt);
            }
        });
        getContentPane().add(boton03, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 64, 64));

        boton00.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton00.setText("0");
        boton00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton00ActionPerformed(evt);
            }
        });
        getContentPane().add(boton00, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 64, 64));

        botonSuma.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonSuma.setText("+");
        botonSuma.setToolTipText("");
        botonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumaActionPerformed(evt);
            }
        });
        getContentPane().add(botonSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 64, 64));

        botonIgual.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonIgual.setText("=");
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });
        getContentPane().add(botonIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 140, 64));

        botonDivision.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonDivision.setText("÷");
        botonDivision.setToolTipText("");
        botonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivisionActionPerformed(evt);
            }
        });
        getContentPane().add(botonDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 64, 64));

        botonResta.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonResta.setText("-");
        botonResta.setToolTipText("");
        botonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestaActionPerformed(evt);
            }
        });
        getContentPane().add(botonResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 64, 64));

        botonMultiplicacion.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonMultiplicacion.setText("x");
        botonMultiplicacion.setToolTipText("");
        botonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicacionActionPerformed(evt);
            }
        });
        getContentPane().add(botonMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 64, 64));

        botonElevadoCuad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botonElevadoCuad.setText("x²");
        botonElevadoCuad.setToolTipText("");
        botonElevadoCuad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonElevadoCuadActionPerformed(evt);
            }
        });
        getContentPane().add(botonElevadoCuad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 64, 64));

        botonRaizCuad.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonRaizCuad.setText("√");
        botonRaizCuad.setToolTipText("");
        botonRaizCuad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRaizCuadActionPerformed(evt);
            }
        });
        getContentPane().add(botonRaizCuad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 64, 64));

        botonPorcentaje.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botonPorcentaje.setText("%");
        botonPorcentaje.setToolTipText("");
        botonPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPorcentajeActionPerformed(evt);
            }
        });
        getContentPane().add(botonPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 64, 64));

        botonPunto.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonPunto.setText(".");
        botonPunto.setToolTipText("");
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        getContentPane().add(botonPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 64, 64));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton07ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")) {
            pantalla.setText("7");
        } else {
            pantalla.setText(auxiliar + "7");
        }
    }//GEN-LAST:event_boton07ActionPerformed

    private void boton08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton08ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")) {
            pantalla.setText("8");
        } else {
            pantalla.setText(auxiliar + "8");
        }
    }//GEN-LAST:event_boton08ActionPerformed

    private void boton09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton09ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")) {
            pantalla.setText("9");
        } else {
            pantalla.setText(auxiliar + "9");
        }
    }//GEN-LAST:event_boton09ActionPerformed

    private void boton05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton05ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")) {
            pantalla.setText("5");
        } else {
            pantalla.setText(auxiliar + "5");
        }
    }//GEN-LAST:event_boton05ActionPerformed

    private void boton04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton04ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")) {
            pantalla.setText("4");
        } else {
            pantalla.setText(auxiliar + "4");
        }
    }//GEN-LAST:event_boton04ActionPerformed

    private void boton06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton06ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")) {
            pantalla.setText("6");
        } else {
            pantalla.setText(auxiliar + "6");
        }
    }//GEN-LAST:event_boton06ActionPerformed

    private void boton02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton02ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")) {
            pantalla.setText("2");
        } else {
            pantalla.setText(auxiliar + "2");
        }
    }//GEN-LAST:event_boton02ActionPerformed

    private void boton01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton01ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")) {
            pantalla.setText("1");
        } else {
            pantalla.setText(auxiliar + "1");
        }
    }//GEN-LAST:event_boton01ActionPerformed

    private void boton03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton03ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")) {
            pantalla.setText("3");
        } else {
            pantalla.setText(auxiliar + "3");
        }
    }//GEN-LAST:event_boton03ActionPerformed

    private void boton00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton00ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")) {
            pantalla.setText("0");
        } else {
            pantalla.setText(auxiliar + "0");
        }
    }//GEN-LAST:event_boton00ActionPerformed

    private void botonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumaActionPerformed
        operacion = "+";
        //Double.valueOf convierte un string en su equivalente numérico
        operando1 = Double.valueOf(pantalla.getText());
        //reseteo la pantalla
        pantalla.setText("0");
        
    }//GEN-LAST:event_botonSumaActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
        double operando2 = Double.valueOf(pantalla.getText());
        if(operacion.equals("+")){
            operando1 = operando1 + operando2;
        }
        if(operacion.equals("-")){
            operando1 = operando1 - operando2;
        }
        if(operacion.equals("/")){
            operando1 = operando1 / operando2;
        }
        if(operacion.equals("*")){
            operando1 = operando1 * operando2;
        }
        if(operacion.equals("x²")){
            operando1 = operando1 * operando1;
        }
        if(operacion.equals("√")){
            operando1 = Math.sqrt(operando1);
        }
        if(operacion.equals("%")){
            operando1 = operando1 / 100;
        }
        pantalla.setText(String.valueOf(operando1));
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivisionActionPerformed
        operacion = "/";
        //Double.valueOf convierte un string en su equivalente numérico
        operando1 = Double.valueOf(pantalla.getText());
        //reseteo la pantalla
        pantalla.setText("0");
    }//GEN-LAST:event_botonDivisionActionPerformed

    private void botonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestaActionPerformed
        operacion = "-";
        //Double.valueOf convierte un string en su equivalente numérico
        operando1 = Double.valueOf(pantalla.getText());
        //reseteo la pantalla
        pantalla.setText("0");
    }//GEN-LAST:event_botonRestaActionPerformed

    private void botonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicacionActionPerformed
        operacion = "*";
        //Double.valueOf convierte un string en su equivalente numérico
        operando1 = Double.valueOf(pantalla.getText());
        //reseteo la pantalla
        pantalla.setText("0");
    }//GEN-LAST:event_botonMultiplicacionActionPerformed

    private void botonElevadoCuadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonElevadoCuadActionPerformed
        operacion = "x²";
        //Double.valueOf convierte un string en su equivalente numérico
        operando1 = Double.valueOf(pantalla.getText());
        //reseteo la pantalla
        pantalla.setText("0");
    }//GEN-LAST:event_botonElevadoCuadActionPerformed

    private void botonRaizCuadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRaizCuadActionPerformed
        operacion = "√";
        //Double.valueOf convierte un string en su equivalente numérico
        operando1 = Double.valueOf(pantalla.getText());
        //reseteo la pantalla
        pantalla.setText("0");
    }//GEN-LAST:event_botonRaizCuadActionPerformed

    private void botonPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPorcentajeActionPerformed
        operacion = "%";
        //Double.valueOf convierte un string en su equivalente numérico
        operando1 = Double.valueOf(pantalla.getText());
        //reseteo la pantalla
        pantalla.setText("0");
    }//GEN-LAST:event_botonPorcentajeActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        //Double.valueOf convierte un string en su equivalente numérico
        operando1 = Double.valueOf(pantalla.getText());
        //hago un int para que al poner la coma no se ponga también la coma del 
        //double que suele salir.
        int operando3 = (int) operando1;
        //reseteo la pantalla
        pantalla.setText(operando3 + ".");
    }//GEN-LAST:event_botonPuntoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton00;
    private javax.swing.JButton boton01;
    private javax.swing.JButton boton02;
    private javax.swing.JButton boton03;
    private javax.swing.JButton boton04;
    private javax.swing.JButton boton05;
    private javax.swing.JButton boton06;
    private javax.swing.JButton boton07;
    private javax.swing.JButton boton08;
    private javax.swing.JButton boton09;
    private javax.swing.JButton botonDivision;
    private javax.swing.JButton botonElevadoCuad;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMultiplicacion;
    private javax.swing.JButton botonPorcentaje;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonRaizCuad;
    private javax.swing.JButton botonResta;
    private javax.swing.JButton botonSuma;
    private javax.swing.JLabel pantalla;
    // End of variables declaration//GEN-END:variables
}
