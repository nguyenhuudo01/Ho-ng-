/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *can bo : hoten , namsinh, gioitinh, dia chi
 * @author nguye
 */
public class canbo {
    protected String hoten;
    protected String namsinh;
    protected String gioitinh;
    protected String diachi;

    public canbo() {
    }

    public canbo(String a, String b, String c, String d) {
        hoten = a;
        namsinh = b;
        gioitinh = c;
        diachi = d;
    }
    public void nhap() {
       Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        namsinh = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioitinh = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diachi = sc.nextLine();
    }
    public void hienthi(){
        System.out.println("\t\t\tTHONG TIN CAN BO DA NHAP LA:");
        System.out.println("Ho Ten:"+ hoten);
        System.out.println("Nam Sinh:"+ namsinh);
        System.out.println("Gioi tinh:"+ gioitinh);
        System.out.println("Dia chi:"+ diachi);
    }
}
