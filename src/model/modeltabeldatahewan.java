/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lab Informatika
 */
public class modeltabeldatahewan extends AbstractTableModel{
List<datahewan> dp;
public modeltabeldatahewan(List<datahewan>dp){
this.dp=dp;
}
    @Override
    public int getRowCount() {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return dp.size();
    }

    @Override
    public int getColumnCount() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return 7;
    }

      public String getColumnName(int column) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    switch (column){
        case 0:
            return "id";
            case 1:
            return "nama_pemilik";

            case 2:
            return "nama_hewan";

            case 3:
            return "jenis_hewan";

           case 4:
            return "nomor_telepon";
        case 5:
            return "durasi_titip";
        case 6:
            return "total_biaya";
        default:
            return null;

    }
    }
    @Override
    public Object getValueAt(int row, int column) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   switch (column){
        case 0:
            return dp.get(row).getId();
            case 1:
            return dp.get(row).getNama_pemilik();

            case 2:
            return dp.get(row).getNama_hewan();

            case 3:
            return dp.get(row).getJenis_hewan();

           case 4:
            return dp.get(row).getNomor_telepon();
        case 5:
            return dp.get(row).getDurasi_titip();
        case 6:
            return dp.get(row).getTotal_biaya();
        default:
            return null;

    }
    }
    
}
