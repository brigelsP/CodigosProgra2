/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacionesswing;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author estuardo
 */
public class VistaPrincipal extends javax.swing.JFrame {

    String palabra;
    String letras;
    String mostrar;

    /**
     * Creates new form VistaPrincipal
     */
    final DefaultListModel model = new DefaultListModel();

    public VistaPrincipal() {
        initComponents();

        btnEnviar.setEnabled(false);
        rbgAcciones.add(rbtnLetras);
        rbgAcciones.add(rbtnPalabra);

        txtString.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent event) {

                String content = txtString.getText();
                if (!content.equals("")) {
                    btnEnviar.setEnabled(true);
                } else {
                    btnEnviar.setEnabled(false);
                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgAcciones = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        txtString = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstElementos = new javax.swing.JList<>();
        rbtnPalabra = new javax.swing.JRadioButton();
        rbtnLetras = new javax.swing.JRadioButton();
        chbxOrdenar = new javax.swing.JCheckBox();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtString.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStringKeyTyped(evt);
            }
        });

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstElementos);

        rbtnPalabra.setText("Palabras");

        rbtnLetras.setText("letras");

        chbxOrdenar.setText("ordenar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(txtString, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(rbtnPalabra)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnLetras))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEnviar)
                            .addComponent(chbxOrdenar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(txtString, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnPalabra)
                    .addComponent(rbtnLetras))
                .addGap(18, 18, 18)
                .addComponent(chbxOrdenar)
                .addGap(11, 11, 11)
                .addComponent(btnEnviar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        palabra = txtString.getText();
        String mostrar;

        Contador contador = new Contador();
        if (rbtnPalabra.isSelected()) {
            palabra = txtString.getText();

            if (chbxOrdenar.isSelected()) {
                mostrar = "el orden de " + palabra.split("\\W").length + " palabras es:";
                model.addElement(mostrar);
                String[] nuevoorden2 = contador.ordenarpalabras(txtString.getText());
                for (String d : nuevoorden2) {
                    model.addElement(d);
                }

            } else {

                mostrar = "usted introdujo " + palabra.split("\\W").length + " palabra";
                model.addElement(mostrar);
                String[] listaPalabras = contador.contadorPalabras(txtString.getText());

                for (String a : listaPalabras) {
                    System.out.println(a);
                    model.addElement(a);
                }
            }

        } else if (rbtnLetras.isSelected()) {
            letras = txtString.getText();
            if (chbxOrdenar.isSelected()) {
                mostrar = "el orden de " + letras.toCharArray().length + " letras es:";
                model.addElement(mostrar);
                String[] nuevoorden = contador.ordenarletras(txtString.getText());
                for (String c : nuevoorden) {
                    model.addElement(c);
                }
            } else {

                mostrar = "usted introdujo " + letras.toCharArray().length + " letras";
                model.addElement(mostrar);

                String[] listaLetras = contador.contadorLetras(txtString.getText());

                for (String b : listaLetras) {
                    model.addElement(b);
                }
            }

        }
        else{
            mostrar="seleccione alguna opcion, si palabra o letra";
            model.addElement(mostrar);
        }
        lstElementos.setModel(model);

    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtStringKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStringKeyTyped
        // TODO add your handling code here:
        
        if(Character.isDigit(evt.getKeyChar())){
        evt.consume();}
    }//GEN-LAST:event_txtStringKeyTyped

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JCheckBox chbxOrdenar;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstElementos;
    private javax.swing.ButtonGroup rbgAcciones;
    private javax.swing.JRadioButton rbtnLetras;
    private javax.swing.JRadioButton rbtnPalabra;
    private javax.swing.JTextField txtString;
    // End of variables declaration//GEN-END:variables
}
