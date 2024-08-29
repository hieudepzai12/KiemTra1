/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de01;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCauThu qlCauThu = new QLCauThu();
        int chon = 0;
        while (chon != 6) {
            System.out.print("\n=====QUAN LY CAU THU====="
                    + "\n1. Xuat danh sach thong tin cac cau thu"
                    + "\n2. Them cau thu moi."
                    + "\n3. Tim cau thu co luong cau nhat doi"
                    + "\n4. Sap xep theo luong lanh"
                    + "\n5. Tinh luong cung trung binh"
                    + "\n6. Thoat"
                    + "\nChon chuc nang:");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    qlCauThu.xuatThongTinDanhSach();
                    break;
                case 2:
                    System.out.print("Nhap so ao: ");
                    int soao = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Nhap ho ten: ");
                    String hoten = sc.nextLine();
                    System.out.print("Nhap nam sinh: ");
                    int namsinh = sc.nextInt();
                    System.out.print("Nhap luong cung: ");
                    double luongcung = sc.nextDouble();
                    System.out.print("Nhap tien thuong: ");
                    double tienthuong = sc.nextDouble();
                    System.out.print("Nhap tien phat: ");
                    double tienphat = sc.nextDouble();
                    CauThu cauThuMoi = new CauThu(soao, hoten, namsinh, luongcung, tienthuong, tienphat);
                    qlCauThu.themCauThu(cauThuMoi);
                    break;
                case 3:
                    qlCauThu.timCauThuLuongCaoNhat();
                    break;
                case 4:
                    qlCauThu.sapXepDanhSach();
                    qlCauThu.xuatThongTinDanhSach();
                    break;
                case 5:
                    qlCauThu.tinhLuongCungTrungBinh();
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh.");
                    sc.close();
                    return;
                default:
                    System.out.println("\nChon khong hop le!");
                    break;
            }
        }
    }
}
