/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.util.List;
import DAOdatahewan.datahewanDAO;
import Implement.dataImplement;
import model.*;
import view.tampilan;
 
/**
 *
 * @author Lab Informatika
 */
public class datahewancontroller {
   tampilan frame;
   dataImplement impldata;
   List<datahewan> dp;
    public datahewancontroller(tampilan frame){
    this.frame=frame;
    impldata = new datahewanDAO();
    dp=impldata.getAll();
    }
    public void isitabel(){
    dp= impldata.getAll();
    modeltabeldatahewan mp = new modeltabeldatahewan(dp);
    frame.getTableDataHewan().setModel(mp);
    }
    public void insert(){
    datahewan dp=new datahewan();
     try{
    int id=Integer.parseInt(frame.getTxtid().getText());
    dp.setId(id);
    }catch(NumberFormatException e){
    
    }
     dp.setNama_pemilik(frame.getTxtnama_pemilik().getText());
      dp.setNama_hewan(frame.getTxtnama_hewan().getText());
       dp.setJenis_hewan(frame.getTxtjenis_hewan().getText());
    try{
    int nomor_telepon=Integer.parseInt(frame.getTxtnomor_telepon().getText());
    dp.setNomor_telepon(nomor_telepon);
    }catch(NumberFormatException e){
    
    }
     try{
    int durasi_titip=Integer.parseInt(frame.getTxtdurasi_titip().getText());
    dp.setDurasi_titip(durasi_titip);
    }catch(NumberFormatException e){
    
    }
      try{
    int total_biaya=Integer.parseInt(frame.getTxttotal_biaya().getText());
    dp.setTotal_biaya(total_biaya);
    }catch(NumberFormatException e){
    
    }
      impldata.insert(dp);
    }
    public void update(){
    datahewan dp=new datahewan();
    try{
    int id=Integer.parseInt(frame.getTxtid().getText());
    dp.setId(id);
    }catch(NumberFormatException e){
    
    }
     dp.setNama_pemilik(frame.getTxtnama_pemilik().getText());
      dp.setNama_hewan(frame.getTxtnama_hewan().getText());
       dp.setJenis_hewan(frame.getTxtjenis_hewan().getText());
    try{
    int nomor_telepon=Integer.parseInt(frame.getTxtnomor_telepon().getText());
    dp.setNomor_telepon(nomor_telepon);
    }catch(NumberFormatException e){
    
    }
     try{
    int durasi_titip=Integer.parseInt(frame.getTxtdurasi_titip().getText());
    dp.setDurasi_titip(durasi_titip);
    }catch(NumberFormatException e){
    
    }
      try{
    int total_biaya=Integer.parseInt(frame.getTxttotal_biaya().getText());
    dp.setTotal_biaya(total_biaya);
    }catch(NumberFormatException e){
    
    }
      impldata.update(dp);
    }
    
    public void delete(){
    int id=Integer.parseInt(frame.getTxtid().getText());
    impldata.delete(id);
    }
    
    
}
