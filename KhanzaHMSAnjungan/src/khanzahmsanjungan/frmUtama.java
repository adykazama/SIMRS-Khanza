/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmUtama.java
 *
 * Created on 04 Des 13, 11:19:32
 */
package khanzahmsanjungan;

import fungsi.sekuel;
import fungsi.validasi;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class frmUtama extends javax.swing.JFrame {
    private final sekuel Sequel=new sekuel();
    private final validasi Valid=new validasi();
    private String validasiregistrasi=Sequel.cariIsi("select wajib_closing_kasir from set_validasi_registrasi");
        
    /** Creates new form frmUtama */
    public frmUtama() {
        initComponents();
        setIconImage(new ImageIcon(super.getClass().getResource("/picture/addressbook-edit24.png")).getImage());      
        this.setSize(screen.width,screen.height);
    }    
    private final Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();  
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new component.Panel();
        jLabel1 = new component.Label();
        jLabel2 = new component.Label();
        jPanel3 = new component.Panel();
        jLabel3 = new component.Label();
        panel1 = new usu.widget.glass.PanelGlass();
        jLabel6 = new component.Label();
        TCari = new component.TextBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("::[ SIMRS KhanzaHMS, Sub Menu Anjungan Registrasi Mandiri Pasien ]::");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(130, 50, 130));
        jPanel1.setBorder(null);
        jPanel1.setPreferredSize(new java.awt.Dimension(560, 55));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setForeground(new java.awt.Color(254, 184, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/folder.png"))); // NOI18N
        jLabel1.setText("Anjungan Registrasi Mandiri, Silahkan Scan Kartu Pasien Anda !!!");
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIconTextGap(10);
        jLabel1.setPreferredSize(new java.awt.Dimension(650, 135));
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jLabel2.setPreferredSize(new java.awt.Dimension(20, 10));
        jPanel1.add(jLabel2, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(130, 50, 130));
        jPanel3.setBorder(null);
        jPanel3.setPreferredSize(new java.awt.Dimension(560, 30));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel3.setForeground(new java.awt.Color(254, 184, 254));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Dikembangkan Oleh Khanza.Soft Media, Email : khanza_media@yahoo.com, Skype : khanza.media, HP : 08562675039");
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jPanel3.add(jLabel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/picture/wallpaper.jpg"))); // NOI18N
        panel1.setBackgroundImageType(usu.widget.constan.BackgroundConstan.BACKGROUND_IMAGE_LEFT_BOTTOM);
        panel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 1, 1, 1));
        panel1.setOpaque(true);
        panel1.setOpaqueImage(false);
        panel1.setPreferredSize(new java.awt.Dimension(200, 200));
        panel1.setRound(false);
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        panel1.setLayout(flowLayout1);

        jLabel6.setForeground(new java.awt.Color(130, 80, 130));
        jLabel6.setText("No.RM/KTP/Asuransi/JKN Pasien :");
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIconTextGap(10);
        jLabel6.setPreferredSize(new java.awt.Dimension(400, 45));
        panel1.add(jLabel6);

        TCari.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        TCari.setPreferredSize(new java.awt.Dimension(350, 45));
        TCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCariActionPerformed(evt);
            }
        });
        TCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TCariKeyPressed(evt);
            }
        });
        panel1.add(TCari);

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCariActionPerformed

    private void TCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TCariKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(TCari.getText().trim().equals("")){
                JOptionPane.showMessageDialog(rootPane,"<html><div align='center'><font size='5' face='Tahoma' color='#825082'>Silahkan masukkan No.RM/KTP/Asuransi/JKN !!!</font></div></html>");
            }else{
                if(Sequel.cariInteger("select count(no_rkm_medis) from pasien where no_rkm_medis=?",TCari.getText().trim())>0){
                     if(validasiregistrasi.equals("Yes")){
                         if(Sequel.cariInteger("select count(no_rkm_medis) from reg_periksa where no_rkm_medis=? and status_bayar='Belum Bayar' and stts<>'Batal'",TCari.getText())>0){
                             JOptionPane.showMessageDialog(rootPane,"Maaf, pasien pada kunjungan sebelumnya memiliki tagihan yang belum di closing.\nSilahkan konfirmasi dengan pihak kasir.. !!");
                         }else{
                             DlgPilihPoli pilih=new DlgPilihPoli(this,true);
                             pilih.setSize(this.getWidth()-20,this.getHeight()-70);
                             pilih.setLocationRelativeTo(this);
                             pilih.setPasien(TCari.getText());
                             pilih.tampil();
                             pilih.setVisible(true);
                         }
                     }else{
                         DlgPilihPoli pilih=new DlgPilihPoli(this,true);
                         pilih.setSize(this.getWidth()-20,this.getHeight()-70);
                         pilih.setLocationRelativeTo(this);
                         pilih.setPasien(TCari.getText());
                         pilih.tampil();
                         pilih.setVisible(true);
                     }  
                }else if(Sequel.cariInteger("select count(no_ktp) from pasien where no_ktp=?",TCari.getText().trim())>0){
                     if(validasiregistrasi.equals("Yes")){
                         if(Sequel.cariInteger("select count(no_rkm_medis) from reg_periksa where no_rkm_medis=? and status_bayar='Belum Bayar' and stts<>'Batal'",Sequel.cariIsi("select no_rkm_medis from pasien where no_ktp=?",TCari.getText().trim()))>0){
                             JOptionPane.showMessageDialog(rootPane,"Maaf, pasien pada kunjungan sebelumnya memiliki tagihan yang belum di closing.\nSilahkan konfirmasi dengan pihak kasir.. !!");
                         }else{
                             DlgPilihPoli pilih=new DlgPilihPoli(this,true);
                             pilih.setSize(this.getWidth()-20,this.getHeight()-70);
                             pilih.setLocationRelativeTo(this);
                             pilih.setPasien(Sequel.cariIsi("select no_rkm_medis from pasien where no_ktp=?",TCari.getText().trim()));
                             pilih.tampil();
                             pilih.setVisible(true);
                         }
                     }else{
                         DlgPilihPoli pilih=new DlgPilihPoli(this,true);
                         pilih.setSize(this.getWidth()-20,this.getHeight()-70);
                         pilih.setLocationRelativeTo(this);
                         pilih.setPasien(Sequel.cariIsi("select no_rkm_medis from pasien where no_ktp=?",TCari.getText().trim()));
                         pilih.tampil();
                         pilih.setVisible(true);
                     }
                }else if(Sequel.cariInteger("select count(no_peserta) from pasien where no_peserta=?",TCari.getText().trim())>0){
                     if(validasiregistrasi.equals("Yes")){
                         if(Sequel.cariInteger("select count(no_rkm_medis) from reg_periksa where no_rkm_medis=? and status_bayar='Belum Bayar' and stts<>'Batal'",Sequel.cariIsi("select no_rkm_medis from pasien where no_peserta=?",TCari.getText().trim()))>0){
                             JOptionPane.showMessageDialog(rootPane,"Maaf, pasien pada kunjungan sebelumnya memiliki tagihan yang belum di closing.\nSilahkan konfirmasi dengan pihak kasir.. !!");
                         }else{
                             DlgPilihPoli pilih=new DlgPilihPoli(this,true);
                             pilih.setSize(this.getWidth()-20,this.getHeight()-70);
                             pilih.setLocationRelativeTo(this);
                             pilih.setPasien(Sequel.cariIsi("select no_rkm_medis from pasien where no_peserta=?",TCari.getText().trim()));
                             pilih.tampil();
                             pilih.setVisible(true);
                         }
                     }else{
                         DlgPilihPoli pilih=new DlgPilihPoli(this,true);
                         pilih.setSize(this.getWidth()-20,this.getHeight()-70);
                         pilih.setLocationRelativeTo(this);
                         pilih.setPasien(Sequel.cariIsi("select no_rkm_medis from pasien where no_peserta=?",TCari.getText().trim()));
                         pilih.tampil();
                         pilih.setVisible(true); 
                     }
                }else{
                    JOptionPane.showMessageDialog(rootPane,
                        "<html><div align='center'><font size='5' face='Tahoma' color='#825082'>Maaf, data pasien dengan No.RM/KTP/Asuransi/JKN tersebut tidak ditemukan." +
                        "<br>Bagi pasien yang baru pertama kali periksa, silahkan ke petugas pendaftaran </font></div></html>");
                    TCari.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_TCariKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        TCari.setText("");
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new frmUtama().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.TextBox TCari;
    private component.Label jLabel1;
    private component.Label jLabel2;
    private component.Label jLabel3;
    private component.Label jLabel6;
    private component.Panel jPanel1;
    private component.Panel jPanel3;
    private usu.widget.glass.PanelGlass panel1;
    // End of variables declaration//GEN-END:variables
}
