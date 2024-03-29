/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Entity.ConnexionBDD;
import Entity.Dosage;
import Entity.FonctionMetier;
import Entity.Medicament;
import Entity.Famille;
import static java.lang.Float.parseFloat;
import javax.swing.JOptionPane;

/**
 *
 * @author fello
 */
public class frmAjoutMedicament extends javax.swing.JFrame {
    FonctionMetier fm;

    /**
     * Creates new form frmAjoutMedicament
     */
    public frmAjoutMedicament() {
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

        txtCompo = new javax.swing.JTextField();
        txtNomMed = new javax.swing.JTextField();
        txtPrix = new javax.swing.JTextField();
        txtEffets = new javax.swing.JTextField();
        txtContreIn = new javax.swing.JTextField();
        cboFamille = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnEnregistre = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtCompo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompoActionPerformed(evt);
            }
        });

        jLabel1.setText("Composition");

        jLabel2.setText("Nom du Medicament");

        jLabel3.setText("Prix échantillion");

        jLabel4.setText("Effets Medicaments  ");

        jLabel5.setText("Famille Medicament");

        jLabel6.setText("Contre indication");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("Ajouter un Médicament");

        btnEnregistre.setText("Enregistré");
        btnEnregistre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnregistreMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNomMed)
                                .addComponent(txtEffets)
                                .addComponent(txtContreIn)
                                .addComponent(cboFamille, 0, 196, Short.MAX_VALUE)
                                .addComponent(txtPrix)
                                .addComponent(txtCompo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(btnEnregistre, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCompo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addComponent(txtEffets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboFamille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContreIn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEnregistre)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCompoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompoActionPerformed

    private void btnEnregistreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnregistreMouseClicked
        // TODO add your handling code here:
        if(txtCompo.getText().compareTo("") == 0)
        {
            JOptionPane.showMessageDialog(this, "Veuillez saisir une Composition svp svp "); 
        }
        else if(txtNomMed.getText().compareTo("") == 0)
        {
            JOptionPane.showMessageDialog(this, "Veuillez saisir un Nom svp "); 
        }
        else if(txtPrix.getText().compareTo("") == 0)
        {
            JOptionPane.showMessageDialog(this, "Veuillez saisir un Prix svp "); 
        }
        else if(txtEffets.getText().compareTo("") == 0)
        {
            JOptionPane.showMessageDialog(this, "Veuillez saisir un effet svp "); 
        }
        else if(txtContreIn.getText().compareTo("") == 0)
        {
            JOptionPane.showMessageDialog(this, "Veuillez saisir une contre indication svp "); 
        }
        else
        {
            
            //c'est un objet et pour retourner un string .toString()
//            fm.InsererUnePrescription(cbxMed.getSelectedItem().toString(),cbxIndiv.getSelectedItem().toString(),cbxDosage.getSelectedItem().toString(),txtPosologie.getText());
              fm.InsererUnMedicament(txtNomMed.getText(),txtCompo.getText(),txtEffets.getText(),txtContreIn.getText(),parseFloat(txtPrix.getText()),cboFamille.getSelectedItem().toString());

            
            //on affiche un message de validation 
            
            JOptionPane.showMessageDialog(this, "Votre Prescrition a bien été enregistré ");       
        }
        
    }//GEN-LAST:event_btnEnregistreMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
         ConnexionBDD cnx = new ConnexionBDD();
             fm = new FonctionMetier();
             
             for(Famille f : fm.getAllNomFamille())
             {
                cboFamille.addItem(f.getLIBELLE());
                 
             }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frmAjoutMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAjoutMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAjoutMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAjoutMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAjoutMedicament().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnregistre;
    private javax.swing.JComboBox<String> cboFamille;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCompo;
    private javax.swing.JTextField txtContreIn;
    private javax.swing.JTextField txtEffets;
    private javax.swing.JTextField txtNomMed;
    private javax.swing.JTextField txtPrix;
    // End of variables declaration//GEN-END:variables
}
