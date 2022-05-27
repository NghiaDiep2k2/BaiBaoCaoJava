package Bai3_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MonHoc {
    private String Ten;
    private List<GiangVien> DanhSachGiangVien;

    public MonHoc() {
        DanhSachGiangVien = new ArrayList<GiangVien>();
    }

    public MonHoc(String Ten, List<GiangVien> DanhSachGiangVien) {
        this.Ten = Ten;
        this.DanhSachGiangVien = DanhSachGiangVien;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    // Them danh sach cac giang vien
    public void addGiangVien(List<GiangVien> DanhSachGiangVien) {
        this.DanhSachGiangVien.addAll(DanhSachGiangVien);
    }

    // Them vao mot giang vien
    public void addGiangVien(GiangVien a) {
        this.DanhSachGiangVien.add(a);
    }

    // Get ds giang vien
    public List<GiangVien> getDanhSachGiangVien() {
        return DanhSachGiangVien;
    }

    // Tong so giang vien co huu cua bo mon co nam sinh truoc 1990
    public int PrimaryLecturer_1990() {
        int count = 0;
        for (int i = 0; i < DanhSachGiangVien.size(); i++) {
            if (DanhSachGiangVien.get(i).NamSinh < 1990)
                count++;
        }
        return count;
    }

    // Giang vien co huu lon tuoi nhat
    public GiangVien maxYearOfPrimaryLecturer() {
        int minYear = DanhSachGiangVien.get(0).NamSinh;
        int index = 0;
        for (int i = 1; i < DanhSachGiangVien.size(); i++) {
            if (DanhSachGiangVien.get(i).NamSinh < minYear) {
                minYear = DanhSachGiangVien.get(i).NamSinh;
                index = i;
            }
        }
        return DanhSachGiangVien.get(index);
    }

    // Tim giang vien cong tac o bo mon
    public List<GiangVien> searchByName() {
        String hoTen;
        List<GiangVien> t = new ArrayList<GiangVien>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten can tim: ");
        hoTen = sc.next();
        for (int i = 0; i < DanhSachGiangVien.size(); i++) {
            if (DanhSachGiangVien.get(i).HoTen == hoTen) {
                t.add(DanhSachGiangVien.get(i));
            }
        }
        return t;
    }

    // Lay ra danh sach giang vien thinh giang tu nam sinh
    public List<GiangVien> searchByBirthYear() {
        int namSinh;
        List<GiangVien> t = new ArrayList<GiangVien>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam can tim: ");
        namSinh = sc.nextInt();
        for (int i = 0; i < DanhSachGiangVien.size(); i++) {
            if (DanhSachGiangVien.get(i).isVisitingLecturer()) {
                if (DanhSachGiangVien.get(i).NamSinh == namSinh) {
                    t.add(DanhSachGiangVien.get(i));
                }
            }
        }
        return t;
    }

    // sap xep cac giang vien tang dan theo ho ten
    public void sortByYear() {
        Collections.sort(DanhSachGiangVien, new Comparator<GiangVien>() {
            public int compare(GiangVien a, GiangVien b) {
                return b.getNamSinh() - a.getNamSinh();
            }
        });
    }

    // sap xep cac giang vien giam dan theo nam sinh
    public void sortByName() {
        Collections.sort(DanhSachGiangVien, new Comparator<GiangVien>() {
            public int compare(GiangVien a, GiangVien b) {
                return a.getHoTen().compareTo(b.getHoTen());
            }
        });
    }

    // thong ke so luong giang vien cua bo mon theo nam sinh
    public Map<Integer, Integer> thongKeNamSinh() {
        Map<Integer, Integer> list = new HashMap<>();
        for (GiangVien i : DanhSachGiangVien) {
            if (!list.containsKey(i.getNamSinh())) {
                list.put(i.getNamSinh(), 1);
            } else
                list.put(i.getNamSinh(), list.get(i.getNamSinh()) + 1);
        }
        return list;
    }
}
