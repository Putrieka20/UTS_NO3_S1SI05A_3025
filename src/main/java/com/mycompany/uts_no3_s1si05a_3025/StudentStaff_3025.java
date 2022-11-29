/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_s1si05a_3025;

/**
 *
 * @author acer
 */
public class StudentStaff_3025 extends Mahasiswa_3025{
    int unitKerja_3025;
    int jamKerja_3025;
    
    public double totalPendapatanSS(){
       return (jamKerja_3025 * 30000);
    }
    
    public void tampilDataMhs(){
        System.out.println("Unit Kerja : "+unitKerja_3025);
        System.out.println("Jam Kerja : "+jamKerja_3025);
        System.out.println("Total Pendapatan : "+totalPendapatanSS());
    }

    void tampilDataStudentStaff_3025() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
