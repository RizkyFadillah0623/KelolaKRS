
package kelolakrs;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormKrs extends javax.swing.JFrame {
    dbCrud obj;
    public void tampilData(){
        String[] judulKolom={"ID","Mata Kuliah","Dosen","Kelas","Semester","Jam","Hari"};
        int[] lebar={100,200,150,100,100,150,100};
        String query="SELECT * FROM tb_krs";
        obj.JudulTable(jTable1, judulKolom);
        obj.tampilTabel(judulKolom, query, jTable1);
        obj.LebarJtable(jTable1, lebar);
        
    }
    public FormKrs() {
        initComponents();
        obj = new dbCrud();
        tampilData();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtDosen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtMata = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtJam = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtHari = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnUbah = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtSmst = new javax.swing.JComboBox<>();
        txtKelas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tfCari1 = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jButton1.setText("Cetak");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("MATA KULIAH");

        jLabel3.setText("DOSEN");

        txtJam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagi 8.00 - 11.15", "Siang 13.00 - 14.00", "Malam 17.00 - 22.00" }));

        jLabel4.setText("KELAS");

        txtHari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Senin", "Selasa", "Rabu", "Kamis", "Jumat" }));

        jLabel5.setText("SEMESTER");

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        jLabel6.setText("JAM");

        jLabel7.setText("HARI");

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtSmst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Form Input Kelola KRS UNISKA MAB");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Form KRS, Dirancang Oleh Muhammad Rizky Fadillah - 2010010623");

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        jLabel9.setText("Cari Data");

        tfCari1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCari1KeyPressed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        btnCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCariKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMata, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDosen, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(txtKelas))))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSmst, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtJam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtHari, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUbah)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnHapus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnClear)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnKembali)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(136, 136, 136)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfCari1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCari))))
                            .addComponent(jLabel8))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSmst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtJam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(btnUbah)
                            .addComponent(btnHapus)
                            .addComponent(btnClear)
                            .addComponent(jButton1)
                            .addComponent(btnKembali))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfCari1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            int baris = jTable1.getSelectedRow();
            txtId.setText(jTable1.getValueAt(baris, 0).toString());
            txtMata.setText(jTable1.getValueAt(baris, 1).toString());
            txtDosen.setText(jTable1.getValueAt(baris, 2).toString());
            txtKelas.setText(jTable1.getValueAt(baris, 3).toString());
            txtSmst.setSelectedItem(jTable1.getValueAt(baris, 4).toString());
            txtJam.setSelectedItem(jTable1.getValueAt(baris, 5).toString());
            txtHari.setSelectedItem(jTable1.getValueAt(baris, 6).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtId.setText(null);
        txtMata.setText(null);
        txtDosen.setText(null);
        txtKelas.setText(null);
        txtSmst.setSelectedItem("Semester 1");
        txtJam.setSelectedItem("Pagi 8.00 - 11.15");
        txtHari.setSelectedItem("Senin");
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String[] fieldnya={"id","mata_kuliah","dosen","kelas","semester","jam","hari"};
        String[] isiFieldnya={txtId.getText(),
            txtMata.getText(),
            txtDosen.getText(),
            txtKelas.getText(),
            txtSmst.getSelectedItem().toString(),
            txtJam.getSelectedItem().toString(),
            txtHari.getSelectedItem().toString()};
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Id Belum Diisi");
            txtId.requestFocus();
        }else if (txtMata.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mata Kuliah Belum Diisi");
            txtMata.requestFocus();
        }else if (txtDosen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama Dosen Belum Diisi");
            txtDosen.requestFocus();
        } else if (txtKelas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Kelas Belum Diisi");
            txtKelas.requestFocus();
        }else if (obj.duplikasiKey("tb_krs", "id", txtId.getText())) {
            JOptionPane.showMessageDialog(this, "ID sudah terdaftar");
            try {
                Statement stm = obj.getKoneksi().createStatement();
                ResultSet rslt = stm.executeQuery("SELECT*FROM tb_krs WHERE id='"+txtId.getText()+"'");
                rslt.next();
                txtMata.setText(rslt.getString(2));
                txtDosen.setText(rslt.getString(3));
                txtKelas.setText(rslt.getString(4));
                txtSmst.setSelectedItem(rslt.getString(5));
                txtJam.setSelectedItem(rslt.getString(6));
                txtHari.setSelectedItem(rslt.getString(7));
            } catch (SQLException ex) {
                Logger.getLogger(FormKrs.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            obj.SimpanDBAuto("tb_krs", fieldnya, isiFieldnya);
            tampilData();
            JOptionPane.showMessageDialog(this, "Data Berhasil disimpan");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            if (
                (txtId.getText().isEmpty()) &&
                (txtMata.getText().isEmpty()) &&
                (txtDosen.getText().isEmpty()) &&
                (txtKelas.getText().isEmpty()) &&
                (txtSmst.getSelectedItem().toString().isEmpty()) &&
                (txtJam.getSelectedItem().toString().isEmpty()) &&
                (txtHari.getSelectedItem().toString().isEmpty())
            ) {
                JOptionPane.showMessageDialog(this, "silahkan pilih data di tabel");
                jTable1.requestFocus();
            } else{
                obj.HapusDBAuto("tb_krs", "id", txtId.getText());
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                tampilData();
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        try {
            if (
                (txtId.getText().isEmpty()) &&
                (txtMata.getText().isEmpty()) &&
                (txtDosen.getText().isEmpty()) &&
                (txtKelas.getText().isEmpty()) &&
                (txtSmst.getSelectedItem().toString().isEmpty()) &&
                (txtJam.getSelectedItem().toString().isEmpty()) &&
                (txtHari.getSelectedItem().toString().isEmpty())
            ) {
                JOptionPane.showMessageDialog(this, "silahkan pilih data di tabel");
                jTable1.requestFocus();
            }else{
                String[] fieldnya={"mata_kuliah","dosen","kelas","semester","jam","hari"};
                String[] isiFieldnya={
                    txtMata.getText(),
                    txtDosen.getText(),
                    txtKelas.getText(),
                    txtSmst.getSelectedItem().toString(),
                    txtJam.getSelectedItem().toString(),
                    txtHari.getSelectedItem().toString()};
                obj.UbahDBAuto("tb_krs", "id", txtId.getText(), fieldnya, isiFieldnya);
                JOptionPane.showMessageDialog(this, "Data Berhasil Diubah");
                tampilData();
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }   
    }//GEN-LAST:event_btnUbahActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String SQLCetak = "SELECT*FROM tb_krs WHERE id LIKE '%"+tfCari1.getText()+"%' OR mata_kuliah LIKE '%"+tfCari1.getText()+"%'";
        obj.tampilLaporan("src/laporanKrs.jrxml", SQLCetak);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        this.setVisible(false);
        
        System.out.println(User.getRole());
        if(User.getRole().equals("1")) {
            Dashboard dsb = new Dashboard();
            dsb.setVisible(true);
        } else if(User.getRole().equals("2")) {
            Dashboard2 dsb2 = new Dashboard2();
            dsb2.setVisible(true);
        }
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void tfCari1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCari1KeyPressed
        
    }//GEN-LAST:event_tfCari1KeyPressed

    private void btnCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCariKeyPressed
        
    }//GEN-LAST:event_btnCariKeyPressed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        String SQL = "SELECT*FROM tb_krs WHERE id LIKE '%"+tfCari1.getText()+"%' OR mata_kuliah LIKE '%"+tfCari1.getText()+"%'";
        String[] judulKolom={"ID","Mata Kuliah","Dosen","Kelas","Semester","Jam","Hari"};
        int[] lebar={100,200,150,100,100,150,100};
        obj.JudulTable(jTable1, judulKolom);
        obj.tampilTabel(judulKolom, SQL, jTable1);
        obj.LebarJtable(jTable1, lebar);
    }//GEN-LAST:event_btnCariActionPerformed

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
            java.util.logging.Logger.getLogger(FormKrs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormKrs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormKrs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKrs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormKrs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnUbah;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfCari1;
    private javax.swing.JTextField txtDosen;
    private javax.swing.JComboBox<String> txtHari;
    private javax.swing.JTextField txtId;
    private javax.swing.JComboBox<String> txtJam;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtMata;
    private javax.swing.JComboBox<String> txtSmst;
    // End of variables declaration//GEN-END:variables
}
