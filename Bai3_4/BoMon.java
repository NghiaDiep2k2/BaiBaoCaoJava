package Bai3_4;

public class BoMon {
    private String TenMonHoc;
    private int SoTinChi;

    public BoMon(String TenMonHoc, int SoTinChi) {
        this.TenMonHoc = TenMonHoc;
        this.SoTinChi = SoTinChi;
    }

    public void setMonHoc(String TenMonHoc, int SoTinChi) {
        this.TenMonHoc = TenMonHoc;
        this.SoTinChi = SoTinChi;
    }

    public String getTenMonHoc() {
        return this.TenMonHoc;
    }

    public void setTenMonHoc(String TenMonHoc) {
        this.TenMonHoc = TenMonHoc;
    }

    public int getSoTinChi() {
        return SoTinChi;
    }

    public void setSoTinChi(int SoTinChi) {
        this.SoTinChi = SoTinChi;
    }

    public void display() {
        System.out.println("Ten MH: " + TenMonHoc);
        System.out.println("So Tin Chi: " + SoTinChi);
    }
}