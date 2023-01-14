package kelolakrs;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.io.File;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class dbCrud {
    private String Database="db_krs";
    private String jdbcurl="jdbc:mysql://localhost:3306/"+Database;
    private String Username="root";
    private String Password="";
    
    public dbCrud(){}
    
    public dbCrud(String url,String username,String password){
        try {
            Driver mysqlDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(mysqlDriver);
            Connection koneksi = DriverManager.getConnection(url, username, password);
            System.out.println("Berhasil dikoneksikan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    public Connection getKoneksi() throws SQLException{
        try {
            Driver mysqlDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(mysqlDriver);
            System.out.println("Berhasil dikoneksikan");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
        return DriverManager.getConnection(this.jdbcurl, this.Username, this.Password);
    }
    public boolean duplikasiKey(String tabel, String primarykey, String isi){
        boolean hasil = true;
        try {
            Statement sts = getKoneksi().createStatement();
            ResultSet rs = sts.executeQuery("SELECT * FROM "+tabel+" WHERE "+primarykey+" = '"+isi+"'");
            hasil = rs.next();
        } catch (Exception e) {
            System.err.println(e.toString());
        }
        return hasil;
    } 
    public String getFieldTabel(String[] Fieldnya){
        String hasil ="";
        int deteksi = Fieldnya.length-1;
        try {
            for(int i=0; i<Fieldnya.length; i++){
                if(i==deteksi){
                    hasil = hasil+Fieldnya[i];
                }else{
                    hasil = hasil+Fieldnya[i]+",";
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return "("+hasil+")";
    }
    public String getIsiTabel(String[] isinya){
        String hasil = "";
        int deteksi = isinya.length-1;
        try {
            for(int i=0; i<isinya.length; i++){
                if (i==deteksi) {
                    hasil=hasil+"'"+isinya[i]+"'";
                }else{
                    hasil=hasil+"'"+isinya[i]+"',";
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return "("+hasil+")";
    }
    public void SimpanDBAuto(String NamaTabel, String[] FieldTabelnya, String[] IsiTabelnya){
        try {
            String SQL = "INSERT INTO "+NamaTabel+" "+getFieldTabel(FieldTabelnya)+" VALUES "+getIsiTabel(IsiTabelnya)+"";
            Statement save = getKoneksi().createStatement();
            save.executeUpdate(SQL);
            save.close();
            System.out.println("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    public void UbahDBAuto(String NamaTabel, String NamaPrimary, String isiPrimary, String[]Field, String[] ValueField){
        try {
            String SQLEdit = "UPDATE "+NamaTabel+" SET "+getEditFieldValue(Field, ValueField)+" WHERE "+NamaPrimary+"='"+isiPrimary+"'";
            Statement perintah = getKoneksi().createStatement();
            perintah.executeUpdate(SQLEdit);
            perintah.close();
            getKoneksi().close();
            System.out.println("Data Berhasil Diubah");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    public String getEditFieldValue(String[] Field, String[] ValueField) {
        String hasil = "";
        int deteksi = Field.length-1;
        try {
            for(int i=0; i<Field.length;i++){
                if (i==deteksi) {
                    hasil=hasil+Field[i]+"='"+ValueField[i]+"'";
                }else{
                    hasil=hasil+Field[i]+"='"+ValueField[i]+"',";
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return hasil;
    }
    public void HapusDBAuto(String NamaTabel, String Primarynya, String isiPrimary){
        try {
            String SQLHapus = "DELETE  FROM "+NamaTabel+" WHERE "+Primarynya+"='"+isiPrimary+"'";
            Statement perintah = getKoneksi().createStatement();
            perintah.executeUpdate(SQLHapus);
            perintah.close();
            getKoneksi().close();
            System.out.println("Data Berhasil Dihapus");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    public void JudulTable(JTable JTabelnya, String[] Judulnya){
        DefaultTableModel modelnya = new DefaultTableModel();
        try {
            JTabelnya.setModel(modelnya);
            for (int i = 0; i < Judulnya.length; i++) {
                modelnya.addColumn(Judulnya[i]);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    public void LebarJtable(JTable Jtabelnya, int[] Lebarnya){
        TableColumn kolom = new TableColumn();
        try {
            Jtabelnya.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
            for (int i = 0; i < Lebarnya.length; i++) {
                kolom=Jtabelnya.getColumnModel().getColumn(i);
                kolom.setPreferredWidth(Lebarnya[i]);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    public Object[][] isiTabel(String SQL, int jumlah){
        Object[][] data = null;
        try {
            Statement st = getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(SQL);
            rs.last();
            int baris=rs.getRow();
            rs.beforeFirst();
            int j=0;
            data = new Object[baris][jumlah];
            while (rs.next()) {                
                for (int i = 0; i < jumlah; i++) {
                    data[j][i]=rs.getString(i+1);
                } j++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return data;
    }
    public void tampilTabel(String Judul[], String SQL, JTable Tabel){
        try {
            String title[]=Judul;
            int jum = title.length;
            Tabel.setModel(new DefaultTableModel(isiTabel(SQL, jum), title));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    public int jumlahRecord(String SQL){
        int hasil=0;
        int i=0;
        try {
            Statement st = getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {                
                i++;
            }
            hasil=i;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return hasil; 
    }
    public void tampilLaporan(String laporanfile, String SQL){
        try {
            File file = new File(laporanfile);
            JasperDesign jasDes = JRXmlLoader.load(file);
            
            JRDesignQuery sqlQuery = new JRDesignQuery();
            sqlQuery.setText(SQL);
            jasDes.setQuery(sqlQuery);
            
            JasperReport JR = JasperCompileManager.compileReport(jasDes);
            JasperPrint JP = JasperFillManager.fillReport(JR, null, getKoneksi());
            JasperViewer.viewReport(JP);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
