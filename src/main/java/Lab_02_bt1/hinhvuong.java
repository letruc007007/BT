/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_02_bt1;

/**
 *
 * @author ADMIN
 */
public class hinhvuong  extends chunhat {
    public hinhvuong(double canh)
    {
     super(canh,canh);  
    }

    @Override
    public void xuat() {
        System.out.println("canh hinh vuong: " + dai);
        System.out.println("chu vi: " + getChuVi());
        System.out.println("dien tich: " + getDienTich());
    }
    
}
