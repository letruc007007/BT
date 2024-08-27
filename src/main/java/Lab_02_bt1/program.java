/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_02_bt1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class program {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("nhap thong tin hinh chu nhat:");
        System.out.print("cho biet dai:");
        double dai=sn.nextDouble();
        System.out.print("cho biet chieu rong:");
        double rong=sn.nextDouble();
        
        chunhat cn= new chunhat(dai,rong);
        System.out.println("ket qua");
        cn.xuat();

        System.out.println("nhap thong tin hinh chu vuong:");
        System.out.print("cho biet canh:");
        double canh = sn.nextDouble();
        
        chunhat hv=new hinhvuong(5);
        hv.xuat();
    }   
}
