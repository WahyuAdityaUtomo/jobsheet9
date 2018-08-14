/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class latihan5 {
public static int nilai(int bil1, int bil2, int bil3, int terbesar){
        return bil1 = bil2 = bil3 = terbesar;
    }
        public static void main(String[] args) {
           Scanner hasil = new Scanner(System.in);
           
            System.out.print("masukan nilai 1: ");
            int bil1 = hasil.nextInt();
            
            System.out.print("masukan nilai 2: ");
            int bil2 = hasil.nextInt();
            
            System.out.print("masukan nilai 3: ");
            int bil3 = hasil.nextInt();
            
    int terbesar = (bil1>bil2)?bil1:bil2;
        terbesar = (terbesar>bil3)?terbesar:bil3;
            System.out.println("Nilai terbesar adalah: "+terbesar);
        }}