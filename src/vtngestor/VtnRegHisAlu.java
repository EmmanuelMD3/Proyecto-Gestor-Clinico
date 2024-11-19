/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vtngestor;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensaje;
import cjb.ci.Validaciones;
import java.text.SimpleDateFormat;
import java.util.Date;
import proyectosp.HistorialClinico;
import proyectosp.Manipulacion;

/**
 *
 * @author Cassandra
 */
public class VtnRegHisAlu extends javax.swing.JFrame
{

    /**
     * Creates new form VtnRegHisAlu
     */
    public VtnRegHisAlu()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        padecimientoAct = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        antecedentesPer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        medicamento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        planTratamiento = new javax.swing.JTextField();
        guarda = new javax.swing.JButton();
        cancela = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Historial Clínico de Alumnos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Padecimiento Actual");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, 20));

        padecimientoAct.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                padecimientoActKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                padecimientoActKeyTyped(evt);
            }
        });
        jPanel1.add(padecimientoAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 270, 40));

        jLabel3.setText("Antecedentes Personales");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, 20));

        antecedentesPer.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                antecedentesPerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                antecedentesPerKeyTyped(evt);
            }
        });
        jPanel1.add(antecedentesPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 250, 40));

        jLabel4.setText("Medicamentos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        medicamento.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                medicamentoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                medicamentoKeyTyped(evt);
            }
        });
        jPanel1.add(medicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 300, 40));

        jLabel5.setText("Plan de Tratamiento");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        planTratamiento.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                planTratamientoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                planTratamientoKeyTyped(evt);
            }
        });
        jPanel1.add(planTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 270, 40));

        guarda.setBackground(new java.awt.Color(36, 231, 36));
        guarda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        guarda.setText("Guardar");
        guarda.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                guardaActionPerformed(evt);
            }
        });
        jPanel1.add(guarda, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, -1, 30));

        cancela.setBackground(new java.awt.Color(255, 0, 0));
        cancela.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancela.setText("Cancelar");
        cancela.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelaActionPerformed(evt);
            }
        });
        jPanel1.add(cancela, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vtngestor/imagenes/Inicio.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void guardaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_guardaActionPerformed
    {//GEN-HEADEREND:event_guardaActionPerformed
        try
        {
//            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
//            String fechaComoStr = formato.format(fecha.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = new Date();
            //Date fechad = new Date(fechaComoStr);
            HistorialClinico hi = new HistorialClinico(padecimientoAct.getText(), antecedentesPer.getText(), medicamento.getText(), planTratamiento.getText(), fecha);
            VtnInicio.matriz = Manipulacion.insertaObj(VtnInicio.matriz, hi, buscaCveRHA.cv);
            Mensaje.exito(this, "Registro exitoso.");
            CtrlInterfaz.limpia(padecimientoAct, antecedentesPer, medicamento, planTratamiento);
            CtrlInterfaz.habilita(false, antecedentesPer, medicamento, planTratamiento);
            CtrlInterfaz.cambia(padecimientoAct);
            dispose();
        } catch (Exception e)
        {
            Mensaje.error(this, "No se encontro la persona ingresada \n\tRegiste a la persona");
            //Mensaje.error(this, "Error..." + e.toString());
        }
    }//GEN-LAST:event_guardaActionPerformed

    private void cancelaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelaActionPerformed
    {//GEN-HEADEREND:event_cancelaActionPerformed
        CtrlInterfaz.limpia(padecimientoAct, antecedentesPer, medicamento, planTratamiento);
        CtrlInterfaz.habilita(false, antecedentesPer, medicamento, planTratamiento, guarda);
        CtrlInterfaz.cambia(padecimientoAct);
    }//GEN-LAST:event_cancelaActionPerformed

    private void padecimientoActKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_padecimientoActKeyTyped
    {//GEN-HEADEREND:event_padecimientoActKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_padecimientoActKeyTyped

    private void antecedentesPerKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_antecedentesPerKeyTyped
    {//GEN-HEADEREND:event_antecedentesPerKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_antecedentesPerKeyTyped

    private void padecimientoActKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_padecimientoActKeyPressed
    {//GEN-HEADEREND:event_padecimientoActKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, padecimientoAct, antecedentesPer);
    }//GEN-LAST:event_padecimientoActKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        CtrlInterfaz.habilita(false, antecedentesPer, medicamento, planTratamiento, guarda);
    }//GEN-LAST:event_formWindowOpened

    private void antecedentesPerKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_antecedentesPerKeyPressed
    {//GEN-HEADEREND:event_antecedentesPerKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, antecedentesPer, medicamento);
    }//GEN-LAST:event_antecedentesPerKeyPressed

    private void medicamentoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_medicamentoKeyPressed
    {//GEN-HEADEREND:event_medicamentoKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, medicamento, planTratamiento);
    }//GEN-LAST:event_medicamentoKeyPressed

    private void medicamentoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_medicamentoKeyTyped
    {//GEN-HEADEREND:event_medicamentoKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_medicamentoKeyTyped

    private void planTratamientoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_planTratamientoKeyTyped
    {//GEN-HEADEREND:event_planTratamientoKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_planTratamientoKeyTyped

    private void planTratamientoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_planTratamientoKeyPressed
    {//GEN-HEADEREND:event_planTratamientoKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, planTratamiento, guarda);
    }//GEN-LAST:event_planTratamientoKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtnRegHisAlu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnRegHisAlu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnRegHisAlu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnRegHisAlu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnRegHisAlu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField antecedentesPer;
    private javax.swing.JButton cancela;
    private javax.swing.JButton guarda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField medicamento;
    private javax.swing.JTextField padecimientoAct;
    private javax.swing.JTextField planTratamiento;
    // End of variables declaration//GEN-END:variables
}
