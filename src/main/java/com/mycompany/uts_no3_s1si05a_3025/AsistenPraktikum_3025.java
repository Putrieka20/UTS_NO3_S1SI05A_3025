/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_s1si05a_3025;

/**
 *
 * @author acer
 */
public class AsistenPraktikum_3025 extends Mahasiswa_3025{
    String mkAsistensi_3025;
    int jmlPertemuan_3025;

    
    public double totalPendapatan(){
       return(jmlPertemuan_3025 * 50000); 
    }
    
    public void tampilDataMhs(){
        System.out.println("Mk Asistensi : "+mkAsistensi_3025);
        System.out.println("Jumlah Pertemuan : "+jmlPertemuan_3025);
        System.out.println("Total Pendapatan : "+totalPendapatan());
    }

    void tampilDataAsistenPraktikum_3025() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
