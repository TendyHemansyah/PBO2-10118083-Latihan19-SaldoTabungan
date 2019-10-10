/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan19.saldotabungan;

/**
 *
 * @author Tendy
 * Nama     : Tendy Hermansyah
 * Kelas    : PBO2
 * Nim      : 10118083
 * Deskripsi Program : Saldo Tabungan
 */
public class PBO210118083Latihan19SaldoTabungan {
    public static int saldoawal = 2500000;
    public static void main(String[] args) {
        for (int i = 1; i<=6; i++){
             saldoawal = saldoawal + (int)(saldoawal * 0.15);
             System.out.printf("Saldo di Bulan ke-"+ i +" Rp. %,d%n" , saldoawal);
        }
    }
}
