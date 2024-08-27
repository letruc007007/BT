/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_02_bt1;

/**
 *
 * @author ADMIN
 */
public class chunhat {
    public double rong;
    public double dai;

    public chunhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getChuVi() {
        return 2 * (dai + rong);
    }

    public double getDienTich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.println("chieu dai: " + dai);
        System.out.println("chieu rong: " + rong);
        System.out.println("chu vi: " + getChuVi());
        System.out.println("dien tich: " + getDienTich());
    }
}
