/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UTS_PBO;

import coba.DbUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Achmad
 */
public class Utama extends javax.swing.JFrame {

    Connection conn;
    Statement stmt;
    PreparedStatement pstmt;

    String driver = "org.postgresql.Driver";
    String koneksi = "jdbc:postgresql://localhost:5432/Perkuliahan";
    String user = "postgres";
    String password = "123";

  
    public Utama() {
        initComponents();
        tampil();
    }

    public void tampil() {

        try {
            // TODO code application logi
            Class.forName(driver);
            String sql = "SELECT * FROM mataKuliah";
            conn = DriverManager.getConnection(koneksi, user, password);
            stmt = conn.createStatement();

            while (!conn.isClosed()) {

                ResultSet rs = stmt.executeQuery(sql);
                this.jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                while (rs.next()) {
                    System.out.println(String.valueOf(rs.getObject(1)) + " " + String.valueOf(rs.getObject(2)) + " " + String.valueOf(rs.getObject(3)) + " " + String.valueOf(rs.getObject(4)));
                }
                conn.close();
            }

            stmt.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Utama.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Utama.class.getName()).log(Level.SEVERE, null, ex);
        }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtKodemk = new javax.swing.JTextField();
        txtSKS = new javax.swing.JTextField();
        txtNamaMk = new javax.swing.JTextField();
        txtSemesterAjar = new javax.swing.JTextField();
        txtTambah = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mata Kuliah");

        jLabel2.setText("Kode Mk");

        jLabel3.setText("SemesterAjar");

        jLabel4.setText("SKS");

        jLabel5.setText("Nama MK");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "KodeMk", "SKS", "NamaMk", "SemesterAjar"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txtSemesterAjar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemesterAjarActionPerformed(evt);
            }
        });

        txtTambah.setText("Tambah");
        txtTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTambahActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSemesterAjar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKodemk, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSKS, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNamaMk, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTambah)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(jButton4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKodemk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaMk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSemesterAjar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTambah)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSemesterAjarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemesterAjarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemesterAjarActionPerformed

    private void txtTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTambahActionPerformed
        if (txtKodemk.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Kode MK belum diisi !");
        } else if (txtSKS.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, SKS belum diisi !");
        } else if (txtNamaMk.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Nama Mk belum diisi !");
        } else if (txtSemesterAjar.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Semester Ajar belum diisi !");
        } else {
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(koneksi, user, password);
                conn.setAutoCommit(false);
                String sql = "INSERT INTO matakuliah VALUES(?,?,?,?)";
                pstmt = conn.prepareStatement(sql);

                int semesterajar = Integer.parseInt(txtSemesterAjar.getText());
                int sks = Integer.parseInt(txtSKS.getText());
                String kodemk, namamk;
                kodemk = txtKodemk.getText();
                namamk = txtNamaMk.getText();

                pstmt.setString(1, kodemk);
                pstmt.setInt(2, sks);
                pstmt.setString(3, namamk);
                pstmt.setInt(4, semesterajar);
                pstmt.executeUpdate();
                conn.commit();
                pstmt.close();
                conn.close();

            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, JOptionPane.INFORMATION_MESSAGE);
            }

        }
        tampil();
        reset();

    }//GEN-LAST:event_txtTambahActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String kodemk = txtKodemk.getText();
        if (kodemk.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kode Mk tidak boleh kosong");
            jTable1.requestFocus();
        } else if (JOptionPane.showConfirmDialog(null, "Apakah anda yakin akan menghapus data ini?",
                "Informasi", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.OK_OPTION) {
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(koneksi, user, password);
                Statement stt = conn.createStatement();
                stt.executeUpdate("DELETE FROM matakuliah WHERE kodemk ='" + kodemk + "'");
                reset();
                tampil();
                JOptionPane.showMessageDialog(this, "Data berhasil di hapus", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(this, "Delete data gagal\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int semesterajar = Integer.parseInt(txtSemesterAjar.getText());
        int sks = Integer.parseInt(txtSKS.getText());
        String kodemk, namamk;
        kodemk = txtKodemk.getText();
        namamk = txtNamaMk.getText();
        if (txtKodemk.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Kode Mk belum diisi !");
        } else if (txtSKS.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, SKS belum diisi !");
        } else if (txtNamaMk.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Nama mk belum diisi !");
        } else if (txtSemesterAjar.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Semester Ajar belum diisi !");
        } else {
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(koneksi, user, password);
                String sql = "UPDATE matakuliah SET sks = ? , namamk = ? , semesterajar = ? WHERE kodemk = ?";
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, sks);
                pstmt.setString(2, namamk);
                pstmt.setInt(3, semesterajar);
                pstmt.setString(4, kodemk);
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
                    pstmt.close();
                    conn.close();
                    reset();
                } else {
                    JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "TERJADI KESALAHAN" + ex.getMessage());
            }

        }
        tampil();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        txtKodemk.setText(jTable1.getValueAt(row, 0).toString());
        txtSKS.setText(jTable1.getValueAt(row, 1).toString());
        txtNamaMk.setText(jTable1.getValueAt(row, 2).toString());
        txtSemesterAjar.setText(jTable1.getValueAt(row, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       reset();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
    public void reset() {
        txtKodemk.setText("");
        txtSKS.setText("");
        txtNamaMk.setText("");
        txtSemesterAjar.setText("");
    }

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
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtKodemk;
    private javax.swing.JTextField txtNamaMk;
    private javax.swing.JTextField txtSKS;
    private javax.swing.JTextField txtSemesterAjar;
    private javax.swing.JButton txtTambah;
    // End of variables declaration//GEN-END:variables
}
