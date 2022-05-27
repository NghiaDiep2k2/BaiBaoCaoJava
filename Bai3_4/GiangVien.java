package Bai3_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class GiangVien {
    protected String MaGV;
    protected String HoTen;
    protected int NamSinh;
    protected String TrinhDo;
    protected int SoNamCongTac;
    protected List<BoMon> DanhSachMonHoc;

    public GiangVien() {
        DanhSachMonHoc = new ArrayList<BoMon>();
    }

    public GiangVien(String MaGV, String HoTen, int NamSinh, String TrinhDo,
            int SoNamCongTac, List<BoMon> DanhSachMonHoc) {
        this.MaGV = MaGV;
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
        this.TrinhDo = TrinhDo;
        this.SoNamCongTac = SoNamCongTac;
        this.DanhSachMonHoc = DanhSachMonHoc;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String id) {
        this.MaGV = id;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getTrinhDo() {
        return TrinhDo;
    }

    public void setTrinhDo(String TrinhDo) {
        this.TrinhDo = TrinhDo;
    }

    public int getSoNamCongTac() {
        return SoNamCongTac;
    }

    public void setSoNamCongTac(int SoNamCongTac) {
        this.SoNamCongTac = SoNamCongTac;
    }

    // Tra ve string ds mon hoc
    public String[] getSubjectsList() {
        String arr[] = new String[DanhSachMonHoc.size()];
        DanhSachMonHoc.toArray(arr);
        return arr;
    }

    // Hien thi thong tin
    public abstract void display();

    // Them mot Mon Hoc vao danh sach cac mon hoc
    public void addSubject(BoMon a) {
        this.DanhSachMonHoc.add(a);
    }

    // Them vao danh sach cac mon hoc
    public void addListMH(List<BoMon> DanhSachMonHoc) {
        this.DanhSachMonHoc.addAll(DanhSachMonHoc);
    }

    // Kiem tra Giang Vien Co Huu tren 50 tuoi
    public abstract boolean PL_50();

    // Kiem tra co la Giang Vien Thinh Giang hay khong
    public abstract boolean isVisitingLecturer();

    // Kiem tra hai giang vien cung loai va nam cong tac
    public boolean lecturersOfTheSameType(GiangVien a) {
        if (this.isVisitingLecturer() && a.isVisitingLecturer()
                || !this.isVisitingLecturer() && !a.isVisitingLecturer()) {
            if (this.SoNamCongTac == a.SoNamCongTac)
                return true;
            else
                return false;
        }
        return false;
    }
}
