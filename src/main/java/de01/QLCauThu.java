/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class QLCauThu {
    private ArrayList<CauThu> ds;

    public QLCauThu() {
        ds = new ArrayList<>();
        ds.add(new CauThu(1, "Nguyen Van An", 2000, 3000, 800, 1000));
        ds.add(new CauThu(2, "Tran Thi Be", 1999, 3200, 400, 550));
        ds.add(new CauThu(3, "Le Van Cao", 1997, 2900, 600, 500));
        ds.add(new CauThu(4, "Pham Thi Dung", 1998, 3200, 550, 400));
        ds.add(new CauThu(5, "Nguyen Van Anh", 2003, 5000, 900, 800));
        ds.add(new CauThu(6, "Tran Thi Mai", 1992, 3800, 1000, 0));
        ds.add(new CauThu(7, "Le Ba Cao", 1997, 2700, 650, 400));
        ds.add(new CauThu(8, "Pham Thi Thuy Duong", 1998, 3300, 750, 300));
        ds.add(new CauThu(9, "Nguyen Van Anh Cong", 2001, 3400, 800, 150));
        ds.add(new CauThu(10, "Tran Thi Thuy Tien", 1996, 4000, 500, 200));
        ds.add(new CauThu(11, "Le Van Phuoc Lam", 1995, 2500, 900, 400));
        ds.add(new CauThu(12, "Pham Thi Kim Anh", 1990, 3800, 550, 100));
    }
    
    public void themCauThu(CauThu cauThu) {
        for (CauThu ct : ds) {
            if (ct.getSoao() == cauThu.getSoao()) {
                System.out.println("So ao da ton tai!");
                return;
            }
        }
        ds.add(cauThu);
    }
    public void xuatThongTinDanhSach() {
        double tongLuong = 0;
        for (CauThu ct : ds) {
            System.out.println(ct);
            tongLuong += ct.tinhLuongThucLanh();
        }
        System.out.println("Tong tien luong ma CLB phai tra: " + tongLuong);

    }
    public void timCauThuLuongCaoNhat() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach cau thu trong!");
            return;
        }
        CauThu ctMax = Collections.max(ds, Comparator.comparingDouble(CauThu::tinhLuongThucLanh));
        System.out.println("Cau thu lanh luong cao nhat CLB la: " + ctMax);
    }

    public void sapXepDanhSach() {
        ds.sort(Comparator.comparingDouble(CauThu::tinhLuongThucLanh).reversed());
    }

    // Tính lương cứng trung bình
    public void tinhLuongCungTrungBinh() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach cau thu trong!");
            return;
        }
        double tongLuongCung = 0;
        for (CauThu ct : ds) {
            tongLuongCung += ct.getLuongcung();
        }
        double luongCungTrungBinh = tongLuongCung / ds.size();
        System.out.println("Luong cung trung binh cua cac cau thu la: " + luongCungTrungBinh);
    }
}
