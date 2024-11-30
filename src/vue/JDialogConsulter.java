/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vue;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import modele.dao.DaoSalarie;
import modele.metier.Salarie;
import modele.metier.Service;
import modele.metier.Categorie;
import java.util.Date;



/**
 *
 * @author Stefen R
 */
public class JDialogConsulter extends javax.swing.JDialog {
    
    /**
     * Creates new form JDialogConsulter
     */
    public JDialogConsulter(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public JDialogConsulter(Salarie salarie) {
        initComponents();
        this.setLocation(150, 150);
        jLabelSalarie.setText(salarie.getNom() + " " + salarie.getPrenom());
        jLabelCodeS.setText(salarie.getCode());
        jLabelNomS.setText(salarie.getNom());
        jLabelPrenomS.setText(salarie.getPrenom());

        // Formater les dates de naissance et d'embauche
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateNaissFormatted = dateFormat.format(salarie.getDateNaiss());
        String dateEmbaucheFormatted = dateFormat.format(salarie.getDateEmbauche());

        jLabelNaissS.setText(dateNaissFormatted);
        jLabelEmbaucheS.setText(dateEmbaucheFormatted);
  
        jLabelFonctionS.setText(salarie.getFonction());
    
        double tauxHoraire = salarie.getTauxHoraire();
        jLabelHoraireS.setText(Double.toString(tauxHoraire));
     
        jLabelFamilleS.setText(salarie.getSituationFamiliale());
        jLabelNbrEnfantsS.setText(Integer.toString(salarie.getNbrEnfants()));
     
        jLabelServiceS.setText(salarie.getService().getDesignation());
        jLabelCateS.setText(salarie.getCategorie().getLibelle());
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelInformations = new javax.swing.JLabel();
        jButtonRetour = new javax.swing.JButton();
        jLabelSalarie = new javax.swing.JLabel();
        jLabelCode = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jLabelNaiss = new javax.swing.JLabel();
        jLabelEmbauche = new javax.swing.JLabel();
        jLabelFonction = new javax.swing.JLabel();
        jLabelService = new javax.swing.JLabel();
        jLabelCate = new javax.swing.JLabel();
        jLabelNomS = new javax.swing.JLabel();
        jLabelCodeS = new javax.swing.JLabel();
        jLabelPrenomS = new javax.swing.JLabel();
        jLabelNaissS = new javax.swing.JLabel();
        jLabelEmbaucheS = new javax.swing.JLabel();
        jLabelFonctionS = new javax.swing.JLabel();
        jLabelServiceS = new javax.swing.JLabel();
        jLabelCateS = new javax.swing.JLabel();
        jLabelHoraire = new javax.swing.JLabel();
        jLabelFamille = new javax.swing.JLabel();
        jLabelNbrenfants = new javax.swing.JLabel();
        jLabelHoraireS = new javax.swing.JLabel();
        jLabelFamilleS = new javax.swing.JLabel();
        jLabelNbrEnfantsS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelInformations.setText("Informations relatives de ");
        jLabelInformations.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonRetour.setText("Retour");
        jButtonRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetourActionPerformed(evt);
            }
        });

        jLabelCode.setText("Code :");
        jLabelCode.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNom.setText("Nom :");
        jLabelNom.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelPrenom.setText("Prenom :");
        jLabelPrenom.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNaiss.setText("Date naissance :");
        jLabelNaiss.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelEmbauche.setText("Date embauche :");
        jLabelEmbauche.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelFonction.setText("Fonction :");
        jLabelFonction.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelService.setText("Service :");
        jLabelService.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCate.setText("Categorie :");
        jLabelCate.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNomS.setText("jLabel1");
        jLabelNomS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelCodeS.setText("jLabel1");
        jLabelCodeS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelPrenomS.setText("jLabel1");
        jLabelPrenomS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelNaissS.setText("jLabel1");
        jLabelNaissS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelEmbaucheS.setText("jLabel1");
        jLabelEmbaucheS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelFonctionS.setText("jLabel1");
        jLabelFonctionS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelServiceS.setText("jLabel1");
        jLabelServiceS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelCateS.setText("jLabel1");
        jLabelCateS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelHoraire.setText("Taux horaire :");
        jLabelHoraire.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelFamille.setText("Situation familiale :");
        jLabelFamille.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNbrenfants.setText("Nbr enfants :");
        jLabelNbrenfants.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelHoraireS.setText("jLabel1");
        jLabelHoraireS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelFamilleS.setText("jLabel1");
        jLabelFamilleS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelNbrEnfantsS.setText("jLabel1");
        jLabelNbrEnfantsS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFonction)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelCate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCateS))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelService)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelServiceS))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelNbrenfants)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNbrEnfantsS))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelFamille)
                            .addGap(136, 136, 136)
                            .addComponent(jLabelFamilleS))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelHoraire)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelHoraireS))
                        .addComponent(jLabelFonctionS)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelEmbauche)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEmbaucheS))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelNaiss)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNaissS))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelPrenom)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPrenomS))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelNom)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNomS))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelCode)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCodeS))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelInformations)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabelSalarie, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRetour)
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInformations)
                    .addComponent(jLabelSalarie))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCode)
                    .addComponent(jLabelCodeS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNom)
                    .addComponent(jLabelNomS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrenom)
                    .addComponent(jLabelPrenomS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNaiss)
                    .addComponent(jLabelNaissS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmbauche)
                    .addComponent(jLabelEmbaucheS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFonction)
                    .addComponent(jLabelFonctionS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHoraire)
                    .addComponent(jLabelHoraireS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFamille)
                    .addComponent(jLabelFamilleS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNbrenfants)
                    .addComponent(jLabelNbrEnfantsS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelService)
                    .addComponent(jLabelServiceS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCate)
                    .addComponent(jLabelCateS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jButtonRetour)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetourActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
    }//GEN-LAST:event_jButtonRetourActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogConsulter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogConsulter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogConsulter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogConsulter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogConsulter dialog = new JDialogConsulter(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRetour;
    private javax.swing.JLabel jLabelCate;
    private javax.swing.JLabel jLabelCateS;
    private javax.swing.JLabel jLabelCode;
    private javax.swing.JLabel jLabelCodeS;
    private javax.swing.JLabel jLabelEmbauche;
    private javax.swing.JLabel jLabelEmbaucheS;
    private javax.swing.JLabel jLabelFamille;
    private javax.swing.JLabel jLabelFamilleS;
    private javax.swing.JLabel jLabelFonction;
    private javax.swing.JLabel jLabelFonctionS;
    private javax.swing.JLabel jLabelHoraire;
    private javax.swing.JLabel jLabelHoraireS;
    private javax.swing.JLabel jLabelInformations;
    private javax.swing.JLabel jLabelNaiss;
    private javax.swing.JLabel jLabelNaissS;
    private javax.swing.JLabel jLabelNbrEnfantsS;
    private javax.swing.JLabel jLabelNbrenfants;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelNomS;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelPrenomS;
    private javax.swing.JLabel jLabelSalarie;
    private javax.swing.JLabel jLabelService;
    private javax.swing.JLabel jLabelServiceS;
    // End of variables declaration//GEN-END:variables
}