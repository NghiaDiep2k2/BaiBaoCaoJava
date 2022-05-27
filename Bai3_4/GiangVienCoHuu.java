package Bai3_4;

import java.util.Date;
import java.util.List;

public class GiangVienCoHuu extends GiangVien {
    private double HeSoLuong;
    private int NamBatDauCongTac;

    public GiangVienCoHuu() {
    }

    public GiangVienCoHuu(String MaGV, String HoTen, int NamSinh,
            String TrinhDo,
            int SoNamCongTac, List<BoMon> DanhSachMon, double HeSoLuong,
            int NamBatDauCongTac) {
        super(MaGV, HoTen, NamSinh, TrinhDo, SoNamCongTac, DanhSachMon);
        this.HeSoLuong = HeSoLuong;
        this.NamBatDauCongTac = NamBatDauCongTac;
    }

    public GiangVienCoHuu(double HeSoLuong, int NamBatDauCongTac) {
        this.HeSoLuong = HeSoLuong;
        this.NamBatDauCongTac = NamBatDauCongTac;
    }

    public double getHeSoLuong() {
        return HeSoLuong;
    }

    public void setHeSoLuong(int HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }

    public int getNamBatDauCongTac() {
        return NamBatDauCongTac;
    }

    public void setNamBatDauCongTac(int NamBatDauCongTac) {
        this.NamBatDauCongTac = NamBatDauCongTac;
    }

    public boolean PL_50() {
        Date curr = new Date(System.currentTimeMillis());
        if (curr.getYear() - NamSinh > 50)
            return true;
        return false;
    }

    public boolean isVisitingLecturer() {
        return false;
    }

    public void display() {
        System.out
                .println(MaGV + HoTen + " " + NamSinh + " " + TrinhDo + " " + SoNamCongTac
                        + " " + HeSoLuong + " " + NamBatDauCongTac);

    }
}
