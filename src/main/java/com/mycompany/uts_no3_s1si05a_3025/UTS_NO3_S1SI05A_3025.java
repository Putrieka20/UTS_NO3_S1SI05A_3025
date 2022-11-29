/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_s1si05a_3025;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author acer
 */
public class UTS_NO3_S1SI05A_3025 extends Mahasiswa_3025{
    public static void main(String[] args) {
        AsistenPraktikum_3025[] A = new AsistenPraktikum_3025[1];
        StudentStaff_3025[] S = new StudentStaff_3025[1];
        A[0] = new AsistenPraktikum_3025();
        S[0] = new StudentStaff_3025();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            //mengisi data ke array pada data nelayan
            for(int i = 0; i < 1; i++){
                System.out.print("NIM              : ");
                A[i].nim_3025 = br.readLine();
                System.out.print("Nama             : ");
                A[i].nama_3025 = br.readLine();
                System.out.print("Jurusan          : ");
                A[i].jurusan_3025 =br.readLine();
                System.out.print("IPK              : ");
                A[i].ipk_3025 =Integer.parseInt(br.readLine());
                System.out.print("Mata Kuliah      : ");
                A[i].mkAsistensi_3025 = br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                A[i].jmlPertemuan_3025 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            System.out.println("DATA ASISTEN PRAKTIKUM");
            for(AsistenPraktikum_3025 AP : A){
                AP.tampilDataAsistenPraktikum_3025();
                System.out.println("");
            }

            for(int i = 0; i < 1; i++){
                System.out.print("NIM         : ");
                S[i].nim_3025 = br.readLine();
                System.out.print("Nama        : ");
                S[i].nama_3025 = br.readLine();
                System.out.print("Jurusan     : ");
                S[i].jurusan_3025 =br.readLine();
                System.out.print("IPK         : ");
                S[i].ipk_3025 =Integer.parseInt(br.readLine());
                System.out.print(" Unit Kerja : ");
                S[i].unitKerja_3025 = Integer.parseInt(br.readLine());
                System.out.print("Jam Kerja   : ");
                S[i].jamKerja_3025 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            System.out.println("DATA STUDENT STAFF");
            for(StudentStaff_3025 SS : S){
                SS.tampilDataStudentStaff_3025();
                System.out.println("");
            }
        } 
        catch (Exception ex){ 
            System.out.println(ex);
        }
        
    }
}