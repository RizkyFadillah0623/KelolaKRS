package kelolakrs;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormTransaksi extends javax.swing.JFrame {
 dbCrud obj;
    
    public void tampilData(){
        String[] judulKolom={"ID","Semester","NPM","Biaya","Pajak","Total Keseluruhan"};
        int[] lebar={50,100,200,100,100,100,150};
        String query="SELECT * FROM transaksi";
        obj.JudulTable(jTable1, judulKolom);
        obj.tampilTabel(judulKolom, query, jTable1);
        obj.LebarJtable(jTable1, lebar);
        
    }
    
    private void hitung() {
    double biayapermalam, totalseluruh,pajak;

    biayapermalam = Double.parseDouble(txtBiaya.getText());

    pajak = 5 * biayapermalam / 100;
    totalseluruh = biayapermalam + pajak;
    txtKeseluruhan.setText(String.valueOf(totalseluruh));

    txtPajak.setText(String.valueOf(pajak));
    txtBiaya.setText(String.valueOf(biayapermalam));
    lbMembayar.setText("Anda Harus Membayar Sebesar : Rp.  "+txtKeseluruhan.getText());
    }
    
        
    
    public FormTransaksi() {
        initComponents();
        obj = new dbCrud();
        tampilData();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtSmst = new javax.swing.JComboBox<>();
        txtNpm = new javax.swing.JTextField();
        txtBiaya = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPajak = new javax.swing.JTextField();
        txtKeseluruhan = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbMembayar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        tfCari = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
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

        jButton3.setText("Hitung");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("BIAYA");

        jLabel3.setText("NPM");

        jLabel2.setText("Semester");

        jLabel1.setText("ID");

        txtSmst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8" }));
        txtSmst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSmstActionPerformed(evt);
            }
        });

        txtBiaya.setEditable(false);

        jLabel6.setText("PAJAK");

        jLabel7.setText("TOTAL KESELURUHAN");

        txtPajak.setEditable(false);

        txtKeseluruhan.setEditable(false);

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jButton1.setText("Cetak");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lbMembayar.setText("Anda Harus Membayar Sebesar : Rp. ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Form Input Kelola KRS UNISKA MAB");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Form Transaksi, Dirancang Oleh Muhammad Rizky Fadillah - 2010010623");

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        tfCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCariKeyPressed(evt);
            }
        });

        jLabel9.setText("Cari Data");

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(71, 71, 71)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSmst, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNpm, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCari)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbMembayar)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtKeseluruhan, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3))
                                            .addComponent(txtPajak, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(103, 103, 103))
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
                                .addComponent(jButton1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtSmst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPajak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtKeseluruhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbMembayar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(btnUbah)
                            .addComponent(btnHapus)
                            .addComponent(btnClear)
                            .addComponent(btnKembali))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(btnCari))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String[] fieldnya={"id","semester","npm","biaya","pajak","total_keseluruhan"};
        String[] isiFieldnya={txtId.getText(),
            txtSmst.getSelectedItem().toString(),
            txtNpm.getText(),
            txtBiaya.getText(),
            txtPajak.getText(),
            txtKeseluruhan.getText()};
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Id Belum Diisi");
            txtId.requestFocus();
        }else if (txtNpm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "NPM Belum Diisi");
            txtNpm.requestFocus();
        }else if (obj.duplikasiKey("transaksi", "id", txtId.getText())) {
            JOptionPane.showMessageDialog(this, "ID sudah terdaftar");
            try {
                Statement stm = obj.getKoneksi().createStatement();
                ResultSet rslt = stm.executeQuery("SELECT*FROM transaksi WHERE id='"+txtId.getText()+"'");
                rslt.next();
                txtSmst.setSelectedItem(rslt.getString(2));
                txtNpm.setText(rslt.getString(3));
                txtBiaya.setText(rslt.getString(4));
                txtPajak.setText(rslt.getString(5));
                txtKeseluruhan.setText(rslt.getString(6));
            } catch (SQLException ex) {
                Logger.getLogger(FormTransaksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            obj.SimpanDBAuto("transaksi", fieldnya, isiFieldnya);
            tampilData();
            JOptionPane.showMessageDialog(this, "Data Berhasil disimpan");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        hitung();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtSmstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSmstActionPerformed
        if (txtSmst.getSelectedItem().equals("Semester 1")) {
            int biaya = 3600000;
            txtBiaya.setText(Integer.toString(biaya));
        } else if (txtSmst.getSelectedItem().equals("Semester 2")) {
            int biaya = 3700000;
            txtBiaya.setText(Integer.toString(biaya));
        } else if (txtSmst.getSelectedItem().equals("Semester 3")) {
            int biaya = 3800000;
            txtBiaya.setText(Integer.toString(biaya));
        } else if (txtSmst.getSelectedItem().equals("Semester 4")) {
            int biaya = 3900000;
            txtBiaya.setText(Integer.toString(biaya));
        } else if (txtSmst.getSelectedItem().equals("Semester 5")) {
            int biaya = 4000000;
            txtBiaya.setText(Integer.toString(biaya));
        } else if (txtSmst.getSelectedItem().equals("Semester 6")) {
            int biaya = 4100000;
            txtBiaya.setText(Integer.toString(biaya));
        }else if (txtSmst.getSelectedItem().equals("Semester 7")) {
            int biaya = 4200000;
            txtBiaya.setText(Integer.toString(biaya));
        }else if (txtSmst.getSelectedItem().equals("Semester 8")) {
            int biaya = 4300000;
            txtBiaya.setText(Integer.toString(biaya));
        }
    }//GEN-LAST:event_txtSmstActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String SQLCetak = "SELECT*FROM transaksi WHERE id LIKE '%"+tfCari.getText()+"%' OR semester LIKE '%"+tfCari.getText()+"%'";
        obj.tampilLaporan("src/laporanTransaksi.jrxml", SQLCetak);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            int baris = jTable1.getSelectedRow();
            txtId.setText(jTable1.getValueAt(baris, 0).toString());
            txtSmst.setSelectedItem(jTable1.getValueAt(baris, 1).toString());
            txtNpm.setText(jTable1.getValueAt(baris, 2).toString());
            txtBiaya.setText(jTable1.getValueAt(baris, 3).toString());
            txtPajak.setText(jTable1.getValueAt(baris, 4).toString());
            txtKeseluruhan.setText(jTable1.getValueAt(baris, 5).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        try {
            if (
                (txtId.getText().isEmpty()) && 
                (txtSmst.getSelectedItem().toString().isEmpty()) &&
                (txtNpm.getText().isEmpty()) &&
                (txtBiaya.getText().isEmpty()) &&
                (txtPajak.getText().isEmpty()) && 
                (txtKeseluruhan.getText().isEmpty())
                ) {
                JOptionPane.showMessageDialog(this, "silahkan pilih data di tabel");
                jTable1.requestFocus();
            }else{
                String[] fieldnya={"semester","npm","biaya","pajak","total_keseluruhan"};
                String[] isiFieldnya={
                              txtSmst.getSelectedItem().toString(),
                              txtNpm.getText(),
                              txtBiaya.getText(),
                              txtPajak.getText(),
                              txtKeseluruhan.getText()};
                obj.UbahDBAuto("transaksi", "id", txtId.getText(), fieldnya, isiFieldnya);
                JOptionPane.showMessageDialog(this, "Data Berhasil Diubah");
                tampilData();
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            if (
                (txtId.getText().isEmpty()) && 
                (txtSmst.getSelectedItem().toString().isEmpty()) &&
                (txtNpm.getText().isEmpty()) &&
                (txtBiaya.getText().isEmpty()) &&
                (txtPajak.getText().isEmpty()) && 
                (txtKeseluruhan.getText().isEmpty())  
                ) {
                JOptionPane.showMessageDialog(this, "silahkan pilih data di tabel");
                jTable1.requestFocus();
            } else{
                obj.HapusDBAuto("transaksi", "id", txtId.getText());
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                tampilData();
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtId.setText(null);
        txtSmst.setSelectedItem("Semester 1");
        txtNpm.setText(null);
        txtBiaya.setText(null);
        txtPajak.setText(null);
        txtKeseluruhan.setText(null);
    }//GEN-LAST:event_btnClearActionPerformed

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

    private void tfCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCariKeyPressed
        
    }//GEN-LAST:event_tfCariKeyPressed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        try {
            String SQL = "SELECT*FROM transaksi WHERE id LIKE '%"+tfCari.getText()+"%' OR semester LIKE '%"+tfCari.getText()+"%'";
            String[] judulKolom={"ID","Semester","NPM","Biaya","Pajak","Total Keseluruhan"};
            int[] lebar={50,100,200,100,100,100,150};
            obj.JudulTable(jTable1, judulKolom);
            obj.tampilTabel(judulKolom, SQL, jTable1);
            obj.LebarJtable(jTable1, lebar);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
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
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTransaksi().setVisible(true);
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
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbMembayar;
    private javax.swing.JTextField tfCari;
    private javax.swing.JTextField txtBiaya;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtKeseluruhan;
    private javax.swing.JTextField txtNpm;
    private javax.swing.JTextField txtPajak;
    private javax.swing.JComboBox<String> txtSmst;
    // End of variables declaration//GEN-END:variables
}
