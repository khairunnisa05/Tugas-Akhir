/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
public class Menu extends javax.swing.JFrame {
    private static void pesan_kosong(){
      JOptionPane.showMessageDialog(null, "Jumlah Pesanan Miso Ayam Super Belum Dimasukkan","Warning", JOptionPane.WARNING_MESSAGE);
    }
    private static void pesan_karakter(){
      JOptionPane.showMessageDialog(null, "Format Jumlah Makanan Harus Angka","Warning", JOptionPane.WARNING_MESSAGE);
    }
    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTHrgMisoAyamSuper = new javax.swing.JLabel();
        lblTHrgPansitAyam = new javax.swing.JLabel();
        lblTHrgNasiGorengSpesial = new javax.swing.JLabel();
        lblTHrgAyamGeprek = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblTJlh = new javax.swing.JLabel();
        lblTBayar = new javax.swing.JLabel();
        cboxMisoAyamSuper = new javax.swing.JCheckBox();
        cboxPansitAyam = new javax.swing.JCheckBox();
        cboxNasiGorengSpesial = new javax.swing.JCheckBox();
        cboxAyamGeprek = new javax.swing.JCheckBox();
        txtJlhMisoAyamSuper = new javax.swing.JTextField();
        txtJlhPansitAyam = new javax.swing.JTextField();
        txtJlhNasiGorengSpesial = new javax.swing.JTextField();
        txtJlhAyamGeprek = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(547, 300));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Warung Miso Pematang");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 0, 290, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Makanan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(23, 37, 80, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Harga");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(207, 37, 60, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Jumlah");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(346, 37, 60, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Total Harga");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(440, 37, 97, 20);

        jLabel6.setText("Rp. 16.000,-");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(207, 69, 90, 20);

        jLabel7.setText("Rp. 13.000,-");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(207, 104, 90, 20);

        jLabel8.setText("Rp. 25.000,-");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(209, 139, 90, 20);

        jLabel9.setText("Rp. 10.000,-");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(209, 174, 90, 20);

        lblTHrgMisoAyamSuper.setText("Rp.0,-");
        getContentPane().add(lblTHrgMisoAyamSuper);
        lblTHrgMisoAyamSuper.setBounds(440, 69, 90, 20);

        lblTHrgPansitAyam.setText("Rp.0,-");
        getContentPane().add(lblTHrgPansitAyam);
        lblTHrgPansitAyam.setBounds(440, 104, 90, 20);

        lblTHrgNasiGorengSpesial.setText("Rp.0,-");
        getContentPane().add(lblTHrgNasiGorengSpesial);
        lblTHrgNasiGorengSpesial.setBounds(440, 139, 90, 20);

        lblTHrgAyamGeprek.setText("Rp.0,-");
        getContentPane().add(lblTHrgAyamGeprek);
        lblTHrgAyamGeprek.setBounds(440, 174, 90, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("TOTAL BAYAR");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(15, 206, 120, 20);

        lblTJlh.setText("0 Porsi");
        getContentPane().add(lblTJlh);
        lblTJlh.setBounds(346, 206, 49, 20);

        lblTBayar.setText("Rp.0,-");
        getContentPane().add(lblTBayar);
        lblTBayar.setBounds(440, 206, 100, 20);

        cboxMisoAyamSuper.setText("Miso Ayam Super");
        cboxMisoAyamSuper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxMisoAyamSuperActionPerformed(evt);
            }
        });
        getContentPane().add(cboxMisoAyamSuper);
        cboxMisoAyamSuper.setBounds(25, 65, 157, 29);

        cboxPansitAyam.setText("Pansit Ayam");
        cboxPansitAyam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPansitAyamActionPerformed(evt);
            }
        });
        getContentPane().add(cboxPansitAyam);
        cboxPansitAyam.setBounds(25, 100, 121, 29);

        cboxNasiGorengSpesial.setText("Nasi Goreng Spesial");
        cboxNasiGorengSpesial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxNasiGorengSpesialActionPerformed(evt);
            }
        });
        getContentPane().add(cboxNasiGorengSpesial);
        cboxNasiGorengSpesial.setBounds(25, 135, 173, 29);

        cboxAyamGeprek.setText("Ayam Geprek");
        cboxAyamGeprek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxAyamGeprekActionPerformed(evt);
            }
        });
        getContentPane().add(cboxAyamGeprek);
        cboxAyamGeprek.setBounds(25, 170, 129, 29);

        txtJlhMisoAyamSuper.setEditable(false);
        getContentPane().add(txtJlhMisoAyamSuper);
        txtJlhMisoAyamSuper.setBounds(346, 66, 49, 26);

        txtJlhPansitAyam.setEditable(false);
        getContentPane().add(txtJlhPansitAyam);
        txtJlhPansitAyam.setBounds(346, 101, 49, 26);

        txtJlhNasiGorengSpesial.setEditable(false);
        getContentPane().add(txtJlhNasiGorengSpesial);
        txtJlhNasiGorengSpesial.setBounds(346, 136, 49, 26);

        txtJlhAyamGeprek.setEditable(false);
        getContentPane().add(txtJlhAyamGeprek);
        txtJlhAyamGeprek.setBounds(346, 171, 49, 26);

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        getContentPane().add(btnHitung);
        btnHitung.setBounds(282, 235, 79, 29);

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(370, 235, 71, 29);

        btnKeluar.setText("Close");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar);
        btnKeluar.setBounds(450, 235, 71, 29);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cooking-pattern-design_1284-545.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 550, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxMisoAyamSuperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxMisoAyamSuperActionPerformed
         if (cboxMisoAyamSuper.isSelected()== true){
             txtJlhMisoAyamSuper.setEditable(true);
             txtJlhMisoAyamSuper.requestFocus();
         }
         else {
           txtJlhMisoAyamSuper.setEditable(false);
           txtJlhMisoAyamSuper.setText("");
           lblTHrgMisoAyamSuper.setText("Rp.0,-");
       }
    }//GEN-LAST:event_cboxMisoAyamSuperActionPerformed

    private void cboxPansitAyamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPansitAyamActionPerformed
          if (cboxPansitAyam.isSelected() == true){
              txtJlhPansitAyam.setEditable(true);
              txtJlhPansitAyam.requestFocus();
          }
          else {
           txtJlhPansitAyam.setEditable(true);
           txtJlhPansitAyam.requestFocus();
           lblTHrgPansitAyam.setText("Rp.0,-");
      }
    }//GEN-LAST:event_cboxPansitAyamActionPerformed

    private void cboxNasiGorengSpesialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxNasiGorengSpesialActionPerformed
         if (cboxNasiGorengSpesial.isSelected() == true){
             txtJlhNasiGorengSpesial.setEditable(true);
             txtJlhNasiGorengSpesial.requestFocus();
         }
         else {
           txtJlhNasiGorengSpesial.setEditable(true);
           txtJlhNasiGorengSpesial.requestFocus();
           lblTHrgNasiGorengSpesial.setText("Rp.0,-");
      }
    }//GEN-LAST:event_cboxNasiGorengSpesialActionPerformed

    private void cboxAyamGeprekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxAyamGeprekActionPerformed
        if (cboxAyamGeprek.isSelected() == true){
            txtJlhAyamGeprek.setEditable(true);
            txtJlhAyamGeprek.requestFocus();
        }
        else {
            txtJlhAyamGeprek.setEditable(true);
            txtJlhAyamGeprek.requestFocus();
            lblTHrgAyamGeprek.setText("Rp.0,-");
        }
    }//GEN-LAST:event_cboxAyamGeprekActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
     int JlhMisoAyamSuper     = 0,
       JlhPansitAyam  = 0,
       JlhNasiGorengSpesial  = 0,
       JlhAyamGeprek    = 0,
       HrgMisoAyamSuper = 0,
       HrgPansitAyam  = 0,
       HrgNasiGorengSpesial  = 0,
       HrgAyamGeprek    = 0,
       THrgMisoAyamSuper, THrgPansitAyam, THrgNasiGorengSpesial, THrgAyamGeprek, TJlh, TBayar;
    if (cboxMisoAyamSuper.isSelected() == false && cboxPansitAyam.isSelected()==false && cboxNasiGorengSpesial.isSelected()==false && cboxAyamGeprek.isSelected()==false){
       JOptionPane.showMessageDialog(null, "Makanan Belum Dipesan","Warning",JOptionPane.WARNING_MESSAGE);
       }
    else {
      if (cboxMisoAyamSuper.isSelected()==true){
          if (txtJlhMisoAyamSuper.getText().length()==0){
              pesan_kosong();
              txtJlhMisoAyamSuper.requestFocus();
          }
          else if (txtJlhMisoAyamSuper.getText().matches("[1-9]")){
              JlhMisoAyamSuper    = Integer.parseInt(txtJlhMisoAyamSuper.getText());
              HrgMisoAyamSuper    = 16000;
              THrgMisoAyamSuper = JlhMisoAyamSuper * HrgMisoAyamSuper;
              lblTHrgMisoAyamSuper.setText("Rp. "+THrgMisoAyamSuper+",-");
          }
          else {
              pesan_karakter();
              txtJlhMisoAyamSuper.requestFocus();
          }
       }
      if (cboxPansitAyam.isSelected()==true){
          if (txtJlhPansitAyam.getText().length()==0){
              pesan_kosong();
              txtJlhPansitAyam.requestFocus();
          }
          else if (txtJlhPansitAyam.getText().matches("[1-9]")){
              JlhPansitAyam    = Integer.parseInt(txtJlhPansitAyam.getText());
              HrgPansitAyam    = 13000;
              THrgPansitAyam = JlhPansitAyam * HrgPansitAyam;
              lblTHrgPansitAyam.setText("Rp. "+THrgPansitAyam+",-");
          }
          else {
              pesan_karakter();
              txtJlhPansitAyam.requestFocus();
          }
       }
      if (cboxNasiGorengSpesial.isSelected()==true){
          if (txtJlhNasiGorengSpesial.getText().length()==0){
              pesan_kosong();
              txtJlhNasiGorengSpesial.requestFocus();
          }
          else if (txtJlhNasiGorengSpesial.getText().matches("[1-9]")){
              JlhNasiGorengSpesial    = Integer.parseInt(txtJlhNasiGorengSpesial.getText());
              HrgNasiGorengSpesial    = 25000;
              THrgNasiGorengSpesial = JlhNasiGorengSpesial * HrgNasiGorengSpesial;
              lblTHrgNasiGorengSpesial.setText("Rp. "+THrgNasiGorengSpesial+",-");
          }
          else {
              pesan_karakter();
              txtJlhNasiGorengSpesial.requestFocus();
          }
       }      
      if (cboxAyamGeprek.isSelected()==true){
          if (txtJlhAyamGeprek.getText().length()==0){
              pesan_kosong();
              txtJlhAyamGeprek.requestFocus();
          }
          else if (txtJlhAyamGeprek.getText().matches("[1-9]")){
              JlhAyamGeprek    = Integer.parseInt(txtJlhAyamGeprek.getText());
              HrgAyamGeprek  = 10000;
              THrgAyamGeprek = JlhAyamGeprek * HrgAyamGeprek;
              lblTHrgAyamGeprek.setText("Rp. "+THrgAyamGeprek+",-");
          }
          else {
              pesan_karakter();
              txtJlhAyamGeprek.requestFocus();
          }
       }
     
       TJlh   = JlhMisoAyamSuper + JlhPansitAyam + JlhNasiGorengSpesial + JlhAyamGeprek;
       TBayar = HrgMisoAyamSuper + HrgPansitAyam + HrgNasiGorengSpesial + HrgAyamGeprek;
       lblTJlh.setText(""+TJlh+"porsi");
       lblTBayar.setText("Rp. "+TBayar+",-");
       }
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
      txtJlhMisoAyamSuper.setEditable(false);
      txtJlhPansitAyam.setEditable(false);
      txtJlhNasiGorengSpesial.setEditable(false);
      txtJlhAyamGeprek.setEditable(false);
      cboxMisoAyamSuper.setSelected(false);
      cboxPansitAyam.setSelected(false);
      cboxNasiGorengSpesial.setSelected(false);
      cboxAyamGeprek.setSelected(false);
      txtJlhMisoAyamSuper.setText("");
      txtJlhPansitAyam.setText("");
      txtJlhNasiGorengSpesial.setText("");
      txtJlhAyamGeprek.setText("");
      lblTJlh.setText("0 porsi");
      lblTHrgMisoAyamSuper.setText("Rp. 0,-");
      lblTHrgPansitAyam.setText("Rp. 0,-");
      lblTHrgNasiGorengSpesial.setText("Rp. 0,-");
      lblTHrgAyamGeprek.setText("Rp. 0,-");
      lblTBayar.setText("Rp. 0,-");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox cboxAyamGeprek;
    private javax.swing.JCheckBox cboxMisoAyamSuper;
    private javax.swing.JCheckBox cboxNasiGorengSpesial;
    private javax.swing.JCheckBox cboxPansitAyam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblTBayar;
    private javax.swing.JLabel lblTHrgAyamGeprek;
    private javax.swing.JLabel lblTHrgMisoAyamSuper;
    private javax.swing.JLabel lblTHrgNasiGorengSpesial;
    private javax.swing.JLabel lblTHrgPansitAyam;
    private javax.swing.JLabel lblTJlh;
    private javax.swing.JTextField txtJlhAyamGeprek;
    private javax.swing.JTextField txtJlhMisoAyamSuper;
    private javax.swing.JTextField txtJlhNasiGorengSpesial;
    private javax.swing.JTextField txtJlhPansitAyam;
    // End of variables declaration//GEN-END:variables
}
